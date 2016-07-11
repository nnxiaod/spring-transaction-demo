package test.spring.transaction.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.spring.transaction.demo3.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class AccountTransferTest3 {

    @Resource(name="accountServiceProxy") // 注入事务代理类，事务增强过的业务类
    private AccountService accountService;
    
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
    
    @Test
    public void test1() {
        accountService.transfer("aaa", "bbb", 200d);
    }
}
