(ns exponentiation.core)

(defn exp [number exp]
  (reduce * (repeat exp number)))

(defn -main
  []
  (println "Hello, World!"))
