

function questao01(firstName, interest, hobby){
	var msg = "Hi, my name is " + firstName + ". I love " + interest + ". In my spare time, I like to " + hobby + ".";
	console.log(msg);
}

function questao02(musicians){
	
	if(musicians <= 0){
	    console.log("not a group");
	}else if(musicians == 1){
	    console.log("solo");
	}else if(musicians == 2){
	    console.log("duet");
	}else if(musicians == 3){
	    console.log("trio");
	}else if(musicians == 4){
	    console.log("quartet");
	}else if(musicians > 4){
	    console.log("this is a large group");
	}
}

function questao03(fileira, cadeiras){
	for (var fileira = 25; i <= 0; i--) {
		for (var cadeiras = 99; j <= 0; j--) {
			console.log(i + " - " + j);
		}
	}
}

function questao04(numeros){
	for (var i = numeros.length - 1; i >= 0; i--) {
		if (numeros % 3 === 0 && numeros % 5 === 0) {
			console.log("FizzBuzz");
		}else if (numeros % 3 === 0) {
			console.log("Fizz");
		}else if (numeros % 5 === 0) {
			console.log("Buzz");
		}else{
			console.log(numeros[i]);
		}
	}
	
}

function questao05(num){
	function laugh(num){
		var ha = "ha"; 
		var msg = "";
		for (var i = num - 1; i >= 0; i--) {
			ha += "ha"
		}
	};

	console.log(laugh(3));

}

/* TESTAR E REVISAR */
function questao06(){
	var numbers = [
		[ 243, 12, 23, 12, 45, 45, 78, 66, 223, 3 ],
		[ 34, 2, 1, 553, 23, 4, 66, 23, 4, 55 ],
		[ 67, 56, 45, 553, 44, 55, 5, 428, 452, 3 ],
		[ 12, 31, 55, 445, 79, 44, 674, 224, 4, 21 ],
		[ 4, 2, 3, 52, 13, 51, 44, 1, 67, 5 ],
		[ 5, 65, 4, 5, 5, 6, 5, 43, 23, 4424 ],
		[ 74, 532, 6, 7, 35, 17, 89, 43, 43, 66 ],
		[ 53, 6, 89, 10, 23, 52, 111, 44, 109, 80 ],
		[ 67, 6, 53, 537, 2, 168, 16, 2, 1, 8 ],
		[ 76, 7, 9, 6, 3, 73, 77, 100, 56, 100 ]
	];

	for (var i = 0; i < numbers.length ; i++) {
	  
		for (var j = 0; j < numbers[i].length - 1; j++) {
			if (numbers[i][j] % 2 === 0){
				numbers[i][j] = "even";
			}else if (numbers[i][j] % 2 !== 0) {
				numbers[i][j] = "old";
			}
			document.write(numbers[i][j]+", \n")
        }
        
	}

}

function questao07(){

	var savingsAccount = {
    balance: 1000,
    interestRatePercent: 1,
    
    deposit: function addMoney(amount) {
        if (amount > 0) {
            savingsAccount.balance += amount;
        }
    },

    withdraw: function removeMoney(amount) {
        var verifyBalance = savingsAccount.balance - amount;
        if (amount > 0 && verifyBalance >= 0) {
            savingsAccount.balance -= amount;
        }
    },

    printAccountSummary: function printAccountSummary(){
        return "Welcome! \nYour balance is currently $" + savingsAccount.balance + " and your interest rate is " + savingsAccount.interestRatePercent + "%.";
    },

	};

	console.log(savingsAccount.printAccountSummary());
}