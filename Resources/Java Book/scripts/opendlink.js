function opendlink(url)
        {
	//added to adjust the window according to the screen size. ETEXT:2130
                var left = (screen.width/2)-(700/2);
                var top = (screen.height/2)-(600/2);
                var charcteristics='width=700,height=600,scrollbars=yes,top='+top+',left='+left;
                window.open(url,'popup',charcteristics);
                 return false;

}
