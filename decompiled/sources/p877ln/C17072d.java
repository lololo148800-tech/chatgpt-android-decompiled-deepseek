package p877ln;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: ln.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C17072d implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54552Y;

    /* JADX INFO: renamed from: Z */
    public final MemberDeserializer f54553Z;

    /* JADX INFO: renamed from: o0 */
    public final GeneratedMessageLite.ExtendableMessage f54554o0;

    /* JADX INFO: renamed from: p0 */
    public final AnnotatedCallableKind f54555p0;

    public /* synthetic */ C17072d(MemberDeserializer memberDeserializer, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind, int i10) {
        this.f54552Y = i10;
        this.f54553Z = memberDeserializer;
        this.f54554o0 = extendableMessage;
        this.f54555p0 = annotatedCallableKind;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f54552Y) {
            case 0:
                MemberDeserializer memberDeserializer = this.f54553Z;
                ProtoContainer protoContainerM18369a = memberDeserializer.m18369a(memberDeserializer.f53038a.getContainingDeclaration());
                List listM19322C0 = protoContainerM18369a != null ? AbstractC17680n.m19322C0(memberDeserializer.f53038a.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(protoContainerM18369a, this.f54554o0, this.f54555p0)) : null;
                return listM19322C0 == null ? C17689w.f56480Y : listM19322C0;
            default:
                MemberDeserializer memberDeserializer2 = this.f54553Z;
                ProtoContainer protoContainerM18369a2 = memberDeserializer2.m18369a(memberDeserializer2.f53038a.getContainingDeclaration());
                List<AnnotationDescriptor> listLoadExtensionReceiverParameterAnnotations = protoContainerM18369a2 != null ? memberDeserializer2.f53038a.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(protoContainerM18369a2, this.f54554o0, this.f54555p0) : null;
                return listLoadExtensionReceiverParameterAnnotations == null ? C17689w.f56480Y : listLoadExtensionReceiverParameterAnnotations;
        }
    }
}
