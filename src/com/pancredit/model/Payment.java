/**
 * 
 */
package com.pancredit.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payment {

	private String id;
	private int applicationId;
	private String type;
	private String summary;
	private double amount;

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date postingDate;

	private boolean isCleared;

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date clearedDate;

	// Constructors, getters, and setters

	public Payment() {
		// this.Id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}

	public boolean isCleared() {
		return isCleared;
	}

	public void setCleared(boolean isCleared) {
		this.isCleared = isCleared;
	}

	public Date getClearedDate() {
		return clearedDate;
	}

	public void setClearedDate(Date clearedDate) {
		this.clearedDate = clearedDate;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", applicationId=" + applicationId + ", type=" + type + ", summary=" + summary
				+ ", amount=" + amount + ", postingDate=" + postingDate + ", isCleared=" + isCleared + ", clearedDate="
				+ clearedDate + "]";
	}

}
