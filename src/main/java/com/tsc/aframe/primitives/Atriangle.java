package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFramePrimitiveBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-triangle")
@JsModule("aframe/dist/aframe-v0.9.2.min.js")
@NpmPackage(value = "aframe", version = "^0.9.2")
public class Atriangle extends AFramePrimitiveBase {
	
	public Atriangle() {
		super();
		modifyAttributes();		
	}
	public Atriangle(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	
	private void modifyAttributes() {
		attributesMap.put("spherical-env-map", "sphericalenvmap");
		attributesMap.put("vertex-a", "vertexa");
		attributesMap.put("vertex-b", "vertexb");
		attributesMap.put("vertex-c", "vertexc");
		
	}
	
	public String getSphericalenvmap() {
		return this.getElement().getAttribute( "spherical-env-map" );		
	}
	public void setSphericalenvmap(String sphericalenvmap) {
		this.getElement().setAttribute( "spherical-env-map", sphericalenvmap );		
	}
	public String getVertexa() {
		return this.getElement().getAttribute( "vertex-a" );		
	}
	public void setVertexa(String vertexa) {
		this.getElement().setAttribute( "vertex-a", vertexa );		
	}
	public String getVertexb() {
		return this.getElement().getAttribute( "vertex-b" );		
	}
	public void setVertexb(String vertexb) {
		this.getElement().setAttribute( "vertex-b", vertexb );		
	}
	public String getVertexc() {
		return this.getElement().getAttribute( "vertex-c" );		
	}
	public void setVertexc(String vertexc) {
		this.getElement().setAttribute( "vertex-c", vertexc );		
	}
}
