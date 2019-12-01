package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFrameBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-text")
@JsModule("aframe/dist/aframe-v0.9.2.min.js")
@NpmPackage(value = "aframe", version = "^0.9.2")
public class Atext extends AFrameBase {
	
	public Atext() {
		super();
		modifyAttributes();
		
	}
	public Atext(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	
	private void modifyAttributes() {
		attributesMap.put("align", "align");
		attributesMap.put("alpha-test", "alphatest");
		attributesMap.put("anchor", "anchor");
		attributesMap.put("baseline", "baseline");
		attributesMap.put("font", "font");
		attributesMap.put("font-image", "fontimage");
		attributesMap.put("height", "height");
		attributesMap.put("letter-spacing", "letterspacing");
		attributesMap.put("line-height", "lineheight");
		attributesMap.put("opacity", "opacity");
		attributesMap.put("shader", "shader");
		attributesMap.put("side", "side");
		attributesMap.put("tab-size", "tabsize");
		attributesMap.put("transparent", "transparent");
		attributesMap.put("value", "value");
		attributesMap.put("white-space", "whitespace");
		attributesMap.put("width", "width");
		attributesMap.put("wrap-count", "wrapcount");
		attributesMap.put("wrap-pixels", "wrappixels");
		attributesMap.put("z-offset", "zoffset");		
	}
	
	public String getAlign() {
		return this.getElement().getAttribute( "align" );		
	}
	public void setAlign(String align) {
		this.getElement().setAttribute( "align", align );		
	}
	public String getAlphatest() {
		return this.getElement().getAttribute( "alpha-test" );		
	}
	public void setAlphatest(String alphatest) {
		this.getElement().setAttribute( "alpha-test", alphatest );		
	}
	public String getAnchor() {
		return this.getElement().getAttribute( "anchor" );		
	}
	public void setAnchor(String anchor) {
		this.getElement().setAttribute( "anchor", anchor );		
	}
	public String getBaseline() {
		return this.getElement().getAttribute( "baseline" );		
	}
	public void setBaseline(String baseline) {
		this.getElement().setAttribute( "baseline", baseline );		
	}
	public String getFont() {
		return this.getElement().getAttribute( "font" );		
	}
	public void setFont(String font) {
		this.getElement().setAttribute( "font", font );		
	}
	public String getFontimage() {
		return this.getElement().getAttribute( "font-image" );		
	}
	public void setFontimage(String fontimage) {
		this.getElement().setAttribute( "font-image", fontimage );		
	}
	public String getHeight() {
		return this.getElement().getAttribute( "height" );		
	}
	public void setHeight(String height) {
		this.getElement().setAttribute( "height", height );		
	}
	public String getLetterspacing() {
		return this.getElement().getAttribute( "letter-spacing" );		
	}
	public void setLetterspacing(String letterspacing) {
		this.getElement().setAttribute( "letter-spacing", letterspacing );		
	}
	public String getLineheight() {
		return this.getElement().getAttribute( "line-height" );		
	}
	public void setLineheight(String lineheight) {
		this.getElement().setAttribute( "line-height", lineheight );		
	}
	public String getOpacity() {
		return this.getElement().getAttribute( "opacity" );		
	}
	public void setOpacity(String opacity) {
		this.getElement().setAttribute( "opacity", opacity );		
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
	public String getTabsize() {
		return this.getElement().getAttribute( "tab-size" );		
	}
	public void setTabsize(String tabsize) {
		this.getElement().setAttribute( "tab-size", tabsize );		
	}
	public String getTransparent() {
		return this.getElement().getAttribute( "transparent" );		
	}
	public void setTransparent(String transparent) {
		this.getElement().setAttribute( "transparent", transparent );		
	}
	public String getValue() {
		return this.getElement().getAttribute( "value" );		
	}
	public void setValue(String value) {
		this.getElement().setAttribute( "value", value );		
	}
	public String getWhitespace() {
		return this.getElement().getAttribute( "white-space" );		
	}
	public void setWhitespace(String whitespace) {
		this.getElement().setAttribute( "white-space", whitespace );		
	}
	public String getWidth() {
		return this.getElement().getAttribute( "width" );		
	}
	public void setWidth(String width) {
		this.getElement().setAttribute( "width", width );		
	}
	public String getWrapcount() {
		return this.getElement().getAttribute( "wrap-count" );		
	}
	public void setWrapcount(String wrapcount) {
		this.getElement().setAttribute( "wrap-count", wrapcount );		
	}
	public String getWrappixels() {
		return this.getElement().getAttribute( "wrap-pixels" );		
	}
	public void setWrappixels(String wrappixels) {
		this.getElement().setAttribute( "wrap-pixels", wrappixels );		
	}
	public String getZoffset() {
		return this.getElement().getAttribute( "z-offset" );		
	}
	public void setZoffset(String zoffset) {
		this.getElement().setAttribute( "z-offset", zoffset );
	}
	
	
}
