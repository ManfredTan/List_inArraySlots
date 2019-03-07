# implement a list by storing data in an encapsulated array

List_inArraySlots stores integers with any value that datatype can hold.

That implies that the implementation cannot identify the end of the list
by the values of the integers stored in the list. That design decision
would require reserving one integer value as a value that cannot be
stored in the list.