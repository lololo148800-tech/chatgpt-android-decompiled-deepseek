package bf;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: bf.W */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C11367W {
    public static final C11366V Companion = new C11366V();

    /* JADX INFO: renamed from: a */
    public final Integer f34370a;

    /* JADX INFO: renamed from: b */
    public final String f34371b;

    /* JADX INFO: renamed from: c */
    public final Boolean f34372c;

    public /* synthetic */ C11367W(int i10, Integer num, String str, Boolean bool) {
        if ((i10 & 1) == 0) {
            this.f34370a = null;
        } else {
            this.f34370a = num;
        }
        if ((i10 & 2) == 0) {
            this.f34371b = null;
        } else {
            this.f34371b = str;
        }
        if ((i10 & 4) == 0) {
            this.f34372c = Boolean.FALSE;
        } else {
            this.f34372c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11367W)) {
            return false;
        }
        C11367W c11367w = (C11367W) obj;
        return AbstractC16544l.m18089b(this.f34370a, c11367w.f34370a) && AbstractC16544l.m18089b(this.f34371b, c11367w.f34371b) && AbstractC16544l.m18089b(this.f34372c, c11367w.f34372c);
    }

    public final int hashCode() {
        Integer num = this.f34370a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f34371b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f34372c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C11367W(Integer num, String str, Boolean bool) {
        this.f34370a = num;
        this.f34371b = str;
        this.f34372c = bool;
    }

    public /* synthetic */ C11367W(int i10, Integer num) {
        this((i10 & 1) != 0 ? null : num, null, Boolean.FALSE);
    }
}
