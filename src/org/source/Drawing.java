package org.source;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = null;
		/*
		 * One way of getting beans from bean factory
		 */
		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));
		// Traingle traingle = (Traingle) factory.getBean("traingle");

		/*
		 * Second way of getting beans from bean factory.
		 */
		context = new ClassPathXmlApplicationContext("spring.xml");
		TraingleWithSetterInjection traingleWithSetterInjection = (TraingleWithSetterInjection) context.getBean("traingle");
		System.out.println(traingleWithSetterInjection.getType() + " Taingle Drawn");

		/*
		 * Taringle with constructor
		 */

		TrainglewithConstuctor trainglewithConstuctor = (TrainglewithConstuctor) context
				.getBean("trainglewithConstuctor");
		System.out.println(
				trainglewithConstuctor.getType() + " Taingle Drawn with eight" + trainglewithConstuctor.getHeight());

		/*
		 * Tainnle with ObjectInjection.
		 */
		TrainglewithObjectInjection injection = (TrainglewithObjectInjection) context
				.getBean("trainglewithObjectInjection");
		injection.draw();

		/*
		 * Taingle with Collection.
		 */
		TrainglewithCollection list = (TrainglewithCollection) context.getBean("trainglewithCollection");
		list.draw();

		/*
		 * Triangle with auto wire
		 */
		TrainglewithAutoWireByName trainglewithAutoWireByName = (TrainglewithAutoWireByName) context.getBean("trainglewithAutoWireByName");
		trainglewithAutoWireByName.draw();

		/*
		 * Traingle with Apllication Context Aware
		 */
		ExampleApllicationContextAware apllicationContextAware = (ExampleApllicationContextAware) context
				.getBean("exampleApllicationContextAware");
		apllicationContextAware.setPointB(new Point());
		apllicationContextAware.draw();
		
		
		
	}

}
