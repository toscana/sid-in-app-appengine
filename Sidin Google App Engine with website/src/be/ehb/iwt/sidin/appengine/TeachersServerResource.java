package be.ehb.iwt.sidin.appengine;

import java.util.List;
import org.restlet.resource.ServerResource;
import org.restlet.resource.Get;

import be.ehb.iwt.sidin.appengine.core.Teacher;
import be.ehb.iwt.sidin.appengine.core.TeacherList;

public class TeachersServerResource extends ServerResource implements
		ITeachersResource {
	@Override
	@Get
	public TeacherList retrieve() {
		List<Teacher> teachers = OfyService.ofy().load().type(Teacher.class).list();
		TeacherList list = new TeacherList();
		list.setTeachers(teachers);
		return list;

	}

}
