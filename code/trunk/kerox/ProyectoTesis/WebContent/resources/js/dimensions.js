window.onload = function(){
	if(screen.availHeight == window.height){
		redimensionar();
	}
};
//window.onresize = redimensionar;

function redimensionar() {
	var altoVentana = obtenerAltoVentana() - 85;
	var alto = (altoVentana / 2) - 28;
	document.getElementById('panelDerecho').style.height = altoVentana + 'px';
	//TODO verificar
	//document.getElementById('panelEnlacesInteres').style.height = alto + 'px';
	//document.getElementById('panelEnlacesRelacionados').style.height = alto + 'px';
};

function obtenerAltoVentana() {
	var winH = 460;
	if (document.body && document.body.offsetWidth) {
		winH = document.body.offsetHeight;
	}
	if (document.compatMode == 'CSS1Compat' && document.documentElement
			&& document.documentElement.offsetWidth) {
		winH = document.documentElement.offsetHeight;
	}
	if (window.innerWidth && window.innerHeight) {
		winH = window.innerHeight;
	}
	return winH;
};