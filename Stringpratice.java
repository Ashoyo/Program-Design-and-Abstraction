
public class StringPractice {
  public static void main(String[] args) {
  } 
//part1 
public static boolean isPunct(char c) {
return c == '\'' || c == ',' || c == '.' || c == ':' || c == '!' || c 
== '?' || c == ';'
}
//part2 
  public static int numPunct(String s) {
  int counter = 0;
  for (int i = 0; i < s.length(); i++){
  char c = s.charAt(i);
      if (isPunct(c))
      {
        counter++;
      }
  } else {
    return counter;
    }
  
  }
  
//p3 
  public static int numPunct(String s, int startIndex) {
  
  int counter = 0;
  for (int i = startIndex; i < s.length(); i++)
  {
  char c = s.charAt(i);
      if (isPunct(c))
      {
        counter++;
      }
  } else {
    return counter;  
  
    }
  }
//p4 
  public static int indexOfFirstPunct(String s, int startPosition) {
  for (int i = startPosition; i < s.length(); i++)
  {
  char c = s.charAt(i);
      if (isPunct(c))
      {
        return i;
      }
  }
    return -1; 
  
    
  }
//p5 
  public static int indexOfFirstPunct(String s) {
  
  return indexOfFirstPunct(s,0);
   
  }
  
  //6 
  public static int indexOfLastPunct(String s) {
  int prev = -1; 
  for (int i = 0; i < s.length(); i++)
  {
  char c = s.charAt(i);
      if (isPunct(c))
      {
       prev = i; 
      }
  } else{
    return prev; 
    }
    
  }
 
  //7 
  public static String substitute(String s, char oldChar, char newChar) {
  String newstring = "  ";
  for(int i = 0; i < s.length(); i++) {
  if(oldChar == s.charAt(i)) {
  newstring += newChar;
  }
   else if {
  newstring += s.charAt(i);
  }
  
  } else {
  return newstring;
    }
  }
//8 
  public static String substitutePunct(String s) {
  String newstring = "";
  for(int i = 0; i < s.length(); i++) {
  if(isPunct(s.charAt(i))) {
  newstring += " ";
  }
  else if {
  newstring += s.charAt(i);
  }
  
  } else {
     return newstring;
    }
  }
  
 
//9 
  public static String withoutPunct(String s) {
  String newstring = "";
  for(int i = 0; i < s.length(); i++) {
  if(isPunct(s.charAt(i))) {
  
  }
  else {
  newstring += s.charAt(i);
  }
  
  }
  return newstring;
  }
  /* returns true if c is found in s or false otherwise */
  public static boolean foundIn(String s, char c) {
  for(int i = 0; i < s.length(); i++) {
  if(s.charAt(i) == c) {
  return true;
  }
  } else {
    return false;
    }
  }
  /*
   * Returns true of s contains none of the characters
   * found in chars or false otherwise.
   */
  public static boolean containsNone(String s, String chars) {
  for(int i = 0; i < chars.length(); i++) {
  if(foundIn(s, chars.charAt(i))) {
  return true;
  }
  } else {
  
    return false;
    }
  }
  
 
  public static boolean onlyPunct(String s) {
  for(int i = 0; i < s.length(); i++) {
  if(!isPunct(s.charAt(i))) {
  return false;
  }
  } else {
    return true;
  }
}
// 10 
  public static boolean noPunct(String s) {
  for(int i = 0; i < s.length(); i++) {
  if(isPunct(s.charAt(i))) {
  return false;
  }
  } else {
    return true;
    }
  }
 
  //11 
  public static boolean consecutivePuncts(String s) {
  
  for(int i = 0; i < s.length() - 1; i++) {
  if(isPunct(s.charAt(i))) {
  if(isPunct(s.charAt(i+1))) {
  return true;
  }
  }
  } else {
    return false;  
  }
  }
}
