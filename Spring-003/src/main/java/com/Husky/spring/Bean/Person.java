package com.Husky.spring.Bean;

import java.util.List;
import java.util.Set;

public class Person {
    private List<String> names;
    private Set<String> addrs;

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddrs(Set<String> addrs) {
        this.addrs = addrs;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", addrs=" + addrs +
                '}';
    }
}
