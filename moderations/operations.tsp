import "@typespec/http";
import "@typespec/openapi";

import "../common/errors.tsp";
import "./models.tsp";

using TypeSpec.Http;
using TypeSpec.OpenAPI;

namespace OpenAI;

@route("/moderations")
interface Moderations {
  @post
  @operationId("createModeration")
  @tag("Moderations")
  @summary("Classifies if text is potentially harmful.")
  createModeration(
    @body content: CreateModerationRequest,
  ): CreateModerationResponse | ErrorResponse;
}
