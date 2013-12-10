package be.ehb.iwt.sidin.appengine;

import java.util.List;

import org.restlet.resource.ServerResource;
import org.restlet.resource.Get;

import be.ehb.iwt.sidin.appengine.core.Event;
import be.ehb.iwt.sidin.appengine.core.Subscription;
import be.ehb.iwt.sidin.appengine.core.SubscriptionList;
import be.ehb.iwt.sidin.appengine.core.Teacher;

public class SubscriptionsServerResource extends ServerResource implements
		ISubscriptionsResource {
	
	@Override
	@Get
	public SubscriptionList retrieve() {
		List<Subscription> subs  = OfyService.ofy().load().type(Subscription.class).list();
		SubscriptionList list = new SubscriptionList();
		
		for(Subscription s:subs){
			Long teachID = s.getTeacher().getId();
			Long eventID = s.getEvent().getId();
			Teacher t = OfyService.ofy().load().type(Teacher.class).filter("id",teachID).first().get();
			Event e = OfyService.ofy().load().type(Event.class).filter("id",eventID).first().get();
			s.setTeacher(t);
			s.setEvent(e);
		}				
		list.setSubscriptions(subs);
		return list;
		
	}

	

}
