#include "stdio.h"
#include "jni.h"
#include "com_JNICall.h"
#include "stdlib.h"

JNIEXPORT void JNICALL Java_com_JNICall_helloC(JNIEnv *env, jobject javaobj) 
{
	printf("Hello World: From C");
	
   FILE *fptr;
   fptr = fopen("output.txt", "w");
   if(fptr == NULL)
   {
      printf("Error!");
      exit(1);
   }
   
   fprintf(fptr,"%s", "Hello World, Written by c program");
   fclose(fptr);

	
	return;
}