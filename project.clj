(defproject sandbox "0.1.0-SNAPSHOT"
  :description "This project is meant as a learning playground for the Clojure language. I am 
                taking a ground up approach playing around with a variety of libraries and 
                language features with no clear end goal in mind. Perhaps at some point the 
                project or at least snippets of it will evolve into something useful or 
                entertaining."
  :url "https://github.com/firefli/sandbox"
  :license {:name "The MIT License (MIT)"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [org.xerial/sqlite-jdbc "3.7.2"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.4"]]}}
  :main sandbox.core)
