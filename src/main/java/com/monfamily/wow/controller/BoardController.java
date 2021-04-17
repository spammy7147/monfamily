package com.monfamily.wow.controller;

import com.monfamily.wow.model.BoardVO;
import com.monfamily.wow.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    private BoardRepository boardRepository;

    @Autowired
    public void setBoardRepository(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @GetMapping("/list")
    public String list(Model model){

        List<BoardVO> boards = boardRepository.findAll();
        model.addAttribute("boards",boards);

        return "board/list";
    }

    @GetMapping("/form")
    public String form(Model model, @RequestParam(required=false)Long boardId){

        if(boardId == null){
            model.addAttribute("board", new BoardVO());
        }else{
            model.addAttribute("board", boardRepository.findById(boardId));
        }

        return "board/form";
    }

    @PostMapping("/form")
    public String form(@Valid BoardVO board, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "board/form";
        }

        boardRepository.save(board);
        return "redirect:/board/list";
    }
}
