package be.ehb.iwt.sidin.appengine;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import be.ehb.iwt.sidin.appengine.core.Event;

public class EventServerResource extends ServerResource implements
IEventResource  {
	
	@Override
	@Get
	public Event retrieve() {
		Long value  = Long.parseLong((String)getRequest().getAttributes().get("id"));
		Event event  = OfyService.ofy().load().type(Event.class).id(value).get();
		return event;	
	}
	
	@Override
	@Post
	public void store(Event e) {
		OfyService.ofy().save().entities(e).now();
	}

	@Override
	@Delete
	public void remove() {
		Long value  = Long.parseLong((String)getRequest().getAttributes().get("id"));
		Event e = OfyService.ofy().load().type(Event.class).id(value).get();
		OfyService.ofy().delete().entity(e);
	}

}
