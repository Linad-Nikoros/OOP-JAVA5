package org.example.model;

public class VipUser  extends  BaseUser{
    private String name;
    private Integer age;
    private Integer salary;
    private Boolean haveCredit;
    private Integer balance;
    private Boolean podpiska;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public boolean isHaveCredit() {
        return haveCredit;
    }

    public Integer getBalance() {
        return balance;
    }

    public VipUser(String name, Integer age, Integer salary, boolean haveCredit, Integer balance, Boolean podpiska) {
        super(name, age, salary, haveCredit, balance);
        this.podpiska = podpiska;
    }
}
