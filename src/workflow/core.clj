(ns workflow.core)

(defn create-state
  ([] nil)
  ([name]
     (cond
      (= name :create) :new-permit)))

(defn transition
  ([] :submitted-permit)
  ([current-state]
     (cond
      (= current-state :new-permit) :submitted-permit
      (= current-state :submitted-permit):approved-permit)))
