package test.spring.transaction.demo1;

import javax.annotation.Resource;

public class AccountServiceImpl implements AccountService {

    @Resource(name="accountDao")
    private AccountDao accountDao;
    
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    
    public void transfer(String out, String in, Double money) {
        accountDao.moneyOut(out, money);
        int i = 1/0;
        accountDao.moneyIn(in, money);
    }

}
