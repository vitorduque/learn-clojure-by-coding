(ns addition.core-test
  (:require [clojure.test :refer :all]
            [addition.core :refer :all]))

(deftest add-test
  (testing "should add one param to another"
    (is (= 10 (add 5 5)))))
