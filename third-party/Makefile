
# Usage: jextract <options> <header file>                                  
# Option                         Description                               
# ------                         -----------                               
# -?, -h, --help                 print help                                
# -D <macro>                     define a C preprocessor macro             
# -I <path>                      specify include files path                
# --dump-includes <file>         dump included symbols into specified file 
# --header-class-name <name>     name of the header class                  
# --include-function <name>      name of function to include               
# --include-macro <name>         name of constant macro to include         
# --include-struct <name>        name of struct definition to include      
# --include-typedef <name>       name of type definition to include        
# --include-union <name>         name of union definition to include       
# --include-var <name>           name of global variable to include        
# -l <library>                   specify a library name or absolute library path   
# --output <path>                specify the directory to place generated files    
# --source                       generate java sources                     
# -t, --target-package <package> target package for specified header files 
# --version                      print version information and exit   

jextract:
	jextract \
		-l uring_extras -l uring \
		-t io.uring \
		-I ../build/liburing_git-prefix/src/liburing_git/src/include \
		--source \
		--output ./generated \
		--header-class-name liburing \
		./liburing_extras/main.h
