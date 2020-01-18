package com.tsc.aframe.base;

import java.util.Map;

public class AFramePrimitiveBase extends AFrameBase {
	
	public AFramePrimitiveBase() {
		super();
		fetchPrimitiveBasicAttributes(attributesMap);
	}
	
	public AFramePrimitiveBase(String attributes) {
		super(attributes);
		fetchPrimitiveBasicAttributes(attributesMap);
	}
	
	private void fetchPrimitiveBasicAttributes( Map<String, String> attributesMap ) {
		attributesMap.put("ambient-occlusion-map", "ambientocclusionmap");
		attributesMap.put("ambient-occlusion-map-intensity", "ambientocclusionmapintensity");
		attributesMap.put("ambient-occlusion-texture-offset", "ambientocclusiontextureoffset");
		attributesMap.put("ambient-occlusion-texture-repeat", "ambientocclusiontexturerepeat");
		attributesMap.put("color", "color");
		attributesMap.put("displacement-bias", "displacementbias");
		attributesMap.put("displacement-map", "displacementmap");
		attributesMap.put("displacement-scale", "displacementscale");
		attributesMap.put("displacement-texture-offset", "displacementtextureoffset");
		attributesMap.put("displacement-texture-repeat", "displacementtexturerepeat");
		attributesMap.put("env-map", "envmap");
		attributesMap.put("fog", "fog");
		attributesMap.put("height", "height");
		attributesMap.put("material", "material");
		attributesMap.put("metalness", "metalness");
		attributesMap.put("normal-map", "normalmap");
		attributesMap.put("normal-scale", "normalscale");
		attributesMap.put("normal-texture-offset", "normaltextureoffset");
		attributesMap.put("normal-texture-repeat", "normaltexturerepeat");
		attributesMap.put("position", "position");
		attributesMap.put("repeat", "repeat");
		attributesMap.put("rotation", "rotation");
		attributesMap.put("roughness", "roughness");		
		attributesMap.put("src", "src");
		attributesMap.put("width", "width");
		attributesMap.put("wireframe", "wireframe");
		attributesMap.put("wireframe-linewidth", "wireframelinewidth");		
	}
	public String getAmbientocclusionmap() {
		return this.getElement().getAttribute( "ambient-occlusion-map" );		
	}
	public void setAmbientocclusionmap(String ambientocclusionmap) {
		this.getElement().setAttribute( "ambient-occlusion-map", ambientocclusionmap );		
	}
	public String getAmbientocclusionmapintensity() {
		
		return this.getElement().getAttribute( "ambient-occlusion-map-intensity" );
	}
	public void setAmbientocclusionmapintensity(String ambientocclusionmapintensity) {
		this.getElement().setAttribute( "ambient-occlusion-map-intensity", ambientocclusionmapintensity );		
	}
	public String getAmbientocclusiontextureoffset() {		
		return this.getElement().getAttribute( "ambient-occlusion-texture-offset" );
	}
	public void setAmbientocclusiontextureoffset(String ambientocclusiontextureoffset) {
		this.getElement().setAttribute( "ambient-occlusion-texture-offset", ambientocclusiontextureoffset );
	}
	public String getAmbientocclusiontexturerepeat() {
		
		return this.getElement().getAttribute( "ambient-occlusion-texture-repeat" );
	}
	public void setAmbientocclusiontexturerepeat(String ambientocclusiontexturerepeat) {
		this.getElement().setAttribute( "ambient-occlusion-texture-repeat", ambientocclusiontexturerepeat );
	}
	public String getColor() {		
		return this.getElement().getAttribute( "color" );
	}
	public void setColor(String color) {
		this.getElement().setAttribute( "color", color );
	}
	public String getDepth() {		
		return this.getElement().getAttribute( "depth" );
	}
	public void setDepth(String depth) {
		this.getElement().setAttribute( "depth", depth );
	}
	public String getDisplacementbias() {
		
		return this.getElement().getAttribute( "displacement-bias" );
	}
	public void setDisplacementbias(String displacementbias) {
		this.getElement().setAttribute( "displacement-bias" ,displacementbias );
	}
	public String getDisplacementmap() {
		
		return this.getElement().getAttribute( "displacement-map" );
	}
	public void setDisplacementmap(String displacementmap) {
		this.getElement().setAttribute( "displacement-map" ,displacementmap );
	}
	public String getDisplacementscale() {
		
		return this.getElement().getAttribute( "displacement-scale" );
	}
	public void setDisplacementscale(String displacementscale) {
		this.getElement().setAttribute( "displacement-scale" ,displacementscale );
	}
	public String getDisplacementtextureoffset() {
		
		return this.getElement().getAttribute( "displacement-texture-offset" );
	}
	public void setDisplacementtextureoffset(String displacementtextureoffset) {
		this.getElement().setAttribute( "displacement-texture-offset" ,displacementtextureoffset );
	}
	public String getDisplacementtexturerepeat() {
		
		return this.getElement().getAttribute( "displacement-texture-repeat" );
	}
	public void setDisplacementtexturerepeat(String displacementtexturerepeat) {
		this.getElement().setAttribute( "displacement-texture-repeat" ,displacementtexturerepeat );
	}
	public String getEnvmap() {
		
		return this.getElement().getAttribute( "env-map" );
	}
	public void setEnvmap(String envmap) {
		this.getElement().setAttribute( "env-map" ,envmap );
	}
	public String getFog() {
		
		return this.getElement().getAttribute( "fog" );
	}
	public void setFog(String fog) {
		this.getElement().setAttribute( "fog" ,fog );
	}
	public String getHeight() {
		
		return this.getElement().getAttribute( "height" );
	}
	public void setHeight(String height) {
		this.getElement().setAttribute( "height" ,height );
	}
	public String getMaterial() {		
		return this.getElement().getAttribute( "material" );
	}
	public void setMaterial(String material) {
		this.getElement().setAttribute( "material" ,material );
	}
	public String getMetalness() {		
		return this.getElement().getAttribute( "metalness" );
	}
	public void setMetalness(String metalness) {
		this.getElement().setAttribute( "metalness" ,metalness );
	}
	public String getNormalmap() {
		
		return this.getElement().getAttribute( "normal-map" );
	}
	public void setNormalmap(String normalmap) {
		this.getElement().setAttribute( "normal-map" ,normalmap );
	}
	public String getNormalscale() {
		
		return this.getElement().getAttribute( "normal-scale" );
	}
	public void setNormalscale(String normalscale) {
		this.getElement().setAttribute( "normal-scale" ,normalscale );
	}
	public String getNormaltextureoffset() {
		
		return this.getElement().getAttribute( "normal-texture-offset" );
	}
	public void setNormaltextureoffset(String normaltextureoffset) {
		this.getElement().setAttribute( "normal-texture-offset" ,normaltextureoffset );
	}
	public String getNormaltexturerepeat() {
		
		return this.getElement().getAttribute( "normal-texture-repeat" );
	}
	public void setNormaltexturerepeat(String normaltexturerepeat) {
		this.getElement().setAttribute( "normal-texture-repeat" ,normaltexturerepeat );
	}
	public String getPosition() {
		
		return this.getElement().getAttribute( "position" );
	}
	public void setPosition(String position) {
		this.getElement().setAttribute( "position" ,position );
	}
	public String getRepeat() {
		
		return this.getElement().getAttribute( "repeat" );
	}
	public void setRepeat(String repeat) {
		this.getElement().setAttribute( "repeat" ,repeat );
	}	
	public String getRotation() {
		
		return this.getElement().getAttribute( "rotation" );
	}
	public void setRotation(String rotation) {
		this.getElement().setAttribute( "rotation" ,rotation );
	}
	public String getRoughness() {
		
		return this.getElement().getAttribute( "roughness" );
	}
	public void setRoughness(String roughness) {
		this.getElement().setAttribute( "roughness" ,roughness );
	}
	public String getSrc() {
		
		return this.getElement().getAttribute( "src" );
	}
	public void setSrc(String src) {
		this.getElement().setAttribute( "src" ,src );
	}
	public String getWidth() {
		
		return this.getElement().getAttribute( "width" );
	}
	public void setWidth(String width) {
		this.getElement().setAttribute( "width" ,width );
	}
	public String getWireframe() {
		
		return this.getElement().getAttribute( "wireframe" );
	}
	public void setWireframe(String wireframe) {
		this.getElement().setAttribute( "wireframe" ,wireframe );
	}
	public String getWireframelinewidth() {
		
		return this.getElement().getAttribute( "wireframe-linewidth" );
	}
	public void setWireframelinewidth(String wireframelinewidth) {
		this.getElement().setAttribute( "wireframe-linewidth" ,wireframelinewidth );
	}
}
