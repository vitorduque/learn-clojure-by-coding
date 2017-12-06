(ns subtraction.core-test
  (:require [clojure.test :refer :all]
            [subtraction.core :refer :all]))

(deftest subtraction-test
  (testing "should return the subtraction of params"
    (is (= 10 (subtraction 20 10)))))
