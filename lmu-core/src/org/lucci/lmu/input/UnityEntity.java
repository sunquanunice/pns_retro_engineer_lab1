package org.lucci.lmu.input;

import org.lucci.lmu.Entity;

public class UnityEntity {
	
	public UnityEntity(String unityName) {
	}
	public static Entity getEntity(String unityName) {
		Entity entity = new Entity();
		entity.setName(unityName);
		//TODO set an attribute for identifying unity deployment 
		return entity;
	}
	

}
