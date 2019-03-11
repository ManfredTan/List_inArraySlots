### List_inArraySlots
by Kenneth Chin and Manfred Tan

# Fields
- int[] elements
- int filledElements
- int INITIAL_CAPACITY
# Constructors
- List_inArraySlots()
# Methods
- list_inArraySlots()
- toString()
- add(int value)
- expand()
- set()
- get()
- add()
- remove()
# Remarks on *UserOfList* class
First it creates an empty list. Then it populates it with 5 elements, each being one less than its predecessor. Then it adds more elements to implement the expand() method. Finally, it runs it with 35 elements to make sure expand() works. Expand() returns a new array with double the number of elements of the previous array. In addition to these basic functions, we added 4 new methods: set(), get(), add(), and remove(). In UserOfList we tested these methods. Set() replaces the value of the element at the given index with a given value. Get() returns the value of the element at the given index. Add() adds a new element to the given index with a given value. Remove() takes out the element at the given index shifts all the elements after the given element one index left.
