package com.tsc.aframe.camera;

import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.interfaces.IAframeBase;
import com.tsc.aframe.utils.Helpers;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-cursor")
@JsModule("aframe/dist/aframe-v1.0.0.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Acursor extends AFrameBase {
	
	public Acursor() {
		super();
		modifyAttributes();
	}
	public Acursor(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	private void modifyAttributes() {
		attributesMap.put("far", "far");
		attributesMap.put("fuse", "fuse");
		attributesMap.put("fuse-timeout", "fusetimeout");
		attributesMap.put("interval", "interval");
		attributesMap.put("objects", "objects");
		
	}
	public String getFar() {
		return this.getElement().getAttribute( "far" );
	}
	public void setFar(String far) {
		this.getElement().setAttribute( "far", far );
	}
	public String getFuse() {
		return this.getElement().getAttribute( "fuse" );
	}
	public void setFuse(String fuse) {
		this.getElement().setAttribute( "fuse", fuse );
	}
	public String getFusetimeout() {
		return this.getElement().getAttribute( "fuse-timeout" );
	}
	public void setFusetimeout(String fusetimeout) {
		this.getElement().setAttribute( "fuse-timeout", fusetimeout );
	}
	public String getInterval() {
		return this.getElement().getAttribute( "interval" );
	}
	public void setInterval(String interval) {
		this.getElement().setAttribute( "interval", interval );
	}
	public String getObjects() {
		return this.getElement().getAttribute( "objects" );
	}
	public void setObjects(String objects) {
		this.getElement().setAttribute( "objects", objects );
	}
}
