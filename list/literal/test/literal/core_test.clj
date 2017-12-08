(ns literal.core-test
  (:require [clojure.test :refer :all]
            [literal.core :refer :all]))

(deftest list-example-test
  (testing "shoul return a list of numbers"
    (is (= '(1 2 3) (list-example '(1 2 3))))))
