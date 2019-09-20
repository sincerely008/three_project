package com.three.kidult;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.three.kidult.model.biz.ProductboardBiz;
import com.three.kidult.model.dto.PagingDto;
import com.three.kidult.model.dto.ProductboardDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@Autowired
	private ProductboardBiz ProductboardBiz;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String test(Model model, @ModelAttribute("ProductboardDto")ProductboardDto productboardDto) {
		// 검색조건, 검색어
		logger.info("SearchFiled : " + productboardDto.getSearchFiled());
		logger.info("SearchValue : " + productboardDto.getSearchValue());
		
		// 페이징 처리
		int totalCount  = http://blog.naver.com/PostView.nhn?blogId=bleu1234&logNo=220263432986
	
		model.addAttribute("list", ProductboardBiz.boardList());
		
		return "border";
	}
	
}
