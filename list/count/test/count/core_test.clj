(ns count.core-test
  (:require [clojure.test :refer :all]
            [count.core :refer :all]))

(deftest count-example-test
  (testing "should return the size of list"
    (is (= 4 (count-example '(1 2 3 4))))))
