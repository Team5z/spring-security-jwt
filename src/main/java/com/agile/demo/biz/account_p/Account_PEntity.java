package com.agile.demo.biz.account_p;

import com.agile.demo.biz.account.AccountEntity;
import com.agile.demo.biz.project.ProjectEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "NAccount_P")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Account_PEntity {

    @Id
    @Column(name="nap_seq")
    private Long seq;

    @OneToOne
    @JoinColumn (name="na_seq") // 삭제하면 같이 삭제되는 부분추가
    private AccountEntity accounts;

    @ManyToOne
    @JoinColumn (name="np_seq")  // 삭제하면 같이 삭제되는 부분추가
    private ProjectEntity parentAccount;

}