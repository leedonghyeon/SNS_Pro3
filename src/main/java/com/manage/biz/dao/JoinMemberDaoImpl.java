package com.manage.biz.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manage.biz.vo.JoinMember;

@Repository
public class JoinMemberDaoImpl implements JoinMemberDao{
	
	@Autowired
	SqlSessionTemplate sqlSession;

	public int insertJoinMember(JoinMember insert_member) throws Exception{
		sqlSession.insert("JoinMemberDao.insertMember", insert_member);
		int m_seq = insert_member.getMember_no();
		return m_seq;
	}
	
	public JoinMember selectJoinMember(String member_id) throws Exception{
		return sqlSession.selectOne("JoinMemberDao.JoinMember", member_id);
	}

	public JoinMember findByUserIdAndPassword(String userId, String password) {
        Map<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("member_id", userId);
        paramMap.put("member_password", password);
        return sqlSession.selectOne("JoinMemberDao.selectLoginUser", paramMap);
	}
	//비밀번호 찾기
	public int findPassword(JoinMember joinmember) throws Exception{
		int m_password = sqlSession.selectOne("JoinMemberDao.selectFind", joinmember);
		return m_password;
	}
	//비밀번호 수정
	public void updatePassword(JoinMember joinmember) throws Exception{
		sqlSession.update("JoinMemberDao.UpdatePassword", joinmember);
	}
	

} 
