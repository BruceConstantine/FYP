package local.myjsp.activemq.queuemodel;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.log4j.Logger;

/**
 * @author dell
 * 消息监听方式的消费者
 */
public class JMSConsumer_listener {
	public static void main(String[] args) {
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("admin", "admin", ActiveMQConnection.DEFAULT_BROKER_URL);
		try{
			Connection connection = connectionFactory.createConnection();
			connection.start();
													//消费不需要加事务, 
			Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
			//创建连接的消息队列
			Destination destination = session.createQueue("FirstQueue");
			//根据目的地创建消费者
			MessageConsumer consumer = session.createConsumer(destination);
			//注册消息监听器
			consumer.setMessageListener( new JMSListener_listener());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
