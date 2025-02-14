import "@typespec/http";
import "@typespec/openapi";

import "../common/errors.tsp";
import "./models.tsp";

using TypeSpec.Http;
using TypeSpec.OpenAPI;

namespace OpenAI;

@route("/files")
interface Files {
  @post
  @operationId("createFile")
  @tag("Files")
  @summary("""
  Upload a file that can be used across various endpoints. The size of all the files uploaded by
  one organization can be up to 100 GB.

  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See
  the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files
  supported. The Fine-tuning API only supports `.jsonl` files.

  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
  """)
  createFile(
    @header contentType: "multipart/form-data",
    @body file: CreateFileRequest,
  ): OpenAIFile | ErrorResponse;

  @get
  @operationId("listFiles")
  @tag("Files")
  @summary("Returns a list of files that belong to the user's organization.")
  listFiles(
    // TODO: This is just a string in the OpenAPI spec.
    /** Only return files with the given purpose. */
    @query purpose?: string,
  ): ListFilesResponse | ErrorResponse;

  @route("{file_id}")
  @get
  @operationId("retrieveFile")
  @tag("Files")
  @summary("Returns information about a specific file.")
  retrieveFile(
    /** The ID of the file to use for this request. */
    @path file_id: string,
  ): OpenAIFile | ErrorResponse;

  @route("{file_id}")
  @delete
  @operationId("deleteFile")
  @tag("Files")
  @summary("Delete a file")
  deleteFile(
    /** The ID of the file to use for this request. */
    @path file_id: string,
  ): DeleteFileResponse | ErrorResponse;

  @route("{file_id}/content")
  @get
  @operationId("downloadFile")
  @tag("Files")
  @summary("Returns the contents of the specified file.")
  // TODO: The OpenAPI spec says this returns a plain string but that the Content-Type is
  // application/json and not text/plain.
  downloadFile(
    /** The ID of the file to use for this request. */
    @path file_id: string,
  ): string | ErrorResponse;
}
