(ns pingify.core
  (:require [postal.core :as email]
            [compojure.core :refer [defroutes GET]]
            [compojure.handler :refer [api]]
            [clojure.edn :as edn]))

(defn get-config []
  (edn/read-string (slurp "config.clj")))

(defn send-email [{:keys [user nick context message]}]
  (let [config (get-config)
        email-config (:email config)]
    (email/send-message email-config
                        {:from (:user email-config)
                         :to (config user)
                         :subject (if (= nick context)
                                    nick
                                    (format "%s/%s" nick context))
                         :body message})))

(defroutes api-routes
  (GET "/" {:keys [params]} (send-email params)))

(def handler
  (-> #'api-routes
      (api)))
