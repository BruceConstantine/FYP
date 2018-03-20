package local.myjsp.activemq.PSmodel;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import org.apache.log4j.Logger;

public class JMSListener_listener1 implements MessageListener {
	public void onMessage(Message msg) {
		Logger.getLogger(this.getClass().getName()).info("Message incoming Receivced @ ListenerI: " + msg.toString());
	} 
}
