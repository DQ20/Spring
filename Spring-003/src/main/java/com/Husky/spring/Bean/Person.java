package com.Husky.spring.Bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
    private List<String> names;
    private Set<String> addrs;
    private Map<Integer,String> phones;
    private Properties sqlDriver;
    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddrs(Set<String> addrs) {
        this.addrs = addrs;
    }

    public void setPhones(Map<Integer, String> phones) {
        this.phones = phones;
    }

    public void setSqlDriver(Properties sqlDriver) {
        this.sqlDriver = sqlDriver;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", addrs=" + addrs +
                ", phones=" + phones +
                ", sqlDriver=" + sqlDriver +
                '}';
    }
}
