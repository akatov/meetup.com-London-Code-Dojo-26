(ns workflow.core)

(defn create-state
  ([] nil)
  ([name]
     (cond
      (= name :create) :new-permit)))

(defn transition
  ([current-state]
     (cond
      (= current-state :new-permit) :submitted-permit
      (= current-state :submitted-permit) :approved-permit))
  ([current-state transition-name]
     :rejected-permit))
