package p925oe;

import ao.C11158d;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.C17691y;

/* JADX INFO: renamed from: oe.a0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18102a0 {
    public static final C18100Z Companion = new C18100Z();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f57742b = {new C11158d(C18096V.f57737a, 2)};

    /* JADX INFO: renamed from: a */
    public final Set f57743a;

    public /* synthetic */ C18102a0(int i10, Set set) {
        if ((i10 & 1) == 0) {
            this.f57743a = C17691y.f56482Y;
        } else {
            this.f57743a = set;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18102a0) && AbstractC16544l.m18089b(this.f57743a, ((C18102a0) obj).f57743a);
    }

    public final int hashCode() {
        return this.f57743a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C18102a0(Set conversations) {
        AbstractC16544l.m18094g(conversations, "conversations");
        this.f57743a = conversations;
    }
}
