package p877ln;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: ln.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C17074f implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final MemberDeserializer f54559Y;

    /* JADX INFO: renamed from: Z */
    public final ProtoContainer f54560Z;

    /* JADX INFO: renamed from: o0 */
    public final GeneratedMessageLite.ExtendableMessage f54561o0;

    /* JADX INFO: renamed from: p0 */
    public final AnnotatedCallableKind f54562p0;

    /* JADX INFO: renamed from: q0 */
    public final int f54563q0;

    /* JADX INFO: renamed from: r0 */
    public final ProtoBuf.ValueParameter f54564r0;

    public C17074f(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind, int i10, ProtoBuf.ValueParameter valueParameter) {
        this.f54559Y = memberDeserializer;
        this.f54560Z = protoContainer;
        this.f54561o0 = extendableMessage;
        this.f54562p0 = annotatedCallableKind;
        this.f54563q0 = i10;
        this.f54564r0 = valueParameter;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return AbstractC17680n.m19322C0(this.f54559Y.f53038a.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(this.f54560Z, this.f54561o0, this.f54562p0, this.f54563q0, this.f54564r0));
    }
}
