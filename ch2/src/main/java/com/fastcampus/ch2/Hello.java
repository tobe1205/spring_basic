package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. ���� ȣ�Ⱑ���� ���α׷����� ���
@Controller
public class Hello {
	int iv = 10; //�ν��Ͻ� ����
	static int cv = 20; //static ����
	//2. URL�� �޼��带 ����
	@RequestMapping("/hello")
	//private �ε��� ȣ�� ������ ���� : java�� reflect API�� �̿��ؼ� ȣ�Ⱑ��
	private void main() { //�ν��Ͻ� �޼��� - iv, cv�� �Ѵ� ��밡��
		System.out.println("Hello - private");
		System.out.println(cv); //ok
		//static �޼����϶��� iv ȣ�� x 
//		System.out.println(iv); //ok
	}

	public static void main2() { //static�޼��� - cv�� ��밡��
		System.out.println(cv); //����
//		System.out.println(iv); //����
	}
}
