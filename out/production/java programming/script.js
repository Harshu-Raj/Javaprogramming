// JavaScript for form validation
function validateForm() {
    const email = document.getElementById('email').value.trim();
    const password = document.getElementById('password').value.trim();
    const errorMessage = document.getElementById('error-message');

    if (!email || !password) {
        errorMessage.textContent = 'All fields are required.';
        return;
    }

    // Email format validation (basic)
    const emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
    if (!emailPattern.test(email)) {
        errorMessage.textContent = 'Please enter a valid email address.';
        return;
    }

    // Password length validation
    if (password.length < 6) {
        errorMessage.textContent = 'Password must be at least 6 characters.';
        return;
    }

    // If all validations pass, submit the form (or implement further logic)
    errorMessage.textContent = '';
    alert('Login successful!');
}
