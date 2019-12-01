package com.tsc.aframe;

import com.tsc.aframe.assets.Aassetitem;
import com.tsc.aframe.assets.Aassets;
import com.tsc.aframe.assets.Img;
import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.camera.Acamera;
import com.tsc.aframe.camera.Acursor;
import com.tsc.aframe.primitives.*;
import com.tsc.aframe.utils.Gulper;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;

@Route("")
public class View extends Div {
	
	Acamera camera1 = null;
	Acursor cursor1 = null;
	
	Abox box1 = null;
	Acircle circle1 = null;
	Acone cone1 = null;
	Acurvedimage curvedimage1 = null;
	Acylinder cylinder1 = null;
	Adodecahedron dodecahedron1 = null;
	Agltfmodel gltfmodel1 = null;
	Aicosahedron icosahedron1 = null;
	Aimage image1 = null;
	Alight light1 = null;
	Alink link1 = null;
	Aobjmodel objmodel1 = null;
	Aoctahedron octahedron1 = null;
	Aplane plane1 = null;
	Aring ring1 = null;
	Asky sky1 = null;
	Asound sound1 = null;
	Asphere sphere1 = null; 
	Atetrahedron tetrahedron1 = null;
	Atext text1 = null;
	Atorusknot torusknot1 = null;
	Atorus torus1 = null;
	Atriangle triangle1 = null;
	Avideo video1 = null;
	Avideosphere videosphere1 = null;
	
	Img img1 = null;
	Aassets assets1 = null;
	Aassetitem assetitem1 = null;
	
    public View() {
    	Ascene ascene = new Ascene();
    	add(ascene);
    	
    	//aCamera.setWasdcontrolsenabled("false");
    	
    	assets1 = (Aassets) ascene.addXml("<a-assets></a-assets>");    	
    	img1 = (Img) assets1.addXml("<img id=\"my-image\" src=\"https://i.imgur.com/mYmmbrp.jpg\" crossorigin=\"anonymous\"/>");
    	assetitem1 = (Aassetitem) assets1.addXml("<a-asset-item id=\"gltf-item\" src=\"https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Duck/glTF/Duck.gltf\" />");
    	//assets1.addXml("<video id=\"penguin-sledding\" autoplay=\"autoplay\" loop=\"true\" src=\"http://techslides.com/demos/sample-videos/small.mp4\" crossorigin=\"anonymous\"></video>");
    	
    	box1 = (Abox)ascene.addXml("<a-box src=\"#my-image\" position=\"-5 2 -5\" rotation=\"0 45 45\" scale=\"2 2 2\"></a-box>");
    	circle1 = (Acircle) ascene.addXml("<a-circle color=\"#CCC\" radius=\"2\" position=\"-5 2 -5\"></a-circle>");
    	cone1 = (Acone) ascene.addXml("<a-cone color=\"tomato\" radius-bottom=\"2\" radius-top=\"0.5\" position=\"-5 2 -5\"></a-cone>");
    	curvedimage1 = (Acurvedimage) ascene.addXml("<a-curvedimage position=\"-5 2 -5\" src=\"#my-image\" height=\"3.0\" radius=\"5.7\" theta-length=\"72\" rotation=\"0 100 0\" scale=\"0.8 0.8 0.8\"></a-curvedimage>");
    	
    	cylinder1 = (Acylinder) ascene.addXml("<a-cylinder position=\"-10 2 -5\" color=\"crimson\" height=\"2\" radius=\"0.5\"></a-cylinder>"); 
    	dodecahedron1 = (Adodecahedron) ascene.addXml("<a-dodecahedron position=\"-10 2 -5\" color=\"#FF926B\" radius=\"1\"></a-dodecahedron>");    	
    	gltfmodel1 = (Agltfmodel) ascene.addXml("<a-gltf-model position=\"-10 2 -5\" src=\"#gltf-item\"></a-gltf-model>");
    	
    	icosahedron1 = (Aicosahedron) ascene.addXml("<a-icosahedron position=\"5 2 -5\" color=\"#FF926B\" radius=\"1\"></a-icosahedron>");
    	image1 = (Aimage) ascene.addXml("<a-image position=\"5 3 -5\" src=\"#my-image\"></a-image>");
    	//light1 = (Alight) ascene.addXml("<a-light color=\"red\" position=\"5 1 0\"></a-light>");
    	//link1 = (Alink) ascene.addXml("<a-link title=\"Dingding\" href=\"https:\\\\www.google.fi\" src=\"#my-image\" />");
    	//objmodel1 = (Aobjmodel) ascene.addXml("<a-obj-model src=\"#crate-obj\" mtl=\"#crate-mtl\"></a-obj-model>");
    	
    	octahedron1 = (Aoctahedron) ascene.addXml("<a-octahedron position=\"10 2 -5\" src=\"#my-image\" color=\"#FF926B\" radius=\"1\"></a-octahedron>");
    	plane1 = (Aplane) ascene.addXml("<a-plane src=\"#my-image\" height=\"10\" width=\"10\" rotation=\"-90 0 0\"></a-plane>");    	
    	ring1 = (Aring) ascene.addXml("<a-ring position=\"10 2 -5\" color=\"teal\" radius-inner=\"1\" radius-outer=\"2\"></a-ring>");
    	sky1 = (Asky) ascene.addXml("<a-sky color=\"#6EBAA7\"></a-sky>");
    	sphere1 = (Asphere) ascene.addXml("<a-sphere position=\"10 2 -5\" color=\"yellow\" radius=\"1\"></a-sphere>");
    	//sound1 = (Asound) ascene.addXml("<a-sound src=\"https://file-examples.com/wp-content/uploads/2017/11/file_example_MP3_700KB.mp3\" autoplay=\"true\" position=\"0 2 5\"></a-sound>");

    	tetrahedron1 = (Atetrahedron) ascene.addXml("<a-tetrahedron position=\"-13 2 -5\" color=\"#FF926B\" radius=\"1\"></a-tetrahedron>");
    	text1 = (Atext) ascene.addXml("<a-text position=\"-13 2 -3\" value=\"Hello, World!\"></a-text>");
    	torusknot1 = (Atorusknot) ascene.addXml("<a-torus-knot position=\"-13 2 -5\" color=\"#B84A39\" arc=\"180\" p=\"2\" q=\"7\" radius=\"2\" radius-tubular=\"0.1\"></a-torus-knot>");
    	torus1 = (Atorus) ascene.addXml("<a-torus position=\"-13 2 -5\" color=\"#43A367\" arc=\"270\" radius=\"2\" radius-tubular=\"0.1\"></a-torus>");
    	
    	triangle1 = (Atriangle) ascene.addXml("<a-triangle position=\"13 2 -5\" color=\"#6a9c52\" vertex-c=\"1 -1 0\"></a-triangle>");
    	video1 = (Avideo) ascene.addXml("<a-video src=\"#penguin-sledding\" width=\"5.3\" height=\"3\" position=\"13 2 -10\"></a-video>");
    	//videosphere1 = (Avideosphere) ascene.addXml("<a-videosphere src=\"#penguin-sledding\"></a-videosphere>");
    	
    }
}
