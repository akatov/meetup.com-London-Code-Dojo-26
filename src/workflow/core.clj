(ns workflow.core)

(defn create-state
  ([] nil)
  ([name]
     (cond
      (= name :create) :new-permit)))
