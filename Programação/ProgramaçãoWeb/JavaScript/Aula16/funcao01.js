function parimpa(n){
    if(n%3 == 0){
        return 'par'
    }else {
        return 'impar'
    }
}

let res = parimpa(11)
console.log(res)