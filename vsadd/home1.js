function validateLogin() {
    // Predefined correct username and password
    const correctUsername = "admin";
    const correctPassword = "12345";

    // Get the input values
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    // Error message element
    const errorMessage = document.getElementById("error-message");

    // Validate the username and password
    if (username === correctUsername && password === correctPassword) {
        alert("Signed in");
        //errorMessage.textContent = ""; // Clear any previous error message
    } else {
        alert("not valid");
       // errorMessage.textContent = "Invalid username or password";
        //errorMessage.style.color = "red";
    }
}
