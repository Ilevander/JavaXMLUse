package in.com.coders;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{
   
	private static final long serialVersionUID = 1L;

	@Override
    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
		System.out.println("I am service method REGISTER");
    }
   
}
