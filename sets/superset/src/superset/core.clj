(ns superset.core)
(use '[clojure.set :only [superset?]])

(defn sets-superset [set-one el]
  (superset? set-one el))

(defn -main
  []
  (println "Hello, World!"))
