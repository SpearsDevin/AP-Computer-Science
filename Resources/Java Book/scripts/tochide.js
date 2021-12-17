function tochide(tgtId, adjacentId) {
	var targetElement = document.getElementById(tgtId);
	var adjacentElement = document.getElementById(adjacentId);

	var imageNode = document.getElementById('tocshowhide');
	var childNodes = targetElement.getElementsByTagName("*");

	if(targetElement.style.position == 'absolute') {
		/*Hack to force IE redraw of elements*/
		for(i=0; i<childNodes.length; i++) {
			childNodes[i].style.height = '';
		}
		targetElement.style.position = 'relative';
		targetElement.style.left = 0 + 'px';
		adjacentElement.style.width='';
		
		//image will retain focus after being set, therefore set to focus-image
		imageNode.setAttribute("src","images/minus-over.gif");
		imageNode.setAttribute("alt","Hide table of contents");
	} else {
		/*Hack to force IE redraw of elements*/
		for(i=0; i<childNodes.length; i++) {
			childNodes[i].style.height = '1%';
		}
		var endPosition = 0 - (targetElement.offsetWidth);

		targetElement.style.position = "absolute";
		targetElement.style.left = (endPosition)+ 'px';
		adjacentElement.style.width='100%';

		//image will retain focus after being set, therefore set to focus-image
		imageNode.setAttribute("src","images/plus-over.gif");
		imageNode.setAttribute("alt","Show table of contents");
	}
}

