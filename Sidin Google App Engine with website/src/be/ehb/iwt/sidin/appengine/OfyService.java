package be.ehb.iwt.sidin.appengine;

import be.ehb.iwt.sidin.appengine.core.Event;
import be.ehb.iwt.sidin.appengine.core.Image;
import be.ehb.iwt.sidin.appengine.core.Subscription;
import be.ehb.iwt.sidin.appengine.core.Teacher;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

	
public class OfyService {
	static {
		factory().register(Teacher.class);
		factory().register(Event.class);
		factory().register(Subscription.class);
		factory().register(Image.class);
	}

	public static Objectify ofy() {
		return ObjectifyService.ofy();
	}

	public static ObjectifyFactory factory() {
		return ObjectifyService.factory();
	}
}

