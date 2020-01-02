package com.tsc.aframe.assets;

import com.tsc.aframe.base.AFrameBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-asset-item")
@JsModule("aframe/dist/aframe-v1.0.3.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Aassetitem extends AFrameBase {
	public Aassetitem() {
		super();
		mapAttributes();
	}
	public Aassetitem(String attributes) {
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
