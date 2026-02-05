package com.spring_student_activity_api.model;


import java.sql.Date;



import jakarta.persistence.*;

@Entity
@Table(name = "act_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Integer userId;

    @Column(name = "userUsername")
    private String userUsername;

    @Column(name = "userCitizenId")
    private String userCitizenId;

    @Column(name = "userEmail")
    private String userEmail;

    @Column(name = "userStuCode")
    private String userStuCode;

    @Column(name = "userTitle")
    private String userTitle;

    @Column(name = "userFirstName")
    private String userFirstName;

    @Column(name = "userLastName")
    private String userLastName;

    @Column(name = "userFirstNameEng")
    private String userFirstNameEng;

    @Column(name = "userLastNameEng")
    private String userLastNameEng;

    @Column(name = "userFacultyCode")
    private Integer userFacultyCode;

    @Column(name = "userDepartmentCode")
    private Integer userDepartmentCode;

    @Column(name = "userProgramCode")
    private String userProgramCode;

    @Column(name = "userGroupCode")
    private String userGroupCode;

    @Column(name = "userPicture")
    private String userPicture;

    @Column(name = "userDrgreeAc")
    private String userDrgreeAc;

    @Column(name = "userTel")
    private String userTel;

    @Column(name = "userMobile")
    private String userMobile;

    @Column(name = "userTypeId")
    private Integer userTypeId;

    @Column(name = "userStatus")
    private Integer userStatus;

    @Column(name = "userCampusId")
    private String userCampusId;

    @Column(name = "userEduStatusId")
    private Integer userEduStatusId;

    @Column(name = "userEduStatusName")
    private String userEduStatusName;

    @Column(name = "userLevelId")
    private Integer userLevelId;

    @Column(name = "userLevelName")
    private String userLevelName;

    @Column(name = "userSectionId")
    private Integer userSectionId;

    @Column(name = "userSectionName")
    private String userSectionName;

    @Column(name = "userCreateAt")
    private Date userCreateAt;

    @Column(name = "userUpdateAt")
    private Date userUpdateAt;

    @Column(name = "userLastLoginAt")
    private Date userLastLoginAt;

    @ManyToOne
    @JoinColumn(name = "userTypeId" , referencedColumnName = "roleId" , insertable = false, updatable = false )
    private Role role;

    public User() {

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserCitizenId() {
        return userCitizenId;
    }

    public void setUserCitizenId(String userCitizenId) {
        this.userCitizenId = userCitizenId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserStuCode() {
        return userStuCode;
    }

    public void setUserStuCode(String userStuCode) {
        this.userStuCode = userStuCode;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserFirstNameEng() {
        return userFirstNameEng;
    }

    public void setUserFirstNameEng(String userFirstNameEng) {
        this.userFirstNameEng = userFirstNameEng;
    }

    public String getUserLastNameEng() {
        return userLastNameEng;
    }

    public void setUserLastNameEng(String userLastNameEng) {
        this.userLastNameEng = userLastNameEng;
    }

    public Integer getUserFacultyCode() {
        return userFacultyCode;
    }

    public void setUserFacultyCode(Integer userFacultyCode) {
        this.userFacultyCode = userFacultyCode;
    }

    public Integer getUserDepartmentCode() {
        return userDepartmentCode;
    }

    public void setUserDepartmentCode(Integer userDepartmentCode) {
        this.userDepartmentCode = userDepartmentCode;
    }

    public String getUserProgramCode() {
        return userProgramCode;
    }

    public void setUserProgramCode(String userProgramCode) {
        this.userProgramCode = userProgramCode;
    }

    public String getUserGroupCode() {
        return userGroupCode;
    }

    public void setUserGroupCode(String userGroupCode) {
        this.userGroupCode = userGroupCode;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public String getUserDrgreeAc() {
        return userDrgreeAc;
    }

    public void setUserDrgreeAc(String userDrgreeAc) {
        this.userDrgreeAc = userDrgreeAc;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserCampusId() {
        return userCampusId;
    }

    public void setUserCampusId(String userCampusId) {
        this.userCampusId = userCampusId;
    }

    public Integer getUserEduStatusId() {
        return userEduStatusId;
    }

    public void setUserEduStatusId(Integer userEduStatusId) {
        this.userEduStatusId = userEduStatusId;
    }

    public String getUserEduStatusName() {
        return userEduStatusName;
    }

    public void setUserEduStatusName(String userEduStatusName) {
        this.userEduStatusName = userEduStatusName;
    }

    public Integer getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(Integer userLevelId) {
        this.userLevelId = userLevelId;
    }

    public String getUserLevelName() {
        return userLevelName;
    }

    public void setUserLevelName(String userLevelName) {
        this.userLevelName = userLevelName;
    }

    public Integer getUserSectionId() {
        return userSectionId;
    }

    public void setUserSectionId(Integer userSectionId) {
        this.userSectionId = userSectionId;
    }

    public String getUserSectionName() {
        return userSectionName;
    }

    public void setUserSectionName(String userSectionName) {
        this.userSectionName = userSectionName;
    }

    public Date getUserCreateAt() {
        return userCreateAt;
    }

    public void setUserCreateAt(Date userCreateAt) {
        this.userCreateAt = userCreateAt;
    }

    public Date getUserUpdateAt() {
        return userUpdateAt;
    }

    public void setUserUpdateAt(Date userUpdateAt) {
        this.userUpdateAt = userUpdateAt;
    }

    public Date getUserLastLoginAt() {
        return userLastLoginAt;
    }

    public void setUserLastLoginAt(Date userLastLoginAt) {
        this.userLastLoginAt = userLastLoginAt;
    }
}