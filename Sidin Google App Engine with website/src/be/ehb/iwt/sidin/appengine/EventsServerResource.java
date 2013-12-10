package be.ehb.iwt.sidin.appengine;

import java.util.List;
import org.restlet.resource.ServerResource;
import org.restlet.resource.Get;

import be.ehb.iwt.sidin.appengine.core.Event;
import be.ehb.iwt.sidin.appengine.core.EventList;



public class EventsServerResource extends ServerResource implements
		IEventsResource {
	@Override
	@Get
	public EventList retrieve() {
		// TODO Auto-generated method stub
		List<Event> events= OfyService.ofy().load().type(Event.class).list();
		EventList list = new EventList(events);
		return list;
		
	}

	

}
