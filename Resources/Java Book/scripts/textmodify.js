function textSizeChange(targetElementId,increment) {

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
			currentSize = parseInt(currentSizeText.replace("incrementUnit",""));
			if(((increment > 0) && currentSize < maxValue) || (increment < 0 && currentSize > minValue)) {
				currentSize += increment;
			}
			storageArray[j]=currentSize;
		}
		for (var m=0; m<storageArray.length; m++) {
			childArray[m].style.fontSize = storageArray[m] + incrementUnit;
		}
		setCookie('text-size', currentSize);
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
