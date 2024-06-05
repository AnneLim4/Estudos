function validateForm(){
    let name = document.forms["Form"]["name"].value
    let email = document.forms["Form"]["email"].value
    let password = document.forms["Form"]["password"].value

    if (name == "" || email == "" || password == ""){
        alert("Por favor, preencha todos os campos obrigatórios.")
        return false;
    }

    let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/
    if (!emailRegex.test(email)){
        alert("Por favor, insira um endereço de e-mail válido.")
        return false;
    }

    if(password.length < 6) {
        alert("A senha deve ter pelo menos 6 caracteres.")
        return false
    }
    return true

   
}
document.getElementById("Form").addEventListener("submit", function(event){
    event.preventDefault();
    if(validateForm()){
        document.getElementById("Form").submit()
    }
} )