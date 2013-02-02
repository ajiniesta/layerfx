package com.iniesta.layerfx;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.iniesta.layerfx.testing.TestView;

public class TestingFXMLHandler {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateFxmlFile() {
		String actual, expected = "/com/iniesta/layerfx/testing/TestView.fxml";
		actual = FXMLHandler.calculateFxmlFile(TestView.class);
		assertEquals(expected, actual);
	}

}
