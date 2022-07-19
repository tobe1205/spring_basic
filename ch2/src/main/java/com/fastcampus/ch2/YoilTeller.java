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
		// 1. 입력
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		
		/*
		 * String year = args[0]; String month = args[1]; String day = args[2];
		 */
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		// 2. 작업
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm-1, dd);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1:일요일, 2: 월요일 ...
		char yoil = " 일월화수목금토".charAt(dayOfWeek);
		
		// 3. 출력
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();//response객체에서 브라우저로의 출력 스트림을 얻는다.
		out.println(year + "년 "+ month + "월 " + day + "일은 ");
		out.print(yoil + "요일입니다.");
		/*
		 * System.out.println(year + "년 "+ month + "월 " + day + "일은 ");
		 * System.out.print(yoil + "요일입니다.");
		 */
	}
}
