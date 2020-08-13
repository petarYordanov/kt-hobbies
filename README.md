# kt-hobbies
This is ktor application that suggest activities to the user based on hobbies.


How to use:
1. clone from github
2. run the application
3. use the terminal to get response
4. once you run the application enter the following curl command in the terminal
``curl -X POST -H "Content-Type: text/plain" --data "fishing" http://localhost:8070/hobbies
``
5. the keyword is fishing, but you can enter any hobby you like
6. when you enter "fishing" as keyword, the application sends you suggestions for activities based on your input
Example for "fishing" is:

*So you like fishing ?Then you might like one of the following activities: [electrofishings, electrofishing, sportfishings, sportfishing, spearfishing, shellfishing, crawfishing, bonefi
shing, overfishing, Handfishing, Bowfishing, fishings, fishingk, fishingk, fishings, fishings]*

