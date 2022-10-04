package kr.or.ddit.basic.reqNresp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/forwardTest.do")
public class ForwardTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//파라미터로 넘어온값 구하기 
		String userName = request.getParameter("username");
		
		// 이전 문서의 setAttribute()메서드로 셋팅한 데이터 구하기 => getAttribute()메서드로 가져옴 
		// 형식) request.getAttribute("키값");
		String tel = (String) request.getAttribute("tel");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		out.println("<html><head><meta charset='utf-8'><title>forward방식</title></head>");
		out.println("<body>");
		out.println("<h3>forward 결과</h3>");
		out.println("<ul>");
		
		out.println("<li>이름 : " + userName + "</li>");
		out.println("<li>전화 : " + tel + "</li>");
		
		out.println("</ul>");
		
		out.println("</body>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
