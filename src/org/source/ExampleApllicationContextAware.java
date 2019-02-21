package org.source;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ExampleApllicationContextAware implements ApplicationContextAware, BeanNameAware {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	ApplicationContext applContext = null;

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
	public void setApplicationContext(ApplicationContext applContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applContext = applContext;
		Point zeropint = (Point) applContext.getBean("zeropoint");
		zeropint.setX(5);
		zeropint.setY(5);
		System.out.println("========" + zeropint.getX() + "========" + zeropint.getY());

	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean NAme ---->" + beanName);
	}

}
