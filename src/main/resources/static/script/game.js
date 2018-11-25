var stompClient = null;
var gameArea = document.getElementById('gameArea');

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
    var context = gameArea.getContext('2d');
    context.clearRect(0, 0, gameArea.width, gameArea.height);
    var players = gameState.players;
    Object.keys(players).forEach(function (key) {
        var player = players[key];
        context.fillStyle = player.color;
        context.fillRect(player.posX, player.posY, 50, 50);
    });
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
