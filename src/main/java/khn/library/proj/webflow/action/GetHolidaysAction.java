package khn.library.proj.webflow.action;


import java.util.Date;
import java.util.List;


import khn.library.proj.service.LibraryService;

import org.springframework.webflow.execution.Action;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

public class GetHolidaysAction implements Action{
	
	private LibraryService libraryService;
	
	public void setLibraryService (LibraryService libraryService) {
		this.libraryService = libraryService;
	}
	@Override
	public Event execute (RequestContext context) {
		Event event = null;
		
		List<Date> holidays = libraryService.getHolidays();
		if (holidays != null) {
			context.getFlowScope().put("holidays", holidays);
			event = new Event(this,"success");
		}
		else {
			event = new Event(this, "error");
		}
	return event;
	}
}

