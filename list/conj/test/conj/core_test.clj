(ns conj.core-test
  (:require [clojure.test :refer :all]
            [conj.core :refer :all]))

(deftest add-to-list-test
  (testing "should return a joined (?) list"
    (is (= '(4 1 2 3) (add-to-list '(1 2 3) 4)))))
