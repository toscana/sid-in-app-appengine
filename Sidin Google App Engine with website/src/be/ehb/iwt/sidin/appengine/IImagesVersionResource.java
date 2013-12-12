package be.ehb.iwt.sidin.appengine;


import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

import be.ehb.iwt.sidin.appengine.core.Image;
import be.ehb.iwt.sidin.appengine.core.ImageList;


public interface IImagesVersionResource {
	
	@Get
	public Integer retrieve();

}
