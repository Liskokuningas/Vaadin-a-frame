package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.interfaces.IAframeBase;
import com.tsc.aframe.utils.Helpers;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-link")
@JsModule("aframe/dist/aframe-v1.0.0.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Alink extends AFrameBase {
	
	public Alink() {
		super();
		modifyAttributes();
	}
	public Alink(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	private void modifyAttributes() {
		attributesMap.put("href", "href");
		attributesMap.put("title", "title");
		attributesMap.put("src", "src");		
	}
	public String getHref() {
		return this.getElement().getAttribute( "href" );		
	}
	public void setHref(String href) {
		this.getElement().setAttribute( "href", href );		
	}
	public String getTitle() {
		return this.getElement().getAttribute( "title" );		
	}
	public void setTitle(String title) {
		this.getElement().setAttribute( "title", title );		
	}
	public String getSrc() {
		return this.getElement().getAttribute( "src" );		
	}
	public void setSrc(String src) {
		this.getElement().setAttribute( "src", src );		
	}
}
