(defproject io.hosaka/common "1.2.0"
  :description "Hosaka common library"
  :url "https://github.com/hosaka-io/common"
  :repositories ^:replace [["releases" {:url  "https://artifactory.i.hosaka.io/artifactory/libs-release"
                                        :username :env/lein_username
                                        :password :env/lein_password
                                        :sign-releases false}]
                                  ["snapshots" "https://artifactory.i.hosaka.io/artifactory/libs-snapshot"]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.cache "0.7.1"]
                 [org.clojure/spec.alpha "0.1.143"]
                 [org.clojure/tools.logging "0.4.0"]
                 [cheshire "5.8.0"]
                 [com.stuartsierra/component "0.3.2"]
                 [yada "1.2.11"]
                 [aleph "0.4.5-alpha6"]
                 [manifold "0.1.7-alpha6"]
                 [clj-time "0.14.4"]
                 [com.layerware/hugsql "0.4.8"]
                 [hikari-cp "2.4.0"]
                 [org.flywaydb/flyway-core "5.0.7"]]
  :target-path "target/%s"
  )
