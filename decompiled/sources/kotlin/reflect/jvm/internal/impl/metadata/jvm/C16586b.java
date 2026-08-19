package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C16586b extends AbstractParser {
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new JvmProtoBuf.JvmMethodSignature(codedInputStream);
    }
}
