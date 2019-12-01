package com.tsc.aframe.interfaces;

import java.util.HashMap;
import java.util.Map;

import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.utils.Gulper;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasElement;

public interface IAframeBase extends HasElement, HasComponents {
	
	Map<String, String> attributesMap = new HashMap<String, String>();
	
	public default Map<String, String> getAttributesMap() {
		return attributesMap;		
	}
	
	public default void setAttribute(String attribute, String value) {
		this.getElement().setAttribute(attribute, value);
	}
	
	public default String getAttribute(String attribute) {
		return this.getElement().getAttribute(attribute);
	}
	
	public default AFrameBase addXml(String elementXml) {
		AFrameBase aFrameBaseObj = Gulper.aFrameFactory(elementXml);
		if ( aFrameBaseObj != null ) {
			this.add(aFrameBaseObj);
		}
		return aFrameBaseObj;
	}
	
}
