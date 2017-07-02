(set-env! :source-paths #{"src"}
          :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]]
          :repositories [["clojars" (cond-> {:url "https://clojars.org/repo/"}
                                      (System/getenv "CLOJARS_USER")
                                      (merge {:username (System/getenv "CLOJARS_USER")
                                              :password (System/getenv "CLOJARS_PASS")}))]])

(require '[boot.git :refer [last-commit]]
         '[adzerk.bootlaces :refer :all])

(def +version+ "0.0.1-SNAPSHOT")

(bootlaces! +version+)

(task-options!
  push {:repo           "clojars"
        :ensure-branch  "master"
        :ensure-clean   true
        :ensure-tag     (last-commit)
        :ensure-version +version+}
  pom  {:project        'class-names
        :version        +version+
        :description    "classnames-inspired helper for managing dynamic classes in Reagent and Re-frame apps"
        :url            "https://github.com/YurySolovyov/class-names-cljs"
        :scm            {:url "https://github.com/YurySolovyov/class-names-cljs"}
        :license        {"MIT" "https://opensource.org/licenses/MIT"}})
