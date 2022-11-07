package com.guan.flyewight;

public class ConcreteWebSite extends WebSite{

    private String type="";
    public ConcreteWebSite(String type){
        this.type=type;

    }
    @Override
    public void use(User user ) {
        System.out.println("网站发布的形式为"+type+"使用者是"+user.getName());
    }
}
