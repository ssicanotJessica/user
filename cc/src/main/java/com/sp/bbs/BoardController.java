package com.sp.bbs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("bbs.boardController")
public class BoardController {
	@RequestMapping(value="/bbs/list")
	public String list(Model model) throws Exception {
		model.addAttribute("subMenu", "2");
		return ".four.menu2.bbs.list";
	}

	@RequestMapping(value="/bbs/created", method=RequestMethod.GET)
	public String createdForm(Model model) throws Exception {
		model.addAttribute("subMenu", "2");
		model.addAttribute("mode", "created");
		return ".four.menu2.bbs.created";
	}
	
	@RequestMapping(value="/bbs/created", method=RequestMethod.POST)
	public String createdSubmit() throws Exception {
		return "redirect:/bbs/list";
	}

	@RequestMapping(value="/bbs/article")
	public String article(Model model) throws Exception {
		model.addAttribute("subMenu", "2");
		return ".four.menu2.bbs.article";
	}
}

