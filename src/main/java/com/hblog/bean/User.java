package com.hblog.bean;

import org.springframework.stereotype.Component;
@Component
public class User {
    private Integer userId;

    private String userName;

    private String userPwd;

    private String userLoginIp;

    private String userRegisterTime;

    private String userHistoryloginTime;

    private String userHistoryloginDevice;

    private String userLoginState;

    private String userLoginBanned;

    private String userHeadimageSrc;

    private Integer userScore;

    private String userGrade;

    private String userReal;

    private String userLabel;

    private String userSignature;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserLoginIp() {
        return userLoginIp;
    }

    public void setUserLoginIp(String userLoginIp) {
        this.userLoginIp = userLoginIp == null ? null : userLoginIp.trim();
    }

    public String getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(String userRegisterTime) {
        this.userRegisterTime = userRegisterTime == null ? null : userRegisterTime.trim();
    }

    public String getUserHistoryloginTime() {
        return userHistoryloginTime;
    }

    public void setUserHistoryloginTime(String userHistoryloginTime) {
        this.userHistoryloginTime = userHistoryloginTime == null ? null : userHistoryloginTime.trim();
    }

    public String getUserHistoryloginDevice() {
        return userHistoryloginDevice;
    }

    public void setUserHistoryloginDevice(String userHistoryloginDevice) {
        this.userHistoryloginDevice = userHistoryloginDevice == null ? null : userHistoryloginDevice.trim();
    }

    public String getUserLoginState() {
        return userLoginState;
    }

    public void setUserLoginState(String userLoginState) {
        this.userLoginState = userLoginState == null ? null : userLoginState.trim();
    }

    public String getUserLoginBanned() {
        return userLoginBanned;
    }

    public void setUserLoginBanned(String userLoginBanned) {
        this.userLoginBanned = userLoginBanned == null ? null : userLoginBanned.trim();
    }

    public String getUserHeadimageSrc() {
        return userHeadimageSrc;
    }

    public void setUserHeadimageSrc(String userHeadimageSrc) {
        this.userHeadimageSrc = userHeadimageSrc == null ? null : userHeadimageSrc.trim();
    }

    public Integer getUserScore() {
        return userScore;
    }

    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade == null ? null : userGrade.trim();
    }

    public String getUserReal() {
        return userReal;
    }

    public void setUserReal(String userReal) {
        this.userReal = userReal == null ? null : userReal.trim();
    }

    public String getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(String userLabel) {
        this.userLabel = userLabel == null ? null : userLabel.trim();
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature == null ? null : userSignature.trim();
    }
}