package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.interfaces.IAframeBase;
import com.tsc.aframe.utils.Helpers;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-obj-model")
@JsModule("aframe/dist/aframe-v1.0.0.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Aobjmodel extends AFrameBase {
	
	public Aobjmodel() {
		super();
		modifyAttributes();		
	}
	public Aobjmodel(String attributes) {
		super(attributes);
		modifyAttributes();	
	}
	private void modifyAttributes() {
		attributesMap.put("mtl", "mtl");
		attributesMap.put("src", "src");
	}
	
	public String getMtl() {
		return this.getElement().getAttribute( "mtl" );		
	}
	public void setMtl(String mtl) {
		this.getElement().setAttribute( "mtl", mtl );		
	}
	public String getSrc() {
		return this.getElement().getAttribute( "src" );		
	}
	public void setSrc(String src) {
		this.getElement().setAttribute( "src", src );		
	}
}
