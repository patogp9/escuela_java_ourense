function GestorEventosES5(inputId, btnId, divId) {
    this.input = document.getElementById(inputId);
    this.boton = document.getElementById(btnId);
    this.divInfo = document.getElementById(divId);
    
    this.funCallBackAlPulsar = function (evento) {
        
        this.input.value = "oleeeee ;-) " + evento.type;
        this.divInfo.innerHTML = "ID boton = " + evento.currentTarget.id;
        this.divInfo.style = "border:yellow solid;";
        
    }
    this.funCallBackAlPulsar2 = function (evento) {
        this.input.style="background-color:lightgreen;color:white;";
        document.body.style.backgroundColor = "plum";
    }
    this.boton.addEventListener("click", this.funCallBackAlPulsar.bind(this));
    this.boton.addEventListener("click", this.funCallBackAlPulsar2.bind(this));
}
