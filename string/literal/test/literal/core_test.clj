(ns literal.core-test
  (:require [clojure.test :refer :all]
            [literal.core :refer :all]))

(deftest string-one-test
  (testing "should return the the param"
    (def string "something")
    (is (= string (string-one string)))))
