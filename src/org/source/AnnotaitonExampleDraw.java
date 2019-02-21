package org.source;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaitonExampleDraw {

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
		 * Shape annotationExample=(Shape)
		 * context.getBean("circleWithAnnotation"); annotationExample.draw();
		 */

		/*
		 * AutowiredExample. By Default it looks for the same name if not
		 * present then looks for the bean which is present inside the required
		 * as arg
		 */
		Shape autowiredAnnotationExample = (Shape) context.getBean("circleWithAutoWireAnnotation");
		//autowiredAnnotationExample.draw();
		/*
		 * JSR250 Annotation
		 */
		Shape circleWithJSR250Annotation = (Shape) context.getBean("circleWithJSR250Annotation");
		//circleWithJSR250Annotation.draw();
		/*
		 * ComponentAnnotation
		 */
		Shape circleWithComponentAnnotation = (Shape) context.getBean("circleWithComponentAnnotation");
		//circleWithComponentAnnotation.draw();
		/*
		 * Messaging
		 */
		// System.out.println(context.getMessage("greeting",null,"Default
		// Greeting",null));

		// Message Resource by
		Shape circlewithMessageResource = (Shape) context.getBean("circlewithMessageResource");
		circlewithMessageResource.draw();
		/*
		 * Event Publisher
		 */
		Shape circlePublishEvent = (Shape) context.getBean("circlePublishEvent");
		circlePublishEvent.draw();

	}

}
