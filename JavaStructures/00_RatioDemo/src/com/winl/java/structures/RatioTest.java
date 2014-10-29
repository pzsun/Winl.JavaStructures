package com.winl.java.structures;

import org.junit.Assert;
import org.junit.Test;

public class RatioTest {

	@Test
	public void RatioConstructorTest() {
		Ratio r = new Ratio(1, 1);

		Assert.assertNotNull(r);
	}

	@Test
	public void GetNumeratorTest() {
		Ratio r = new Ratio(1, 2);

		Assert.assertEquals(1, r.getNumerator());
	}

	@Test
	public void GetDenominatorTest() {
		Ratio r = new Ratio(1, 2);

		Assert.assertEquals(2, r.getDenominator());
	}

	@Test
	public void ValueTest() {
		Ratio r = new Ratio(1, 2);
		Assert.assertEquals(0.5, r.value(), 0);
	}
	
	@Test
	public void AddTest(){
		Ratio r1 = new Ratio(1,2);
		Ratio r2 = new Ratio(1,4);
		
		Ratio addResult = r1.add(r2);

		Assert.assertNotNull(addResult);
		Assert.assertEquals(6, addResult.getNumerator());
		Assert.assertEquals(8, addResult.getDenominator());
		Assert.assertEquals(0.75, addResult.value(), 0);
	}
	
	@Test
	public void ToStringTest(){
		Ratio r = new Ratio(1,2);
		
		String result = r.toString();
		
		Assert.assertNotNull(result);
		Assert.assertTrue(result.contains(Integer.toString(r.getDenominator())));
		Assert.assertTrue(result.contains(Integer.toString(r.getNumerator())));
		Assert.assertTrue(result.contains(Double.toString(r.value())));
		Assert.assertTrue(result.contains(Integer.toString(r.hashCode())));
	}
}
