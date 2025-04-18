package com.scrum.Scrumboard.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "BOARD")
public class BoardEntity {

    @Id
    private UUID id;
    private String boardName;
    @OneToMany(mappedBy = "board")
    private List<TeamEntity> team;
}
