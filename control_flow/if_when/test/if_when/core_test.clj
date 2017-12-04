(ns if-when.core-test
  (:require [clojure.test :refer :all]
            [if-when.core :refer :all]))

(deftest positive-numbers-test
  (testing "should return an array of positive numbers"
    (is (= (vector 1 2 3) (positive-numbers [-1 0 1 2 3]))))

   (testing "should return an string"
     (is (= (str "No positive") (positive-numbers [-2 -1 0])))))
