var idade = 66
if (idade < 16){
    // console.log('Menor de idade')
    console.log('Não vota')
} 

/* else {    
   // console.log('Maior de idade')
    if (idade >= 16 && idade < 18){
        console.log('Voto opcional')
    }else{
        console.log('Voto obrigatorio')
    }
} */

else if (idade < 18 || idade > 65){
         console.log('Voto opcional')
     }else{
         console.log('Voto obrigatorio')
     }
 