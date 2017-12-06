(ns multiplication.core-test
  (:require [clojure.test :refer :all]
            [multiplication.core :refer :all]))

(deftest multiplication-test
  (testing "should return the multiplication of paramas"
    (is (= 30 (multiplication 5 6)))))
