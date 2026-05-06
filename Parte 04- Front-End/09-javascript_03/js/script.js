const form = document.querySelector('form');

// arrow function {lambda}
const maioridade = () => {
// declaração de variaveis
let nome = document.querySelector('#nome').value;
let idade = document.querySelector('#idade').value;

// saida de dados
if (idade >= 18) {
    document.querySelector('#result').innerHTML = nome + ' é maior de idade.';
}
 else {
    document.querySelector('#result').innerHTML = nome + ' é menor de idade.';
}

form.reset();
}

// evento
form.addEventListener('submit', function(event) {
    // anula o submit
    event.preventDefault();

    // chama a arrow function
    maioridade();
});