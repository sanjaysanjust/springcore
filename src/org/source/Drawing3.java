package org.source;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = null;

		context = new ClassPathXmlApplicationContext("spring2.xml");
		/*
		 * This is to tell Spring to shutdown once we are done with ourn
		 * execution. This applays only to deskop application but Pring web
		 * application has this feature by default
		 */
		context.registerShutdownHook();
		/*
		 * Parent-Child relationship
		 */
		TraingleWithParentChilRltn traingle = (TraingleWithParentChilRltn) context
				.getBean("traingleWithParentChilRltn");
		traingle.draw();

		/*
		 * Parent-Child relationship Here The call back methods executes once
		 * after bean initialzation and before bean shut down.
		 */
		TraingleWithParentChilRltn traingleWithParentChilRltn = (TraingleWithParentChilRltn) context
				.getBean("traingleWithParentChilRltn");
		traingle.draw();

		/*
		 * Coding to interfaces Concept
		 */
		Shape shape = (Shape) context.getBean("traingleWithParentChilRltn");
		shape.draw();
		Shape shape1 = (Shape) context.getBean("circle");
		shape1.draw();
	}

}
