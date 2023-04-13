package com.agile.demo.repository;

import com.agile.demo.biz.account.AccountEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;
@SpringBootTest
public class AccountEntityTest {
    @Autowired
    private AccountRepository accountRepository;

    @Test
    void crud(){
        accountRepository.save(new AccountEntity(1,"h", "1234", "3xxx@xxx.xxx", "123456",LocalDate.now()));  //

        System.out.println(">>>>>>>>>>"+accountRepository.findAll()); // 회원정보를 리스트 형태로 출력
    }
}
