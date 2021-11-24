package com.mycompany.test.member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mycompany.test.member.model.vo.Member;

@Repository
public class MemberDao {

	@Autowired
	private SqlSession sqlsesison;
	
	public int idCheck(Member vo){
		return sqlsesison.selectOne("Member.idCheck");
	}
	
}
