(ns modulo.core)

(defn modulo [num-one num-two]
  (mod num-one num-two))

(defn -main
  []
  (println (modulo 3 2)))
