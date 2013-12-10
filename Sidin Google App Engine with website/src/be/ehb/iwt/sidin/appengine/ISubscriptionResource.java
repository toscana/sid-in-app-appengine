package be.ehb.iwt.sidin.appengine;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;


import be.ehb.iwt.sidin.appengine.core.Subscription;

public interface ISubscriptionResource {
	@Get
	public Subscription retrieve();
	
	@Post
	public void store(Subscription e);
	
	@Delete
	public void remove();

	
}
