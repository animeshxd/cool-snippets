import asyncio
async def send(request):
    # Create a future to hold the result
    future = asyncio.Future()

    # Schedule the send() function to be run asynchronously
    asyncio.create_task(_send(request, future.set_result))

    # Wait for the result to be available
    result = await future
    return result
