function signUp() {
    const uId = document.getElementById("t1").value;
    const uPass = document.getElementById("t2").value;
    const message = document.getElementById("message");

    if (uId === "" || uPass === "") {
        message.textContent = "Please enter both User ID and Password to sign up.";
        message.style.color = "red";
        return;
    }

    // Store the User ID and Password in localStorage
    localStorage.setItem(uId, uPass);
    message.textContent = "Sign Up successful!";
    message.style.color = "green";
}
function signIn() {
    const uId = document.getElementById("t1").value;
    const uPass = document.getElementById("t2").value;
    const message = document.getElementById("message");

    if (uId === "" || uPass === "") {
        message.textContent = "Please enter both User ID and Password to sign in.";
        message.style.color = "red";
        return;
    }

    // Retrieve the stored password for the given user ID
    const storedPass = localStorage.getItem(uId);

    // Check if the stored password matches the entered password
    if (storedPass === uPass) {
        message.textContent = "Welcome! You have successfully signed in.";
        message.style.color = "green";
        alert("Signed in");
    } else {
        message.textContent = "Invalid User ID or Password. Please try again.";
        message.style.color = "red";
    }
}
function updatePassword() {
    const uId = document.getElementById("t1").value;
    const oldPass = document.getElementById("t2").value;
    const newPass = document.getElementById("t3").value;
    const message = document.getElementById("message");

    if (uId === "" || oldPass === "" || newPass === "") {
        message.textContent = "Please enter User ID, Current Password, and New Password.";
        message.style.color = "red";
        return;
    }

    // Retrieve the stored password for the given user ID
    const storedPass = localStorage.getItem(uId);

    // Check if the stored password matches the entered old password
    if (storedPass === oldPass) {
        // Update the password
        localStorage.setItem(uId, newPass);
        message.textContent = "Password updated successfully!";
        message.style.color = "green";
    } else {
        message.textContent = "Current password is incorrect.";
        message.style.color = "red";
    }
}