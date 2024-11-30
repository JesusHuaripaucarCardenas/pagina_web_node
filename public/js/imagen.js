window.addEventListener('scroll', function() {
    const imagen = document.querySelector('.imagen-en-medio');
    const section = document.querySelector('.imagen-seccion');
    const distancia = window.scrollY;
    const sectionTop = section.offsetTop;
    const sectionHeight = section.offsetHeight;
    const sectionBottom = sectionTop + sectionHeight;

    if (distancia >= sectionTop && distancia <= sectionBottom) {
        // Si estamos dentro de la sección, mostrar la imagen
        imagen.style.opacity = '1';
    } else {
        // Si estamos fuera de la sección, ocultar la imagen
        imagen.style.opacity = '0';
    }
});
