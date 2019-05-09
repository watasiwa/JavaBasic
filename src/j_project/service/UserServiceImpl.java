package j_project.service;

import j_project.dao.UserDao;
import j_project.dao.UserDaoImpl;
import j_project.vo.Database;
import j_project.vo.UserVO;

import java.util.ArrayList;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
	
	UserDao userDao = new UserDaoImpl();
	ArrayList<UserVO> userList = userDao.selectUserList();
	
	@Override
	public void join() {
		//회원가입
		Scanner s = new Scanner(System.in);
	
		UserVO user = new UserVO();
		
		System.out.print("아이디 : ");
		user.setId(s.nextLine());
		System.out.print("비밀번호 : ");
		user.setPassword(s.nextLine());
		System.out.print("이름 : ");
		user.setName(s.nextLine());
	
		UserVO userCheck = userDao.selectUser("ID", user.getId());
		
		if(userCheck == null){
			//회원가입 진행
			userDao.insertUser(user);
		}else{
			//아이디 중복
			System.out.println("아이디가 중복되었습니다.");
		}
	}
	
	
	@Override
	public void userList() {
	ArrayList<UserVO> userList	= userDao.selectUserList();	
		
		
		
		System.out.println("------------------------------------");
		for(UserVO user : userList){
			System.out.println("ID : " + user.getId());
			System.out.println("NAME : "+ user.getName());
		}
		System.out.println("------------------------------------");
	
	
	
	}


	@Override
	public void userInfo() {
ArrayList<UserVO> userList	= userDao.selectUserList();	
	int num = 1;	
	
		System.out.println("------------------------------------");
		for(UserVO user : userList){
			System.out.println(num +"." + user.getName() + "\t" + user.getId() +"뒤에 등등등 옮"  );
			num++;
		}
		System.out.println("------------------------------------");
		num=1;
	
	}


	@Override
	public void userInfoUpdate() {
		
		for(int i =0; i < userList.size(); i++){
			
		}
	}


	@Override
	public void userRemove() {
		
		
		
		
	}


	@Override
	public void findaccount() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void findpassword() {
		// TODO Auto-generated method stub
		
	}

}
