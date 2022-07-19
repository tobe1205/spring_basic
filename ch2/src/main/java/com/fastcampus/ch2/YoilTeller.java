package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YoilTeller { //http://localhost:8000/ch2/getYoil?year=2022&month=07&day=19

	@RequestMapping("/getYoil")
	public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
//	public void main(HttpServletRequest request) {
		// 1. �Է�
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		
		/*
		 * String year = args[0]; String month = args[1]; String day = args[2];
		 */
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		// 2. �۾�
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm-1, dd);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1:�Ͽ���, 2: ������ ...
		char yoil = " �Ͽ�ȭ�������".charAt(dayOfWeek);
		
		// 3. ���
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();//response��ü���� ���������� ��� ��Ʈ���� ��´�.
		out.println(year + "�� "+ month + "�� " + day + "���� ");
		out.print(yoil + "�����Դϴ�.");
		/*
		 * System.out.println(year + "�� "+ month + "�� " + day + "���� ");
		 * System.out.print(yoil + "�����Դϴ�.");
		 */
	}
}
