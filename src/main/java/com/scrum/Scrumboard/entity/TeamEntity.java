package com.scrum.Scrumboard.entity;

import javax.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TEAM")
public class TeamEntity {
    @Id
    private UUID id;
    private String teamName;
    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;
/*    @ManyToMany
    private List<UserEntity> userEntities;*/
    @ManyToOne(targetEntity = BoardEntity.class)
    private BoardEntity board;


}
