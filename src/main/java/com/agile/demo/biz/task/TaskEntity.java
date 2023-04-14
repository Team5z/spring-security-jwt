package com.agile.demo.biz.task;

import com.agile.demo.biz.account.AccountEntity;
import com.agile.demo.biz.backlog.BacklogEntity;
import com.agile.demo.biz.project.ProjectEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "NTASK")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="nt_seq", nullable = false, length = 25, unique = true)
    private Long nt_seq;

    @Column(nullable = false, updatable = true, length = 100)
    private String Title;

    @Column(nullable = true, updatable = true)
    private int Story_Progress;

    @Column(nullable = true, updatable = true, length = 255)
    private String Description;

    @Column(nullable = true, updatable = true)
    private Long Assign;

    @Column(name = "createDate", nullable = true, insertable = true, updatable = false)
    @CreatedDate
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime createDate;

    @Column(name = "updateData", nullable = true, insertable = true, updatable = true)
    @LastModifiedDate
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime updateData;

    @Column(nullable = false, updatable = true)
    private Long Presenter;

    @Column(nullable = false, updatable = true)
    private Long manager;

    @OneToOne
    @JoinColumn(name = "na_seq", insertable = false, unique = true, updatable = false)
    private AccountEntity account;

    @ManyToOne
    @JoinColumn(name = "np_seq", insertable = false, unique = true, updatable = false)
    private ProjectEntity projectEntity;

    @ManyToOne
    @JoinColumn(name = "nb_seq", insertable = false, unique = true, updatable = false)
    private BacklogEntity backlogEntity;
}
