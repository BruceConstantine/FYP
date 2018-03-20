 
import org.hibernate.Session;
import org.junit.Test;
import org.apache.log4j.Logger;
import local.myjsp.entity.User;
import local.myjsp.persist.dao.UserService; 

/**
 * Hello world!
 *
 */
public class LoggerConf  {
	
	//Logger的reference:		http://www.360doc.com/content/11/0408/14/987036_108161048.shtml
	//						http://blog.csdn.net/xiaocxks/article/details/52670470
	
	// Logger类不允许实例化一个新的记录器实例，但它提供了两个静态方法获得一个 Logger 对象		
	private static Logger logger = Logger.getRootLogger();	//返回应用程序实例根记录器并没有名字		
															//任何其他命名的Logger对象实例是通过第二种方法通过记录器的名称获得, getRootLogger() 可以替换为logger.getLogger(App.class)	
	@Test 
    public static void testLogger( String[] args ) {
    	logger.warn("warn 输出");
    	logger.info("info输出");
    	logger.debug("debug输出");
    	logger.error("error输出");
    	logger.fatal("fatal输出");
    }
 
	public static void main(String []args) {
		User user =  UserService.findById(Integer.parseInt( "1" ));
		if( user != null && "123".equals( user.getPassword() ) )
			System.out.println( true ); 
	}
    
}
