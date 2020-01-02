package com.tsc.aframe.primitives;

import com.tsc.aframe.base.AFramePrimitiveComplexBase;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("a-cylinder")
@JsModule("aframe/dist/aframe-v1.0.3.min.js")
@NpmPackage(value = "aframe", version = "^1.0.0")
public class Acylinder extends AFramePrimitiveComplexBase {
	
	public Acylinder() {
		super();
		modifyAttributes();
	}
	public Acylinder(String attributes) {
		super(attributes);
		modifyAttributes();
	}
	private void modifyAttributes() {
			
	}
	
}
