document.querySelector('#search').addEventListener('submit', async (event) =>{
    event.preventDefault();

    const cityName = document.querySelector('#city_name').value;

    if (!cityName){
        document.querySelector('#weather').classList.remove('show');
        showAlert('Digite uma cidade!!');
        Swal.fire({
            icon: "error",
            title: "Oops...",
            text: "Você não digitou uma cidade",
          });

        return 
    }


    const apiKey = '4c3c81f9057264f9e51e775aa33711c0';
    const apiUrl = `https://api.openweathermap.org/data/2.5/weather?q=${encodeURI(cityName)}&appid=${apiKey}&units=metric&lang=pt_br`

    const results = await fetch(apiUrl);
    const json = await results.json();

    if (json.cod === 200){
        showInfo({
            city: json.name, 
            country: json.sys.country, 
            temp: json.main.temp,
            tempMax: json.main.temp_max,
            tempMin: json.main.temp_min,
            description: json.weather[0].description,
            tempIcon: json.weather[0].icon,
            windSpeed: json.wind.speed,
            humidity: json.main.humidity
        });
    }else{
        document.querySelector('#weather').classList.remove('show');
        showAlert(`Não foi possivel localizar
                <img src="src/img/notUn.svg" />
        
        `);
    }
})

function showInfo(json){
    showAlert('');

    document.querySelector('#weather').classList.add('show');

    document.querySelector('#title').innerHTML = `${json.city}, ${json.country}`;
    document.querySelector('#temp_value').innerHTML = `${json.temp} <sup>°C</sup>`;
    document.querySelector('#temp_description').innerHTML = `${json.description}`;
    document.querySelector('#temp_img').setAttribute('src', `https://openweathermap.org/img/wn/${json.tempIcon}@2x.png`);
    document.querySelector('#temp_max').innerHTML = `${json.tempMax} <sup>°C</sup>`;
    document.querySelector('#temp_min').innerHTML = `${json.tempMin} <sup>°C</sup>`;
    document.querySelector('#humidity').innerHTML = `${json.humidity}% `
    document.querySelector('#wind').innerHTML = `${json.windSpeed}km/h`


                                            // Condições de tempestade/chuva/raios de sol

    if (json.tempMax > 41) {
         // Exibe o alerta
        Swal.fire({
            icon: "warning",
            title: "Temperatura Alta",
            text: "Se proteja dos Raios de Sol e beba bastante agua",
          });

    }

    if (json.windSpeed > 50){
        Swal.fire({
            icon: "warning",
            title: "Ventos Violentos",
            text: "Se proteja, evite janelas e lugares abertos!",
          });
    }

    if (json.description == "chuva leve"){
        Swal.fire({
            icon: "warning",
            title: "Chuva leve",
            text: "Se sua casa estiver em risco de alagar ou estiver alagada procure ajuda dos bombeiros ligue para: 193 e em casos de acidentes com rede elétrica para Central de Atendimento 0800 091 0196",
          });
    }
    
    if (json.description == "chuva"){
        Swal.fire({
            icon: "warning",
            title: "Chuva",
            text: "Se sua casa estiver em risco de alagar ou estiver alagada procure ajuda dos bombeiros ligue para: 193 e em casos de acidentes com rede elétrica para Central de Atendimento 0800 091 0196",
          });
    }

    if (json.description == "tempestade"){
        Swal.fire({
            icon: "warning",
            title: "Tempestade",
            text: "Se sua casa estiver em risco de alagar ou estiver alagada procure ajuda dos bombeiros ligue para: 193 e em casos de acidentes com rede elétrica para Central de Atendimento 0800 091 0196",
          });
    }
        
    if (json.description == "trovoada"){
        Swal.fire({
            icon: "warning",
            title: "Tempestade",
            text: "Se sua casa estiver em risco de alagar ou estiver alagada procure ajuda dos bombeiros ligue para: 193 e em casos de acidentes com rede elétrica para Central de Atendimento 0800 091 0196",
          });
    }

    if (json.description == "pancadas de chuva"){
        Swal.fire({
            icon: "warning",
            title: "Tempestade",
            text: "Se sua casa estiver em risco de alagar ou estiver alagada procure ajuda dos bombeiros ligue para: 193 e em casos de acidentes com rede elétrica para Central de Atendimento 0800 091 0196",
          });
    }

    if (json.description == "forte tempestade"){
        Swal.fire({
            icon: "warning",
            title: "forte tempestade",
            text: "Se sua casa estiver em risco de alagar ou estiver alagada procure ajuda dos bombeiros ligue para: 193 e em casos de acidentes com rede elétrica para Central de Atendimento 0800 091 0196",
          });
    }

    if (json.description == "tempestade pesada"){
        Swal.fire({
            icon: "warning",
            title: "Tempestade",
            text: "Se sua casa estiver em risco de alagar ou estiver alagada procure ajuda dos bombeiros ligue para: 193 e em casos de acidentes com rede elétrica para Central de Atendimento 0800 091 0196",
          });
    }

    

}


function showAlert(msg){
    document.querySelector('#alert').innerHTML = msg;
}




 

