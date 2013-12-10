package be.ehb.iwt.sidin.appengine;

import org.restlet.resource.Get;


import be.ehb.iwt.sidin.appengine.core.TeacherList;

public interface ITeachersResource {
	
	@Get
	public TeacherList retrieve();

}
