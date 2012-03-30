package com.loiane.gxt3.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.box.MessageBox;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		MessageBox messageBox = new MessageBox("First GXT 3 App", "Hello, World!");
		
		RootPanel.get().add(messageBox);
		
		messageBox.show();

	}

}
