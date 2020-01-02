package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.interfaces.IAframeBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-videosphere")
@JsModule("aframe/dist/aframe-v1.0.3.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Avideosphere extends AFrameBase {
	
	public Avideosphere() {
		super();
		modifyAttributes();
	}
	public Avideosphere(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	private void modifyAttributes() {
		attributesMap.put("autoplay", "autoplay");
		attributesMap.put("crossOrigin", "crossOrigin");
		attributesMap.put("loop", "loop");
		attributesMap.put("radius", "radius");
		attributesMap.put("segments-height", "segmentsheight");
		attributesMap.put("segments-width", "segmentswidth");
	}
	
	public String getAutoplay() {
		return this.getElement().getAttribute( "autoplay" );		
	}
	public void setAutoplay(String autoplay) {
		this.getElement().setAttribute( "autoplay", autoplay );		
	}
	public String getCrossOrigin() {
		return this.getElement().getAttribute( "crossOrigin" );		
	}
	public void setCrossOrigin(String crossOrigin) {
		this.getElement().setAttribute( "crossOrigin", crossOrigin );		
	}
	public String getLoop() {
		return this.getElement().getAttribute( "loop" );		
	}
	public void setLoop(String loop) {
		this.getElement().setAttribute( "loop", loop );		
	}
	public String getRadius() {
		return this.getElement().getAttribute( "radius" );		
	}
	public void setRadius(String radius) {
		this.getElement().setAttribute( "radius", radius );		
	}
	public String getSegmentsheight() {
		return this.getElement().getAttribute( "segments-height" );		
	}
	public void setSegmentsheight(String segmentsheight) {
		this.getElement().setAttribute( "segments-height", segmentsheight );		
	}
	public String getSegmentswidth() {
		return this.getElement().getAttribute( "segments-width" );		
	}
	public void setSegmentswidth(String segmentswidth) {
		this.getElement().setAttribute( "segments-width", segmentswidth );		
	}
	
	
}
