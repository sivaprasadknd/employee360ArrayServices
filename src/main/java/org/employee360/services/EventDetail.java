package org.employee360.services;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.employee360.bo.Event;
import org.employee360.bo.EventsList;
import org.employee360.util.DataBase;

@Path("/event")
public class EventDetail {

	public EventDetail() {
		DataBase.eventMap.put(1,
				new Event("1", "New Store in Hyderabad", "Colruytgroup opened a new store in Madhapur."));
		DataBase.eventMap.put(2, new Event("2", "CI celebrating 11 years", "BP&S Hyderabad completed 11 Years."));
		DataBase.eventMap.put(3, new Event("3", "Hackathon in Colruyt India", "BP&S Hyderabad conducting Hackathon in CI"));
		DataBase.eventMap.put(4, new Event("4", "CI acquired new building in Hyderabad", "BP&S Hyderabad acquired a new building in Hyderabad"));
		DataBase.eventMap.put(5, new Event("5", "CI crossed 1000 employees", "In 2018 Colruyt India crossed 1000 employees"));
	}

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to the
	 * client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public EventsList getEvents() {
		EventsList eventsList = new EventsList();
		eventsList.setEventsList(new ArrayList<Event>(DataBase.eventMap.values()));
		return eventsList;
	}

	@GET
	@Path("/{eventId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Event getEvent(@PathParam("eventId") String eventId) {
		return DataBase.eventMap.get(Integer.parseInt(eventId));
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Event addEvent(Event event) {
		DataBase.eventMap.put(Integer.parseInt(event.getEventId()), event);
		return DataBase.eventMap.get(Integer.parseInt(event.getEventId()));
	}
	
	@DELETE
	@Path("/{eventId}")
	public void deleteEvent(@PathParam("eventId") String eventId) {
		DataBase.eventMap.remove(Integer.parseInt(eventId));
	}

}
