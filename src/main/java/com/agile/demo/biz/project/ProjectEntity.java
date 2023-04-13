package com.agile.demo.biz.project;

import com.agile.demo.biz.backlog.BacklogEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "NProject")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProjectEntity {

    @Id
    private long np_seq;

    @Column(nullable = false, updatable = true, length = 100)
    private String Project_Title;

    @Column(nullable = true, updatable = true)
    private String Project_Assign;


//    @OneToMany(cascade = CascadeType.REMOVE)
//    private List<BacklogEntity> backlogs;       // 체크 필요

    
}
