package p947pd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: pd.p */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18376p {
    public static final C18375o Companion = new C18375o();

    /* JADX INFO: renamed from: a */
    public final boolean f58648a;

    /* JADX INFO: renamed from: b */
    public final C18373m f58649b;

    public C18376p() {
        this.f58648a = false;
        this.f58649b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18376p)) {
            return false;
        }
        C18376p c18376p = (C18376p) obj;
        return this.f58648a == c18376p.f58648a && AbstractC16544l.m18089b(this.f58649b, c18376p.f58649b);
    }

    public final int hashCode() {
        int i10 = (this.f58648a ? 1231 : 1237) * 31;
        C18373m c18373m = this.f58649b;
        return i10 + (c18373m == null ? 0 : c18373m.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C18376p(int i10, boolean z6, C18373m c18373m) {
        this.f58648a = (i10 & 1) == 0 ? false : z6;
        if ((i10 & 2) == 0) {
            this.f58649b = null;
        } else {
            this.f58649b = c18373m;
        }
    }
}
