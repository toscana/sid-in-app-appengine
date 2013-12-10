package be.ehb.iwt.sidin.appengine.core;

import java.io.Serializable;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Image implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8721047703302981359L;
	
	@Id
	private Long id;
	private byte[] image;
	private int priority;
	
	
	public Image(){
	}
	
	public Image(byte[] image, int priority) {
		super();
		this.image = image;
		this.priority = priority;
	}
	public Image(Long id, byte[] image, int priority) {
		super();
		this.id = id;
		this.image = image;
		this.priority = priority;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	

}
