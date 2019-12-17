package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFrameMediaBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-curvedimage")
@JsModule("aframe/dist/aframe-v1.0.0.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Acurvedimage extends AFrameMediaBase {
	
	public Acurvedimage() {
		super();
		modifyAttributes();
	}
	public Acurvedimage(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	
	private void modifyAttributes() {
		attributesMap.put("open-ended", "openended");
		attributesMap.put("radius", "radius");
		attributesMap.put("theta-length", "thetalength");
		attributesMap.put("theta-start", "thetastart");
		
	}
	public String getOpenended() {
		return this.getElement().getAttribute( "open-ended" );
	}
	public void setOpenended(String openended) {
		this.getElement().setAttribute( "open-ended", openended );
	}
	public String getRadius() {
		return this.getElement().getAttribute( "radius" );
	}
	public void setRadius(String radius) {
		this.getElement().setAttribute( "radius", radius );
	}
	public String getThetalength() {
		return this.getElement().getAttribute( "theta-length" );
	}

	public void setThetalength(String thetalength) {
		this.getElement().setAttribute( "theta-length", thetalength );
	}

	public String getThetastart() {
		return this.getElement().getAttribute( "thetastart" );
	}

	public void setThetastart(String thetastart) {
		this.getElement().setAttribute( "thetastart", thetastart );
	}
	
	
}
