package org.employee360.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.employee360.bo.Feedback;
import org.employee360.bo.FeedbackList;
import org.employee360.bo.FeedbackType;
import org.employee360.util.DataBase;

@Path("/feedback")
public class FeedbackService {

	public FeedbackService() {
		Feedback feedback = new Feedback("1B90", "5WJ5", new FeedbackType("PT Feedback"),
				"Great work! Continue the spirit");
		DataBase.feedbackMap.put(feedback.getFeedbackId(), feedback);
		feedback = new Feedback("5WJ5", "Bakery", new FeedbackType("FOOD Feedback"),
				"No. of Varieties have to be increased");
		DataBase.feedbackMap.put(feedback.getFeedbackId(), feedback);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public FeedbackList getFeedbacks(@QueryParam("feedbackId") String feedbackId) {
		FeedbackList feedbackList = new FeedbackList();
		if (feedbackId != null) {
			Feedback feedback = DataBase.feedbackMap.get(Integer.parseInt(feedbackId));
			List<Feedback> tempFeedbackList = new ArrayList<>();
			tempFeedbackList.add(feedback);
			feedbackList.setFeedbackList(tempFeedbackList);

		} else {
			feedbackList.setFeedbackList(new ArrayList<>(DataBase.feedbackMap.values()));
		}
		return feedbackList;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Feedback addFeedback(Feedback feedback) {
		DataBase.feedbackMap.put(feedback.getFeedbackId(), feedback);
		return feedback;
	}

}
