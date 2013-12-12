package be.ehb.iwt.sidin.appengine;

import java.util.List;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import be.ehb.iwt.sidin.appengine.core.Image;
import be.ehb.iwt.sidin.appengine.core.ImageList;
import be.ehb.iwt.sidin.appengine.core.ImageVersion;

public class ImagesVersionServerResource extends ServerResource implements
		IImagesVersionResource {

	public Integer retrieve() {
		
		ImageVersion im = OfyService.ofy().load().type(ImageVersion.class).first().get();
		
		return new Integer(im.getVersion());
	}
}
