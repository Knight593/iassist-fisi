window.onresize = redimensionar;
window.onload = redimensionar;

function redimensionar() {
	var altoVentana = obtenerAltoVentana() - 85;
	var alto = (altoVentana / 2) - 28;
	document.getElementById('container').style.height = altoVentana + 'px';
	document.getElementById('superior').style.height = alto + 'px';
	document.getElementById('inferior').style.height = alto + 'px';
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