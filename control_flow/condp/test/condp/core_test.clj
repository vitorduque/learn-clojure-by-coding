(ns condp.core-test
  (:require [clojure.test :refer :all]
            [condp.core :refer :all]))

(deftest condp-example-test
  (testing "should return 'contain 2'"
    (is (= (str "contain 2") (condp-example 2))))
  (testing "should return 'do not contain'"
    (is (= (str "do not contain 777") (condp-example 777)))))
