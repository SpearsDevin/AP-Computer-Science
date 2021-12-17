/*Global variables for configuration of initializeRollover()*/

//Defines what areas will get rollovers automatically added
var rolloverContainers = ['top_area', 'top_nav', 'bottom_nav', 'bottom_bar']


//Because IE6 doesn't work correctly with dynamically assigned events, this function doesn't work.
//Implemented manually, instead
function initializeRollover() {
	var containerElement;
	var anchorElements;
	var imageElement;
	var imageId;

	for(i=0; i<rolloverContainers.length;i++) {
		containerElement = document.getElementById(rolloverContainers[i]);
		anchorElements = containerElement.getElementsByTagName('a');
		for(j=0; j<anchorElements.length;j++) {
			imageElement = anchorElements[j].getElementsByTagName('img');
			if(imageElement[0]) {
				//Grab first element - shouldn't have more than one
				if(!(imageElement[0].getAttribute('id'))) {
					imageElement[0].setAttribute("id","id" + Math.floor(Math.random()*1001));
				}
				imageId = imageElement[0].getAttribute('id');

				//set onfocus, onblur for anchor
				anchorElements[j].setAttribute("onfocus", "swapOut('"+imageId+"')");
				anchorElements[j].setAttribute("onblur", "swapIn('"+imageId+"')");
								
				//set onmouseover, onmouseout for img
				imageElement[0].setAttribute("onmouseover", "swapOut('"+imageId+"')");
				imageElement[0].setAttribute("onmouseout", "swapIn('"+imageId+"')");
			}
		}
	}
}

var focusCount = new Array();

function swapOut(imageId) {
	if(focusCount[imageId]) {
		focusCount[imageId]++;
	} else {
		focusCount[imageId]=1;
	}
	if(focusCount[imageId] == 1) {
		var toSwap = document.getElementById(imageId);
		var currentSrc = toSwap.src;
		var srcExtension = currentSrc.substr(currentSrc.length-4, 3);
		var newSrc = currentSrc.replace(srcExtension, "-over"+srcExtension);
		toSwap.setAttribute("src", newSrc);
	}
}

function swapIn(imageId) {
	if(focusCount[imageId]) {
		focusCount[imageId]--;
	} else {
		focusCount[imageId]=0;
	}
	if(focusCount[imageId] == 0) {
		var toSwap = document.getElementById(imageId);
		var currentSrc = toSwap.src;
		var srcExtension = currentSrc.substr(currentSrc.length-4, 3);
		var newSrc = currentSrc.replace("-over"+srcExtension, srcExtension);
		toSwap.setAttribute("src", newSrc);
	}
}
