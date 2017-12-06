(ns str.core)

(defn str-one [something]
  (str "My name is: " something))

(defn -main
  []
  (println (str-one "Vitor Duque")))
