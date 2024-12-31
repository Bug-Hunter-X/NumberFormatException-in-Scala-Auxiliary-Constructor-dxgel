# Scala Auxiliary Constructor NumberFormatException

This example showcases a subtle error that can arise when using auxiliary constructors in Scala, specifically when dealing with type conversions that can throw exceptions, like converting a String to an Int.

The `BadClass` example demonstrates how an attempt to convert a non-numeric string to an Int within an auxiliary constructor will cause a `NumberFormatException`. This exception is not handled and will crash your program.

The solution involves adding error handling (try-catch) to gracefully manage potential exceptions during the type conversion within the auxiliary constructor.