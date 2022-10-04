package kr.or.ddit.basic.reqNresp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/responseTest02.do")
public class ResponseTest02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		request.setCharacterEncoding("utf-8");
		
		/*
		  - sendRedirect 
		       다른 페이지로 제어를 넘긴다. ( Request객체와 Response 객체가 공유되지 않는다.)
		       응답시 웹브라우저에게 '이동할 URL'을 전송하여 웹브라우저가 해당 URL로 이동하는 방식이다.
		       이동할 때에는 GET방식으로 요청하기 때문에 URL의 길이에 제한이 있다.
	    */
		
		// sendRedirect로 이동하기 = Response객체의 sendRedirect()메서드를 이용한다.
		// 형식> response객체.sendRedirect("이동할 URL주소");
		//       이동할 URL주소 ==> 전체 URL을 모두 기술한다.
		
		// (Request객체와  Response객체가 공유되지 않는다.)
		//request.setAttribute("tel", "011-2334-4214");
		//response.sendRedirect("/webTest/redirectTest.do");
			
		//이 문서에서 만든 데이터를 sendRedirect로 다른 문서로 보내려면 
		//GET방식으로 보낼 수 있다.(즉, URL주소 뒤에 붙여서 보낼수 있다.)
		
		String name = request.getParameter("username");
		String tel = "010-3213-2134";
		//GET방식으로 보내기 !
		response.sendRedirect("/webTest/redirectTest.do?username=" + name +"&tel=" + tel);
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
