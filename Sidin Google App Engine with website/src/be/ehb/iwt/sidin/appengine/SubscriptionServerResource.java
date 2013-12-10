package be.ehb.iwt.sidin.appengine;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import be.ehb.iwt.sidin.appengine.core.Subscription;

public class SubscriptionServerResource extends ServerResource implements
		ISubscriptionResource {
	@Override
	@Get
	public Subscription retrieve() {
		// TODO Auto-generated method stub
		Long value = Long.parseLong((String) getRequest().getAttributes().get("id"));
		Subscription subsc = OfyService.ofy().load().type(Subscription.class).id(value).get();
		return subsc;

	}

	@Override
	@Post
	public void store(Subscription e) {
		OfyService.ofy().save().entities(e).now();

	}

	@Override
	@Delete
	public void remove() {
		Long value  = Long.parseLong((String)getRequest().getAttributes().get("id"));
		Subscription e = OfyService.ofy().load().type(Subscription.class).id(value).get();
		OfyService.ofy().delete().entity(e);
	}

}
