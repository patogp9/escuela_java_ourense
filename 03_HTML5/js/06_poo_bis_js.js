var divBis = document.getElementById("contenido bis");
divBis.style = "background-color: lightpink";

var mostrarTodosParam = function (primerParam) {
    divBis.innerHTML += "<p>Primer parámetro:  " + primerParam + "</p>";
    for (argumento of arguments) {
        divBis.innerHTML += "Argumento:  " + argumento + "<br/>";
    }
    if (typeof (primerParam) === "undefined")
        divBis += "primerParam no está definida";

    if (primerParam == "1") {
        divBis.innerHTML += "Pues es parecido a \"1\"<br/>";
    } else {
        divBis.innerHTML+= "No es parecido a \"1\"<br/>"
    }

    if (primerParam === "1") {
        divBis.innerHTML += "Pues es identico a \"1\"<br/>";
    } else {
        divBis.innerHTML+= "No es identico a \"1\"<br/>"
    }
}
//mostrarTodosParam("Un argumento", 50, true, bebida);
mostrarTodosParam("1");
mostrarTodosParam(1);

var intentoConversion= parseFloat("veinte");
divBis.innerHTML+="</br>Convirtiendo: Res = "+intentoConversion+ "Tipo de dato: "+typeof(intentoConversion);