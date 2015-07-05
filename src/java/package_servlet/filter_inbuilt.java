/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Shweta
 */

@WebFilter(servletNames = {"servlet_packa"} )

public class filter_inbuilt extends fillter_java {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        String str = ((HttpServletRequest) request).getParameter("password");
        if(str.equalsIgnoreCase("shweta"))
            chain.doFilter(request, response);
        else{
              response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.print("wrong password");
            
        }
           
        }
    }

}
