(ns case.core)

(defn case-example [number]
  (case number
    1 "one"
    2 "two"
    "anything"))

(defn -main
  []
  (println (case-example "blabla")))
