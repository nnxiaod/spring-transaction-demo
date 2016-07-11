package test.spring.transaction.demo5;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountServiceImpl implements AccountService {

    @Resource(name="accountDao")
    private AccountDao accountDao;
    
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    
    @Transactional(rollbackFor=Exception.class, isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
    public void transfer(final String out, final String in, final Double money) {
        accountDao.moneyOut(out, money);
        int i = 1/0;
        accountDao.moneyIn(in, money);
    }

}
