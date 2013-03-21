package com.example.practise;

public class User 
{
  String name,contact_no,email;
  void getInformation(String name)
  {
   this.name=name; 
  }
  
  void postInformation()
  {
    System.out.println(name);
  }
}