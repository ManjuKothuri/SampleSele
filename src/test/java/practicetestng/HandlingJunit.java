package practicetestng;

import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.BeforeTest;


public class HandlingJunit {
	@Test
	public void onetimesetup() {

		Assert.assertEquals("yahoo", "yahoo");

	}

	@BeforeTest
	public void google() {

		Assert.assertEquals("google", "google");
	}
}
