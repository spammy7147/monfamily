package com.monfamily.wow.entity;


import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import javax.persistence.*;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board extends TimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "monfamily_board_seq")
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="writer", nullable = false, referencedColumnName = "user_id")
    @Cascade(value = CascadeType.DELETE)
    private User writer;
    private String title;
    private String content;

    @Builder
    public Board(Long id, User writer, String title, String content) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
    }
}
