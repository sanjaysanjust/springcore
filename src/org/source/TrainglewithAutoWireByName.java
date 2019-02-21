package org.source;

public class TrainglewithAutoWireByName {
	private Point zeropoint;
	private Point twopoint;
	private Point threepoint;

	public Point getZeropoint() {
		return zeropoint;
	}

	public void setZeropoint(Point zeropoint) {
		this.zeropoint = zeropoint;
	}

	public Point getTwopoint() {
		return twopoint;
	}

	public void setTwopoint(Point twopoint) {
		this.twopoint = twopoint;
	}

	public Point getThreepoint() {
		return threepoint;
	}

	public void setThreepoint(Point threepoint) {
		this.threepoint = threepoint;
	}

	public void draw() {
		System.out.println("Get Point A " + getZeropoint().getX() + "/" + getZeropoint().getY() + " ::: Get Point B "
				+ getTwopoint().getX() + "/" + getTwopoint().getY() + "::: Get Point c " + getThreepoint().getX() + "/"
				+ getThreepoint().getY());
	}

}
