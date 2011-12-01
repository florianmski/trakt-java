package com.jakewharton.trakt.enumerations;

import java.util.HashMap;
import java.util.Map;
import com.jakewharton.trakt.TraktEnumeration;

public enum ActivityAction implements TraktEnumeration {
    All("all"),
	Watching("episode"),
	Scrobble("show"),
	Checkin("movie"),
	Seen("list"),
	Collection("collection"),
	Rating("rating"),
	Watchlist("watchlist"),
	Shout("shout"),
	Created("created"),
	ItemAdded("item_added");
	
	private final String value;
	
	private ActivityAction(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
	
	private static final Map<String, ActivityAction> STRING_MAPPING = new HashMap<String, ActivityAction>();

	static {
		for (ActivityAction via : ActivityAction.values()) {
			STRING_MAPPING.put(via.toString().toUpperCase(), via);
		}
	}
	
	public static ActivityAction fromValue(String value) {
		return STRING_MAPPING.get(value.toUpperCase());
	}
}