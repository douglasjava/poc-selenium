package com.selenium.pocselenium.main;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegadores {

	private static WebDriver webDriver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Douglas\\drivers-selenium\\chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.get("https://www.youtube.com/");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		webDriver.close();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
