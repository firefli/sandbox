sandbox
=======
This project is meant as a learning playground for the Clojure language. I am 
taking a ground up approach playing around with a variety of libraries and 
language features with no clear end goal in mind. Perhaps at some point the 
project or at least snippets of it will evolve into something useful or 
entertaining.


Useful Clojure Errata
=====================
- Reloading files into a REPL
   - (use 'sandbox.core :reload)
   - (use '[clojure.tools.namespace.repl :only (refresh)])  /  (refresh)