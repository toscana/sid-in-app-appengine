package be.ehb.iwt.sidin.appengine;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

import be.ehb.iwt.sidin.appengine.core.Event;

public interface IEventResource {
	@Get
	public Event retrieve();
	
	@Post
	public void store(Event e);
	
	@Delete
	public void remove();

	
}
