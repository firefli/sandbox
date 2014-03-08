(ns sandbox.character.storage
	(:require [clojure.java.jdbc :as jdbc]))

(def db-spec 
   {:classname   "org.sqlite.JDBC"
    :subprotocol "sqlite"
    :subname     "db/database.db"})
    
(defn create-char-table []
   (jdbc/db-do-commands db-spec
      (jdbc/create-table-ddl :character
         [:name :text]
         [:att :int]
         [:def :int]
         [:spd :int])))