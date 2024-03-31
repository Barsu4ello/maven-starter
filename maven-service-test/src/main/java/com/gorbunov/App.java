package com.gorbunov;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        UserService userService = new UserService();

        System.out.println(userService.getUser(25l));
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
    }
}
