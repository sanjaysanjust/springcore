package org.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class CircleWithMessageResource implements Shape {
	private Point center;
	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		//System.out.println("INside Circlew" + getCenter().getX() + "::::" + getCenter().getY());
		System.out.println(this.messageSource.getMessage("draw.point",new Object[]{center.getX(),center.getY()},"Default points of Circle",null));
		
		System.out.println(this.messageSource.getMessage("draw.circle",null,"Default Draw Circle",null));
		
		System.out.println(this.messageSource.getMessage("greeting",null,"Default Greeint",null));

	}

}
