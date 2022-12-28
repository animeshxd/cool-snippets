import 'dart:async';

Future<dynamic> send(dynamic request) async {
  // Create a Completer to hold the result
  Completer<dynamic> completer = Completer<dynamic>();

  // Call the send() function and provide a callback to set the result
  _send(request, (dynamic result) {
    completer.complete(result);
  });

  // Return the Future for the result
  return completer.future;
}

