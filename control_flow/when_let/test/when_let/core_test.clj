(ns when-let.core-test
  (:require [clojure.test :refer :all]
            [when-let.core :refer :all]))

(deftest when-let-example-test
  (testing "should return empty array"
    (is (= (vector) (when-let-example [-1 0]))))
  (testing "should return positive array"
    (is (= [1 2 3] (when-let-example [-1 0 1 2 3])))))
