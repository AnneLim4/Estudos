/*

function tabuada() {
    let num = document.getElementById('txtn')
    let tab = document.getElementById('seltab')

    if (num.value.length == 0){
        window.alert('Digite um numero')
    } else {
        let n = Number(num.value)
        let c = 1
        tab.innerHTML = ''  // deixa a area da tabuada sempre limpa quando chama o while
        while (c <= 10){
            let item  = document.createElement('option')
            item.text = `${n} x ${c} = ${n*c}`
            item.value = `tab${c}` // saber qual item foi selecionado
            tab.appendChild(item)
            c++
        }
    }

    
}

*/

function tabuada() {
    let num = document.querySelector('#txtn')
    let tab = document.querySelector('#seltab')

    if (num.value.length == 0){
        window.alert('Digite um numero')
    }else {
        let n = Number(num.value)
        tab.innerHTML = ''
        for ( c = 1 ;c <= 10 ; n * c ){
            //cria um option no select
            let item = document.createElement('option')
            item.text = `${n} x ${c} = ${n*c}`
            tab.appendChild(item)
            c++
        }
    }
}