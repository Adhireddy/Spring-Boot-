package com.javainuse.services;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javainuse.controllers.Employee;

@RefreshScope
@FeignClient(name="EMPLOYEE-PRODUCER" ,url="${consumer.url}")
public interface RemoteCallService {
	@RequestMapping(method=RequestMethod.GET, value="/employee")
	public Employee getData();


}
