(ns io.hosaka.common.util
  (:require [clojure.java.io :refer [reader]]
            [aleph.http :as http]
            [manifold.deferred :as d]
            [cheshire.core :as json]))

(defn parse-stream [stream]
  (with-open [rdr (reader stream)]
    (json/parse-stream rdr true)))

(defn get-json
  ([url] (get-json url {}))
  ([url opt]
   (d/chain
    (http/get url opt)
    :body
    parse-stream)))

