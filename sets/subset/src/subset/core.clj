(ns subset.core)
(require 'clojure.set)

(defn sets-subset [sub-set set-one]
  (clojure.set/subset? sub-set set-one))

(defn -main
  []
  (println "Hello, World!"))
