"use strict";
var myAnmi = function() {
    var timer;
    var index = 0;
    var speed = 250;
    var animationData = ANIMATIONS["Dive"];
    var text = document.getElementById("text");
    var array = animationData.split("=====\n")
    document.getElementById("stop").disabled = true;

    function setText() {
        timer = setInterval(function() {
            text.value = array[index];
            index++;
            if (index >= array.length) {
                index = 0;
            }
        }, speed)
    }

    function doAnimation(speed) {
        if (timer == null) {
            setText();
        } else {
            stop();
            setText();
        }
        document.getElementById("stop").disabled = false;
        document.getElementById("start").disabled = true;
        document.getElementById("animation").disabled = true;
        //document.getElementById("size").disabled=true;
        //document.getElementById("turbo").disabled = false;
    }

    function stop() {
        clearInterval(timer);
        text.value=animationData;
        document.getElementById("start").disabled = false;
        document.getElementById("stop").disabled = true;
        document.getElementById("animation").disabled = false;
        document.getElementById("size").disabled = false;
        //document.getElementById("turbo").disabled = true;
    }

    function changeAnimination() {
        var anmi = document.getElementById("animation");
        var anmiText = anmi.options[anmi.selectedIndex].text;
        animationData = ANIMATIONS[anmiText];
        array = animationData.split("=====\n");
        text.value=animationData;
    }

    function changeSize() {
        var e = document.getElementById("size");
        var fontSize = e.options[e.selectedIndex].value;
        text.style.fontSize = fontSize;
    }
    return {
        startOnlick: function() {
            changeAnimination();
            changeSize();
            doAnimation(speed);

        },
        stopOnclick: function() {
            stop();
        },
        animationOnchange: function() {
            changeAnimination();
            //stop();
            //doAnimation(speed);
        },
        sizeOnchange: function() {
            changeSize();
        },
        turboOnclick: function() {
            var checkbox = document.getElementById("turbo");
            if (checkbox.checked) {
                speed = 50;
                stop();
                doAnimation(speed);
            } else {
                speed = 250;
                stop();
                doAnimation(speed);
            }
        }
    }

}
window.onload = function() {
    var animation = myAnmi();
    document.getElementById("start").onclick = animation.startOnlick;
    document.getElementById("stop").onclick = animation.stopOnclick;
    document.getElementById("animation").onchange = animation.animationOnchange;
    document.getElementById("size").onchange = animation.sizeOnchange;
    document.getElementById("turbo").onclick = animation.turboOnclick;
}