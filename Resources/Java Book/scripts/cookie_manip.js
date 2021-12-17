/*Sample usage*/

/*
//On text size increase set cookie (Note: netSizeChange should 
//be the total change on the page, not just the current increment.  
//A global variable that is updated upon text-size increase is 
//recommended.
	setCookie('text-size', netSizeChange);

//On page load, retrieve cookie and set text size
	var cookieResponse = getCookie('text-size');
	if(typeof(cookieResponse) != 'null' && cookieResponse != null) {
		var textIncreaseIncrement = parseInt(cookieResponse);
		textSizeChange(targetElementId,textIncreaseIncrement)
	}
*/

/*End sample usage*/


function setCookie(name, value, expires, path, domain, secure) {
	//Set cookie simplification function
	document.cookie= name + "=" + escape(value) +
		((expires) ? "; expires=" + expires.toGMTString() : "") +
		((path) ? "; path=" + path : "") +
		((domain) ? "; domain=" + domain : "") +
		((secure) ? "; secure" : "");
}

function getCookie(name) {
	//Get cookie simplification function
	var dc = document.cookie;
	var prefix = name + "=";
	var begin = dc.indexOf("; " + prefix);
	if (begin == -1) {
		begin = dc.indexOf(prefix);
		if (begin != 0) return null;
	} else {
		begin += 2;
	}
	var end = document.cookie.indexOf(";", begin);
	if (end == -1) {
		end = dc.length;
	}
	return unescape(dc.substring(begin + prefix.length, end));
}