package com.guan.composite;

public class Department extends OrganizationComponent{
    public Department(String name, String des) {
        super(name, des);
    }


    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void prit() {
        System.out.println(getName());
    }
}
