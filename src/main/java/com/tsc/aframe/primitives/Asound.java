package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.interfaces.IAframeBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-sound")
@JsModule("aframe/dist/aframe-v1.0.0.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Asound extends AFrameBase implements IAframeBase {
	
	public Asound() {
		super();
		modifyAttributes();
	}
	public Asound(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	
	private void modifyAttributes() {
		attributesMap.put("autoplay", "autoplay");
		attributesMap.put("loop", "loop");
		attributesMap.put("on", "on");
		attributesMap.put("src", "src");
		attributesMap.put("volume", "volume");				
	}
	
	public String getAutoplay() {
		return this.getElement().getAttribute( "autoplay" );		
	}
	public void setAutoplay(String autoplay) {
		this.getElement().setAttribute( "autoplay", autoplay );		
	}
	public String getLoop() {
		return this.getElement().getAttribute( "loop" );		
	}
	public void setLoop(String loop) {
		this.getElement().setAttribute( "loop", loop );		
	}
	public String getOn() {
		return this.getElement().getAttribute( "on" );		
	}
	public void setOn(String on) {
		this.getElement().setAttribute( "on", on );		
	}
	public String getSrc() {
		return this.getElement().getAttribute( "src" );		
	}
	public void setSrc(String src) {
		this.getElement().setAttribute( "src", src );		
	}
	public String getVolume() {
		return this.getElement().getAttribute( "volume" );		
	}
	public void setVolume(String volume) {
		this.getElement().setAttribute( "volume", volume );		
	}
}
