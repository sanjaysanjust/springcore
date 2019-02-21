package org.source;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class CircleWithJSR250AnnotationExample implements Shape {
	private Point center;

	public Point getCenter() {
		return center;
	}

	@Resource(name = "threepoint")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("INside Circlew" + getCenter().getX() + "::::" + getCenter().getY());

	}

	@PostConstruct
	public void initialzecircle() {
		System.out.println(" Before corcle executes");
	}

	@PreDestroy
	public void predestroy() {
		System.out.println("Before Circle Bean destroys");
	}
}
