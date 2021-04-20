package com.monfamily.wow.controller;

import com.monfamily.wow.dto.BoardDTO;
import com.monfamily.wow.model.BoardVO;
import com.monfamily.wow.service.IBoardService;
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
@RequestMapping("api/board")
public class BoardController {

    private IBoardService boardService;

    @Autowired
    public void setBoardService(IBoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/list")
    public String list(Model model){

        List<BoardDTO> boards = boardService.boardReadAll();
        model.addAttribute("boards",boards);

        return "board/list";
    }

    @GetMapping("/form")
    public String form(Model model, @RequestParam(required=false)Long boardId){

        if(boardId == null){
            model.addAttribute("board", new BoardVO());
        }else{
            model.addAttribute("board", boardService.boardReadOne(boardId));
        }

        return "board/form";
    }

    @PostMapping("/form")
    public String form(@Valid BoardDTO board, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "board/form";
        }

        boardService.boardCreate(board);
        return "redirect:/board/list";
    }
}
