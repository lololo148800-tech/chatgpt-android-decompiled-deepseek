package p436Rm;

import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Rm.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6938d implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22221Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6940f f22222Z;

    public /* synthetic */ C6938d(C6940f c6940f, int i10) {
        this.f22221Y = i10;
        this.f22222Z = c6940f;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f22221Y) {
            case 0:
                Name name = (Name) obj;
                C6940f c6940f = this.f22222Z;
                if (name == null) {
                    c6940f.getClass();
                    C6940f.m7326a(8);
                    throw null;
                }
                MemberScope memberScope = c6940f.f22227d.getTypeConstructor().getSupertypes().iterator().next().getMemberScope();
                if (memberScope != null) {
                    return c6940f.m7327b(name, memberScope.getContributedFunctions(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                C6940f.m7326a(9);
                throw null;
            default:
                Name name2 = (Name) obj;
                C6940f c6940f2 = this.f22222Z;
                if (name2 == null) {
                    c6940f2.getClass();
                    C6940f.m7326a(4);
                    throw null;
                }
                MemberScope memberScope2 = c6940f2.f22227d.getTypeConstructor().getSupertypes().iterator().next().getMemberScope();
                if (memberScope2 != null) {
                    return c6940f2.m7327b(name2, memberScope2.getContributedVariables(name2, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                C6940f.m7326a(9);
                throw null;
        }
    }
}
