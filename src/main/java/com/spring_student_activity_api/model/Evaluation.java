package com.spring_student_activity_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "act_evaluation")
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evaId")
    private Integer evaId;

    @Column(name = "evaStudentCode")
    private String evaStudentCode;

    @Column(name = "evaActivityId")
    private Integer evaActivityId;

    @Column(name = "evaGrade")
    private String evaGrade;

    @Column(name = "evaStatus")
    private Integer evaStatus;

    @Column(name = "evaFirstInsert")
    private Integer evaFirstInsert;

    @Column(name = "evaCreateAt")
    private Date evaCreateAt;

    @Column(name = "evaUpdateAt")
    private Date evaUpdateAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "evaActivityId", referencedColumnName = "activityId", insertable = false, updatable = false)
    @JsonIgnore // ไม่ให้โผล่ใน JSON ปกติ
    private Activity activity;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Evaluation() {
    }

    public Integer getEvaId() {
        return evaId;
    }

    public void setEvaId(Integer evaId) {
        this.evaId = evaId;
    }

    public String getEvaStudentCode() {
        return evaStudentCode;
    }

    public void setEvaStudentCode(String evaStudentCode) {
        this.evaStudentCode = evaStudentCode;
    }

    public Integer getEvaStatus() {
        return evaStatus;
    }

    public void setEvaStatus(Integer evaStatus) {
        this.evaStatus = evaStatus;
    }

    public String getEvaGrade() {
        return evaGrade;
    }

    public void setEvaGrade(String evaGrade) {
        this.evaGrade = evaGrade;
    }

    public Integer getEvaActivityId() {
        return evaActivityId;
    }

    public void setEvaActivityId(Integer evaActivityId) {
        this.evaActivityId = evaActivityId;
    }

    public Integer getEvaFirstInsert() {
        return evaFirstInsert;
    }

    public void setEvaFirstInsert(Integer evaFirstInsert) {
        this.evaFirstInsert = evaFirstInsert;
    }

    public Date getEvaCreateAt() {
        return evaCreateAt;
    }

    public void setEvaCreateAt(Date evaCreateAt) {
        this.evaCreateAt = evaCreateAt;
    }

    public Date getEvaUpdateAt() {
        return evaUpdateAt;
    }

    public void setEvaUpdateAt(Date evaUpdateAt) {
        this.evaUpdateAt = evaUpdateAt;
    }
}
