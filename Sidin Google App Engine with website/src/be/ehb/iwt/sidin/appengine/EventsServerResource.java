package be.ehb.iwt.sidin.appengine;

import java.util.ArrayList;
import java.util.List;
import org.restlet.resource.ServerResource;
import org.restlet.resource.Get;

import be.ehb.iwt.sidin.appengine.core.Event;
import be.ehb.iwt.sidin.appengine.core.EventList;
import be.ehb.iwt.sidin.appengine.core.Teacher;
import be.ehb.iwt.sidin.appengine.core.TeacherList;



public class EventsServerResource extends ServerResource implements
		IEventsResource {
	@Override
	@Get
	public EventList retrieve() {
		
		try {
			Long value = Long.parseLong((String) getRequest().getAttributes().get("year"));
			int year = value.intValue();
			List<Event> evts = OfyService.ofy().load().type(Event.class).list();
			List<Event> evtsyear = new ArrayList<Event>();
			for(Event e: evts){
				if(e.getAcadyear() == year)
				evtsyear.add(e);
			}
			
			EventList list = new EventList();
		
			list.setEvents(evtsyear);
			return list;
		} catch (NumberFormatException e) {
			// no year provided
			List<Event> evts = OfyService.ofy().load().type(Event.class).list();
			EventList list = new EventList();
			list.setEvents(evts);
			return list;
		}
		
	}

	

}
