(ns sort.core-test
  (:require [clojure.test :refer :all]
            [sort.core :refer :all]))

(deftest set-one-test
  (testing "should return the ordered set"
    (is (= (count #{1 2 3 4}) (count (sets-sort #{4 3 1 2}))))))
