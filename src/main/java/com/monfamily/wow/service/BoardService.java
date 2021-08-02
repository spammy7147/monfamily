package com.monfamily.wow.service;

import com.monfamily.wow.dto.BoardDTO;
import com.monfamily.wow.entity.Board;
import com.monfamily.wow.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService implements IBoardService{

    BoardRepository boardRepository;
    @Autowired
    public void setBoardRepository(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public void boardCreate(BoardDTO board) {

        boardRepository.save(board.toEntity());
    }

    @Override
    public void boardDelete(Long boardNum) {

        boardRepository.deleteById(boardNum);
    }

    @Override
    public void boardUpdate(BoardDTO board) {

        boardRepository.save(board.toEntity());
    }

    @Override
    public BoardDTO boardReadOne(Long boardNum) {

        Board board = boardRepository.findById(boardNum).orElseThrow(() -> new IllegalArgumentException("해당 게시물을 찾을 수 없습니다 boardNum="+boardNum));
        return new BoardDTO(board);
    }

    @Override
    public List<BoardDTO> boardReadAll(Pageable pageable) {
        boardRepository.findAll(pageable).forEach(System.out::println);
        return null;
    }
}
