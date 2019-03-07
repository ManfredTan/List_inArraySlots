/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
	int[] fakeList;
	int numOfElements;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
		fakeList = new int[5];
        numOfElements = 0;
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
		return numOfElements;
	}


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        String stringFormat = "[";
        int index = 0;
        while (index < fakeList.length) {
            stringFormat += fakeList[index] + ",";
            index++;
        }
        return( stringFormat + "]");
	}


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
         if (numOfElements >= fakeList.length){
				  expand();
				};
         fakeList[numOfElements] = value;
         numOfElements++;
         return true;
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data
     */
     private void expand() {
        System.out.println( "expand... (for debugging)");
						int[] newList = new int[2*numOfElements] ;
						for (int i = 0; i < fakeList.length; i++){
							int index = 0;
							newList[i] = fakeList[i];



						}

					
						fakeList = newList;

						// for (int i:fakeList){
						// 	System.out.println(i);
						// }
		           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
     }
}
