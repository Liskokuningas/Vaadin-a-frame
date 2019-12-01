package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.base.AFramePrimitiveBase;
import com.tsc.aframe.interfaces.IAframeBase;
import com.tsc.aframe.utils.Helpers;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-ring")
@JsModule("aframe/dist/aframe-v0.9.2.min.js")
@NpmPackage(value = "aframe", version = "^0.9.2")
/*
 If you wish to include your own JS modules in the add-on jar, add the module
 files to './src/main/resources/META-INF/resources/frontend' and insert an
 annotation @JsModule("./my-module.js") here.
*/
public class Aring extends AFramePrimitiveBase {
	
	public Aring() {
		super();
		modifyAttributes();
		
	}
	public Aring(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	private void modifyAttributes() {
		attributesMap.put("radius-inner", "radiusinner");
		attributesMap.put("radius-outer", "radiusouter");
		attributesMap.put("segments-phi", "segmentsphi");
		attributesMap.put("segments-theta", "segmentstheta");
		attributesMap.put("spherical-env-map", "sphericalenvmap");
		attributesMap.put("theta-length", "thetalength");
		attributesMap.put("theta-start", "thetastart");		
	}
	
	public String getRadiusinner() {
		return this.getElement().getAttribute( "radius-inner" );
	}
	public void setRadiusinner(String radiusinner) {
		this.getElement().setAttribute( "radius-inner", radiusinner );
	}
	public String getRadiusouter() {
		return this.getElement().getAttribute( "radius-outer" );
	}
	public void setRadiusouter(String radiusouter) {
		this.getElement().setAttribute( "radius-outer", radiusouter );
	}
	public String getSegmentsphi() {
		return this.getElement().getAttribute( "segments-phi" );
	}
	public void setSegmentsphi(String segmentsphi) {
		this.getElement().setAttribute( "segments-phi", segmentsphi );
	}
	public String getSegmentstheta() {
		return this.getElement().getAttribute( "segments-theta" );
	}
	public void setSegmentstheta(String segmentstheta) {
		this.getElement().setAttribute( "segments-theta", segmentstheta );
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
	public String getShetastart() {
		return this.getElement().getAttribute( "theta-start" );
	}
	public void setShetastart(String thetastart) {
		this.getElement().setAttribute( "theta-start", thetastart );
	}
}
