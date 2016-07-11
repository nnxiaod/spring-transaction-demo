package test.spring.transaction.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.spring.transaction.demo2.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class AccountTransferTest2 {

    @Resource(name="accountService")
    private AccountService accountService;
    
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
    
    @Test
    public void test1() {
        accountService.transfer("aaa", "bbb", 200d);
    }
}
