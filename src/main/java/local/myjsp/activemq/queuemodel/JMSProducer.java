package local.myjsp.activemq.queuemodel;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.log4j.Logger;
import org.springframework.messaging.core.MessageReceivingOperations;

/* JMS的编程过程很简单，概括为：
 * 	应用程序A发送一条消息到消息服务器的某个目得地(Destination)，然后消息服务器把消息转发给应用程序B。
 * 	因为应用程序A和应用程序B没有直接的代码关连，所以两者实现了解偶。
 * */

/** @author dell
 * 消息生产者
 */
public class JMSProducer {

	private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
	private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
	//broker连接地址
	private static final String BROKER   = ActiveMQConnection.DEFAULT_BROKER_URL;
	private static final int	SENDNUM  = 10;
	
	public static void main(String[] args)  {
		
		/// 连接工厂
		ConnectionFactory connectionFactory = null;
		/// 连接
		Connection connection = null;
		/// 会话：接受或者发送消息的线程
		Session session = null;
		/// 消息目的地
		Destination destination  = null;
		/// 消息发送者
		MessageProducer messageProducer = null;
		
		
		//实例化连接工厂
		connectionFactory = new ActiveMQConnectionFactory(USERNAME, PASSWORD, BROKER);
		try {
			//通过连接工厂获取连接
			connection = connectionFactory.createConnection();
			//打开连接
			connection.start();
			//创建session		 	开启事务(true),Session消息的应答方式
			session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			//创建消息队列，返回到 目的地
			destination = session.createQueue("FirstQueue");
			//创建消息发送者 
			messageProducer = session.createProducer(destination);
			
			sendMessage(session, messageProducer);
			//提交事务
			session.commit();
		} catch (JMSException e) {
			e.printStackTrace();
			try { session.rollback(); } catch (JMSException e1) { e1.printStackTrace(); }
		} finally {
			try {
				if ( connection != null ) connection.close();
				if ( session != null ) session.close(); 
			 } catch (JMSException e) { e.printStackTrace(); }
		}
		
	}
	
	/** 发送消息测试方法
	 * @param session
	 * @param messageProducer
	 */
	public static void  sendMessage(Session session, MessageProducer messageProducer) {
		for (int i = 0 ; i < SENDNUM; i++) {
			try {
				TextMessage msg = session.createTextMessage("ActiveMQ 发送的消息： "+ i);
				messageProducer.send(msg);
				Logger.getLogger(JMSProducer.class).debug("ActiveMQ 发送的消息： "+ i);
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}

}






























