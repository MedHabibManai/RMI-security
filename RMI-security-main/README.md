EXERCICE1:
Execution:

Server:
bash
Copy code
cd server
javac *.java
rmic -v1.1 Reverse
java -Djava.security.policy=server.policy ReverseServer

Client:
bash
Copy code
cd client
javac ReverseClient.java
java -Djava.security.policy=client.policy ReverseClient BONJOUR

Exercice2:
Execution:
bash:javac DynamicReverseServer.java
client:javac ReverseClient.java
java ReverseClient ianam bibah
// 
