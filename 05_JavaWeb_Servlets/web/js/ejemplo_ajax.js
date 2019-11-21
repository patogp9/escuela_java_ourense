/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.addEventListener("load", function () {

    document.getElementById("btn_peticion_ajax").onclick = function () {
        var objAjax = new XMLHttpRequest();
        objAjax.onreadystatechange = function () {

            console.log("State:  " + this.readyState + " status:  " + this.status);
            console.log("Texto respuesta:  " + this.responseText);

            if (this.readyState == 4 && this.status == 200)
                document.getElementById("div_datos_json").innerHTML = this.responseText;

            var respuestaObj = JSON.parse(this.responseText);
            document.getElementById("div_datos").innerHTML = `

<span style='font-weight: bold;'>Nombre :</span></br>
            ${respuestaObj.nombre}
<span style='font-weight: bold;'>Nombre</span></br>
            ${respuestaObj.edad}
 <span style='font-weight: bold;'>Nombre</span></br>
            `;
            for (var numFib of respuestaObj.fibonacci) {
                document.getElementById("div_datos").innerHTML += " - " + numFib;
            }
        };

        objAjax.open("GET", "./datosjson");
        objAjax.send();
        console.log("petcion enviada")
    };
});

