(ns workflow.core)

(defn create-state
  ([] nil)
  ([name]
     (cond
      (= name :create) :new-permit)))

(defn transition
  ([] :submitted-permit)
  ([current-state]
     :approved-permit))
