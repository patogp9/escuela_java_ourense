/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
    $("#btn_peticion_ajax_jq").click(function(){
        $.ajax({
           "url":"./datosjson",
           "type": "GET",
           "success":function(respuestaJson){
               $("#div_datos_json").html(JSON.stringify(respuestaJson));
           },
           "error":function (jqXHR,textStatus,errorThrown){
               console.error("no se obtuvo la info:");
               console.warn(jqXHR);
               console.warn(textStatus);
               console.warn(errorThrown);
               if(jqXHR.status===404){
                   alert("URL no localizada");
               }
           }
        });
    });
    
    $("#btn_peticion_ajax_post").click(function(){
        let nombre = document.getElementById("nombre").value;
        let email = document.getElementById("email").value;
        
        
        if(nombre!=="" && nombre.length > 1 && email!==""){
        let datosUsuario = {
          "nombre": nombre,
          "email": email
        };
        
        $.post("./datosjson",datosUsuario,
        function(response){
            $("#div_datos_json").html(JSON.stringify(response));
        });
    }else{
        alert("machooooooo");
    }
    });
});

