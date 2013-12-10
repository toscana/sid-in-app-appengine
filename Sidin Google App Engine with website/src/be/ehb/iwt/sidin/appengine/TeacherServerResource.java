package be.ehb.iwt.sidin.appengine;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import be.ehb.iwt.sidin.appengine.core.Teacher;

public class TeacherServerResource extends ServerResource implements
		ITeacherResource {
	@Override
	@Get
	public Teacher retrieve() {
		Long value = Long.parseLong((String) getRequest().getAttributes().get("id"));
		Teacher t = OfyService.ofy().load().type(Teacher.class).id(value).get();
		return t;

	}

	@Override
	@Post
	public void store(Teacher t) {
		OfyService.ofy().save().entities(t).now();
	}

	@Override
	@Delete
	public void remove() {
		Long value  = Long.parseLong((String)getRequest().getAttributes().get("id"));
		Teacher e = OfyService.ofy().load().type(Teacher.class).id(value).get();
		OfyService.ofy().delete().entity(e);
	}

}
