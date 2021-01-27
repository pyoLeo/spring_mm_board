package edu.bit.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;
import jdk.internal.org.jline.utils.Log;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@Controller
@AllArgsConstructor
public class BoardController {	//컨트롤러에서 서비스 호출
	
	private BoardService boardService;
	
	@GetMapping("/list")
	public void list(Model model) {
		System.out.println("list()");
		model.addAttribute("list", boardService.getList());	//list객체 생성되어 getList()정보 담김
	
	}
	
	@GetMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");
		
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write_view(BoardVO boardVO, Model model) throws Exception {
		System.out.println("write()");
		
		boardService.writeBoard(boardVO);
		
		return "redirect:list";
	}
}
