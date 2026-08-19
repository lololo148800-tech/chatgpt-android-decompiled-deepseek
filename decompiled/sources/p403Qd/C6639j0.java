package p403Qd;

import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.C17689w;

/* JADX INFO: renamed from: Qd.j0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6639j0 extends AbstractC6653q0 {
    public static final C6637i0 Companion = new C6637i0();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f21401c = {new C11158d(C11181o0.f33827a, 0)};

    /* JADX INFO: renamed from: b */
    public final List f21402b;

    public /* synthetic */ C6639j0(int i10, List list) {
        if ((i10 & 1) == 0) {
            this.f21402b = C17689w.f56480Y;
        } else {
            this.f21402b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6639j0) && AbstractC16544l.m18089b(this.f21402b, ((C6639j0) obj).f21402b);
    }

    public final int hashCode() {
        return this.f21402b.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C6639j0(List updatedMemories) {
        AbstractC16544l.m18094g(updatedMemories, "updatedMemories");
        this.f21402b = updatedMemories;
    }
}
