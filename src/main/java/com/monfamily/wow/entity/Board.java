package com.monfamily.wow.entity;



import lombok.Data;

import javax.persistence.*;

@Entity(name = "monfamily_board")
@Data
@SequenceGenerator(
        name = "monfamily_board_seq",
        sequenceName = "monfamily_board_seq",
        initialValue = 1,
        allocationSize = 1)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "monfamily_board_seq")
    @Column(name = "board_id")
    private Long boardId;
    private String writer;
    private String title;
    private String content;

}
