
function addChat() {
  document.body.classList.add('activeChat');
  const chatDiv = document.getElementById("chat-room");
  chatDiv.scrollTop = chatDiv.scrollHeight;
}

function removeChat() {
  document.body.classList.remove('activeChat');
}

