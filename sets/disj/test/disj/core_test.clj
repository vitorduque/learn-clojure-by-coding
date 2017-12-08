(ns disj.core-test
  (:require [clojure.test :refer :all]
            [disj.core :refer :all]))

(deftest sets-disj-test
  (testing "shoul return a setwith removed element"
    (is (= 3 (count (sets-disj #{1 2 3 4} 1))))))
