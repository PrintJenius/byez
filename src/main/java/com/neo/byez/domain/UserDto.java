package com.neo.byez.domain;

import java.sql.Timestamp;

public class UserDto {

    private String id;
    private String pwd;
    private String name;
    private Integer bef_birth;
    private Integer af_birth;
    private String sex;
    private Integer tel_num;
    private Integer mobile_num;
    private String email;
    private String card_corp;
    private String card_num;
    private String mail_auth;
    private String mail_key;
    private String join_date; // now() -> 문자열로 변환하여 저장
    private String quit_date; // now() -> 문자열로 변환하여 저장
    private String join_state;
    private Timestamp recent_login;
    private String remark;
    private String reg_date; // now() -> 문자열로 변환하여 저장
    private String reg_id;
    private String up_date; // now() -> 문자열로 변환하여 저장
    private String up_id;

    public UserDto() {}

    public UserDto(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public UserDto(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public UserDto(String id, String pwd, String name, String email, String mail_key, String join_state, Timestamp recent_login) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.mail_key = mail_key;
        this.join_state = join_state;
        this.recent_login = recent_login;
    }

    // 회원가입 시 활용할 Dto 객체
    public UserDto(String id, String pwd, String name, Integer bef_birth, Integer af_birth, String sex, Integer tel_num,
            Integer mobile_num, String email, String reg_id,  String up_id) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.bef_birth = bef_birth;
        this.af_birth = af_birth;
        this.sex = sex;
        this.tel_num = tel_num;
        this.mobile_num = mobile_num;
        this.email = email;
        this.reg_id = reg_id;
        this.up_id = up_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBef_birth() {
        return bef_birth;
    }

    public void setBef_birth(Integer bef_birth) {
        this.bef_birth = bef_birth;
    }

    public Integer getAf_birth() {
        return af_birth;
    }

    public void setAf_birth(Integer af_birth) {
        this.af_birth = af_birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getTel_num() {
        return tel_num;
    }

    public void setTel_num(Integer tel_num) {
        this.tel_num = tel_num;
    }

    public Integer getMobile_num() {
        return mobile_num;
    }

    public void setMobile_num(Integer mobile_num) {
        this.mobile_num = mobile_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCard_corp() {
        return card_corp;
    }

    public void setCard_corp(String card_corp) {
        this.card_corp = card_corp;
    }

    public String getCard_num() {
        return card_num;
    }

    public void setCard_num(String card_num) {
        this.card_num = card_num;
    }

    public String getMail_auth() {
        return mail_auth;
    }

    public void setMail_auth(String mail_auth) {
        this.mail_auth = mail_auth;
    }

    public String getMail_key() {
        return mail_key;
    }

    public void setMail_key(String mail_key) {
        this.mail_key = mail_key;
    }

    public String getJoin_date() {
        return join_date;
    }

    public void setJoin_date(String join_date) {
        this.join_date = join_date;
    }

    public String getQuit_date() {
        return quit_date;
    }

    public void setQuit_date(String quit_date) {
        this.quit_date = quit_date;
    }

    public String getJoin_state() {
        return join_state;
    }

    public void setJoin_state(String join_state) {
        this.join_state = join_state;
    }

    public Timestamp getRecent_login() {
        return recent_login;
    }

    public void setRecent_login(Timestamp recent_login) {
        this.recent_login = recent_login;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

    public String getReg_id() {
        return reg_id;
    }

    public void setReg_id(String reg_id) {
        this.reg_id = reg_id;
    }

    public String getUp_date() {
        return up_date;
    }

    public void setUp_date(String up_date) {
        this.up_date = up_date;
    }

    public String getUp_id() {
        return up_id;
    }

    public void setUp_id(String up_id) {
        this.up_id = up_id;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", bef_birth=" + bef_birth +
                ", af_birth=" + af_birth +
                ", sex='" + sex + '\'' +
                ", tel_num='" + tel_num + '\'' +
                ", mobile_num='" + mobile_num + '\'' +
                ", email='" + email + '\'' +
                ", card_corp='" + card_corp + '\'' +
                ", card_num='" + card_num + '\'' +
                ", join_Date='" + join_date + '\'' +
                ", quit_date='" + quit_date + '\'' +
                ", join_state='" + join_state + '\'' +
                ", recent_login='" + recent_login + '\'' +
                ", remark='" + remark + '\'' +
                ", reg_date='" + reg_date + '\'' +
                ", reg_id='" + reg_id + '\'' +
                ", up_date='" + up_date + '\'' +
                ", up_id='" + up_id + '\'' +
                ", mail_auth='" + mail_auth + '\'' +
                ", mail_key='" + mail_key + '\'' +
                '}';
    }
}