package com.example.demo;

import java.util.List;

public class PojoListParam {

    private List<String> in;

    public List<String> getIn() {
        return in;
    }

    public void setIn(List<String> in) {
        this.in = in;
    }

    @Override
    public String toString() {
        return "PojoListParam{" +
                "in=" + in +
                '}';
    }
}
