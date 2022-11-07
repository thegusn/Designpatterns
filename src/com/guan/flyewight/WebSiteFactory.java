package com.guan.flyewight;

import java.util.HashMap;

//网站工厂  需要返回一个网站
public class WebSiteFactory {

//    集合，充当池的作用
    private HashMap<String ,ConcreteWebSite> pool=new HashMap<>();

//    根据网站类型，返回一个网站，如果没有就创建一个，并放到池中，并返回
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    public int getWebSiteCount(){
        return pool.size();
    }
























}
