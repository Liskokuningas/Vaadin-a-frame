package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFramePrimitiveComplexBase;
import com.tsc.aframe.utils.Helpers;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-dodecahedron")
@JsModule("aframe/dist/aframe-v0.9.2.min.js")
@NpmPackage(value = "aframe", version = "^0.9.2")
public class Adodecahedron extends AFramePrimitiveComplexBase {
	
	public Adodecahedron() {
		super();
		modifyAttributes();
	}
	public Adodecahedron(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	
	private void modifyAttributes() {
	
	}	
}
