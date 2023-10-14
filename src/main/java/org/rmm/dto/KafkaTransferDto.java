package org.rmm.dto;


public class KafkaTransferDto {

    private Object object;
    private String name;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
