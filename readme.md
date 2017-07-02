[class-names](https://github.com/JedWatson/classnames) for ClojureScript
===

```clojure
(class-names "foo" "bar" :bax { :active true :seleced false })
; -> "foo bar bax active"
(class-names "foo" "bar" nil)
; -> "foo bar"
(class-names "foo" "bar" :bax { :active true :seleced false } 'nox { :more-classes-in-map true })
; -> "foo bar bax active nox more-classes-in-map"
```

### License

MIT © Yury Solovyov
