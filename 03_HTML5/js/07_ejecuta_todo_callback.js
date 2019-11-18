        let array_A = [1, 2, 3, 4, 5];
        let array_B = [2, 4, 6, 3, 1];
        
        let sumaAB = operarArrays(array_A, array_B, suma);
        let multiAB = operarArrays(array_A, array_B, multiplica);
        let divAB = operarArrays(array_A, array_B, divide);
        let restAB = operarArrays(array_A, array_B, resta);
        let punto = operarArrays(array_A, array_B, hacerUnPunto);
        function arrayEnTabla(array) {
            let tabla = "<table border=2><tr>";
            for (let index = 0; index < array.length; index++) {
                const element = array[index];
                tabla += "<td>" + element + "</td>";
            }
            document.getElementById("contenido").innerHTML += tabla+ "</tr></table>";
        }
        arrayEnTabla(array_A);
        arrayEnTabla(array_B);
        arrayEnTabla(punto);
        arrayEnTabla(sumaAB);
        arrayEnTabla(restAB);
        arrayEnTabla(multiAB);
        arrayEnTabla(divAB);
