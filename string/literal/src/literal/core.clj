(ns literal.core)

(defn string-one [something]
  (str something))

(defn -main
  []
  (println  (string-one "Hello, World!")))
