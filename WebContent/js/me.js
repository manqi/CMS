function Changedisplay1(){
	if (document.getElementById('hiden1').style.display=='block')
		document.getElementById('hiden1').style.display='none';
	else
		document.getElementById('hiden1').style.display='block';
}

function Changedisplay2(){
	if (document.getElementById('hiden2').style.display=='block')
		document.getElementById('hiden2').style.display='none';
	else
		document.getElementById('hiden2').style.display='block';
}

function Changedisplay3(){
	if (document.getElementById('hiden3').style.display=='block')
		document.getElementById('hiden3').style.display='none';
	else
		document.getElementById('hiden3').style.display='block';
}

function Changedisplay4(){
	if (document.getElementById('hiden4').style.display=='block')
		document.getElementById('hiden4').style.display='none';
	else
		document.getElementById('hiden4').style.display='block';
}

function QueryKclb(){
	document.getElementById('ifmSignIn').src='queryKclb.jsp';
}

function AddKclb(){
	document.getElementById('ifmSignIn').src='addKclb.jsp';
}


function iFrameHeight() { 
	var ifm= document.getElementById("ifmSignIn"); 
	var subWeb = document.frames ? document.frames["ifmSignIn"].document : ifm.contentDocument; 
	if(ifm != null && subWeb != null) { 
		ifm.height = subWeb.body.scrollHeight; 
	} 
} 