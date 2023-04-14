package com.agile.demo.biz.accountproject;

import com.agile.demo.biz.account.AccountEntity;
import com.agile.demo.biz.project.ProjectEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "NAccount_P")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AccountProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="nap_seq", nullable = false, length = 25, unique = true)
    private Long nap_seq;

    @OneToOne
    @JoinColumn (name="na_seq") // 삭제하면 같이 삭제되는 부분추가
    private AccountEntity accounts;

    @ManyToOne
    @JoinColumn (name="np_seq")  // 삭제하면 같이 삭제되는 부분추가
    private ProjectEntity parentAccount;

}