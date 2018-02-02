package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by admin on 31-01-2018.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Welcome to Spring Framework !!");
        /*Loading Ioc Container with BeanFactory or core container */

        //Loading configuration file to resource to provide object to factory
        Resource resource=new ClassPathResource("resources/studentBean.xml");

        //Loading factory object for creation of objects
        BeanFactory factory = new XmlBeanFactory(resource);

        /*Loading Ioc Container with ApplicationContext or extended container of BeanFactory*/

        //Loading configuration file with ClassPathXmlApplicationContext - to load file in class path resource
        ApplicationContext  classPathXmlApplicationContext= new ClassPathXmlApplicationContext("resources/studentBean.xml");

        //Loading configuration file with FileSystemApplicationContext - to load file in file system
        ApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("D:\\Workspace\\MyWorkspace\\spring-boot-multiple-datasources-master\\SpringExmaples\\SpringWithHelloWorld\\src\\resources\\studentBean.xml");

    }

}
