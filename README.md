# Vaadin A-frame addon

Vaadin 14 Java integration of @aframevr/aframe.
This addon wraps the most common elements of the A-Frame Framework for Java usage in Vaadin.

## You can see more about A-frame from
[Homepage](https://aframe.io/)

[GitHub](https://github.com/aframevr/aframe)

[npm](https://www.npmjs.com/package/aframe)

## Basic usage

Create an ``<a-scene>`` element and add it to the view. 
 
```
Ascene ascene = new Ascene();
add(ascene);
```

You can add a child element to an ``<a-scene>`` by creating A-Frame element such as ``<a-box>`` and then call the ``add`` method of the ``<a-scene>`` instance.

```
Abox abox = new Abox();
ascene.add(abox);
```

Most of the available attributes of the elements have a setter and a getter.

You can modify the attributes of the elements by calling setters of the attributes.

```
abox.setColor("green");
abox.setPosition("0 2 -5");
```

You can also set the attributes directly using ``setAttribute(String, String)`` method. 

```
abox.setAttribute("height", "2");
```

Element attribute values can be obtained using getters or ``getAttribute`` method. If the attribute is not set for the element a ``null`` is returned.

```
String colorByGetter = abox.getColor();
String colorByGetAttribute =  abox.getAttribute("color");    	
```
    	
Vaadin A-Frame also contains Gulper that allows creating objects from a XML string.
A-box declared in HTML like ``<a-box color="green" position="0 2 -5" rotation="0 45 45"></a-box>`` can be converted into Abox object using ``addXml(String)`` method. New object is automatically added to the object which method was called. 

```
ascene.addXml("<a-box color=\"green\" position=\"0 2 -5\" rotation=\"0 45 45\"></a-box>");
```

The ``addXml(String)`` method returns the object created (return type ``AFrameBase``). 

```
Abox dynamicAbox = (Abox) ascene.addXml("<a-box color=\"green\" position=\"0 2 -5\" rotation=\"0 45 45\"></a-box>");
```
If you just want to create a new object from a string but don't want to add it to a parent you can call Gulper directly.

```
Abox dynamicAbox = (Abox) Gulper.aFrameFactory("<a-box color=\"green\" position=\"0 2 -5\" rotation=\"0 45 45\"></a-box>");
```

NOTE: All XML elements must have a closing tag. Use closing tag like ``</a-box>`` or ``<a-box/>``.

NOTE: Attributes must be followed by the ' = ' character. Using ``<video autoplay></video>`` causes an exception while while ``<video autoplay=\"\"></video>`` does not.


## Embedded ``<a-scene>``

Without ``embedded`` attribute the ``<a-scene>`` fills the whole view. You can use the ``embedded`` attribute with CSS to modify the size of the ``<a-scene>`` element.

```
Ascene ascene = new Ascene();    	
ascene.setEmbedded("embedded");
ascene.getElement().getStyle().set("height", "800px");
ascene.getElement().getStyle().set("width", "800px");
```

Note: In basic Vaadin application A-Frame "Enter VR mode" button is not visible by default. Button appears in the embedded mode.  

You can add other Vaadin elements to the view using layouts such as VerticalLayout.

```
VerticalLayout layout = new VerticalLayout();
layout.add(new Button("Press me")); 
Ascene ascene = new Ascene();    	
ascene.setEmbedded("embedded");
ascene.getElement().getStyle().set("height", "800px");
ascene.getElement().getStyle().set("width", "800px");
layout.add(ascene);
add(layout);
```

## Camera and Cursor

Element ``<a-camera>`` provides access to what the user sees. Element ``<a-cursor>`` provides clicking and basic interactivity to the user. Cursor should always be added to the camera.

```
Acamera camera = (Acamera) ascene.addXml("<a-camera></a-camera>");
Acursor cursor = (Acursor) camera.addXml("<a-cursor></a-cursor>");
```

By default the user can move around in 3d view using wasd keys. This can be modified via the ``wasd-controls-enabled`` attribute of ``<a-camera>``. 

```
camera.setWasdcontrolsenabled("false");
```

## Events

Using cursor allows basic event handling. Basic events provided are *mousedown*, *mouseup*, *mouseenter*, *mouseleave*, and *click*. Event can be added to elements as normal. 

```
Ascene ascene = new Ascene();    	
Abox abox = new Abox();
ascene.add(abox);
abox.setColor("green");
Acamera camera = (Acamera) ascene.addXml("<a-camera></a-camera>");
Acursor cursor = (Acursor) camera.addXml("<a-cursor></a-cursor>");
abox.getElement().addEventListener("click", e -> {
	Notification.show("Element abox was clicked");
});
abox.getElement().addEventListener("mouseenter", e -> {
	Notification.show("Element emitted mouseenter event");
});
abox.getElement().addEventListener("mouseleave", e -> {
	Notification.show("Element emitted mouseleave event");
});
```

## Using assets

Assets can be defined using ``<a-assets>`` as the parent. Adding for example images can be done by creating an ``<img>`` and using parents ``add `` or ``addXml`` methods. Image can be then referred in the ``<a-box>`` ``src`` attribute.
 
``` 
Aassets assets = (Aassets) ascene.addXml("<a-assets></a-assets>");
assets.addXml("<img id=\"my-image\" src=\"https://i.imgur.com/mYmmbrp.jpg\" crossorigin=\"anonymous\"/>");
Abox abox = new Abox();
ascene.add(abox);
abox.setSrc("#my-image");
```

## Binding

Vaadin A-Frame elements can be bound using ``Binder``. Example below shows how to create a view with three ``TextField`` and an ``Abox``. TextFiels are then bound to the attribute getters and setters of the ``Abox`` class.  
  
```
VerticalLayout layout = new VerticalLayout();
Ascene ascene = new Ascene();
ascene.setEmbedded("true");
ascene.getElement().getStyle().set("height", "800px");
ascene.getElement().getStyle().set("width", "800px");

TextField widthField = new TextField();
TextField heightField = new TextField();
TextField depthField = new TextField();

Abox abox = new Abox();
ascene.add(abox);
abox.setColor("green");
abox.setWidth("1");
abox.setHeight("1");
abox.setDepth("1");

Binder<Abox> boxBinder = new Binder<Abox>();    	
boxBinder.setBean(abox);
boxBinder.forField(widthField).bind(Abox::getWidth, Abox::setWidth);
boxBinder.forField(heightField).bind(Abox::getHeight, Abox::setHeight);
boxBinder.forField(depthField).bind(Abox::getDepth, Abox::setDepth);

HorizontalLayout horiLayout = new HorizontalLayout();
horiLayout.add(widthField, heightField, depthField);    			
layout.add(horiLayout, ascene);
add(layout);
```

Note: In the example above the width, height and depth are set to "1". A-Frame defaults the dimension of an ``<a-box>`` to "1 1 1" but if they are not explicitly set the TextFields won't show any value. Getters always return the value of the element attribute and if the attribute is not set the getter returns a ``null``.    

## Available elements:

Following elements have been implemented to Vaadin A-Frame addon:

```
<a-entity>
<a-scene>
<a-camera>
<a-cursor>
```

Primitives:

```
<a-box>
<a-camera>
<a-circle>
<a-cone>
<a-cursor>
<a-curvedimage>
<a-cylinder>
<a-dodecahedron>
<a-gltf-model>
<a-icosahedron>
<a-image>
<a-light>
<a-link>
<a-obj-model>
<a-octahedron>
<a-plane>
<a-ring>
<a-sky>
<a-sound>
<a-sphere>
<a-tetrahedron>
<a-text>
<a-torus-knot>
<a-torus>
<a-triangle>
<a-video>
<a-videosphere>
```
Assets:

```
<a-assets>
<a-asset-item>
<audio>
<img>
<video>
```
