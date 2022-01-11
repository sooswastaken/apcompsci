//Rev. Dr. Douglas R Oberle - Washington, DC
public class scaleMutator
{          
//pre:  a and b are valid index #s of list, which is not null
//post: swaps list[a] with list[b]  - modifies the array that is sent
//i.e., given list:[1,2,3,4], a:1, b:3 -> changes list to [1,4,3,2]
   public static void swap(int[] list, int a, int b)
   {
   //*********WRITE THIS METHOD***************
      int a_value = list[a];
      int b_value = list[b];
      list[a] = b_value;
      list[b] = a_value;
   //*****************************************
   }

//pre:  list is not null
//post: nums is sorted in ascending order - modifies the array that is sent
//i.e., given list:[4,2,7,5] -> changes list to [2,4,5,7] 
//needs to work with an array of any size             
   public static void selSort(int[] list)
   {
   //*********WRITE THIS METHOD***************
      // Loop the length of the passed in array
      for (int i = 0; i < list.length; i++)
      {
         // Set the current index to the minimum value
         int min = i;
         // Loop the length of the passed in array again
         for (int j = i + 1; j < list.length; j++)
         {
            // If the current value is less than the minimum value, set the minimum value to the current value
            // With the swap method above
            if (list[j] < list[min])
            {
               min = j;
            }
         }
         swap(list, i, min);
      }
   //*****************************************
   }

//pre:   list is not null
//post:  returns a new array with the same elements of list, but scrambled (put in random order)
//needs to work with an array of any size
   public static int[] scramble(int[]list)
   {
      int[]retVal = list.clone();
      //*********WRITE THIS METHOD***************
      // Loop the length of the passed in array
      // Scramble the list
      int i;
      for(i = 0; i < list.length; i++) {
         int j = (int)(Math.random() * list.length);
         swap(retVal, i, j);
      }
      //*****************************************
      return retVal;
   }

//pre:  list is not null
//post: returns a new array with elements in list, but in reverse order
//i.e., given list:[1,2,3,4] -> returns [4,3,2,1]
//needs to work with an array of any size
   public static int[] reverse(int[]list)
   {
     //*********WRITE THIS METHOD***************
      int[] retVal = new int[list.length];
      for (int i = list.length - 1; i >= 0; i--)
      {
         retVal[list.length - 1 - i] = list[i];
      }


      return retVal;
     //*****************************************
   }

//pre:  list is not null
//post: returns a new array (almost double the size of list) with the elements of list as a palindrome.
//i.e., given list:[1,2,3,4] -> returns [1,2,3,4,3,2,1]
//needs to work with an array of any size
   public static int[] makePalindrome(int[]list)
   {
     //*********WRITE THIS METHOD***************
      int[] retVal = new int[list.length * 2 - 1];
      // Add the list to the front of the array
      for (int i = 0; i < list.length; i++)
      {
         retVal[i] = list[i];
      }
      // Add the list but reversed to the end of the array, ignoring the last element
      for (int i = list.length - 2; i >= 0; i--)
      {
         retVal[(retVal.length - 1) - i] = list[i];
      }


      return retVal;
     //*****************************************
   }   

//pre:  neither a nor b are null, assume a.length == b.length
//post: returns a new array with elements shuffles in from two lists,
//alternating between advancing elements of lists a and b
//[a0, b0, a1, b1, a2, b2, a3, b3, a4, b4,...]
//i.e., given a:[0,1,2,3], b:[9,8,7,6] -> returns [0,9,1,8,2,7,3,6]
//needs to work with arrays of any size
   public static int[] shuffle(int[]a, int[]b)
   {
     //*********WRITE THIS METHOD***************
      // Create a new array with the size of the two arrays
      int[] retVal = new int[a.length + b.length];
      // Create a variable to keep track of which array we are on
      int turn = 0;
      // 0 is a, 1 is b

      for (int i = 0, k = 0, j = 0; i < retVal.length; i++)
      {
         if (turn == 0) {
            retVal[i] = a[k];
            turn = 1;
            k++;
         } else {
            retVal[i] = b[j];
            turn = 0;
            j++;
         }
      }
      return retVal;
     //*****************************************
   }
      //*****************************************

