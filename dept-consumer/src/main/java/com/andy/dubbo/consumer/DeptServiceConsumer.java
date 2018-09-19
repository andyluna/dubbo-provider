package com.andy.dubbo.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andy.dubbo.entity.Dept;
import com.andy.dubbo.service.DeptService;

@Service
public class DeptServiceConsumer{

	@Autowired
	private DeptService deptService;
	
	public List<Dept> getAll() {
		System.out.println("客户端开始调用deptService");
		List<Dept> depts = deptService.getAll();
		depts.forEach(System.out::println);
		return depts;
	}

}
