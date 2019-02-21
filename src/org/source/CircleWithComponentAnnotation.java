package org.source;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CircleWithComponentAnnotation implements Shape {

	private Point center;

	/*
	 * Annotations tell the bean post processor to initialize the required bean
	 * while bean initialization time. Bean Post processor is the which actually
	 * takes care of initialization of annotations/required annotation beans
	 * 
	 */

	public Point getCenter() {
		return center;
	}
@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("INside Circlew" + getCenter().getX() + "::::" + getCenter().getY());

	}
}
