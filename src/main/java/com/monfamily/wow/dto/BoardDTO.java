package com.monfamily.wow.dto;


import com.monfamily.wow.entity.Board;
import com.monfamily.wow.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BoardDTO {

    private Long id;
    private User writer;
    private String title;
    private String content;

    @Builder
    public BoardDTO(Long id, User writer, String title, String content) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
    }


    public BoardDTO(Board board) {
        this.id = board.getId();
        this.writer = board.getWriter();
        this.title = board.getTitle();
        this.content = board.getContent();
    }


    public Board toEntity(){
       return Board.builder()
               .writer(writer)
               .title(title)
               .content(content)
               .build();
   }


}
