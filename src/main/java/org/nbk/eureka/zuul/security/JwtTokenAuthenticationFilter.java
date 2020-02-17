package org.nbk.eureka.zuul.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nbk.eureka.zuul.security.model.JwtConfig;
import org.springframework.web.filter.OncePerRequestFilter;

public class JwtTokenAuthenticationFilter extends OncePerRequestFilter{


	private final JwtConfig jwtConfig;
	
	
	
	public JwtTokenAuthenticationFilter(JwtConfig jwtConfig) {
		super();
		this.jwtConfig = jwtConfig;
	}



	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
