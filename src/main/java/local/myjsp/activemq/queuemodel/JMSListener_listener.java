package local.myjsp.activemq.queuemodel;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;

/**
 * @author dell
 * 消息监听
 */

public class JMSListener_listener implements MessageListener {
	public void onMessage(Message msg) {
		try {
			Logger.getLogger(JMSListener_listener.class).debug("收到的消息"+ ((TextMessage)msg).getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}