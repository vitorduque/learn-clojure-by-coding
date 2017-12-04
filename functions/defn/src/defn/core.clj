(ns defn.core)

(defn method-one
  [name]
  (str "Hello, " name))

(defn -main
  []
  (println (method-one "Vitaum")))
