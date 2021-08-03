package com.monfamily.wow.dto;


import com.monfamily.wow.entity.Board;
import com.monfamily.wow.entity.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {

    private Long id;
    private User writer;
    private String title;
    private String content;


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
