package com.zuehlke.contacts.ui.tests;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.junit.Assert;
import org.junit.Test;

public class PerpectiveTest {

	@Test
	public void testPerspective() {
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		Assert.assertEquals("Contacts Perspective", bot.activePerspective().getLabel());
	}
	
}
