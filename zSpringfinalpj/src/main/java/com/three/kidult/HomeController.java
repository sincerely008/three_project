package com.three.kidult;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@Autowired
	private ProductboardBiz biz;
	
	int currentPageNo = 1;
	int recordsPerPage = 0;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	
	
	
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
	public String test(Model model, HttpServletRequest request) {
		
		
		
		if(request.getParameter("pages") != null) {
			currentPageNo = Integer.parseInt(request.getParameter("pages"));
		}
		if(request.getParameter("lines") != null) {
			recordsPerPage = Integer.parseInt(request.getParameter("lines"));
		}
		
		PagingDto paging = new PagingDto(recordsPerPage, currentPageNo);
		int offset = (paging.getCurrentPageNo() - 1) * paging.getRecordsPerPage();
		
		
		List<ProductboardDto> list = biz.boardList(offset, paging.getRecordsPerPage());
		paging.setNumberOfRecords(biz.getNoOfRecords());
		paging.makePaging();
		model.addAttribute("list", list);
		model.addAttribute("paging", paging);
		
		return "border";
	}
	
	@RequestMapping("/paging.do")
	public String paging(Model model, HttpServletRequest request) {
		
		if(request.getParameter("pages") != null) {
			currentPageNo = Integer.parseInt(request.getParameter("pages"));
		}
		if(request.getParameter("lines") != null) {
			recordsPerPage = Integer.parseInt(request.getParameter("lines"));
		}
		
		String searchFiled = request.getParameter("searchFiled");
		String searchValue = request.getParameter("searchValue");
		
		PagingDto paging = new PagingDto(recordsPerPage, currentPageNo);
		int offset = (paging.getCurrentPageNo() - 1) * paging.getRecordsPerPage();
		
		List<ProductboardDto> list = biz.searchFiled(offset, paging.getRecordsPerPage(), searchFiled, searchValue);
		paging.setSearchFiled(searchFiled);
		paging.setSearchValue(searchValue);
		paging.setNumberOfRecords(biz.getNoOfRecords());
		paging.makePaging();
		
		model.addAttribute("list", list);
		model.addAttribute("paging", paging);
		
		return "border";
	}
	
}
