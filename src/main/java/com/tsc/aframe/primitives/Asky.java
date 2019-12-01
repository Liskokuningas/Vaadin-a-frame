package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.interfaces.IAframeBase;
import com.tsc.aframe.utils.Helpers;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-sky")
@JsModule("aframe/dist/aframe-v0.9.2.min.js")
@NpmPackage(value = "aframe", version = "^0.9.2")
/*
 If you wish to include your own JS modules in the add-on jar, add the module
 files to './src/main/resources/META-INF/resources/frontend' and insert an
 annotation @JsModule("./my-module.js") here.
*/
public class Asky extends AFrameBase {
	public Asky() {
		super();
		modifyAttributes();
	}
	
	public Asky(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	private void modifyAttributes() {
		attributesMap.put("color", "color");
		attributesMap.put("metalness", "metalness");
		attributesMap.put("opacity", "opacity");
		attributesMap.put("phi-length", "philength");
		attributesMap.put("phi-start", "phistart");
		attributesMap.put("radius", "radius");
		attributesMap.put("repeat", "repeat");
		attributesMap.put("roughness", "roughness");
		attributesMap.put("segments-height", "segmentsheight");
		attributesMap.put("segments-width", "segmentswidth");
		attributesMap.put("shader", "shader");
		attributesMap.put("side", "side");
		attributesMap.put("src", "src");
		attributesMap.put("theta-length", "thetalength");
		attributesMap.put("theta-start", "thetastart");
		attributesMap.put("transparent", "transparent");
		
	}
	public String getColor() {
		return this.getElement().getAttribute( "color" );		
	}
	public void setColor(String color) {
		this.getElement().setAttribute( "color", color );		
	}
	public String getMetalness() {
		return this.getElement().getAttribute( "metalness" );		
	}
	public void setMetalness(String metalness) {
		this.getElement().setAttribute( "metalness", metalness );		
	}
	public String getOpacity() {
		return this.getElement().getAttribute( "opacity" );		
	}
	public void setOpacity(String opacity) {
		this.getElement().setAttribute( "opacity", opacity );		
	}
	public String getPhilength() {
		return this.getElement().getAttribute( "phi-length" );		
	}
	public void setPhilength(String philength) {
		this.getElement().setAttribute( "phi-length", philength );		
	}
	public String getPhistart() {
		return this.getElement().getAttribute( "phi-start" );		
	}
	public void setPhistart(String phistart) {
		this.getElement().setAttribute( "phi-start", phistart );		
	}
	public String getRadius() {
		return this.getElement().getAttribute( "radius" );		
	}
	public void setRadius(String radius) {
		this.getElement().setAttribute( "radius", radius );		
	}
	public String getRepeat() {
		return this.getElement().getAttribute( "repeat" );		
	}
	public void setRepeat(String repeat) {
		this.getElement().setAttribute( "repeat", repeat );		
	}
	public String getRoughness() {
		return this.getElement().getAttribute( "roughness" );		
	}
	public void setRoughness(String roughness) {
		this.getElement().setAttribute( "roughness", roughness );		
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
	public String getShader() {
		return this.getElement().getAttribute( "shader" );		
	}
	public void setShader(String shader) {
		this.getElement().setAttribute( "shader", shader );		
	}
	public String getSide() {
		return this.getElement().getAttribute( "side" );		
	}
	public void setSide(String side) {
		this.getElement().setAttribute( "side", side );		
	}
	public String getSrc() {
		return this.getElement().getAttribute( "src" );		
	}
	public void setSrc(String src) {
		this.getElement().setAttribute( "src", src );		
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
	public String getTransparent() {
		return this.getElement().getAttribute( "transparent" );		
	}
	public void setTransparent(String transparent) {
		this.getElement().setAttribute( "transparent", transparent );		
	}
}
