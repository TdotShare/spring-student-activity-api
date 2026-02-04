package com.spring_student_activity_api.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "act_activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activityId")
    private Integer activityId;

    @Column(name = "activityCategoryId")
    private Integer activityCategoryId;

    @Column(name = "activityCode")
    private String activityCode;

    @Column(name = "activityName")
    private String activityName;

    @Column(name = "activityNameEng")
    private String activityNameEng;

    @Column(name = "activityDetails")
    private String activityDetails;

    @Column(name = "activityUnit")
    private Integer activityUnit;

    @Column(name = "activityScore")
    private Integer activityScore;

    @Column(name = "activityFacultyCode")
    private Integer activityFacultyCode;

    @Column(name = "activityAgencyCode")
    private Integer activityAgencyCode;

    @Column(name = "activityTypeAgency")
    private Integer activityTypeAgency;

    @Column(name = "activitySemester")
    private Integer activitySemester;

    @Column(name = "activityYear")
    private Integer activityYear;

    @Column(name = "activityStatus")
    private Integer activityStatus;

    @Column(name = "activityIsShow")
    private Integer activityIsShow;

    @Column(name = "activityIsDelete")
    private Integer activityIsDelete;

    @Column(name = "activityIsRegister")
    private Integer activityIsRegister;

    @Column(name = "activityCampusId")
    private String activityCampusId;

    @Column(name = "activityHaveCertificate")
    private Integer activityHaveCertificate;

    @Column(name = "activityStatusLimited")
    private Integer activityStatusLimited;

    @Column(name = "activityAmountMax")
    private Integer activityAmountMax;

    @Column(name = "activityStartDate")
    private Date activityStartDate;

    @Column(name = "activityEndDate")
    private Date activityEndDate;

    @Column(name = "activityRegisterStartDate")
    private Date activityRegisterStartDate;

    @Column(name = "activityRegisterEndDate")
    private Date activityRegisterEndDate;

    @Column(name = "activityCreaetByUsername")
    private String activityCreaetByUsername;

    @Column(name = "activityUpdateByUsername")
    private String activityUpdateByUsername;

    @Column(name = "activityCreateAt")
    private Date activityCreateAt;

    @Column(name = "activityUpdateAt")
    private Date activityUpdateAt;

    @ManyToOne
    @JoinColumn(name = "activityCategoryId" , referencedColumnName = "categoryId" , insertable = false , updatable = false)
    private Category category;

    public Activity() {
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getActivityCategoryId() {
        return activityCategoryId;
    }

    public void setActivityCategoryId(Integer activityCategoryId) {
        this.activityCategoryId = activityCategoryId;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityNameEng() {
        return activityNameEng;
    }

    public void setActivityNameEng(String activityNameEng) {
        this.activityNameEng = activityNameEng;
    }

    public String getActivityDetails() {
        return activityDetails;
    }

    public void setActivityDetails(String activityDetails) {
        this.activityDetails = activityDetails;
    }

    public Integer getActivityUnit() {
        return activityUnit;
    }

    public void setActivityUnit(Integer activityUnit) {
        this.activityUnit = activityUnit;
    }

    public Integer getActivityScore() {
        return activityScore;
    }

    public void setActivityScore(Integer activityScore) {
        this.activityScore = activityScore;
    }

    public Integer getActivityFacultyCode() {
        return activityFacultyCode;
    }

    public void setActivityFacultyCode(Integer activityFacultyCode) {
        this.activityFacultyCode = activityFacultyCode;
    }

    public Integer getActivityAgencyCode() {
        return activityAgencyCode;
    }

    public void setActivityAgencyCode(Integer activityAgencyCode) {
        this.activityAgencyCode = activityAgencyCode;
    }

    public Integer getActivityTypeAgency() {
        return activityTypeAgency;
    }

    public void setActivityTypeAgency(Integer activityTypeAgency) {
        this.activityTypeAgency = activityTypeAgency;
    }

    public Integer getActivitySemester() {
        return activitySemester;
    }

    public void setActivitySemester(Integer activitySemester) {
        this.activitySemester = activitySemester;
    }

    public Integer getActivityYear() {
        return activityYear;
    }

    public void setActivityYear(Integer activityYear) {
        this.activityYear = activityYear;
    }

    public Integer getActivityIsShow() {
        return activityIsShow;
    }

    public void setActivityIsShow(Integer activityIsShow) {
        this.activityIsShow = activityIsShow;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public Integer getActivityIsDelete() {
        return activityIsDelete;
    }

    public void setActivityIsDelete(Integer activityIsDelete) {
        this.activityIsDelete = activityIsDelete;
    }

    public Integer getActivityIsRegister() {
        return activityIsRegister;
    }

    public void setActivityIsRegister(Integer activityIsRegister) {
        this.activityIsRegister = activityIsRegister;
    }

    public String getActivityCampusId() {
        return activityCampusId;
    }

    public void setActivityCampusId(String activityCampusId) {
        this.activityCampusId = activityCampusId;
    }

    public Integer getActivityHaveCertificate() {
        return activityHaveCertificate;
    }

    public void setActivityHaveCertificate(Integer activityHaveCertificate) {
        this.activityHaveCertificate = activityHaveCertificate;
    }

    public Integer getActivityStatusLimited() {
        return activityStatusLimited;
    }

    public void setActivityStatusLimited(Integer activityStatusLimited) {
        this.activityStatusLimited = activityStatusLimited;
    }

    public Integer getActivityAmountMax() {
        return activityAmountMax;
    }

    public void setActivityAmountMax(Integer activityAmountMax) {
        this.activityAmountMax = activityAmountMax;
    }

    public Date getActivityStartDate() {
        return activityStartDate;
    }

    public void setActivityStartDate(Date activityStartDate) {
        this.activityStartDate = activityStartDate;
    }

    public Date getActivityEndDate() {
        return activityEndDate;
    }

    public void setActivityEndDate(Date activityEndDate) {
        this.activityEndDate = activityEndDate;
    }

    public Date getActivityRegisterStartDate() {
        return activityRegisterStartDate;
    }

    public void setActivityRegisterStartDate(Date activityRegisterStartDate) {
        this.activityRegisterStartDate = activityRegisterStartDate;
    }

    public Date getActivityRegisterEndDate() {
        return activityRegisterEndDate;
    }

    public void setActivityRegisterEndDate(Date activityRegisterEndDate) {
        this.activityRegisterEndDate = activityRegisterEndDate;
    }

    public String getActivityCreaetByUsername() {
        return activityCreaetByUsername;
    }

    public void setActivityCreaetByUsername(String activityCreaetByUsername) {
        this.activityCreaetByUsername = activityCreaetByUsername;
    }

    public String getActivityUpdateByUsername() {
        return activityUpdateByUsername;
    }

    public void setActivityUpdateByUsername(String activityUpdateByUsername) {
        this.activityUpdateByUsername = activityUpdateByUsername;
    }

    public Date getActivityCreateAt() {
        return activityCreateAt;
    }

    public void setActivityCreateAt(Date activityCreateAt) {
        this.activityCreateAt = activityCreateAt;
    }

    public Date getActivityUpdateAt() {
        return activityUpdateAt;
    }

    public void setActivityUpdateAt(Date activityUpdateAt) {
        this.activityUpdateAt = activityUpdateAt;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
