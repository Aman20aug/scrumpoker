package com.scrum.Scrumboard.DTO;

import com.scrum.Scrumboard.entity.Department;
import com.scrum.Scrumboard.entity.TeamEntity;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
public class UserDTO {
    private String userName;
    private String displayName;
    private String createdBy;
    private String createDate;
    private String updatedBy;
    private String updateDate;
}
