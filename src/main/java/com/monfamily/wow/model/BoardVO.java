package com.monfamily.wow.model;

import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
public class BoardVO {


    private Long boardId;
    private String writer;
    private String title;
    private String content;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoardVO boardVO = (BoardVO) o;

        if (!boardId.equals(boardVO.boardId)) return false;
        if (!writer.equals(boardVO.writer)) return false;
        if (!title.equals(boardVO.title)) return false;
        return content.equals(boardVO.content);
    }

    @Override
    public int hashCode() {
        int result = boardId.hashCode();
        result = 31 * result + writer.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + content.hashCode();
        return result;
    }
}
