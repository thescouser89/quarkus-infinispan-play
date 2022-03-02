package org.lakaz.proto;

import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

@AutoProtoSchemaBuilder(includeClasses = { Author.class }, schemaPackageName = "book_sample")
interface BookSchema extends GeneratedSchema {
}
