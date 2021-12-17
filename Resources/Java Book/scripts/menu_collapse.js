/*User Variables*/
var tocId = 'toc_content'; //ID of main TOC container

function initializeTOC() {
	//Wrapper function for generating and inserting the TOC.
	var tocString = "<ul class='toc_list'>";
	var tocHandle = document.getElementById(tocId);
	var anchorArray = tocHandle.getElementsByTagName('a');

	//Get cookie and toggle visibilities
	var tempCollapse = getCookie('collapse');
	var tocCollapse = [];
	if(tempCollapse != null) {
		tocCollapse = tempCollapse.split(',');
	}
	tocString += generateTOC("", 0, anchorArray, tocCollapse);
	tocString += '</ul>';
	writeToElementId(tocId,tocString);
	if(document.all) {
		addTocHoverIE6(tocId);
	}

}

function generateTOC(tocString, arrayIndex, anchorArray, tocCollapse) {
	//Recursively populates the TOC from the datafile.
	var tIndex = arrayIndex;
	var tCollapse = tocCollapse;
	var nexttIndex = tIndex +1;
	var levelValue = findTOCLevelValue(anchorArray[tIndex]);

	//Determine previous TOC visiblity
	var itemVisible = 'none';
	var itemExpand = 'plus';
	for(var r = 0; r < tCollapse.length; r++) {
		if (tIndex == tCollapse[r] && tCollapse[r] != '') {
			itemVisible = 'block';
			itemExpand = 'minus';
		}
	}

	var returntocString = "";
	var tocArrayLength = anchorArray.length;

	if(nexttIndex < tocArrayLength) {
		var nextLevelValue = findTOCLevelValue(anchorArray[nexttIndex]);
	} else {
		var nextLevelValue = false;
	}
	
	tocString += '<li class="toc_menu' + levelValue + '"><span class="toc_container">';
	if((nextLevelValue) && (levelValue < 3) && !(nextLevelValue < levelValue) && (nextLevelValue != levelValue)) {
		tocString += '<a id="tocItemId'+ tIndex+'" href="javascript:toggleTOCVisibility(\'tocid'+ tIndex +'\')" onfocus="swapOut(\'toctree'+tIndex+'\')" onblur="swapIn(\'toctree'+tIndex+'\')">'
			+ '<img id="toctree'+tIndex+'" src="images/'+itemExpand+'-tree.gif"  onmouseover="swapOut(\'toctree'+tIndex+'\')" onmouseout="swapIn(\'toctree'+tIndex+'\')" alt="Expand Table of Contents" title="Expand Table of Contents"/>'
			+ '</a>';
	}
	tocString += '<a class="toc_item' + levelValue +'" '
		+ 'href="' + anchorArray[tIndex].href +'">'
		+ anchorArray[tIndex].innerHTML + '</a></span>';

	if(nexttIndex < tocArrayLength) {
		if(nextLevelValue > levelValue) {
			tocString += '<ul class="toc_head' + levelValue + '" id="tocid'+tIndex+'" style="display: '+itemVisible+';">';
			returntocString = generateTOC(tocString, nexttIndex, anchorArray, tCollapse);
		} else if(nextLevelValue < levelValue) {
			for(var q = 0; q<levelValue-nextLevelValue; q++) {
				tocString += '</ul></li>';
			}
			returntocString = generateTOC(tocString, nexttIndex, anchorArray, tCollapse);
		} else {
			tocString +='</li>';
			returntocString = generateTOC(tocString, nexttIndex, anchorArray, tCollapse);
		}
	} else {
		tocString += '</li>';
		returntocString = tocString;
	}
	return(returntocString);
}

function findTOCLevelValue(curAnchor) {
	var curLevel = curAnchor.parentNode.className.match(/(sub)/g);
	if (curLevel == null) {
		if(curAnchor.parentNode.nodeName == 'BODY') {
			var levelValue = 1;
			return levelValue;
		} else {
			return findTOCLevelValue(curAnchor.parentNode);
		}
	} else {
		var levelValue = curLevel.length +1;
		return levelValue;
	}
}

function toggleTOCVisibility(listId) {
	//Expands and contracts TOC levels.
	var changeList = document.getElementById(listId);
	var treeItem = listId.replace('tocid','toctree');
	var treeNode = document.getElementById(treeItem);
	/*Get current cookie string*/
	var tempCollapse = getCookie('collapse');
	if(tempCollapse == null) {
		tempCollapse = '';
	}
	if(changeList.style.display == 'block') {
		tempCollapse = tempCollapse.replace(listId.replace('tocid','')+',','');
		setCookie('collapse',tempCollapse);
		
		changeList.style.display = 'none';
		treeNode.src = treeNode.src.replace(/minus([^\\/]*\....)$/, "plus$1");
	} else {
		changeList.style.display = 'block';
		treeNode.src = treeNode.src.replace(/plus([^\\/]*\....)$/, "minus$1");
		
		tempCollapse += listId.replace('tocid','') + ',';
		setCookie('collapse',tempCollapse);
	}
}



function writeToElementId(elementId, replaceString) {
	//write string to given element ID simplification function
	var elementNode = document.getElementById(elementId);
	elementNode.innerHTML = replaceString;
}

function addTocHoverIE6(tocid) {
	var tocHandle = document.getElementById(tocid);
	var litemArray = tocHandle.getElementsByTagName('li');
	for(i=0,n=litemArray.length; i<n;i++) {
		litemArray[i].style.height = 'auto';////Pranjali: ETEXT-2243
		litemArray[i].onmouseenter = function() {tocHoverOn(this)};
		litemArray[i].onmouseleave = function() {tocHoverOff(this)};
	}
}

function tocHoverOn(litem) {
//	var litem = e.target ? e.target : e.srcElement;
//	if(litem && ( litem.nodeType == 3 || litem.nodeType == 4 ) ) {
//		litem = litem.parentNode;
//	}
	if(!litem.className.match(/toc_menu\d_hover/)) {
		litem.className += ' ' + litem.className.replace(/toc_menu(\d)/,'toc_menu$1_hover');
	}
}

function tocHoverOff(litem) {
//	var litem = e.target ? e.target : e.srcElement;
//	if(litem && ( litem.nodeType == 3 || litem.nodeType == 4 ) ) {
//		litem = litem.parentNode;
//	}

	if(litem.className.match('_hover')) {
		litem.className = litem.className.replace(/ toc_menu\d_hover/,'');
	}
}