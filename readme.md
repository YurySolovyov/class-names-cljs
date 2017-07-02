[class-names](https://github.com/JedWatson/classnames) for ClojureScript
===

[![Clojars Project](https://img.shields.io/clojars/v/class-names.svg)](https://clojars.org/class-names)

```clojure
(:require [class-names.core :refer [class-names]])

(class-names "foo" "bar" :bax { :active true :seleced false })
; -> "foo bar bax active"
(class-names "foo" "bar" nil)
; -> "foo bar"
(class-names "foo" "bar" :bax { :active true :seleced false } 'nox { :more-classes-in-map true })
; -> "foo bar bax active nox more-classes-in-map"
```

### License

MIT © Yury Solovyov
