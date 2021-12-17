function GoToSite(pagelistTXTfile) 
{
	var xmlHttp = null;
	
	if(window.ActiveXObject)
 	{
  		try 
  		{ 
  			xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
  		} 
  		catch(e) 
  		{
   			try 
   			{ 
   				xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
   			} 
   			catch(e) 
   			{ 
   				xmlHttp = false; 
   			}
  		}
 	}
 	else if(window.XMLHttpRequest) 
 	{
  		try 
  		{ 
  			xmlHttp = new XMLHttpRequest();
  		} 
  		catch(e) 
  		{ 
  			xmlHttp = false; 
  		}
 	}

	if(xmlHttp)
	{			
		xmlHttp.open("GET", pagelistTXTfile, true);
		xmlHttp.onreadystatechange=function() 
		{
			 if (xmlHttp.readyState==4) 
			 {				   			    
					var content = xmlHttp.responseText;
					var str1=content.split("$");
					var flag=0;
					var v1=document.getElementById('pagenum').value;
					if(v1=='')
					{
						alert("please enter page number");
					}
					else if(v1.toLowerCase() == 'index'.toLowerCase())
					{
						var var3=v1.toLowerCase()+".html";
						window.location.href = var3;
					}
					else
					{				
						for(var i=0;i < str1.length;i++)
						{
							if(v1.toLowerCase() == str1[i].toLowerCase())
							{
								flag=1;
								var var4 = str1[i];
							}
						}
						if(flag==1)
						{
							var var2="page_"+var4+".html";
							window.location.href = var2;
						}
						else
						{
							alert("This page number does not exist in this book");
						}
					}
					 
				
				}
		}
	}
	
    xmlHttp.send(null);	
		

}

function pageJumpEnter(e) {
	if(e.keyCode == 13) {
		GoToSite('pagelist/pagelist.txt');
		return(false);
	} else {
		return(true);
	}
}

