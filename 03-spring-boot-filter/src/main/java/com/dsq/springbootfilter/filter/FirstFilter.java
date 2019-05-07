package com.dsq.springbootfilter.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "FirstFilter" , urlPatterns = {"*.do"})
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("into Filter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("out Filter");
    }

    @Override
    public void destroy() {

    }
}
