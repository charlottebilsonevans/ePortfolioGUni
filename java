document.addEventListener('DOMContentLoaded', function() {
    const contactForm = document.getElementById('contact-form');
    contactForm.addEventListener('submit', function(event) {
        event.preventDefault();
        // Here you can add the logic to send the data to a server or email service.
        alert('Thank you for your message!');
    });
});
