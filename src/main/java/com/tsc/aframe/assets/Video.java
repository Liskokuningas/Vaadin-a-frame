package com.tsc.aframe.assets;

import com.tsc.aframe.base.AFrameBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("video")
@JsModule("aframe/dist/aframe-v0.9.2.min.js")
@NpmPackage(value = "aframe", version = "^0.9.2")
public class Video extends AFrameBase {
	
	public Video() {
		super();
		mapAttributes();
	}
	public Video(String attributes) {
		super(attributes);
		mapAttributes();
	}
	
	private void mapAttributes() {
		attributesMap.put("autoplay", "autoplay");		
		attributesMap.put("preload", "preload");
	}
	public String getAutoplay() {		
		return this.getElement().getAttribute( "autoplay" );
	}
	public void setAutoplay(String autoplay) {
		this.getElement().setAttribute( "autoplay", autoplay );
	}
	public String getPreload() {		
		return this.getElement().getAttribute( "preload" );
	}
	public void setPreload(String preload) {
		this.getElement().setAttribute( "preload", preload );
	}	
}

