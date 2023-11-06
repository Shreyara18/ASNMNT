function submitForm() {
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;
    const gender = document.querySelector('input[name="gender"]:checked');
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    if (firstName && lastName && dob && country && gender && profession && email && mobile) {
        const genderValue = gender ? gender.value : 'Not specified';
        const message = `First Name: ${firstName}\nLast Name: ${lastName}\nDate of Birth: ${dob}\nCountry: ${country}\nGender: ${genderValue}\nProfession: ${profession}\nEmail: ${email}\nMobile: ${mobile}`;
        alert(message);
        document.getElementById('surveyForm').reset();
    } else {
        alert('Please fill out all the fields.');
    }
}

function resetForm() {
    document.getElementById('surveyForm').reset();
}
