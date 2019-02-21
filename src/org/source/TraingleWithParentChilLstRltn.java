package org.source;

import java.util.List;

public class TraingleWithParentChilLstRltn {

	private List<Point> poitList;

	public List<Point> getPointList() {
		return poitList;
	}

	public void setPointList(List<Point> pointList) {
		this.poitList = pointList;
	}

	public void draw() {
		for (Point p : poitList) {
			System.out.println("Point" + p.getX() + "--" + p.getY());
		}
	}

}
