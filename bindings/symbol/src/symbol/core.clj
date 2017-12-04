(ns symbol.core)

(def string "not sure")

(def a (type 'a))

(def b (type 'b))

(def everything-is-symbol (type 'everything-is-symbol))

(defn -main
  []
  (println a)
  (println b)
  (println everything-is-symbol)
  (println string))


