(ns format.core)

(defn format-one [something]
  (format "I hate %s" something))

(defn -main
  []
  (println (format-one "water")))
