var Puzzle = (function() {
	//General implementation steps
	//1. initialize the background
	//2. set the click event for divs
	//3. movie the div for the clicked one and swap with the empty one
	//4. 
    var init = function() {
        var puzzleArea = document.getElementById('puzzlearea');
        var divs = $("#puzzlearea div");

        // initialize each piece
        $.each(divs, function(i, value) {
            var div = divs[i];
            // calculate x and y for this piece
            var x = ((i % 4) * 100);
            var y = (Math.floor(i / 4) * 100);

            // set basic style and background
            div.className = "puzzlepiece";
            div.style.left = x + 'px';
            div.style.top = y + 'px';
            div.style.backgroundImage = 'url("background.jpg")';
            div.style.backgroundPosition = -x + 'px ' + (-y) + 'px';

            // store x and y for later
            div.x = x;
            div.y = y;
        })

    };
    var clickMoveInit = function() {
        $("")
    };

    return {
        init: init
    }
})();
$(document).ready(function() {
        // alert("I have jquery");
        Puzzle.init();
    })
    // window.onload=function(){
    // 
    // }