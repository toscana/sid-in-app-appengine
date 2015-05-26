package be.ehb.iwt.sidin.appengine;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import be.ehb.iwt.sidin.appengine.core.School;
import be.ehb.iwt.sidin.appengine.core.Teacher;

public class SchoolServerResource extends ServerResource implements
		ISchoolResource {
	@Override
	@Get
	public School retrieve() {
				
		Long value = Long.parseLong((String) getRequest().getAttributes().get("id"));
		School t = OfyService.ofy().load().type(School.class).id(value).get();
		return t;

	}

	@Override
	@Post
	public void store(School t) {
		OfyService.ofy().save().entities(t).now();
	}

	@Override
	@Delete
	public void remove() {
		Long value  = Long.parseLong((String)getRequest().getAttributes().get("id"));
		School e = OfyService.ofy().load().type(School.class).id(value).get();
		OfyService.ofy().delete().entity(e);
	}

}
