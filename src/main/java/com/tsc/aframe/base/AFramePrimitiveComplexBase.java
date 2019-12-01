package com.tsc.aframe.base;

import java.util.Map;

import com.tsc.aframe.utils.Helpers;

public class AFramePrimitiveComplexBase extends AFramePrimitiveBase {
	
	public AFramePrimitiveComplexBase() {
		super();
		fetchPrimitiveBasicAttributes(attributesMap);
	}
	
	public AFramePrimitiveComplexBase(String attributes) {
		super(attributes);
		fetchPrimitiveBasicAttributes(attributesMap);
	}
	
	private void fetchPrimitiveBasicAttributes( Map<String, String> attributesMap ) {
		attributesMap.put("open-ended", "openended");		
		attributesMap.put("radius-bottom", "radiusbottom");
		attributesMap.put("radius-top", "radiustop");
		attributesMap.put("segments-height", "segmentsheight");
		attributesMap.put("segments-radial", "segmentsradial");
		attributesMap.put("spherical-env-map", "sphericalenvmap");
		attributesMap.put("theta-length", "thetalength");
		attributesMap.put("theta-start", "thetastart");	
	}
	public String getOpenended() {
		return this.getElement().getAttribute( "openended" );
	}
	public void setOpenended(String openended) {
		this.getElement().setAttribute( "openended", openended );	
	}
	public String getRadiusbottom() {
		return this.getElement().getAttribute( "radius-bottom" );
	}
	public void setRadiusbottom(String radiusbottom) {
		this.getElement().setAttribute( "radius-bottom", radiusbottom );	
	}
	public String getRadiustop() {
		return this.getElement().getAttribute( "radius-top" );
	}
	public void setRadiustop(String radiustop) {
		this.getElement().setAttribute( "radius-top", radiustop );	
	}
	public String getSegmentsheight() {
		return this.getElement().getAttribute( "segments-height" );
	}
	public void setSegmentsheight(String segmentsheight) {
		this.getElement().setAttribute( "segments-height", segmentsheight );	
	}
	public String getSegmentsradial() {
		return this.getElement().getAttribute( "segments-radial" );
	}
	public void setSegmentsradial(String segmentsradial) {
		this.getElement().setAttribute( "segments-radial", segmentsradial );	
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
