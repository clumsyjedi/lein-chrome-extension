# {{ns-name}}

FIXME: description

## Installation

FIXME: how to install

## Usage

FIXME: explanation

## Options

FIXME: listing of options this app accepts.

## Examples

...

### Bugs

...

### Any Other Sections
### That You Think
### Might be Useful

## License

Copyright © 2016 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.


### Coda

The template for this project came from [lein-chrome-extension](https://github.com/clumsyjedi/lein-chrome-extension), and started with this command:

`lein new chrome-extension {{ns-name}}`

#### To build `target/{{sanitized}}.js`, run:

`lein chromebuild once`

#### To rebuild whenever a source file is modified, run:

`lein chromebuild auto`

#### To install your extension in Chrome:

* Visit `chrome://extensions`
* Click the `Developer mode` checkbox
* Click the `Load unpacked extension ...` button
* Select `target/{{sanitized}}.js`
* Click the `Enable` checkbox
