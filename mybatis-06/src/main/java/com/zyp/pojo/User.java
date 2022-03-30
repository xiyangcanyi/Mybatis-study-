package com.zyp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Alias("user1")
public class User {
    private int id;
    private String name;
    private String password;
}
