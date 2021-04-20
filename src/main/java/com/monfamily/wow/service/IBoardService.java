package com.monfamily.wow.service;

import com.monfamily.wow.dto.BoardDTO;

import java.util.List;

public interface IBoardService {


    // 게시물 생성
    void boardCreate(BoardDTO board);
    //게시물 삭제
    void boardDelete(Long BoardNum);
    //게시물 수정
    void boardUpdate(BoardDTO board);
    //게시물 단일조회
    BoardDTO boardReadOne(Long BoardNum);
    //게시물 전부 조회
    List<BoardDTO> boardReadAll();

}
