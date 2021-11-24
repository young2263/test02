package com.mycompany.test.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mycompany.test.member.model.service.MemberService;
import com.mycompany.test.member.model.vo.Member;

@Controller
@SessionAttributes("msg")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="idCheck", method = RequestMethod.POST)
	@ResponseBody
	public String idCheck(@RequestParam(name="id") String id){
		
		System.out.println(id);
		Member vo = new Member();
		vo.setMemberId(id);
		System.out.println(vo);
		int result = memberService.idCheck(vo);
		System.out.println(result);
		if(result == 0) {
			return "true";
		}else if(result == 1) {
			return "false";
		} else {
			return "null";
		}
		
	}
	
}
