package local.myjsp.activemq.queuemodel;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.util.BooleanEditor;
import org.apache.log4j.Logger; 

public class JMSConsumer_whileLoop {

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
			while (true) {
				Message msg = consumer.receive(1000);
				TextMessage textMessage = (TextMessage) msg;
				if (textMessage != null){
					Logger.getLogger(JMSConsumer_whileLoop.class).debug("收到了消息: "+ textMessage.getText());
				} else {
					//	do nothing
				} 	//	else { break; }
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
		 
	}

}
