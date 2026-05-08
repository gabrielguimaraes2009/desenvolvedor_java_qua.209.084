const form = document.querySelector('form');

// arrow function {lambda}
const IMC = () => {
// declaração de variaveis
let nome = document.querySelector('#nome').value;
let peso = document.querySelector('#peso').value;
let altura = document.querySelector('#altura').value;

let imc = peso / (altura * altura);

// saida de dados

if (imc < 18.5) {
    document.querySelector('#result').innerHTML = nome + ' está abaixo do peso.';
}
 else if (imc < 25) {
    document.querySelector('#result').innerHTML = nome + ' está no peso ideal.';
}
 else if (imc < 30) {
    document.querySelector('#result').innerHTML = nome + ' está acima do peso.';
}
 else if (imc < 35) {
    document.querySelector('#result').innerHTML = nome + ' está com obesidade nível 1.';
}
 else if (imc < 40) {
    document.querySelector('#result').innerHTML = nome + ' está com obesidade nível 2.';
}
 else {
    document.querySelector('#result').innerHTML = nome + ' está com obesidade mórbida.';
}

document.querySelector('#result').innerHTML +=
    ' O IMC de ' + nome + ' é: ' + imc.toFixed(2);

form.reset();
}

// evento
form.addEventListener('submit', function(event) {
    // anula o submit
    event.preventDefault();

    // chama a arrow function
    IMC();
});