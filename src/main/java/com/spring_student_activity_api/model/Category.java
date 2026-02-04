package com.spring_student_activity_api.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "act_category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId")
    private Integer categoryId;

    @Column(name = "categoryNameTh")
    private String categoryNameTh;

    @Column(name = "categoryNameEng")
    private String categoryNameEng;

    @Column(name = "categoryShotName")
    private String categoryShotName;

    @Column(name = "categoryFree")
    private Integer categoryFree;

    @Column(name = "categoryStatus")
    private Integer categoryStatus;

    @Column(name = "categoryIsRequest")
    private Integer categoryIsRequest;

    @Column(name = "categoryCreateAt")
    private Date categoryCreateAt;

    @Column(name = "categoryUpdateAt")
    private Date categoryUpdateAt;

    public Category() {
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryNameTh() {
        return categoryNameTh;
    }

    public void setCategoryNameTh(String categoryNameTh) {
        this.categoryNameTh = categoryNameTh;
    }

    public String getCategoryNameEng() {
        return categoryNameEng;
    }

    public void setCategoryNameEng(String categoryNameEng) {
        this.categoryNameEng = categoryNameEng;
    }

    public String getCategoryShotName() {
        return categoryShotName;
    }

    public void setCategoryShotName(String categoryShotName) {
        this.categoryShotName = categoryShotName;
    }

    public Integer getCategoryFree() {
        return categoryFree;
    }

    public void setCategoryFree(Integer categoryFree) {
        this.categoryFree = categoryFree;
    }

    public Integer getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Integer categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public Integer getCategoryIsRequest() {
        return categoryIsRequest;
    }

    public void setCategoryIsRequest(Integer categoryIsRequest) {
        this.categoryIsRequest = categoryIsRequest;
    }

    public Date getCategoryCreateAt() {
        return categoryCreateAt;
    }

    public void setCategoryCreateAt(Date categoryCreateAt) {
        this.categoryCreateAt = categoryCreateAt;
    }

    public Date getCategoryUpdateAt() {
        return categoryUpdateAt;
    }

    public void setCategoryUpdateAt(Date categoryUpdateAt) {
        this.categoryUpdateAt = categoryUpdateAt;
    }
}
