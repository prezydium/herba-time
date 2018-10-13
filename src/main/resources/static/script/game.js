var playerId;

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

function sendAction(action) {
        stompClient.send("/app/input", {},
            JSON.stringify({'id': playerId, 'Action': action}));
}

function updateGameState(gameState) {
    var chat = document.getElementById('chat-room');
    var p = document.createElement('p');
    p.appendChild(document.createTextNode(messageOutput.nick + ": "
        + messageOutput.msgText + " (" + messageOutput.time + ")"));
    chat.appendChild(p);
}
window.addEventListener("keyup", function (event) {
    event.preventDefault();
    if (event.keyCode === 87 ||
        event.keyCode === 83 ||
        event.keyCode === 65 ||
        event.keyCode === 68 ) {
        sendAction(event);
    }
});

connect();
