package org.worney.springboot_bbs.entity;

import java.util.Date;

import lombok.Data;

@Data
public class BoardEntity {
    private long postId;
    private String writer;
    private String title;
    private String content;
    private String password;
    private Date createdAt;
    private Date updatedAt;
    private String categoryId;
    private int views;
}
