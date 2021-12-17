function dlinkload()
{
   var flg = mathJaxSupportRequired();
   //MathJAX supported is required
   if (flg=='true')
   {
       var head= document.getElementsByTagName('head')[0];
       var script= document.createElement('script');
       script.type= 'text/javascript';
       script.src= 'https://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML';
       head.appendChild(script);

       var componentContainer=document.getElementsByTagName("m:math");
       for (var i=0; i<componentContainer.length; i++)
       {
           componentContainer[i].setAttribute("xmlns:m", "http://www.w3.org/1998/Math/MathML");
       }
   }
}

//Method to check whether MathJax support is required or not
function mathJaxSupportRequired()
{
   var isSupported='true'; //it will be false only for IE8 or less
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
         isSupported='false';
      }
   }
  return isSupported;
}
