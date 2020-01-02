package com.tsc.aframe;

import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.interfaces.IAframeBase;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-scene")
@JsModule("aframe/dist/aframe-v1.0.3.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
/*
 If you wish to include your own JS modules in the add-on jar, add the module
 files to './src/main/resources/META-INF/resources/frontend' and insert an
 annotation @JsModule("./my-module.js") here.
*/
public class Ascene extends AFrameBase implements IAframeBase {
	
	public Ascene() {
		super();
		mapAttributes();
	}
	
	public Ascene(String attributes) {
		super(attributes);
		mapAttributes();
	}
	private void mapAttributes() {
		attributesMap.put("embedded", "embedded");		
	}
	public String getEmbedded() {		
		return this.getElement().getAttribute( "embedded" );
	}
	public void setEmbedded(String embedded) {
		this.getElement().setAttribute( "embedded", embedded );
	}
    
}
