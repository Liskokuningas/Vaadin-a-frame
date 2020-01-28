package com.tsc.aframe.base;

import java.util.Map;

public class AFrameMediaBase extends AFrameBase {
	
	public AFrameMediaBase() {
		super();
		fetchPrimitiveBasicAttributes(attributesMap);
	}
	
	public AFrameMediaBase(String attributes) {
		super(attributes);
		fetchPrimitiveBasicAttributes(attributesMap);
	}
	
	private void fetchPrimitiveBasicAttributes( Map<String, String> attributesMap ) {
		attributesMap.put("color", "color");
		attributesMap.put("height", "height");
		attributesMap.put("metalness", "metalness");
		attributesMap.put("opacity", "opacity");
		attributesMap.put("position", "position");
		attributesMap.put("repeat", "repeat");
		attributesMap.put("roughness", "roughness");
		attributesMap.put("segments-height", "segmentsheight");
		attributesMap.put("segments-radial", "segmentsradial");
		attributesMap.put("shader", "shader");
		attributesMap.put("side", "side");
		attributesMap.put("src", "src");
		attributesMap.put("transparent", "transparent");
		
	}
	public String getColor() {
		return this.getElement().getAttribute( "color" );
	}

	public void setColor(String color) {
		this.getElement().setAttribute("color", color );
	}

	public String getHeight() {
		return this.getElement().getAttribute( "height" );
	}

	public void setHeight(String height) {
		this.getElement().setAttribute( "height", height );
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

	public String getSegmentsradial() {
		return this.getElement().getAttribute( "segments-radial" );
	}

	public void setSegmentsradial(String segmentsradial) {
		this.getElement().setAttribute( "segments-radial", segmentsradial );
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

	public String getTransparent() {
		return this.getElement().getAttribute( "transparent" );
	}

	public void setTransparent(String transparent) {
		this.getElement().setAttribute( "transparent", transparent );
	}
	
}
