package be.ehb.iwt.sidin.appengine;

import java.util.List;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import be.ehb.iwt.sidin.appengine.core.Image;
import be.ehb.iwt.sidin.appengine.core.ImageList;

public class ImageServerResource extends ServerResource implements
		IImageResource {

	@Override
	@Post
	public void store(Image i) {
		OfyService.ofy().save().entities(i).now();
	}

	@Override
	@Get
	public ImageList retrieve() {
		List<Image> images = OfyService.ofy().load().type(Image.class).list();
		ImageList list = new ImageList(images);
		return list;
	}
	
	@Override
	@Delete
	public void remove() {
		Long value  = Long.parseLong((String)getRequest().getAttributes().get("id"));
		Image i = OfyService.ofy().load().type(Image.class).id(value).get();
		OfyService.ofy().delete().entity(i);
	}

}
