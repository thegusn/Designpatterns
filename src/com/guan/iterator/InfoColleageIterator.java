package com.guan.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoColleageIterator implements Iterator {
//    信息工程学院以List方法存放
    List<Department> departmentList;
    int index=-1;

    public InfoColleageIterator(List<Department> departmentsList){
        this.departmentList=departmentsList;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }



































}
