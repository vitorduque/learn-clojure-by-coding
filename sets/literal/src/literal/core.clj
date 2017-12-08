(ns literal.core)

(defn sets-literal [set-one]
  (if (instance? clojure.lang.PersistentHashSet set-one)
  set-one
  false))

(defn -main
  []
  (println "Hello, World!"))
