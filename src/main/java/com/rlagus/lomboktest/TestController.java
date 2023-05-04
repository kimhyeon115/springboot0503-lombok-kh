package com.rlagus.lomboktest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlagus.lomboktest.dto.MemberDto;

@RestController
public class TestController {

	@RequestMapping(value = "/test")
	public MemberDto test() {
		
		MemberDto dto = new MemberDto();
		dto.setName("홍길동");
		dto.setId("hong");
		dto.setPw("1234");
		dto.setAge(99);
		return dto;
	}
	
}
