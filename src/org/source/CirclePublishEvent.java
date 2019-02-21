package org.source;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CirclePublishEvent implements ApplicationEventPublisherAware, Shape {
	private ApplicationEventPublisher applicationEventPublisher;

	public void draw() {
		DrawEvent event = new DrawEvent(this);
		applicationEventPublisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.applicationEventPublisher = publisher;
	}

}
