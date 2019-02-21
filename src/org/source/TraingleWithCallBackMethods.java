package org.source;

public class TraingleWithCallBackMethods {

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

}
