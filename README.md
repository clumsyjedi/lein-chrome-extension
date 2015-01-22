# lein-chrome-extension

A leiningen template for generating lein-chromebuild projects

## Usage

    lein new chrome-extension example

## What's in the box?

Projects created by this template are functional chrome extensions that can be built using ```lein chromebuild once```. The default extension once built includes:

  - A manifest.json
  - A content script (executing on every page load)
  - A background page
  - A new tab page
  - A popup (IE clickable button)
  - A button
  - A bunch of default icons

Both the content script and popup, when loaded, will send messages to the background page and receive messages back using [khroma](https://github.com/suprematic/khroma). This means your starting point is a project with the hard parts already implemented, and you just need to cut away the pieces of the extension you will not need.

## But... but why?

Making chrome extension in clojurescript is actually really easy, but theres a fair bit of boilerplate required. I fully accept that this adds no value to developers who are already comfortable with the layout of chrome extensions and clojurescript builds.

## See also

[lein-chromebuild](https://github.com/clumsyjedi/lein-chromebuild)

## License

Copyright © 2014 Frazer Irving

Released under the Eclipse Public License - v 1.0.


