package com.guan.flyewight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        User user=new User();
        user.setName("张三");
        User user1=new User();
        user1.setName("李四");
        WebSite webSite=webSiteFactory.getWebSiteCategory("新闻");
        webSite.use(user );
        WebSite webSite1=webSiteFactory.getWebSiteCategory("博客");
        webSite1.use(user);
        WebSite webSite2=webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(user1);
        System.out.println("网站公共分类为"+webSiteFactory.getWebSiteCount());
    }
}
