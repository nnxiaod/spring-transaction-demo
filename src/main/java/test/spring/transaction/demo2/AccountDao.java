package test.spring.transaction.demo2;

public interface AccountDao {
    public void moneyIn(String in, Double money);
    public void moneyOut(String out, Double money);
}
