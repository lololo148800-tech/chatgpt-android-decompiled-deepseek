package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1056c extends AbstractC1098i {
    public static final C1049b Companion = new C1049b();

    /* JADX INFO: renamed from: b */
    public final String f2889b;

    /* JADX INFO: renamed from: c */
    public final String f2890c;

    public C1056c(int i10, String str, String str2) {
        if ((i10 & 1) == 0) {
            this.f2889b = null;
        } else {
            this.f2889b = str;
        }
        if ((i10 & 2) == 0) {
            this.f2890c = null;
        } else {
            this.f2890c = str2;
        }
    }

    @Override // p040Bd.AbstractC1098i
    /* JADX INFO: renamed from: a */
    public final String mo1968a() {
        return "chart";
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1056c)) {
            return false;
        }
        C1056c c1056c = (C1056c) obj;
        String str = c1056c.f2889b;
        String str2 = this.f2889b;
        if (str2 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str2, str);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f2890c, c1056c.f2890c);
    }

    public final int hashCode() {
        String str = this.f2889b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2890c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
