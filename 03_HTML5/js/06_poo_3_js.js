var unObjeto = {};
var otroObj = {
    "prop_1": "Propiedad 1",
    "prop_2": "Propiedad 2",
    "prop_3": "Propiedad 3",
    "prop_4": "Propiedad 4",
    toString: function () {
        var strProp = "Lista de propiedades: ";
        for (key in this) {
            if (key.indexOf("prop_") >= 0) {
                strProp+= this[key] + "; ";
            }
        }
        return strProp;
    },
    busqueda:function(busqueda){
        return res
    }//,
    //opera:function(i,j){
      //  return (i*j);
    }

}
otroObj.prop_5 = "Propiedad cinco";
otroObj.prop_9 = "Popiedad nueve";
var divTris = document.getElementById("divTris");
divTris.innerHTML += otroObj.toString();