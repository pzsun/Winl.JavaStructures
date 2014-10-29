package com.winl.java.structures;

public class Ratio {
	protected int numerator;

	protected int denominator;

	public Ratio(int top, int bottom) {
		numerator = top;
		denominator = bottom;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public double value() {
		return (double) numerator / (double) denominator;
	}

	public Ratio add(Ratio other) {
		return new Ratio(this.numerator * other.denominator + this.denominator
				* other.numerator, this.denominator * other.denominator);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ratio [numerator=").append(numerator)
				.append(", denominator=").append(denominator)
				.append(", value()=").append(value()).append(", hashCode()=")
				.append(hashCode()).append("]");
		return builder.toString();
	}
}
