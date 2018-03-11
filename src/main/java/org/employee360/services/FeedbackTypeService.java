package org.employee360.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.employee360.bo.FeedbackType;
import org.employee360.bo.FeedbackTypeList;
import org.employee360.util.DataBase;

@Path("/feedbackType")
public class FeedbackTypeService {

	public FeedbackTypeService() {
		DataBase.feedbackTypeList.add(new FeedbackType("PT Feedback"));
		DataBase.feedbackTypeList.add(new FeedbackType("Facilities Feedback"));
		DataBase.feedbackTypeList.add(new FeedbackType("Food Feedback"));
		DataBase.feedbackTypeList.add(new FeedbackType("Other Feedback"));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public FeedbackTypeList getFeedbackTypeList() {
		FeedbackTypeList feedbackTypeList = new FeedbackTypeList();
		feedbackTypeList.setFeedbackTypeList(DataBase.feedbackTypeList);
		return feedbackTypeList;
	}

}
