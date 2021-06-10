(function() {

    function updateClock() {
        const clocks = document.querySelectorAll(".clock");
        const dateNow = new Date();
        const datetext = dateNow.toTimeString().split(' ')[0]
        clocks.forEach(function(clock) {
            clock.innerHTML = datetext;
        });
    }

    updateClock();
    setInterval(updateClock, 1000);
})();
