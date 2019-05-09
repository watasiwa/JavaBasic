package j_project.service;

import j_project.vo.UserVO;

public interface UserService {
		//회원가입
		void join();
		
	
		//회원 전체 리스트 출력
		void userList();


		//회원정보보기
		void userInfo();
		//회원정보수정
		void userInfoUpdate();
		//회원탈퇴
		void userRemove();
		
		
		//아이디 찾기
		void findaccount();
		//비밀번호찾기?
		void findpassword();
}
