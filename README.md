# RPG-lexer
RPG lexer using xText

This project aims to describe the RPG syntax gramma. To be more precise: After IBM introduced 100% free RPG
it is now possible to use standard lexers like xText or event use tooling from the LEX/YACC/BISON universe
to parse RPG and even generate code. 
So this project can be used as an academic project for better understanding of the RPG 
language but also for better tooling like plug in for 100% free-RPG editors 
running in i.e. Eclipse with code completion etc. Or even tranpilers to create C or JAVA code 
from RPG. Just some thoughts

This implementation is using xText to describe the RPG language as a domain specific language in JAVA.

### How this works
Since this is an Eclipse project using xText then the gramma is located in:

org.sitemule.rpglanguage.rpgle/src/org.sitemule.rpglanguage/Rpgle.xtext

When you open this file it is the LR-gramma for free RPG ( still lot of work to do - so feel free contribute and make pull requests;)  

Now in Eclipse editor with the cursor in the gramma text then right-click and select "Run as". You 
will see a context menu where you can select "1 Generate Xtext artifacts" 

When you run this – and your LR gramma is valid - it will create the code for an Eclipse plugin.

### Try it out
With the Eclipse plugin created you can right click in “Project explorer” on 
the folder org.sitemule.rpglanguage.rpgle . Now select  “run as“ and then “1 Eclipse Application”


Now the fun begins: An new instance of Eclipse will spin up where you can
try out the RPG syntax and it will give you:

..* Syntax highlight
..* Code completion
..* Syntax checking 

### This is a RPG free editor plugin for Eclipse!! 

Open a new text file in that Eclipse instance and rename it to test.rpgle.  
Since the file type is .rpgle the syntax checker kicks in. Try the code 
completion: Press “Control” and “Space” and you will see a drop down 
where you can start up you code: It will suggest “Ctrl-opt”, “Declare” and “code”.

So if you i.e. are using a “chain” op-code it will check that you have 
a Dcl-f with that file. If not insert a Dcl-f statement and with you file 
name and the syntax error disappears from the chain operation when the file is declared.

The same goes for Procedures and subroutines and variables – The syntax 
checker will look up the name of the procedure, subroutine or variable 
and it will make a syntax error if you are referring to a name not declared.

This is what you expect of modern editor

### Contribute - Please! 
As is said – still lots of work to do. So please contribute to this project for better 
tooling arround the RPG language and better understanding the power of RPG free.



Read more about Eclipse xText here:

https://www.eclipse.org/Xtext/
 
