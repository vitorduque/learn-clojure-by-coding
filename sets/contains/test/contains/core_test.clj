(ns contains.core-test
  (:require [clojure.test :refer :all]
            [contains.core :refer :all]))

(deftest a-test
  (testing "should return true"
    (is (= true (sets-contains #{1 2 3} 2))))
  (testing "shoul return false"
    (is (= false (sets-contains #{1 2 3} 4)))))
