var contentId = 'content_wrap';
var frameId = 'wrap';

function resizePageImages() {
	//Traces through the inserted page, finds all images that are larger than the content width and shrinks them, adding a popup layer link.
	var contentNode = document.getElementById(contentId);
	var imagesArray = contentNode.getElementsByTagName('img');
	for(i=0,n=imagesArray.length; i<n; i++) {
		var imgNode = imagesArray[i];
		var imageWidth = imgNode.offsetWidth;
		var parentNode = imgNode.parentNode;
		//Temporarily turn off overflow
		parentNode.style['overflow'] = 'hidden';
		var parentWidth = parentNode.offsetWidth;
		parentNode.style['overflow'] = '';
		
		//Pranjali:ETEXT-2244
		if(imageWidth > parentWidth) {
			var imagesArrayStyle = imgNode.style;
			//set styling behavior
			var imageHeight = imgNode.offsetHeight;
			imagesArrayStyle['height'] = (imageHeight * ((parentWidth -30) / imageWidth)) + 'px';
			imagesArrayStyle['width'] = (parentWidth -30) + 'px';
			
			var imageId;
			if(imgNode.id) {
				imageId = imgNode.id;
			} else {
				imageId = generateId();
				imgNode.id = imageId;
			}
			imgNode.onclick = fullImageLayerOnClick;

			//create link node as image sibling
			var expandLink = document.createElement('a');
			var expandLinkText = document.createTextNode('Expand this image');
			expandLink.appendChild(expandLinkText);
			expandLink.className = "expandLink";
			expandLink.href = 'javascript:fullImageLayer("'+imageId+'")';
			parentNode.insertBefore(expandLink, imgNode);
		}
	}
}

function fullImageLayerOnClick(e) {
	if(!e) {
		e = window.event;
		fullImageLayer(e.srcElement.id);
	} else {
		fullImageLayer(e.target.id);
	}
}

var image;

function fullImageLayer(imageid) {
	//Generates a popup layer for the given image.
	image = imageLayer(imageid);
	//Init routines
	image.img.onload = appendImage;
	image.img.src = image.originalImage.src;
}


function imageLayer(imageid) {
	var self = this;
	this.imageid = imageid;
	this.originalImage = document.getElementById(this.imageid);
	this.img = new Image();
	this.divLayer = '';

	//Create div layer for image.
	this.divLayer = document.createElement('div');
	this.divLayer.className = 'imageLayer';
	this.divLayer.id = generateId();
	this.divLayer.style.zIndex = 2;
	this.divLayer.style.position = 'absolute';

	//add closing link.
	var closeLinkDiv = document.createElement('div');
	closeLinkDiv.className = 'closeLink';
	var closeLink = document.createElement('a');
	var closeLinkText = document.createTextNode('Close');
	closeLink.appendChild(closeLinkText);
	closeLink.href = "javascript: fullImageLayerDestroy('" + this.divLayer.id + "', '"+this.imageid+"')";
	closeLinkDiv.appendChild(closeLink);
	this.divLayer.appendChild(closeLinkDiv);
	this.divLayer.appendChild(this.img);
	this.divLayer.appendChild(closeLinkDiv.cloneNode(true));
	return self;
}

	function appendImage() {
		//calculate dimensions
		var imgWidth = image.img.width;
		var bodyTag = document.getElementsByTagName('body')[0];
		var bodyWidth = bodyTag.clientWidth;

		var leftPosition = ((bodyWidth - imgWidth)/2);
		if(leftPosition < 0) {
			var leftPosition = 0 + 'px';
		} else {
			leftPosition += 'px';
		}
		var topPosition = findPos(image.originalImage)[1] + 'px';
		image.divLayer.style.top = topPosition;
		image.divLayer.style.left = leftPosition;

		bodyTag.appendChild(image.divLayer);
		image.createBodyBlur();
		
		image.divLayer.focus();
		
		protectImage(image.img);

	}
	
	function createBodyBlur() {
		//Generates a dimming layer for the background
		var bodyTag = document.getElementsByTagName('body')[0];
	
		//Create gray-out overlay for background-text (and links)
		var bodyBlur = document.createElement('img');
		bodyBlur.style.zIndex = 1;
		bodyBlur.src = 'images/bodyBlur.gif';
		bodyBlur.id = 'layerExpand';
		bodyBlur.style.position = 'absolute';
		bodyBlur.style.top = '0px';
		bodyBlur.style.left = '0px';
		if(document.all) {
			bodyBlur.style['filter']= 'alpha(opacity=75)';
			//Hack to turn off image toolbar in IE6
			bodyBlur.setAttribute('galleryimg', 'no');
		} else {
			bodyBlur.style['opacity'] = .75;
		}
		//Size background to full width of scrolled window
		var divWidth = image.divLayer.offsetWidth;
		var bodyWidth = bodyTag.offsetWidth;
		if(bodyWidth > bodyTag.scrollWidth) {
			//IE6 gives incorrect offsetWidth, so this will only be true for IE6
			bodyWidth = bodyTag.scrollWidth;
		}
		if(divWidth > bodyWidth) {
			bodyBlur.style.width = divWidth + 'px';
		} else {
			bodyBlur.style.width = bodyWidth + 'px';
		}
		
		var divHeight = image.divLayer.offsetHeight;
		var bodyHeight = bodyTag.offsetHeight;
		if(bodyHeight < bodyTag.scrollHeight) {
			//IE6 gives incorrect offsetHeight, so this will only be true for IE6
			bodyHeight = bodyTag.scrollHeight;
		}
		if(divHeight > bodyHeight) {
			bodyBlur.style.height = divHeight + 'px';
		} else {
			bodyBlur.style.height = bodyHeight + 'px';
		}
		bodyTag.appendChild(bodyBlur);
	}

function fullImageLayerDestroy(divId, imageId) {
	//Removes popup layer
	var divLayer = document.getElementById(divId);
	var originalImage = document.getElementById(imageId);
	if(divLayer) {
		divLayer.parentNode.removeChild(divLayer);
		if(originalImage) {
			originalImage.focus();
		}
	}
	destroyBodyBlur();
}

function destroyBodyBlur() {
	//Remove blur pane (and DRM-glass pane related items)
	var blurPane = document.getElementById('layerExpand')
	document.getElementsByTagName('body')[0].removeChild(blurPane);
}

function generateId() {
	//Psuedo-unique ID generation.  Should never have problems on a simple page.
	var gennedId = 'id' + Math.floor(Math.random()*11111);
	if(document.getElementById(gennedId)) {
		return (generateId());
	} else {
		return (gennedId);
	}
}

function findPos(obj) {
	//finds the current visual position of an arbitrary object.
	var curleft = curtop = 0;
	if (obj.offsetParent) {
		while (1) {
			curleft += obj.offsetLeft;
			curtop += obj.offsetTop;
			//correction for IE offset bug
			if(obj.currentStyle && obj.currentStyle.bottom != 'auto') {
				curtop -= parseInt(obj.currentStyle.bottom.replace('px',''));
			}
			if(!obj.offsetParent) {
				break;
			} else {
				obj = obj.offsetParent
			}
		}
	} else if (obj.x) {
		curleft += obj.x;
	} else if (obj.y) {
		curtop += obj.y;
	}
	return [curleft,curtop];
}

//Attach processes to onload event
if(document.all) {
	//this is called for IE10 and later versions of chrome/FF
	window.attachEvent('onload', resizePageImages);
} else {
	//for prior versions of IE10
	window.addEventListener('load', resizePageImages, true);
}
