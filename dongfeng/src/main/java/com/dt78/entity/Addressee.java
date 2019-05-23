package com.dt78.entity;

public class Addressee {
   

	private Integer recipientsId;

    private String recipientsName;

    private String recipientsPhone;

    private String recipientsAddress;

    private Integer userId;

    public Integer getRecipientsId() {
        return recipientsId;
    }

    public void setRecipientsId(Integer recipientsId) {
        this.recipientsId = recipientsId;
    }

    public String getRecipientsName() {
        return recipientsName;
    }

    public void setRecipientsName(String recipientsName) {
        this.recipientsName = recipientsName;
    }

    public String getRecipientsPhone() {
        return recipientsPhone;
    }

    public void setRecipientsPhone(String recipientsPhone) {
        this.recipientsPhone = recipientsPhone;
    }

    public String getRecipientsAddress() {
        return recipientsAddress;
    }

    public void setRecipientsAddress(String recipientsAddress) {
        this.recipientsAddress = recipientsAddress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    @Override
   	public String toString() {
   		return "Addressee [recipientsId=" + recipientsId + ", recipientsName=" + recipientsName + ", recipientsPhone="
   				+ recipientsPhone + ", recipientsAddress=" + recipientsAddress + ", userId=" + userId + "]";
   	}
}