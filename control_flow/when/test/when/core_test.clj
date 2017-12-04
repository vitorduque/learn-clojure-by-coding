(ns when.core-test
  (:require [clojure.test :refer :all]
            [when.core :refer :all]))

(deftest when-example-test
  (testing "should return 'It's cold'"
    (is (= "It's cold" (when-example "cold"))))
  (testing "should return nil"
    (is (= nil (when-example "hue")))))
