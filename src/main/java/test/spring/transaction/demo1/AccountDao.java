package test.spring.transaction.demo1;

public interface AccountDao {
    public void moneyIn(String in, Double money);
    public void moneyOut(String out, Double money);
}
