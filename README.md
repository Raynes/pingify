# pingify

A little web server designed to sit and wait for GETs from [znc-push](https://github.com/jreese/znc-push)
and send out emails with the data it passes along. I specifically use this to send
an email to sprint with the data which then triggers a text message on my cell phone
which in turn triggers my pebble's notification stuff so I get IRC pings as watch notifications.

## Usage

Just `lein ring server`. Then you can hit `localhost:6556/?user=SomeUser&context=SomeChannelOrQueryWindow&message=ohaithere` and such.
Note that the 'user' param is looked up in the configuration map -- the email address associated
with that key is where the email is sent to.

Cheers!

## License

Copyright © 2013 Anthony Grimes

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
