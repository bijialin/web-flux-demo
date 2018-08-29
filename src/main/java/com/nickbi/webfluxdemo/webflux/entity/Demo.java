package com.nickbi.webfluxdemo.webflux.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * demo entity
 *
 * @author nickbi
 * @date 2018-08-28
 */
@Data
@Builder
public class Demo implements Serializable {
    private String name;
    private String title;
    private Date date;

}
