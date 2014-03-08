(ns sandbox.core-test
	(:require [clojure.test :refer :all]
			[sandbox.core :refer :all]))

(deftest test-count-hits
  (testing "count-hits"
    (is (= 2 (count-hits '(1 2) '(0 1)) ))
    (is (= 0 (count-hits '(0 0) '(1 1)) ))
    (is (= 2 (count-hits '(3 3) '()) ))
    (is (= 1 (count-hits '(3 0) '()) )) ))