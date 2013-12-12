package be.ehb.iwt.sidin.appengine;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.logging.Logger;
import org.restlet.resource.ServerResource;
import org.restlet.resource.Get;

import be.ehb.iwt.sidin.appengine.core.Subscription;
import be.ehb.iwt.sidin.appengine.core.Teacher;
import be.ehb.iwt.sidin.appengine.core.TeacherList;

public class TeachersServerResource extends ServerResource implements ITeachersResource {
	
	private static final Logger log = Logger.getLogger(ServerApplication.class.getName());
	
	@Override
	@Get
	public TeacherList retrieve() {

		try {
			Long value = Long.parseLong((String) getRequest().getAttributes().get("year"));
			int year = value.intValue();
			List<Teacher> teachers = OfyService.ofy().load().type(Teacher.class).list();
			List<Teacher> teachersyear = new ArrayList<Teacher>();
			for(Teacher t: teachers){
				if(t.getAcadyear() == year)
				teachersyear.add(t);
			}
			
			TeacherList list = new TeacherList();
		
			list.setTeachers(teachersyear);
			return list;
		} catch (NumberFormatException e) {
			// no year provided
			List<Teacher> teachers = OfyService.ofy().load().type(Teacher.class).list();
			TeacherList list = new TeacherList();
			list.setTeachers(teachers);
			return list;
		}
	

	}

}
