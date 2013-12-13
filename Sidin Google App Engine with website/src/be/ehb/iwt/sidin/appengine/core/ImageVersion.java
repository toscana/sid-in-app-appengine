package be.ehb.iwt.sidin.appengine.core;

import java.io.Serializable;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class ImageVersion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1409291403011394980L;
	@Id
	private Long id;
	private int version;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public ImageVersion() {
		super();
	}
	
	public void increase(){
		version++;
	}
	
	

}
