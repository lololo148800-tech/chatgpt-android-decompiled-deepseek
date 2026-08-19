package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C16597r extends AbstractParser {
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ProtoBuf.Type.Argument(codedInputStream, extensionRegistryLite);
    }
}
