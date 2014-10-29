package com.winl.java.structures;

public final class Main {
	public static void main(String[] args) {
		Ratio r = new Ratio(1, 1);
		r = new Ratio(1, 2);
		r.add(new Ratio(1, 3));
		r = r.add(new Ratio(1, 4));
		System.out.println(r.toString());
	}
}
