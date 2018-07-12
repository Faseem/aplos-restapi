package com.aplos.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Aux072 on 17/04/2018.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String username;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_telnumber_one")
    private String userTelnumberOne;

    @Column(name = "user_telnumber_two")
    private String userTelnumberTwo;

    @Column(name = "user_image_path")
    private String userImagePath;

    @Column(name = "user_isActive")
    private Boolean userIsActive;

    @Column(name = "user_created_date")
    @Temporal(TemporalType.DATE)
    private Date userCreatedDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientRolePrivilageId")
    private List<ClientRolePrivilage> clientRolePrivilageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userAddressId")
    private List<UserAddress> userAddressList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "batchCreateByUserId")
    private List<Batch> batchList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientRoleAssignedByUserId")
    private List<ClientRole> clientRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientUserId")
    private List<ClientUser> clientUserList;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTelnumberOne() {
        return userTelnumberOne;
    }

    public void setUserTelnumberOne(String userTelnumberOne) {
        this.userTelnumberOne = userTelnumberOne;
    }

    public String getUserTelnumberTwo() {
        return userTelnumberTwo;
    }

    public void setUserTelnumberTwo(String userTelnumberTwo) {
        this.userTelnumberTwo = userTelnumberTwo;
    }

    public String getUserImagePath() {
        return userImagePath;
    }

    public void setUserImagePath(String userImagePath) {
        this.userImagePath = userImagePath;
    }

    public Boolean getUserIsActive() {
        return userIsActive;
    }

    public void setUserIsActive(Boolean userIsActive) {
        this.userIsActive = userIsActive;
    }

    public Date getUserCreatedDate() {
        return userCreatedDate;
    }

    public void setUserCreatedDate(Date userCreatedDate) {
        this.userCreatedDate = userCreatedDate;
    }

    public List<ClientRolePrivilage> getClientRolePrivilageList() {
        return clientRolePrivilageList;
    }

    public void setClientRolePrivilageList(List<ClientRolePrivilage> clientRolePrivilageList) {
        this.clientRolePrivilageList = clientRolePrivilageList;
    }

    public List<UserAddress> getUserAddressList() {
        return userAddressList;
    }

    public void setUserAddressList(List<UserAddress> userAddressList) {
        this.userAddressList = userAddressList;
    }

    public List<Batch> getBatchList() {
        return batchList;
    }

    public void setBatchList(List<Batch> batchList) {
        this.batchList = batchList;
    }

    public List<ClientRole> getClientRoleList() {
        return clientRoleList;
    }

    public void setClientRoleList(List<ClientRole> clientRoleList) {
        this.clientRoleList = clientRoleList;
    }

    public List<ClientUser> getClientUserList() {
        return clientUserList;
    }

    public void setClientUserList(List<ClientUser> clientUserList) {
        this.clientUserList = clientUserList;
    }
}
