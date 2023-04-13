package com.agile.demo.biz.user;

import com.agile.demo.biz.account.AccountEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "NUSER")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {

    @Id
    @Column(name="nu_seq")
    private Long nu_seq;

    @OneToOne
    @JoinColumn(name="na_seq")
    private AccountEntity accountEntity;

     @Enumerated(EnumType.STRING)
     @Column(name="user1")
     private Role role;

    @AllArgsConstructor
    @Getter
    public enum Role {
        ADMIN("ROLE_ADMIN");
        private String value;
    }


}
