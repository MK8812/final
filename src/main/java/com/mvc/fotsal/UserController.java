package com.mvc.fotsal;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.fotsal.model.biz.UserBiz;
import com.mvc.fotsal.model.dto.UserDto;

@Controller
public class UserController {

	private Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserBiz biz;
	
	@RequestMapping("/loginform.do")
	public String loginForm() {
		logger.info("LOGIN PAGE");
		
		return "loginform";
	}
	
	@RequestMapping("/registerform.do")
	public String registerForm() {
		logger.info("REGISTER FORM");
		
		return "registerform";
	}
	
	@RequestMapping("/insertres.do")
	public String insertRes(UserDto dto) {
		
		logger.info("INSERT RES");
		
		int res = biz.insert(dto);
		if(res>0) {
			return "index.html";//메인페이지
		}else {
			return "redirect:registerform.do";//인서트폼
		}
		
	}
	
	@RequestMapping(value="/ajaxlogin.do", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Boolean> ajaxLogin(HttpSession session, @RequestBody UserDto dto) {
		logger.info("LOGIN");
		
		UserDto res = biz.login(dto);
		
		boolean check = false;
		if(res != null) {
			session.setAttribute("login", res);
			check=true;
		}
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("check", check);
		
		return map;
	}
	
}
