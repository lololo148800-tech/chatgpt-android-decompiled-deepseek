package p947pd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: pd.m */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18373m {
    public static final C18372l Companion = new C18372l();

    /* JADX INFO: renamed from: a */
    public final String f58644a;

    /* JADX INFO: renamed from: b */
    public final String f58645b;

    /* JADX INFO: renamed from: c */
    public final C18379s f58646c;

    public /* synthetic */ C18373m(int i10, String str, String str2, C18379s c18379s) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C18371k.f58643a.getDescriptor());
            throw null;
        }
        this.f58644a = str;
        this.f58645b = str2;
        if ((i10 & 4) == 0) {
            this.f58646c = null;
        } else {
            this.f58646c = c18379s;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18373m)) {
            return false;
        }
        C18373m c18373m = (C18373m) obj;
        return AbstractC16544l.m18089b(this.f58644a, c18373m.f58644a) && AbstractC16544l.m18089b(this.f58645b, c18373m.f58645b) && AbstractC16544l.m18089b(this.f58646c, c18373m.f58646c);
    }

    public final int hashCode() {
        String str = this.f58644a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f58645b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C18379s c18379s = this.f58646c;
        return iHashCode2 + (c18379s != null ? c18379s.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
