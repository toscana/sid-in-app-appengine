package be.ehb.iwt.sidin.appengine;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

import be.ehb.iwt.sidin.appengine.core.Teacher;

public interface ITeacherResource {
	@Get
	public Teacher retrieve();
	
	@Post
	public void store(Teacher t);
	
	@Delete
	public void remove();
}
