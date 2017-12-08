(ns nth.core-test
  (:require [clojure.test :refer :all]
            [nth.core :refer :all]))

(deftest a-test
  (testing "should return the index number of a list"
    (is (= 2 (nth-example '(1 2 3) 1)))))
