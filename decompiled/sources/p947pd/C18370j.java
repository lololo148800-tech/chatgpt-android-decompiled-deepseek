package p947pd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: pd.j */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18370j {
    public static final C18369i Companion = new C18369i();

    /* JADX INFO: renamed from: a */
    public final C18376p f58642a;

    public /* synthetic */ C18370j(int i10, C18376p c18376p) {
        if ((i10 & 1) == 0) {
            this.f58642a = new C18376p();
        } else {
            this.f58642a = c18376p;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18370j) && AbstractC16544l.m18089b(this.f58642a, ((C18370j) obj).f58642a);
    }

    public final int hashCode() {
        return this.f58642a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
