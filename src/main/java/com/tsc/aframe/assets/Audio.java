package com.tsc.aframe.assets;

import com.tsc.aframe.base.AFrameBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("audio")
@JsModule("aframe/dist/aframe-v1.0.3.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Audio extends AFrameBase {
	
	public Audio() {
		super();
		mapAttributes();
	}
	public Audio(String attributes) {
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

