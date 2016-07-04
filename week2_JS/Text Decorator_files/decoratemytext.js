window.onload = function() {
    var timer = null;
    document.getElementById("bigger").onclick = function() {
        if (timer == null) {
            timer = setInterval(setFontSize, 500)
        } else {
            clearInterval(timer);
            timer = setInterval(setFontSize, 500)
        }

        function setFontSize() {
            var currentSize = document.getElementById("textArea").style.fontSize;
            //alert(currentSize)
            var number = Number(currentSize.split("pt")[0]) == 0 ? 12 : Number(currentSize.split("pt")[0]);
            //alert(number);
            document.getElementById("textArea").style.fontSize = number + 2 + "pt";
        }

    };
    var bling = document.getElementById("bling");
    bling.onchange = function() {
        //bling= document.getElementById("bling");
        document.body.style.backgroundImage = "url(http://www.cs.washington.edu/education/courses/190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg)";
        var blingvalue = document.querySelector('#bling:checked');
        //alert(blingvalue)
        if (blingvalue == null) {
            document.getElementById("textArea").style.fontWeight = "normal";
        } else {

            document.getElementById("textArea").style.fontWeight = "bold";
            document.getElementById("textArea").style.color = "green";
            document.getElementById("textArea").style.textDecoration = "underline";

        }
    }

    document.getElementById("igpay").onclick = function() {
            var text = document.getElementById("textArea");
            var words = text.value.split(" ");
            for (var i = 0; i < words.length; i++) {
                var word = words[i];
                var pattern = /^[b-df-hj-np-tv-z]+/i;
                if (pattern.test(word)) {
                    var matched = pattern.exec(word);
                    //alert(matched+"--")
                    var temp = word.replace(pattern, '');
                    //alert(temp)
                    var newWord = temp + matched + "-ay";
                    words[i] = newWord;
                }
            }
            text.value = words.join(" ");
        }
        //Malkovich process
    document.getElementById("malkovitch").onclick = function() {
        var text = document.getElementById("textArea");
        //alert(text);
        var words = text.value.split(" ");
        for (var i = 0; i < words.length; i++) {
            if (words[i].length >= 5) {
                words[i] = "Malkovich";
            }
        }
        text.value = words.join(" ");
    }

}