(ns {{ns-name}}.background
  (:require [khroma.log :as console]
            [khroma.runtime :as runtime]
            [cljs.core.async :refer [>! <!]])
  (:require-macros [cljs.core.async.macros :refer [go]]))

(defn init []
  (go (let [conns (runtime/connections)
            content (<! conns)]
        (console/log "Content script said: " (<! content))
        (>! content :fml-i-am-the-background-script))))
