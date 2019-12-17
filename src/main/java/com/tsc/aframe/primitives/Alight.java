package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.interfaces.IAframeBase;
import com.tsc.aframe.utils.Helpers;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-light")
@JsModule("aframe/dist/aframe-v1.0.0.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Alight extends AFrameBase {
	
	public Alight() {
		super();
		modifyAttributes();	
	}
	public Alight(String attributes) {
		super(attributes);
		modifyAttributes();	
	}
	private void modifyAttributes() {
		attributesMap.put("angle", "angle");
		attributesMap.put("color", "color");
		attributesMap.put("decay", "decay");
		attributesMap.put("distance", "distance");
		attributesMap.put("ground-color", "groundcolor");
		attributesMap.put("intensity", "intensity");
		attributesMap.put("penumbra", "penumbra");
		attributesMap.put("type", "type");
		attributesMap.put("target", "target");
			
	}	
	public String getAngle() {
		return this.getElement().getAttribute( "angle" );
	}
	public void setAngle(String angle) {
		this.getElement().setAttribute( "angle", angle );	
	}
	public String getColor() {
		return this.getElement().getAttribute( "color" );
	}
	public void setColor(String color) {
		this.getElement().setAttribute( "color", color );
	}
	public String getDecay() {
		return this.getElement().getAttribute( "decay" );
	}
	public void setDecay(String decay) {
		this.getElement().setAttribute( "decay", decay );
	}
	public String getDistance() {
		return this.getElement().getAttribute( "distance" );
	}
	public void setDistance(String distance) {
		this.getElement().setAttribute( "distance", distance );
	}
	public String getGroundcolor() {
		return this.getElement().getAttribute( "groundcolor" );
	}
	public void setGroundcolor(String groundcolor) {
		this.getElement().setAttribute( "groundcolor", groundcolor );
	}
	public String getIntensity() {
		return this.getElement().getAttribute( "intensity" );
	}
	public void setIntensity(String intensity) {
		this.getElement().setAttribute( "intensity", intensity );
	}
	public String getPenumbra() {
		return this.getElement().getAttribute( "penumbra" );
	}
	public void setPenumbra(String penumbra) {
		this.getElement().setAttribute( "penumbra", penumbra );
	}
	public String getType() {
		return this.getElement().getAttribute( "type" );
	}
	public void setType(String type) {
		this.getElement().setAttribute( "type", type );
	}
	public String getTarget() {
		return this.getElement().getAttribute( "target" );
	}
	public void setTarget(String target) {
		this.getElement().setAttribute( "target", target );
	}
	
}
