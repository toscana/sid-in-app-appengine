package be.ehb.iwt.sidin.appengine;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.resource.Directory;
import org.restlet.routing.Router;



public class ServerApplication extends Application{
	@Override
	public Restlet createInboundRoot(){
		Router router = new Router(getContext());
		router.attachDefault(new Directory(getContext(),"war:///"));
		router.attach("/teachers",TeachersServerResource.class);
		router.attach("/teachers/{year}",TeachersServerResource.class);
		
		
		router.attach("/teacher", TeacherServerResource.class);
		router.attach("/teacher/{id}", TeacherServerResource.class);
		
		router.attach("/events",EventsServerResource.class);
		router.attach("/event", EventServerResource.class);
		router.attach("/event/{id}",EventServerResource.class);
		
		router.attach("/subscription",SubscriptionServerResource.class);
		router.attach("/subscription/{id}", SubscriptionServerResource.class);
		router.attach("/subscriptions", SubscriptionsServerResource.class);
		
		
		router.attach("/image",ImageServerResource.class);
		router.attach("/image/{id}",ImageServerResource.class);
		router.attach("/images",ImageServerResource.class);
		
		router.attach("/imagesversion",ImagesVersionServerResource.class);
				
		return router;
	}
	

}
