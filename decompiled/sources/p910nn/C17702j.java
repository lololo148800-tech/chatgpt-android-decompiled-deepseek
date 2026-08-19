package p910nn;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17665J;

/* JADX INFO: renamed from: nn.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C17702j implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56501Y;

    /* JADX INFO: renamed from: Z */
    public final C17703k f56502Z;

    /* JADX INFO: renamed from: o0 */
    public final DeserializedMemberScope f56503o0;

    public /* synthetic */ C17702j(C17703k c17703k, DeserializedMemberScope deserializedMemberScope, int i10) {
        this.f56501Y = i10;
        this.f56502Z = c17703k;
        this.f56503o0 = deserializedMemberScope;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f56501Y) {
            case 0:
                C17703k c17703k = this.f56502Z;
                List list = c17703k.f56505a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(NameResolverUtilKt.getName(c17703k.f56518n.f53093a.getNameResolver(), ((ProtoBuf.Function) ((MessageLite) it.next())).getName()));
                }
                return AbstractC17665J.m19266f(linkedHashSet, this.f56503o0.mo18387g());
            default:
                C17703k c17703k2 = this.f56502Z;
                List list2 = c17703k2.f56506b;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    linkedHashSet2.add(NameResolverUtilKt.getName(c17703k2.f56518n.f53093a.getNameResolver(), ((ProtoBuf.Property) ((MessageLite) it2.next())).getName()));
                }
                return AbstractC17665J.m19266f(linkedHashSet2, this.f56503o0.mo18388h());
        }
    }
}
