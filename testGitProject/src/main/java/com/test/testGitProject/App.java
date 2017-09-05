package com.test.testGitProject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
// this is comment from remote github
        // second comment from github
<<<<<<< HEAD
    	int a=10;
=======
        int b=10;
>>>>>>> refs/remotes/origin/master
       // this is from branch 2
        // this is local master 
    	System.out.println("hello first commit");
        for(int i=0; i<=10; i++){
        	System.out.println(i);
        	if(i%2==0)
        		System.out.println(1 + "number is even");
        }
    }
}
