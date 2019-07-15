package com.gl.cdcconsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"com.gl:cdc-producer:+:stubs:8080"}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class CdcConsumerApplicationTests {

	@Test
	public void contextLoads() {
		try {
			Thread.currentThread().sleep(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
