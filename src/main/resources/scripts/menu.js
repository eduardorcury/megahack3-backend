const menu = document.querySelector('.menu')
const navbar = document.querySelector('.navbar')


menu.addEventListener("click", function(){
    navbar.classList.add('visible')
})

document.querySelector('.fechar').addEventListener("click", function(){

    navbar.classList.remove('visible')
})

// menu = document.querySelector('.buttom').addEventListener("click", function(){
//     if(cont==1)

// })