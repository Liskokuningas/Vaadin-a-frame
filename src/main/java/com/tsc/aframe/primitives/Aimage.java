package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFrameMediaBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-image")
@JsModule("aframe/dist/aframe-v0.9.2.min.js")
@NpmPackage(value = "aframe", version = "^0.9.2")
public class Aimage extends AFrameMediaBase {
	
	public Aimage() {
		super();
		modifyAttributes();
	}
	public Aimage(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	private void modifyAttributes() {
		attributesMap.put("width", "width");		
	}
	public String getWidth() {
		return this.getElement().getAttribute( "width" );		
	}
	public void setWidth(String width) {
		this.getElement().setAttribute( "width", width );		
	}
}
