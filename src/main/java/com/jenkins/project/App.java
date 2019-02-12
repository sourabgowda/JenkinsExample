package com.jenkins.project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int response = callMethod();
        if(response == 2)
        System.out.println( response);
    }

	public static int callMethod() {
		
		return 2;
	}
}
