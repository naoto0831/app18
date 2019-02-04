package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.ebean.Finder;
import io.ebean.Model;

@Entity
public class Message extends Model{

	@Id
	public Long id;

	public String message;

	public static Finder<Long,Message> finder = new Finder<Long,Message>(Message.class);

	@Override
	public String toString() {
		return "id: " + id + " ,message: " + message;
	}
}
