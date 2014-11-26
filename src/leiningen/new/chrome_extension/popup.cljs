(ns {{ns-name}}.popup
  (:require [khroma.runtime :as runtime]
            [khroma.log :as console]
            [cljs.core.async :refer [>! <!]])
  (:require-macros [cljs.core.async.macros :refer [go]]))

(defn init []
  (let [bg (runtime/connect)]
    (go (>! bg :lol-i-am-a-popup)
        (console/log "Background said: " (<! bg)))))
