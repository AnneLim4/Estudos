
let num = document.querySelector('input#fnum')
let lista = document.querySelector('select#flista')
let res = document.querySelector('div#res')
let valores = []

function isNumero(n){
    if(Number(n) >= 1 && Number(n) <= 100){
        return true
    } else {
        return false
    }
}

function inlista(n, l){
     if(l.indexOf(Number(n)) != -1){
        return true
     }else{
        return false
     }
}

function adicionar() {

    // isNumero é um nome qualquer para analisar se é um numero
    // !inlista uma analise criada para saber se o numero esta em uma lista ou não 


    if (isNumero(num.value) && !inlista(num.value, valores)){
        
        valores.push(Number(num.value))
        let item = document.createElement('option')
        item.text = `Numero adicionado é: ${num.value}`
        lista.appendChild(item)
        res.innerHTML = '' //quando adicionar um valor todo o sistema é limpo
    
    }else {
        window.alert(`Valor invalido ou já encontrado na lista`)
    }
    num.value = ''
    num.focus() // quando o num.value apaga e adiciona o valor o curso volta para a barra
}


function finalizar(){

    if(valores.length == 0){
        window.alert('Adicione valores antes de finalizar!')
    }else{

        let maior = valores[0]
        let menor = valores[0]
        let soma = 0
        for (let pos in valores){

            // soma o valor atual com os proximos
            soma += valores[pos]

            if (valores[pos] > maior)
                maior = valores[pos]
            
            if (valores[pos] < menor)
                menor = valores[pos]
            
        }
        res.innerHTML = ''
        valores.sort()
        res.innerHTML = `O vetor na ordem fica: ${valores} <br>`
        res.innerHTML += `O vetor tem ${valores.length} posições <br>`
        res.innerHTML += `O primeiro valor do vetor é ${valores[0]} <br>`
        res.innerHTML += `O maior valor do vetor é ${maior} <br>`
        res.innerHTML += `O menor valor do vetor é ${menor} <br>`

        res.innerHTML += `A somando de todos os valores é: ${soma}`

    }
      
}