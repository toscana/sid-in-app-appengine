package be.ehb.iwt.sidin.appengine;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

import be.ehb.iwt.sidin.appengine.core.School;
import be.ehb.iwt.sidin.appengine.core.Teacher;

public interface ISchoolResource {
	@Get
	public School retrieve();
	
	@Post
	public void store(School t);
	
	@Delete
	public void remove();
}
