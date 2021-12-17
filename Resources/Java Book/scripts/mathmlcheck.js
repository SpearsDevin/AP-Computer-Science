function IsMPInstalled()
{
  try {
    var oMP = new ActiveXObject("MathPlayer.Factory.1");
    return true;
  }
  catch(e) {
    return false;
  }
}
function IsIE6LaterWindows()
{
  var pos=navigator.appVersion.indexOf("MSIE ")+5;
  return( navigator.appName=="Microsoft Internet Explorer" && navigator.platform=="Win32" && parseFloat(navigator.appVersion.substr(pos))>="6.0");
}

if(!mathJaxSupportRequired() ) {
  if( ! IsMPInstalled() ) {
    if( confirm("This page requires Design Science's MathPlayer to display equations and symbols.\nMathPlayer is not currently installed, so equations and symbols will not display properly.\n\nWould you like to download and install MathPlayer now?") )
      window.open("http://www.dessci.com/webmath/mathplayer", "MPDownload");
  }
}
else {
 // alert("This page uses Design Science's MathPlayer to display equations and symbols,\nand requires Microsoft Internet Explorer 6.0 or later on Windows.\n\nAs you are using a different browser, equations and symbols will not display properly.");
}



function mathJaxSupportRequired()
{
   var isSupported=true; //it will be false only for IE8 or less
   var ieVersion = -1; // Return value assumes failure.
   if (navigator.appName == 'Microsoft Internet Explorer')
   {
      var userAgent = navigator.userAgent;
      var regularExpressionForIEVersion  = new RegExp("MSIE ([0-9]{1,}[\.0-9]{0,})");
      if (regularExpressionForIEVersion.exec(userAgent) != null)
      {
         ieVersion = parseFloat( RegExp.$1 );
      }
      if(ieVersion <=8)
      {
         isSupported=false;
      }
   }
  return isSupported;
}