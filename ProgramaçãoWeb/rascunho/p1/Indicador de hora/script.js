
function carregar(){
    var msg = window.document.getElementById('msg')
    var img = window.document.getElementById('imagem')
    var data = new Date()
    var hora = data.getHours()
    var minuto = data.getMinutes()
    msg.innerHTML = `Agora são ${hora}:${minuto} horas`

    if (hora >= 0 && hora < 12){
        img.src = 'img/Manha.png'
        document.body.style.backgroundColor = '#d6c7a8'
    } else if(hora >= 12 && hora < 18){
        img.src = 'img/Tarde.png'
        document.body.style.background = '#d8c261'
    } else {
        img.src = 'img/Noite.png'
        document.body.style.background = '#398a7f'
    }
}


