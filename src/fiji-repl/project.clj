(defproject fiji-repl "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
 ;; :repositories {"sc.fiji" "https://mvnrepository.com/"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                [funimage "0.1.90"]]
  :main ^:skip-aot fiji-repl.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
