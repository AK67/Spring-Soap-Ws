package com.app.webservices.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.stage.beans.Event;

public class EventMaper implements RowMapper<Event> {

	public Event mapRow(ResultSet rs, int arg1)
			throws SQLException {
		Event event = new Event();
		event.setEvents(rs.getString("Event"));
		event.setNotice(rs.getString("Notice"));
		return event;
	}

}
