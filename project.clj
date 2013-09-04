(defproject pingify "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.draines/postal "1.11.0"]
                 [compojure "1.1.5"]]
  :plugins [[lein-ring "0.8.7"]]
  :ring {:handler pingify.core/handler
         :port 6556})
