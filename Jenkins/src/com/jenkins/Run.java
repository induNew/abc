package com.jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Run {

	@Test
	
	public void print()
	{
		Reporter.log("hi",true);
	}

}
