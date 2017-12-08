(ns nth.core-test
  (:require [clojure.test :refer :all]
            [nth.core :refer :all]))

(deftest nth-vector-test
  (testing "should return the specified element of vector"
    (is (= 2 (nth-vector [1 2 3] 1)))))
