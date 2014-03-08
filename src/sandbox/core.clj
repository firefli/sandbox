(ns sandbox.core
	(:require [sandbox.character :as char]))

(defn roll [x] 
  (repeatedly x #(inc (rand-int 6))))

(defn attack [x y]
  (let [a (sort (roll (:att x)))
		d (sort (roll (:def y)))]
	(println(list a d))))

(defn count-hits [x y]
  ;(println "count-hits " x y)
  (cond 
    (empty? x) 0
    (empty? y) 
      (if (> (first x) 2) 
		(inc (trampoline count-hits (pop x) y))
        (trampoline count-hits (pop x) y))
    (> (first x) (first y)) (inc (trampoline count-hits (pop x) (pop y)))
    :else (trampoline count-hits (pop x) (pop y))))