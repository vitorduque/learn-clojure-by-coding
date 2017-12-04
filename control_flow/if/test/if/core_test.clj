(ns if.core-test
  (:require [clojure.test :refer :all]
            [if.core :refer :all]))

(deftest happy-test
  (testing "should return happy"
    (is (= (str "I'm happy :)") (happy true))))

  (testing "should return not happy"
    (is (= (str "I'm not happy :(") (happy false)))))
