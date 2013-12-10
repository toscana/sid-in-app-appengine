package be.ehb.iwt.sidin.appengine;


import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

import be.ehb.iwt.sidin.appengine.core.Image;
import be.ehb.iwt.sidin.appengine.core.ImageList;


public interface IImageResource {
	
	@Post
	public void store(Image i);
	
	@Get
	public ImageList retrieve();
	
	@Delete
	public void remove();

}
