const horas = document.getElementById('horas');
const minutos = document.getElementById('minutos');
const segundos = document.getElementById('segundos');

const relogio = setInterval(function time(){ 
    // setInterval: função que executa uma determinada função repetidamente, a cada intervalo de tempo definido em milissegundos | //function time(): uma função chamada time.

    let dateToday = new Date();
    let hr = dateToday.getHours();
    let min = dateToday.getMinutes();
    let seg = dateToday.getSeconds();

    horas.textContent = hr; // textContent recebe todos as mudanças ocultas do css
    minutos.textContent = min;
    segundos.textContent = seg;
});