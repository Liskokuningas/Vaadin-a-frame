package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFramePrimitiveBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-torus-knot")
@JsModule("aframe/dist/aframe-v0.9.2.min.js")
@NpmPackage(value = "aframe", version = "^0.9.2")
public class Atorusknot extends AFramePrimitiveBase {
	
	public Atorusknot() {
		super();
		modifyAttributes();
	}
	public Atorusknot(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	
	private void modifyAttributes() {
		attributesMap.put("p", "p");
		attributesMap.put("q", "q");
		attributesMap.put("radius", "radius");
		attributesMap.put("radius-tubular", "radiustubular");
		attributesMap.put("segments-radial", "segmentsradial");
		attributesMap.put("segments-tubular", "segmentstubular");
		attributesMap.put("spherical-env-map", "sphericalenvmap");
	}
	
	public String getP() {
		return this.getElement().getAttribute( "p" );		
	}
	public void setP(String p) {
		this.getElement().setAttribute( "p", p );		
	}
	public String getQ() {
		return this.getElement().getAttribute( "q" );		
	}
	public void setQ(String q) {
		this.getElement().setAttribute( "q", q );		
	}
	public String getRadius() {
		return this.getElement().getAttribute( "radius" );		
	}
	public void setRadius(String radius) {
		this.getElement().setAttribute( "radius", radius );		
	}
	public String getRadiustubular() {
		return this.getElement().getAttribute( "radius-tubular" );		
	}
	public void setRadiustubular(String radiustubular) {
		this.getElement().setAttribute( "radius-tubular", radiustubular );		
	}
	public String getSegmentsradial() {
		return this.getElement().getAttribute( "segments-radial" );		
	}
	public void setSegmentsradial(String segmentsradial) {
		this.getElement().setAttribute( "segments-radial", segmentsradial );		
	}
	public String getSegmentstubular() {
		return this.getElement().getAttribute( "segments-tubular" );		
	}
	public void setSegmentstubular(String segmentstubular) {
		this.getElement().setAttribute( "segments-tubular", segmentstubular );		
	}
	public String getSphericalenvmap() {
		return this.getElement().getAttribute( "spherical-env-map" );		
	}
	public void setSphericalenvmap(String sphericalenvmap) {
		this.getElement().setAttribute( "spherical-env-map", sphericalenvmap );		
	}
	
	
}
