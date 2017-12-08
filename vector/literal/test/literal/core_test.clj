(ns literal.core-test
  (:require [clojure.test :refer :all]
            [literal.core :refer :all]))

(deftest vector-literal-test
  (testing "should return a vector"
    (is (= (type []) (type (vector-literal [1 2 3])))))
  (testing "should return the vector"
    (is (= [1 2 3] (vector-literal [1 2 3])))))
