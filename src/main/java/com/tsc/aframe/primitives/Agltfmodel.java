package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.utils.Helpers;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-gltf-model")
@JsModule("aframe/dist/aframe-v0.9.2.min.js")
@NpmPackage(value = "aframe", version = "^0.9.2")

public class Agltfmodel extends AFrameBase {
	
	public Agltfmodel() {
		super();
		modifyAttributes();
	}
	public Agltfmodel(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	
	private void modifyAttributes() {
		attributesMap.put("src", "src");
	}
	public String getSrc() {
		
		return this.getElement().getAttribute( "src" );
	}
	public void setSrc(String src) {
		this.getElement().setAttribute( "src", src );
	}
}
