(defproject ring-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [metosin/muuntaja "0.6.8"]
                 [metosin/ring-http-response "0.9.1"]
                 [ring "1.8.2"]]
  :mirrors {"clojars" {:name "ustc"
                       :url "https://mirrors.ustc.edu.cn/clojars"}}
  :repl-options {:init-ns ring-app.core}
  :main ring-app.core)
