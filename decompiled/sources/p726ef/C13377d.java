package p726ef;

import ao.C11131E;
import ao.C11158d;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1155zi.C21928J0;
import p559Wn.InterfaceC8975g;
import p706df.C13085e;
import p909nm.C17690x;

/* JADX INFO: renamed from: ef.d */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13377d {
    public static final C13376c Companion = new C13376c();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f42415b = {new C11131E(C21928J0.f69475a, new C11158d(C13085e.f41578a, 0), 1)};

    /* JADX INFO: renamed from: a */
    public final Map f42416a;

    public /* synthetic */ C13377d(int i10, Map map) {
        if ((i10 & 1) == 0) {
            this.f42416a = C17690x.f56481Y;
        } else {
            this.f42416a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13377d) && AbstractC16544l.m18089b(this.f42416a, ((C13377d) obj).f42416a);
    }

    public final int hashCode() {
        return this.f42416a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C13377d(Map conversationsByGizmo) {
        AbstractC16544l.m18094g(conversationsByGizmo, "conversationsByGizmo");
        this.f42416a = conversationsByGizmo;
    }
}
