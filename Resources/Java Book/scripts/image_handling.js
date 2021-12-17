/*Sample function for processing images to add the galleryimg
  attribute and a right click event handler to prevent right
  click save-as on images.  This is best run on the body onload 
  event.*/

function imageHandling() {	
	var imagesArray = document.getElementsByTagName('img');
	for(i=0,n=imagesArray.length; i<n; i++) {
		protectImage(imagesArray[i]);
	}

	var cookieResponse = getCookie('text-size');
	if(typeof(cookieResponse) != 'null' && cookieResponse != null) {
		var textIncreaseIncrement = parseInt(cookieResponse);
		textSizeMaintain('wrap',textIncreaseIncrement);
	}	
}

function protectImage(node) {
		//Set galleryimg attribute if browser is IE
		if(document.all) {
			node.setAttribute('galleryimg', 'no');			
		}
		
		//Add contextmenu event handler.  Note: This fails in Opera
		node.oncontextmenu = function() {return false};
		
		//Add drag drop disabling
		dragDisable.capture(node);
}

function textSizeMaintain(targetElementId,increment) {

	var incrementUnit = "px";
	var maxValue= 25;
	var minValue = 6;
	var currentSize = 0;
	var storageArray = [];
	
	
	var targetNode = document.getElementById(targetElementId);

		var childArray = targetNode.getElementsByTagName("*");
		for(var j=0;j<childArray.length;j++) {
		currentSize = 0;
			currentSizeText = getStyle(childArray[j], "font-size");
			storageArray[j] = parseInt(currentSizeText.replace("incrementUnit",""));
			if(((increment > 0) && currentSize < maxValue) || (increment < 0 && currentSize > minValue)) {
				currentSize += increment;
			}
			storageArray[j]=currentSize;
		}
		for (var m=0; m<storageArray.length; m++) {
			childArray[m].style.fontSize = storageArray[m] + incrementUnit;			
		}
		
}

function getStyle(oElm, strCssRule){
	/*Created by Robert Nyman*/
	var strValue = "";
	if(document.defaultView && document.defaultView.getComputedStyle){
		strValue = document.defaultView.getComputedStyle(oElm, "").getPropertyValue(strCssRule);
	}
	else if(oElm.currentStyle){
		strCssRule = strCssRule.replace(/\-(\w)/g, function (strMatch, p1){
			return p1.toUpperCase();
		});
		strValue = oElm.currentStyle[strCssRule];
	}
	return strValue;
}


var dragDisable = function() {
	function getEvent(evt) {
		if (!evt || typeof(evt) == 'undefined') {
			evt = window.event;
		}
		return evt;		
	}

	var pm = {
		'capture':function(node) {
			if(node.addEventListener) {
				node.addEventListener('mousedown',pm.block,false);
			}
			else if(node.attachEvent) {
				node.attachEvent('ondragstart',pm.block);
			}
		},
		'block': function(evt) {
			var e = getEvent(evt);
			if(e.stopPropagation) {
				e.stopPropagation();
				e.preventDefault();
			} else {
				e.cancelBubble = true;
				e.returnValue = false;
			}			
			return false;
		}
	};
	return pm;
}();
