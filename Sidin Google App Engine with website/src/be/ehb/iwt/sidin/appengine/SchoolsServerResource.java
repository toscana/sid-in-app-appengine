package be.ehb.iwt.sidin.appengine;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.Logger;

import org.restlet.resource.ServerResource;
import org.restlet.resource.Get;

import be.ehb.iwt.sidin.appengine.core.School;
import be.ehb.iwt.sidin.appengine.core.SchoolList;
import be.ehb.iwt.sidin.appengine.core.Subscription;
import be.ehb.iwt.sidin.appengine.core.Teacher;
import be.ehb.iwt.sidin.appengine.core.TeacherList;

public class SchoolsServerResource extends ServerResource implements
		ISchoolsResource {

	private static final Logger log = Logger.getLogger(ServerApplication.class
			.getName());

	@Override
	@Get
	public SchoolList retrieve() {

		List<School> schools = OfyService.ofy().load().type(School.class)
				.list();
		SchoolList schoolList = new SchoolList();
		schoolList.setSchools(schools);
		return schoolList;

	}

}
