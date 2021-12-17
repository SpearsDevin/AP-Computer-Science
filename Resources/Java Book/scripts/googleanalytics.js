var googleSiteID = 'UA-39060246-1'; //DEV
var currentEbookServerName = window.location.host;
if (currentEbookServerName == 'dev.ebookcm.pearsoncmg.com')
{
  googleSiteID = 'UA-39060246-1';  //DEV
}
else if (currentEbookServerName == 'cert.ebookcm.pearsoncmg.com' 
	|| currentEbookServerName == 'uat.ebookcm.pearsoncmg.com'
	|| currentEbookServerName == 'ppe.ebookcm.pearsoncmg.com'
	|| currentEbookServerName == 'ebookcm.pearsoncmg.com')
{
  googleSiteID = 'UA-39055555-1';  //CERT
}
else
{
	googleSiteID = 'UA-39058243-1'; // Accessible HTML PROD and other HTML related servers
}

var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));