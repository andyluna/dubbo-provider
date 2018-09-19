package com.andy.dubbo.provider;

import java.util.ArrayList;
import java.util.List;

import com.andy.dubbo.entity.Dept;
import com.andy.dubbo.service.DeptService;

public class DeptServiceImpl implements DeptService {

	@Override
	public List<Dept> getAll() {
		
		List<Dept> depts = new ArrayList<>();
		depts.add(new Dept(1, "默认地址", "长沙市", "13875909772"));
		depts.add(new Dept(2, "其他地址", "娄底市", "18584731152"));
		return depts;
	}

}
