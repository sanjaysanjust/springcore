package org.source;

import java.util.List;

public class TrainglewithCollection {
	private List<Point> pointList;

	public List<Point> getPointList() {
		return pointList;
	}

	public void setPointList(List<Point> pointList) {
		this.pointList = pointList;
	}

	public void draw() {
		for (Point p : pointList) {
			System.out.println("Point" + p.getX() + "--" + p.getY());
		}
	}
}
