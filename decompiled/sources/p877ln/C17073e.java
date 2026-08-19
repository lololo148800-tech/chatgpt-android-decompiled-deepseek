package p877ln;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: ln.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C17073e implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final MemberDeserializer f54556Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f54557Z;

    /* JADX INFO: renamed from: o0 */
    public final ProtoBuf.Property f54558o0;

    public C17073e(MemberDeserializer memberDeserializer, boolean z6, ProtoBuf.Property property) {
        this.f54556Y = memberDeserializer;
        this.f54557Z = z6;
        this.f54558o0 = property;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        List listM19322C0;
        MemberDeserializer memberDeserializer = this.f54556Y;
        ProtoContainer protoContainerM18369a = memberDeserializer.m18369a(memberDeserializer.f53038a.getContainingDeclaration());
        if (protoContainerM18369a != null) {
            boolean z6 = this.f54557Z;
            ProtoBuf.Property property = this.f54558o0;
            DeserializationContext deserializationContext = memberDeserializer.f53038a;
            listM19322C0 = z6 ? AbstractC17680n.m19322C0(deserializationContext.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(protoContainerM18369a, property)) : AbstractC17680n.m19322C0(deserializationContext.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(protoContainerM18369a, property));
        } else {
            listM19322C0 = null;
        }
        return listM19322C0 == null ? C17689w.f56480Y : listM19322C0;
    }
}
