package com.monfamily.wow.controller;

import com.monfamily.wow.dto.BoardDTO;
import com.monfamily.wow.model.BoardVO;
import com.monfamily.wow.service.IBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/board")
public class BoardController {

    private IBoardService boardService;

    @Autowired
    public void setBoardService(IBoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/list")
    public List<BoardDTO> list(final Pageable pageable){

        return boardService.boardReadAll(pageable);
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
    public String form(BoardDTO board, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "board/form";
        }

        boardService.boardCreate(board);
        return "redirect:/board/list";
    }
}
