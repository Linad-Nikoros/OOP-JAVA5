package org.example.model;

public class BaseUser {
    private String name;
    private Integer age;
    private Integer salary;
    private Boolean haveCredit;
    private Integer balance;

    public BaseUser(String name, Integer age, Integer salary, boolean haveCredit, Integer balance) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.haveCredit = haveCredit;
        this.balance = balance;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public Boolean HaveCredit() {
        return haveCredit;
    }

    public Integer getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
