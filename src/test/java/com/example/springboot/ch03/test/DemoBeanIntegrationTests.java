package com.example.springboot.ch03.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;
import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {

	@Autowired
	private TestBean testBean;
	
	@Test
	public void prodBeanShouldInject() {
		String expected = "from production profile";
		String actual = testBean.getContent();
		TestCase.assertEquals(expected, actual);
	}
}