 //pre:  list is not null	
 //post: returns a new array with elements of list, but shuffled- 
 //alternating between elements from the beginning moving right and elements from the end moving left
 //[1st elem, Last elem, 2nd elem, 2nd to last elem, 3rd elem, 3rd to last elem, 4th elem, 4th to last elem,...]
 //i.e., given list:[0,1,2,3,4,5,6,7] -> returns [0,7,1,6,2,5,3,4]
 //needs to work with an array of any size
   public static int[] shuffle(int[]list)
   {
     //*********WRITE THIS METHOD***************
      // Create two lists, one for the left and one for the right
      // If the list length is odd, the left side of the list will have 1 added to it
      // If the list length is even, the right list and the left list will both be the same length, the passed in list length divided by 2
      // Check if the list is even or odd
      int leftLength;
      if (list.length % 2 == 0) leftLength = list.length / 2;
      else leftLength = list.length / 2 + 1;
      int[] left = new int[leftLength];
      int[] right = new int[list.length / 2];
      // Fill the left list with the first half of the list
      for (int i = 0; i < left.length; i++)
      {
         left[i] = list[i];
      }
      // Fill the right list with the second half of the list, starting at the end
      for (int i = list.length - 1, j = 0; i >= list.length / 2; i--, j++)
      {
         right[j] = list[i];
      }
      // Use the above method to create the shuffled list
      return shuffle(left, right);


     //*****************************************
   }
      //*****************************************


//pre:  list is not null, note is between 22 and 108
//post:  makes a new array containing each element of list, but where every other element is note
//[list0, note, list1, note, list2, note, list3, note, list4, note,...]
//if list:[2, 4, 6, 8] and note:1 -> returns [1,2,1,4,1,6,1,8]
//needs to work with an array of any size
   public static int[] mixWithNote(int[] list, int note)
   {
     //*********WRITE THIS METHOD***************
      // Create a list with the same length of the list, but just consisting of the note
      int[] noteList = new int[list.length];
      for (int i = 0; i < noteList.length; i++)
      {
         noteList[i] = note;
      }
      // Call the shuffle method to shuffle the list and the note list
      return shuffle(noteList, list);
     //*****************************************
   }

//pre:  list is at least of length 3
//post:  makes a new array containing triads (groups of 3 consecutive notes in the scale), each starting with successive elements of list
//[1st elem, 2nd elem, 3rd elem, 2nd elem, 3rd elem, 4th elem, 3rd elem, 4th elem, 5th elem,...]
//if list:[1,2,3,4,5,6] -> returns [1,2,3,  2,3,4,  3,4,5, 4,5,6]
//if list:[1,2,3,4,5,6,7] -> returns [1,2,3,  2,3,4,  3,4,5, 4,5,6, 5,6,7]
//if list:[1,2,3,4,5,6,7,8] -> returns [1,2,3,  2,3,4,  3,4,5, 4,5,6, 5,6,7, 6,7,8]
//if list: [1,2,3] -> returns [1,2,3]
   public static int[] triads(int[] list)
   {
     //*********WRITE THIS METHOD***************
      int[] retVal = new int[(list.length - 2) * 3];
      for (int i = 0; i < list.length - 2; i++) {
         retVal[i * 3] = list[i];
         retVal[i * 3 + 1] = list[i + 1];
         retVal[i * 3 + 2] = list[i + 2];
      }
      return retVal;

      //*****************************************
   }
   
   //post:  student invents their own mutation to the scale
   public static int[] extraCredit(int[] list)
   {
     //*********WRITE THIS METHOD***************
      // Turn this: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
      // Into this: {9, 10, 7, 8, 5, 6, 3, 4, 1, 2}
      // Starts at the end of the loop, and every 2 elements, it adds them but swapped
      int[] retVal = new int[list.length];
      for (int i = list.length - 1; i >= 0; i -= 2) {
         retVal[i] = list[i - 1];
         retVal[i - 1] = list[i];
      }
      return retVal;
      //*****************************************
   }
} 	

