function calculateSum() {
    let price, qty, totalAmount, discount, paidAmount;

    // Get the values from the input fields and convert them to integers
    price = parseInt(document.getElementById("t1").value);
    qty = parseInt(document.getElementById("t2").value);

    // Check if price and quantity are valid numbers
    if (isNaN(price) || isNaN(qty)) {
        alert("Please enter valid numbers for price and quantity");
        return;
    }

    // Calculate total amount
    totalAmount = price * qty;
    document.getElementById("t3").value = totalAmount;

    // Calculate discount (5% of total amount)
    discount = totalAmount * 0.05;
    document.getElementById("t4").value = discount.toFixed(2); // Rounded to 2 decimal places

    // Calculate total paid amount (total amount minus discount)
    paidAmount = totalAmount - discount;
    document.getElementById("t5").value = paidAmount.toFixed(2);
}
