package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import mm.C17309l;

/* JADX INFO: loaded from: classes2.dex */
public final class ContractDeserializer$Companion$DEFAULT$1 implements ContractDeserializer {
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer
    public C17309l deserializeContractFromFunction(ProtoBuf.Function proto, FunctionDescriptor ownerFunction, TypeTable typeTable, TypeDeserializer typeDeserializer) {
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(ownerFunction, "ownerFunction");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        AbstractC16544l.m18094g(typeDeserializer, "typeDeserializer");
        return null;
    }
}
