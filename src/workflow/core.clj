(ns workflow.core)

(defn create-state
  ([] nil)
  ([name]
     (cond
      (= name :create) :new-permit)))

(defn transition
  ([current-state]
     (cond
      (= current-state :new-permit) :submitted-permit))
  ([current-state transition-name]
     (cond
      (and (= current-state :submitted-permit)
           (= transition-name :approve))
      :approved-permit
      :otherwise :rejected-permit)))
