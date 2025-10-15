package com.powernode.spring6.bean;

import java.util.List;
import java.util.Set;

public class Person {
    //注入List集合
    private List<String> names;

    //注入Set集合
    private Set<String> addrs;

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", addrs=" + addrs +
                '}';
    }

    public void setAddrs(Set<String> addrs) {
        this.addrs = addrs;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
