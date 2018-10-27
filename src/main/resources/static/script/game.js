var stompClient = null;

function connect() {
    var socket = new SockJS('/input');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/game-state', function (messageOutput) {
            updateGameState(JSON.parse(messageOutput.body));
        });
    });
}

function sendAction(keyCode, playerId) {
    stompClient.send("/app/input", {},
        JSON.stringify({'id': playerId, 'keyCode': keyCode}));
}

function updateGameState(gameState) {
    //TODO process data from server
}

window.addEventListener("keyup", function (event) {
    event.preventDefault();
    if (event.keyCode === 87 ||
        event.keyCode === 83 ||
        event.keyCode === 65 ||
        event.keyCode === 68) {
        sendAction(event.keyCode, playerId);
    }
});

connect();
