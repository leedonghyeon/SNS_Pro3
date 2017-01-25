package com.manage.biz.service;

import com.manage.biz.vo.JoinMember;

public interface JoinMemberService {
	int insertJoinMember(JoinMember joinmember) throws Exception;
	JoinMember getAllMember(String member_id) throws Exception;
	JoinMember findByUserIdAndPassword(String userId, String password) throws Exception;	
	int findPassword(JoinMember joinmember) throws Exception;
	void updatePassword(JoinMember joinmember) throws Exception;
	int CheckID(JoinMember joinmember) throws Exception; 
}
