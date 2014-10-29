package com.winl.java.structures;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}

	@Test
	public void MailMethodTest() {
		Main.main(new String[0]);

		String message = outContent.toString();

		assertNotNull(message);
		assertTrue(message.contains("0.75"));
	}

	@Test
	public void testConstructorPrivate() throws Exception {
		Main main = Main.class.newInstance();
		assertNotNull(main);
	}
}
