package org.source;

public class TrainglewithConstuctor {

	public String type;
	private int height;

	public TrainglewithConstuctor(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}

	public void draw() {
		System.out.println(getType() + " Traingle drawn with height" + getHeight());
	}

}
