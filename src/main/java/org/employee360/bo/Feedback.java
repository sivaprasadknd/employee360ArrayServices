package org.employee360.bo;

public class Feedback {

	private Integer feedbackId;
	private String empId;
	private String to;
	private FeedbackType feedbackType;
	private String description;

	public static Integer feedCount = 0;

	public Feedback() {

	}

	public Feedback(String empId, String to, FeedbackType feedbackType, String description) {
		this.feedbackId = ++feedCount;
		this.empId = empId;
		this.to = to;
		this.feedbackType = feedbackType;
		this.description = description;

	}

	public Integer getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public FeedbackType getFeedbackType() {
		return feedbackType;
	}

	public void setFeedbackType(FeedbackType feedbackType) {
		this.feedbackType = feedbackType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
