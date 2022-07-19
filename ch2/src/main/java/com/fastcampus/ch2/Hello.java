package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. 원격 호출가능한 프로그램으로 등록
@Controller
public class Hello {
	int iv = 10; //인스턴스 변수
	static int cv = 20; //static 변수
	//2. URL과 메서드를 연결
	@RequestMapping("/hello")
	//private 인데도 호출 가능한 이유 : java의 reflect API를 이용해서 호출가능
	private void main() { //인스턴스 메서드 - iv, cv를 둘다 사용가능
		System.out.println("Hello - private");
		System.out.println(cv); //ok
		//static 메서드일때는 iv 호출 x 
//		System.out.println(iv); //ok
	}

	public static void main2() { //static메서드 - cv만 사용가능
		System.out.println(cv); //가능
//		System.out.println(iv); //에러
	}
}
