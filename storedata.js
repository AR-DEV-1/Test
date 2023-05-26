<script>
  // Retrieve the login form element
  const loginForm = document.getElementById('loginForm');

  // Add an event listener to the form submit event
  loginForm.addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the form from submitting

    // Get the entered username and password
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // Store the username and password in local storage
    localStorage.setItem('username', username);
    localStorage.setItem('password', password);

    // Redirect the user to the authenticated page or perform any other desired action
    window.location.href = 'authenticated.html';
  });
</script>
