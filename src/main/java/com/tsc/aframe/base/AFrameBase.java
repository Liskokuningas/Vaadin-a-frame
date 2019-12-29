package com.tsc.aframe.base;

import java.util.HashMap;
import java.util.Map;

import com.tsc.aframe.interfaces.IAframeBase;
import com.tsc.aframe.utils.Gulper;
import com.vaadin.flow.component.Component;

public class AFrameBase extends Component implements IAframeBase {
	
	protected Map<String, String> attributesMap = new HashMap<String, String>();
	
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

	
	public Map<String, String> getAttributesMap() {
		return attributesMap;		
	}
	
	public void setAttribute(String attribute, String value) {
		this.getElement().setAttribute(attribute, value);
	}
	
	public String getAttribute(String attribute) {
		return this.getElement().getAttribute(attribute);
	}
	
	public AFrameBase addXml(String elementXml) {
		AFrameBase aFrameBaseObj = Gulper.aFrameFactory(elementXml);
		if ( aFrameBaseObj != null ) {
			this.add(aFrameBaseObj);
		}
		return aFrameBaseObj;
	}
}
