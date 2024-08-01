package com.zza.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    private int id;
    private String type;
    private String name;
    private String description;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
