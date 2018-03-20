 
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;


//@ParentPackage("basePackage") 
@Action          //使用convention插件提供的@Action注解将一个普通Java类标识为可以处理用户请求的Action类  
@Namespace("/")  //使用使用convention插件提供的@Namespace注解指明这个Action类的命名空间
public class TestAction {
    /**
     * test方法的访问方式：http://localhost:8080/Struts2AnnotationMavenProject/test!test
     * MethodName: test
     * Description: 
     * @author xudp
     */
    public void test(){
        System.out.println("调用了TestAction里面的test方法");
    }
    
    public String execute(){
    	test();
    	return "success";
    }
} 
