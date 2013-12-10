package be.ehb.iwt.sidin.appengine;

import org.restlet.resource.Get;

import be.ehb.iwt.sidin.appengine.core.SubscriptionList;

public interface ISubscriptionsResource {
	@Get
	public SubscriptionList retrieve();

}
