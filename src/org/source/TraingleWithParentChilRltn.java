package org.source;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;

public class TraingleWithParentChilRltn implements InitializingBean, DisposableBean, Shape{

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Get Point A " + getPointA().getX() + "/" + getPointA().getY() + " ::: Get Point B "
				+ getPointB().getX() + "/" + getPointB().getY() + "::: Get Point c " + getPointC().getX() + "/"
				+ getPointC().getY());
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Executed before bean shut down");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Executed once bean initialzes");

	}
	public void MyInit(){
		System.out.println("Executed once bean initialzes MyInit");
	}
	public void MyDestroy(){
		System.out.println("Executed before bean shut down My destroy");
		
	}

}
