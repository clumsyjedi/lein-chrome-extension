(ns leiningen.new.chrome-extension
  (:require [leiningen.new.templates :refer [renderer name-to-path sanitize-ns ->files sanitize]]
            [clojure.java.io :as io]
            [clojure.string :as string]))

(def render (renderer "chrome-extension"))

(def source-dir "leiningen/new/chrome_extension/")

(defn binary [filename]
  (io/input-stream (io/resource (str source-dir filename))))

(defn chrome-extension
  [name]
  (let [sanitized (sanitize-ns name)
        data {:name name :ns-name sanitized :sanitized (name-to-path name)}]
;    (doseq [x [16 19 38 48 128]
;            :let [icon (str "icon" x ".png")]]
;      (println "resource" (io/resource (str source-dir icon)))
;      (io/copy (io/reader (io/resource (str source-dir icon)))
;               (io/file (str "resources/images/" icon))))

    (->files data 
             [(str "src/" sanitized "/background.cljs") (render "background.cljs" data)]
             [(str "src/" sanitized "/content.cljs") (render "content.cljs" data)]
             ["project.clj" (render "project.clj" data)]
             ["resources/images/icon16.png" (binary "icon16.png")]
             ["resources/images/icon19.png" (binary "icon19.png")]
             ["resources/images/icon38.png" (binary "icon38.png")]
             ["resources/images/icon48.png" (binary "icon48.png")]
             ["resources/images/icon128.png" (binary "icon128.png")]

             ["resources/js/content.js" (render "content.js" data)]
             ["resources/js/manifest.json" (render "manifest.json" data)]
             ["resources/js/background.js" (render "background.js" data)]
             ["resources/html/popup.html" (render "popup.html" data)]
             )))
