package com.tsc.aframe.camera;

import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.interfaces.IAframeBase;
import com.tsc.aframe.utils.Helpers;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-camera")
@JsModule("aframe/dist/aframe-v1.0.3.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Acamera extends AFrameBase {
	
	public Acamera() {
		super();
		mapAttributes();
	}
	public Acamera(String attributes) {
		super(attributes);
		mapAttributes();
	}
	
	private void mapAttributes() {
		attributesMap.put("far", "far");
		attributesMap.put("fov", "fov");
		attributesMap.put("look-controls-enabled", "lookcontrolsenabled");
		attributesMap.put("near", "near");
		attributesMap.put("reverse-mouse-drag", "reversemousedrag");
		attributesMap.put("wasd-controls-enabled", "wasdcontrolsenabled");
	}
	public String getFar() {
		return this.getElement().getAttribute( "far" ) ;
	}
	public void setFar(String far) {
		this.getElement().setAttribute( "far", far );
	}
	public String getFov() {
		return this.getElement().getAttribute( "fov" ) ;
	}
	public void setFov(String fov) {
		this.getElement().setAttribute( "fov", fov );
	}
	public String getLookcontrolsenabled() {
		return this.getElement().getAttribute( "look-controls-enabled") ;
	}
	public void setLookcontrolsenabled(String lookcontrolsenabled) {
		this.getElement().setAttribute( "look-controls-enabled", lookcontrolsenabled );
	}
	public String getNear() {
		return this.getElement().getAttribute( "near" );
	}
	public void setNear(String near) {
		this.getElement().setAttribute( "near", near );
	}
	public String getReversemousedrag() {
		return this.getElement().getAttribute( "reverse-mouse-drag" );
	}
	public void setReversemousedrag(String reversemousedrag) {
		this.getElement().setAttribute( "reverse-mouse-drag", reversemousedrag );
	}
	public String getWasdcontrolsenabled() {
		return this.getElement().getAttribute( "wasd-controls-enabled" );
	}
	public void setWasdcontrolsenabled(String wasdcontrolsenabled) {
		this.getElement().setAttribute( "wasd-controls-enabled", wasdcontrolsenabled );
	}		
}
