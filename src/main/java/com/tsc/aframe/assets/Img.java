package com.tsc.aframe.assets;

import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.interfaces.IAframeBase;
import com.tsc.aframe.utils.Helpers;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("img")
@JsModule("aframe/dist/aframe-v0.9.2.min.js")
@NpmPackage(value = "aframe", version = "^0.9.2")
public class Img extends AFrameBase implements IAframeBase {
	public Img() {
		super();
		mapAttributes();
	}
	public Img(String attributes) {
		super(attributes);
		mapAttributes();
	}
	
	private void mapAttributes() {
		attributesMap.put("src", "src");		
	}
	public String getSrc() {		
		return this.getElement().getAttribute( "src" );
	}
	public void setSrc(String src) {
		this.getElement().setAttribute( "src", src );
	}
	
}
