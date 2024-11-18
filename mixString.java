public String mixString(String a, String b) {
  int x = a.length();
  int y = b.length();
  int shortestLength;
  if(x < y){
    shortestLength = x;
  } else {
    shortestLength = y;
  }
  
  String builder = "";
  
  for(int i = 0; i < shortestLength; i++){
     builder += a.substring(i, i+1);
     builder += b.substring(i, i+1);
  }
  
  if(x < y){
    builder += b.substring(shortestLength);
  } else if (y < x){
    builder += a.substring(shortestLength);
  }
  return builder;
}
