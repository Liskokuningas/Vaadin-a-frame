package com.tsc.aframe.camera;

import com.tsc.aframe.base.AFrameBase;
import com.vaadin.flow.component.Tag;

@Tag("a-marker-camera")
public class Amarkercamera extends AFrameBase {
	
	public Amarkercamera() {
		super();
		mapAttributes();
	}
	public Amarkercamera(String attributes) {
		super(attributes);
		mapAttributes();
	}
	
	private void mapAttributes() {
		attributesMap.put("preset", "preset");		
	}
	public String getPreset() {
		return this.getElement().getAttribute( "preset" ) ;
	}
	public void setPreset(String preset) {
		this.getElement().setAttribute( "preset", preset );
	}	
}
