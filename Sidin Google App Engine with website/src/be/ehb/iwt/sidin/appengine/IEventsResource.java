package be.ehb.iwt.sidin.appengine;

import org.restlet.resource.Get;

import be.ehb.iwt.sidin.appengine.core.EventList;


public interface IEventsResource {
	
	@Get
	public EventList retrieve();

}
