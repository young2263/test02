package com.mycompany.test.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.test.member.model.dao.MemberDao;
import com.mycompany.test.member.model.vo.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
	
	@Override
	public int idCheck(Member vo) {
		return memberDao.idCheck(vo);
	}
	
}
