package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFramePrimitiveBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-octahedron")
@JsModule("aframe/dist/aframe-v1.0.3.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Aoctahedron extends AFramePrimitiveBase {
	
	public Aoctahedron() {
		super();
		modifyAttributes();	
	}
	public Aoctahedron(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	private void modifyAttributes() {
		attributesMap.put("detail", "detail");
		attributesMap.put("radius", "radius");
		attributesMap.put("spherical-env-map", "sphericalenvmap");		
	}
	
	public String getDetail() {
		return this.getElement().getAttribute( "detail" );		
	}
	public void setDetail(String detail) {
		this.getElement().setAttribute( "detail", detail );		
	}
	public String getRadius() {
		return this.getElement().getAttribute( "radius" );		
	}
	public void setRadius(String radius) {
		this.getElement().setAttribute( "radius", radius );		
	}
	public String getSphericalenvmap() {
		return this.getElement().getAttribute( "spherical-env-map" );		
	}
	public void setSphericalenvmap(String sphericalenvmap) {
		this.getElement().setAttribute( "spherical-env-map", sphericalenvmap );		
	}
	
}
