package com.xpc.testjson.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ManVO implements Serializable {
    private static final long serialVersionUID = 777728899306981846L;
    private String name;
    @JsonProperty("性别")
    private String sex;
    private Integer age;
    private String color;
    @JsonIgnore
    private String password;
}
