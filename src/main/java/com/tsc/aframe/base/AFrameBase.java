package com.tsc.aframe.base;

import java.util.HashMap;

import com.tsc.aframe.interfaces.IAframeBase;
import com.tsc.aframe.utils.Gulper;
import com.vaadin.flow.component.Component;

public class AFrameBase extends Component implements IAframeBase {
	
	public AFrameBase() {
				
	}
	
	public AFrameBase(String attributes) {
		HashMap<String, String> attributesList = Gulper.parseXml(attributes);
		if ( !attributesList.isEmpty() ) {
			attributesList.forEach( (key, value) -> {								
				this.getElement().setAttribute(key, value);
			});
		}
	
	}	
}
