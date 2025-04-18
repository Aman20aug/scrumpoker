package com.scrum.Scrumboard.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "UserTable")
@Data
public class UserEntity {
    @Id
   private UUID id;
    private String userName;
/*    @ManyToMany(targetEntity = TeamEntity.class,mappedBy = "userEntities")
    List<TeamEntity> team;*/
    @Enumerated(EnumType.STRING)
    private Department department;
    private String displayName;
    private String createdBy;
    private String createDate;
    private String updatedBy;
    private String updateDate;

}
