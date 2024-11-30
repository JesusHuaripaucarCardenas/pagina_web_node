document.addEventListener("DOMContentLoaded", function () {
    const productoLink = document.getElementById("producto-link");
    const loadingOverlay = document.getElementById("loading-overlay");

    productoLink.addEventListener("click", function (e) {
        e.preventDefault(); // Prevenir la redirección inmediata
        loadingOverlay.classList.add("active"); // Mostrar la animación

        // Redirigir después de 2 segundos
        setTimeout(() => {
            window.location.href = productoLink.href;
        }, 2000);
    });
});
