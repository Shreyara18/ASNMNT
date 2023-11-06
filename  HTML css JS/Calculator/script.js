let displayValue = "";

function appendToDisplay(val) {
    displayValue += val;
    document.getElementById("display").value = displayValue;
}

function calculateResult() {
    try {
        let result = eval(displayValue);
        document.getElementById("display").value = result;
    } catch (error) {
        document.getElementById("display").value = "Error";
    }
}

function clearDisplay() {
    displayValue = "";
    document.getElementById("display").value = "";
}
