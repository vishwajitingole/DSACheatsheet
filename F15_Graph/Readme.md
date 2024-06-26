In Tree we used to represent parent child relationship between the nodes.

However here we have friendship relationship betweeen the nodes.

###Adjacent Matrix

##Space Complexity :-O(V\*V)

##Operation:-
Adjacency check(Baaju mein kon dekhna):-
O(1)

Find all vertices to u:-
O(V) Here, V is vertices

Find degree of u:-
O(v)

Add or remove an Edge:-
O(1)

Add or remove a Vertex:-
O(v2)
It is V square

Disadvantages:-
Storing more spaces
It stores redundant information too which isn't important

###To Overcome from it they introduced Adjacency List
###Adjacency List

We can implement it using Dynamic sized array
or Linked List

##Space Complexity :- O(V+E)

##Operations :-

Check if there is an edge from u to v:- O(V)
Find all adjacent of u:- O(degree(u))
Find degree of u:-O(1)
Add an Edge:-O(1)
Remove an Edge:- O(V)


