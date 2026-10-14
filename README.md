# Java RMI Calculator

A small Remote Method Invocation (RMI) example exposing addition and subtraction through a remote calculator interface.

## Requirements

- JDK 17 or later

## Run

The source files declare the `RMI` package, so compile from the repository root:

```bash
javac -d . calculator.java calculatorImpl.java server.java client.java
```

Start the RMI registry in one terminal:

```bash
rmiregistry 1099
```

Start the server in another terminal:

```bash
java RMI.server
```

Then run the client in a third terminal:

```bash
java RMI.client
```

The registry must be running and the server/client lookup URLs must match. If the registry or server is hosted elsewhere, configure the hostname accordingly.

## Security and scope

This is a local learning demo, not an authenticated production service. RMI registry lookup alone does not establish application-level user identity or authorization. Before exposing remote calls to a network, design explicit access controls, network restrictions, secure transport, and input validation.
