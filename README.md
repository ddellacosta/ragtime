## This is a fork of this fork of ragtime: https://github.com/mjroghelia/ragtime/tree/jsyrjala-jdbc-0.3.0.

It provides clojure.java.jdbc 0.3.3 compatibility as well as dumping out exceptions on migration errors (https://github.com/weavejester/ragtime/pull/22).  While we are waiting for folks to figure out what to do about clojure.java.jdbc in the main branch of ragtime you can include it in your project like so:

```clojure
[ragtime-c.j.j-0.3.3 "0.3.4-2"]
```

# Ragtime

[![Build Status](https://secure.travis-ci.org/weavejester/ragtime.png)](http://travis-ci.org/weavejester/ragtime)

Ragtime is a Clojure library for migrating structured data. It defines
a common interface for expressing migrations, much like [Ring][1]
defines a common interface for expression web applications.

[1]: https://github.com/ring-clojure/ring

## Libraries

* ragtime.core -
  database independent tools and functions for managing migrations

* ragtime.sql -
  an adapter for applying migrations to a SQL database
  
* ragtime.sql.files -
  provides a way of specifying migrations as SQL script files

* ragtime.lein -
  a Leiningen plugin that wraps ragtime.core

## Installation

Add ragtime.core as a dependency if you just want the database-
independent core:

```clojure
:dependencies [[ragtime/ragtime.core "0.3.4"]]
```

Or add the full library if you want support for SQL databases:

```clojure
:dependencies [[ragtime "0.3.4"]]
```

If you want to integrate Ragtime into Leiningen:

```clojure
:plugins [[ragtime/ragtime.lein "0.3.4"]]
```

## Documentation

* [Wiki](https://github.com/weavejester/ragtime/wiki)
* [API docs](http://weavejester.github.com/ragtime)

## License

Copyright © 2013 James Reeves

Distributed under the Eclipse Public License, the same as Clojure.
