package javastrava.model;

import java.io.Serializable;

import javastrava.model.reference.StravaResourceState;

/**
 * <p>
 * Things that implement this are part of the Strava data model
 * </p>
 *
 * @author Dan Shannon
 *
 */
public interface StravaEntity extends Serializable{
	/**
	 * @return Return the resource state of the entity
	 */
	public StravaResourceState getResourceState();
}
