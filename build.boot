(set-env! :resource-paths #{"src"}
          :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]])

(require '[boot.git :refer [last-commit]]
         '[adzerk.bootlaces :refer :all])

(def +version+ "0.0.1")

(bootlaces! +version+)

(task-options!
  push {:repo           "deploy"
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
