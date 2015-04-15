#Thrift Stack

Remarkably, I was unable to find an example of a multi-language stack put together with thrift with a scala backend and a ruby client operation. So I made one.

Currently, I'm working to flesh more of it out. Suggestions are welcome.

------------------------

###So you want to run this thing? 
Duh, just read the code. Should be self-explanatory.

More realistically:

- go to the `scala` directory
- run `sbt compile`. This should trigger scrooge to auto-generate scala code from the thrift specifications in `/src/main/thrift/` and compile the rest of the scala code
- turn on the thrift server: run `sbt run`, choose the thriftServer option if it asks
- open another shell and launch into the ruby
- you should be able to do a few things to make it all happy

or really:

- open another terminal window and run `sbt console`
- import both `com.oheasytiger._` and `com.twitter.finagle.Thrift`
- `val client = Thrift.newIface[Hello.FutureIface]("localhost:9000")`
- `client.hi().onSuccess{ y=>println(y) }`
- rejoice

