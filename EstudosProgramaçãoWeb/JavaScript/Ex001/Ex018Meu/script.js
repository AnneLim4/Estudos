function analisar(){

    let nbar = document.getElementById('n1')
    let narea = document.getElementById('area')
    let res = document.getElementById('res')

    if(nbar.value.length <= 0 && nbar.value.length > 100){
        window.alert('Numero invalido ou não foi digitado')
    }else{ 
        let numero = []
        let a = numero.push(nbar.value)
        res.innerHTML = ''

        let item = document.createElement('option')
        item.text = `O seu numero é ${a}`
        res.appendChild(item)
    }



}