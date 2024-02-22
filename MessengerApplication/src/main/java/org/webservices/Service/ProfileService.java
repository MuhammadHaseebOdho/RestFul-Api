package org.webservices.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.webservices.database.DatabaseConnection;
import org.webservices.model.Profile;

public class ProfileService {
	private Map<String, Profile> profiles = DatabaseConnection.getProfiles();

	public ProfileService() {

		
		/*
		 * profiles.put("Haseeb",new Profile(1,"Haseeb","Muhammad","Haseeb"));
		 * profiles.put("Zoha",new Profile(1,"Zoha","Zoha","Memon"));
		 */
		  
		 

	}

	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile removeProfile(String profileName) {

		return profiles.remove(profileName);
	}
}
