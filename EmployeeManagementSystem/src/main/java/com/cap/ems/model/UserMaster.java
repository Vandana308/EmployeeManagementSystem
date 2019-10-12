package com.cap.ems.model;

public class UserMaster {
private String UserId, UserName, UserPassword, UserType;
public UserMaster() {
	
}
public UserMaster(String userId, String userName, String userPassword, String userType) {
	super();
	this.UserId = userId;
	this.UserName = userName;
	this.UserPassword = userPassword;
	this.UserType = userType;
}



public String getUserId() {
	return UserId;
}

public void setUserId(String userId) {
	UserId = userId;
}

public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
}

public String getUserPassword() {
	return UserPassword;
}

public void setUserPassword(String userPassword) {
	UserPassword = userPassword;
}

public String getUserType() {
	return UserType;
}

public void setUserType(String userType) {
	UserType = userType;
}
@Override
public String toString() {
	return "UserMaster [UserId=" + UserId + ", UserName=" + UserName + ", UserPassword=" + UserPassword + ", UserType="
			+ UserType + "]";
}

}
