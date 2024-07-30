// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace OpenAI.VectorStores
{
    public partial class VectorStoreBatchFileJob
    {
        internal IDictionary<string, BinaryData> SerializedAdditionalRawData { get; set; }
        internal VectorStoreBatchFileJob(string batchId, DateTimeOffset createdAt, string vectorStoreId, VectorStoreBatchFileJobStatus status, VectorStoreFileCounts fileCounts)
        {
            Argument.AssertNotNull(batchId, nameof(batchId));
            Argument.AssertNotNull(vectorStoreId, nameof(vectorStoreId));
            Argument.AssertNotNull(fileCounts, nameof(fileCounts));

            BatchId = batchId;
            CreatedAt = createdAt;
            VectorStoreId = vectorStoreId;
            Status = status;
            FileCounts = fileCounts;
        }

        internal VectorStoreBatchFileJob(string batchId, object @object, DateTimeOffset createdAt, string vectorStoreId, VectorStoreBatchFileJobStatus status, VectorStoreFileCounts fileCounts, IDictionary<string, BinaryData> serializedAdditionalRawData)
        {
            BatchId = batchId;
            Object = @object;
            CreatedAt = createdAt;
            VectorStoreId = vectorStoreId;
            Status = status;
            FileCounts = fileCounts;
            SerializedAdditionalRawData = serializedAdditionalRawData;
        }

        internal VectorStoreBatchFileJob()
        {
        }

        public DateTimeOffset CreatedAt { get; }
        public string VectorStoreId { get; }
        public VectorStoreBatchFileJobStatus Status { get; }
    }
}
