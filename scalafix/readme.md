# Scalafix rules for Spark Auto Upgrade

To develop rule:
```
sbt ~tests/test
# edit rules/src/main/scala/fix/SparkAutoUpgrade.scala
```

## Other rules to use

https://github.com/scala/scala-rewrites -

fix.scala213.Any2StringAdd
fix.scala213.Core
fix.scala213.ExplicitNonNullaryApply
fix.scala213.ExplicitNullaryEtaExpansion
fix.scala213.NullaryHashHash
fix.scala213.ScalaSeq
fix.scala213.Varargs
