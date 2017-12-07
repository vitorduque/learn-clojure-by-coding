(ns exponentiation.core-test
  (:require [clojure.test :refer :all]
            [exponentiation.core :refer :all]))

(deftest exp-test
  (testing "should return the exponentiation of the params"
    (is (=  64  (exp 4 3)))))
