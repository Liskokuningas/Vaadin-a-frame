package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFramePrimitiveBase;
import com.tsc.aframe.utils.Helpers;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-circle")
@JsModule("aframe/dist/aframe-v1.0.0.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Acircle extends AFramePrimitiveBase {
	
	public Acircle() {
		super();
		modifyAttributes();
	}
	public Acircle(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	private void modifyAttributes() {
		attributesMap.put("radius", "radius");
		attributesMap.put("segments", "segments");
		attributesMap.put("spherical-env-map", "sphericalenvmap");
		attributesMap.put("theta-length", "thetalength");
		attributesMap.put("theta-start", "thetastart");
		
	}
	public String getRadius() {
		return this.getElement().getAttribute( "radius" );		
	}
	public void setRadius(String radius) {
		this.getElement().setAttribute( "radius", radius );		
	}
	public String getSegments() {
		return this.getElement().getAttribute( "segments" );
	}
	public void setSegments(String segments) {
		this.getElement().setAttribute( "segments", segments );
	}
	public String getSphericalenvmap() {
		return this.getElement().getAttribute( "spherical-env-map" );
	}
	public void setSphericalenvmap(String sphericalenvmap) {
		this.getElement().setAttribute( "spherical-env-map", sphericalenvmap );
	}
	public String getThetalength() {
		return this.getElement().getAttribute( "theta-length" );
	}
	public void setThetalength(String thetalength) {
		this.getElement().setAttribute( "theta-length", thetalength );
	}
	public String getThetastart() {
		return this.getElement().getAttribute( "theta-start" );
	}
	public void setThetastart(String thetastart) {
		this.getElement().setAttribute( "theta-start", thetastart );
	}
}
