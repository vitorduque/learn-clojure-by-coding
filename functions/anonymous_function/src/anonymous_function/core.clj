(ns anonymous-function.core)

(def greeting
  (fn [name]
    (str "Hey, I am: " name)))

(defn -main
  []
  (println (greeting "Duque")))
