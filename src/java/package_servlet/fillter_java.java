/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Shweta
 */
public class fillter_java implements Filter {

    private FilterConfig fc = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.fc = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
    chain.doFilter(request, response);
    }

    public FilterConfig getFc() {
        return fc;
    }

    public void setFc(FilterConfig fc) {
        this.fc = fc;
    }

    @Override
    public void destroy() {
        
        fc=null;
     }

}
