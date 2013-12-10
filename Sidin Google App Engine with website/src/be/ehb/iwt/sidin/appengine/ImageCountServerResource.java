package be.ehb.iwt.sidin.appengine;

import java.util.List;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import be.ehb.iwt.sidin.appengine.core.Image;
import be.ehb.iwt.sidin.appengine.core.ImageList;

public class ImageCountServerResource extends ServerResource implements
		IImageCountResource {

	public Integer retrieve() {
		List<Image> images = OfyService.ofy().load().type(Image.class).list();
		ImageList list = new ImageList(images);
		return new Integer(list.getImages().size());
	}
}
