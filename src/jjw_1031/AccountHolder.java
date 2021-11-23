package jjw_1031;

public class AccountHolder {
    protected int ID;
    protected String address;
    public AccountHolder(int ID,String address){
        this.ID=ID;
        this.address=address;
    }
    public int nextID(){
        return this.ID;
    }
}
class IndividualHolder extends AccountHolder{
    private String name;
    private String SSN;

    public IndividualHolder(int ID,String address,String name,String SSN){
        super(ID,address);
        this.name =name;
        this.SSN = SSN;
    }
    public String getName(){
        return this.name;
    }
    public String getSSN(){
        return this.SSN;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSSN(String SSN){
        this.SSN=SSN;
    }
}

class CorporateHolder extends AccountHolder{
    private String contact;
    public CorporateHolder(int ID,String address,String contact){
        super(ID,address);
        this.contact = contact;
    }
    public String getContact(){
        return this.contact;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
}
class Account{
    private AccountHolder holder;
    private double balance =0.0;

    public Account(double amt,AccountHolder holder){
        this.holder= holder;
        this.balance = amt;
    }
    public double withdraw(double money){ //xiaofei
        return this.balance-money;
    }
    public double deposit(double money){
        return this.balance+money;
    }
    public double getBalance(){
        return this.balance;
    }
    public AccountHolder getHolder(){
        return this.holder;
    }
    public void setHolder(double amt){
        this.balance=amt;
    }
    public void setBalance(AccountHolder holder){
        this.holder = holder;
    }
}


