package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFramePrimitiveBase;
import com.tsc.aframe.utils.Helpers;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-box")
@JsModule("aframe/dist/aframe-v1.0.3.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Abox extends AFramePrimitiveBase {	
	
	public Abox() {
		super();
		modifyAttributes();		
	}
	public Abox(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	
	private void modifyAttributes() {
		attributesMap.put("depth", "depth");
		attributesMap.put("segments-depth", "segmentsdepth");
		attributesMap.put("segments-height", "segmentsheight");
		attributesMap.put("segments-width", "segmentswidth");
		attributesMap.put("spherical-env-map", "sphericalenvmap");		
	}
	
	public String getDepth() {
		return this.getElement().getAttribute( "depth" );		
	}
	public void setDepth(String depth) {
		this.getElement().setAttribute( "depth", depth );		
	}
	public String getSegmentsdepth() {
		return this.getElement().getAttribute( "segments-depth" );
	}
	public void setSegmentsdepth(String segmentsdepth) {
		this.getElement().setAttribute( "segments-depth", segmentsdepth );
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
		this.getElement().setAttribute( "segmentswidth", segmentswidth );
	}
	public String getSphericalenvmap() {
		return this.getElement().getAttribute( "spherical-env-map" );
	}
	public void setSphericalenvmap(String sphericalenvmap) {
		this.getElement().setAttribute( "spherical-env-map", sphericalenvmap );
	}
}
