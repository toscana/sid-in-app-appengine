package be.ehb.iwt.sidin.appengine;

import org.restlet.resource.Get;

import be.ehb.iwt.sidin.appengine.core.SchoolList;
import be.ehb.iwt.sidin.appengine.core.SubscriptionList;

public interface ISchoolsResource {
	@Get
	public SchoolList retrieve();

}
