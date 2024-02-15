// <auto-generated/>

#nullable disable

using System;
using System.ClientModel;
using NUnit.Framework;
using OpenAI;

namespace OpenAI.Tests
{
    public partial class MessagesTests
    {
        [Test]
        public void SmokeTest()
        {
            KeyCredential credential = new KeyCredential(Environment.GetEnvironmentVariable("OpenAIClient_KEY"));
            Messages client = new OpenAIClient(credential).GetMessagesClient();
            Assert.IsNotNull(client);
        }
    }
}
