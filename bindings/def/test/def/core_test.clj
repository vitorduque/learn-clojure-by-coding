(ns def.core-test
  (:require [clojure.test :refer :all]
            [def.core :refer :all]))

(deftest object-one-test
  (testing "should return a plain text"
    (is (= "Something to say" object-one))))

(deftest object-two-test
  (testing "should return a plain text"
    (is (= "Something to do" object-two))))
