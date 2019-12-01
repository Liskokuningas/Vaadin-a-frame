package com.tsc.aframe;

import com.tsc.aframe.base.AFrameBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-entity")
@JsModule("aframe/dist/aframe-v0.9.2.min.js")
@NpmPackage(value = "aframe", version = "^0.9.2")
public class Aentity extends AFrameBase {

	public Aentity() {
		super();
		mapAttributes();
	}
	
	public Aentity(String attributes) {
		super(attributes);
		mapAttributes();
	}
	
	private void mapAttributes() {
		
	}
	   
}
