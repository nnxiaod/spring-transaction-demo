package test.spring.transaction.demo3;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl extends JdbcTemplate implements AccountDao {

    public void moneyIn(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.update(sql, money, in);
    }

    public void moneyOut(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.update(sql, money, out);
    }

}
