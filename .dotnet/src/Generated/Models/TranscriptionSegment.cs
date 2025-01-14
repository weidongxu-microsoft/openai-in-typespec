// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;
using System.Linq;

namespace OpenAI.Internal.Models
{
    /// <summary> The TranscriptionSegment. </summary>
    internal partial class TranscriptionSegment
    {
        /// <summary>
        /// Keeps track of any properties unknown to the library.
        /// <para>
        /// To assign an object to the value of this property use <see cref="BinaryData.FromObjectAsJson{T}(T, System.Text.Json.JsonSerializerOptions?)"/>.
        /// </para>
        /// <para>
        /// To assign an already formatted json string to this property use <see cref="BinaryData.FromString(string)"/>.
        /// </para>
        /// <para>
        /// Examples:
        /// <list type="bullet">
        /// <item>
        /// <term>BinaryData.FromObjectAsJson("foo")</term>
        /// <description>Creates a payload of "foo".</description>
        /// </item>
        /// <item>
        /// <term>BinaryData.FromString("\"foo\"")</term>
        /// <description>Creates a payload of "foo".</description>
        /// </item>
        /// <item>
        /// <term>BinaryData.FromObjectAsJson(new { key = "value" })</term>
        /// <description>Creates a payload of { "key": "value" }.</description>
        /// </item>
        /// <item>
        /// <term>BinaryData.FromString("{\"key\": \"value\"}")</term>
        /// <description>Creates a payload of { "key": "value" }.</description>
        /// </item>
        /// </list>
        /// </para>
        /// </summary>
        private IDictionary<string, BinaryData> _serializedAdditionalRawData;

        /// <summary> Initializes a new instance of <see cref="TranscriptionSegment"/>. </summary>
        /// <param name="id"> Unique identifier of the segment. </param>
        /// <param name="seek"> Seek offset of the segment. </param>
        /// <param name="start"> Start time of the segment in seconds. </param>
        /// <param name="end"> End time of the segment in seconds. </param>
        /// <param name="text"> Text content of the segment. </param>
        /// <param name="tokens"> Array of token IDs for the text content. </param>
        /// <param name="temperature"> Temperature parameter used for generating the segment. </param>
        /// <param name="avgLogprob"> Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. </param>
        /// <param name="compressionRatio">
        /// Compression ratio of the segment. If the value is greater than 2.4, consider the compression
        /// failed.
        /// </param>
        /// <param name="noSpeechProb">
        /// Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob`
        /// is below -1, consider this segment silent.
        /// </param>
        /// <exception cref="ArgumentNullException"> <paramref name="text"/> or <paramref name="tokens"/> is null. </exception>
        internal TranscriptionSegment(long id, long seek, TimeSpan start, TimeSpan end, string text, IEnumerable<long> tokens, double temperature, double avgLogprob, double compressionRatio, double noSpeechProb)
        {
            Argument.AssertNotNull(text, nameof(text));
            Argument.AssertNotNull(tokens, nameof(tokens));

            Id = id;
            Seek = seek;
            Start = start;
            End = end;
            Text = text;
            Tokens = tokens.ToList();
            Temperature = temperature;
            AvgLogprob = avgLogprob;
            CompressionRatio = compressionRatio;
            NoSpeechProb = noSpeechProb;
        }

        /// <summary> Initializes a new instance of <see cref="TranscriptionSegment"/>. </summary>
        /// <param name="id"> Unique identifier of the segment. </param>
        /// <param name="seek"> Seek offset of the segment. </param>
        /// <param name="start"> Start time of the segment in seconds. </param>
        /// <param name="end"> End time of the segment in seconds. </param>
        /// <param name="text"> Text content of the segment. </param>
        /// <param name="tokens"> Array of token IDs for the text content. </param>
        /// <param name="temperature"> Temperature parameter used for generating the segment. </param>
        /// <param name="avgLogprob"> Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. </param>
        /// <param name="compressionRatio">
        /// Compression ratio of the segment. If the value is greater than 2.4, consider the compression
        /// failed.
        /// </param>
        /// <param name="noSpeechProb">
        /// Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob`
        /// is below -1, consider this segment silent.
        /// </param>
        /// <param name="serializedAdditionalRawData"> Keeps track of any properties unknown to the library. </param>
        internal TranscriptionSegment(long id, long seek, TimeSpan start, TimeSpan end, string text, IReadOnlyList<long> tokens, double temperature, double avgLogprob, double compressionRatio, double noSpeechProb, IDictionary<string, BinaryData> serializedAdditionalRawData)
        {
            Id = id;
            Seek = seek;
            Start = start;
            End = end;
            Text = text;
            Tokens = tokens;
            Temperature = temperature;
            AvgLogprob = avgLogprob;
            CompressionRatio = compressionRatio;
            NoSpeechProb = noSpeechProb;
            _serializedAdditionalRawData = serializedAdditionalRawData;
        }

        /// <summary> Initializes a new instance of <see cref="TranscriptionSegment"/> for deserialization. </summary>
        internal TranscriptionSegment()
        {
        }

        /// <summary> Unique identifier of the segment. </summary>
        public long Id { get; }
        /// <summary> Seek offset of the segment. </summary>
        public long Seek { get; }
        /// <summary> Start time of the segment in seconds. </summary>
        public TimeSpan Start { get; }
        /// <summary> End time of the segment in seconds. </summary>
        public TimeSpan End { get; }
        /// <summary> Text content of the segment. </summary>
        public string Text { get; }
        /// <summary> Array of token IDs for the text content. </summary>
        public IReadOnlyList<long> Tokens { get; }
        /// <summary> Temperature parameter used for generating the segment. </summary>
        public double Temperature { get; }
        /// <summary> Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. </summary>
        public double AvgLogprob { get; }
        /// <summary>
        /// Compression ratio of the segment. If the value is greater than 2.4, consider the compression
        /// failed.
        /// </summary>
        public double CompressionRatio { get; }
        /// <summary>
        /// Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob`
        /// is below -1, consider this segment silent.
        /// </summary>
        public double NoSpeechProb { get; }
    }
}
