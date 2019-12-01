package com.tsc.aframe.primitives;


import com.tsc.aframe.base.AFramePrimitiveBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-plane")
@JsModule("aframe/dist/aframe-v0.9.2.min.js")
@NpmPackage(value = "aframe", version = "^0.9.2")
/*
 If you wish to include your own JS modules in the add-on jar, add the module
 files to './src/main/resources/META-INF/resources/frontend' and insert an
 annotation @JsModule("./my-module.js") here.
*/
public class Aplane extends AFramePrimitiveBase {
	
	public Aplane() {
		super();
		modifyAttributes();
		
	}
	public Aplane(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	private void modifyAttributes() {
		attributesMap.put("segments-height", "segmentsheight");
		attributesMap.put("segments-width", "segmentswidth");
		attributesMap.put("spherical-env-map", "sphericalenvmap");			
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
	public String getSphericalenvmap() {
		return this.getElement().getAttribute( "spherical-env-map" );
	}
	public void setSphericalenvmap(String sphericalenvmap) {
		this.getElement().setAttribute( "spherical-env-map", sphericalenvmap );
	}
}
