(ns hello-world.core-test
  (:require [clojure.test :refer :all]
            [hello-world.core :refer :all]))

(deftest hello-world-test
  (testing "main method should return 'Hello, World!'"
    (is (= "Hello, World!"))))
