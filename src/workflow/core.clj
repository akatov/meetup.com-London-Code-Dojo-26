(ns workflow.core)

(defn create-state
  ([] nil)
  ([name]
     (cond
      (= name :create) :new-permit)))

(defn transition
  ([current-state])
  ([current-state transition-name]
     (cond
      (and (= current-state :new-permit)
           (= transition-name :submit))
      :submitted-permit
      (and (= current-state :submitted-permit)
           (= transition-name :approve))
      :approved-permit
      :otherwise :rejected-permit)))
