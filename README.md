# TrelloAPITesting
Trello API Testing using Retrofit

This project was created as a requirement to a technical interview in order to join H8tch Innovations (https://www.h8tch.com/), a subcontractor of Epic Games.

Technology stacks:
- JUnit 4,
- Maven 3.3.9
- JDK 7+
- Retrofit
- Converter-gson


These are a couple of integration tests targeting Trello API.
The goal is to test some of the features of Trello, such as :
- Adding cards to an existing board (in a given trello list)
- Deleting cards from board
- Updating an existing card

The tests assume there exits at a least one trello list, thus, a board that holds such list.
You should pick a list (from any board) and provide its ID in the command below, in order for the tests to work.

3 System properties have been  defined so you don't have to touch the code:
- 'trello.key'  defines the application key provided by Trello
- 'trello.token' defines the server token (or user token) provided by Trello
- 'trello.list.id' defines the Id of the Trello List you want to test into.
NOTE:  The tests don't clean up created cards in the list you will provide. You will have the manually
delete created cards by logging into Trello, with the associated account.

The Commands :

To Run the JUnit Test Suite: 
```
$mvn test -Dtest=TrelloTestingSuite -Dtrello.key=[YOUR_APPLICATION_KEY] -Dtrello.token=[YOUR_SERVER_TOKEN] -Dtrello.list.id=[ID_TRELLO_LIST]
```

To Run tests individually: 
```
$mvn test -Dtrello.key=[YOUR_APPLICATION_KEY] -Dtrello.token=[YOUR_SERVER_TOKEN] -Dtrello.list.id=[ID_TRELLO_LIST]
```



