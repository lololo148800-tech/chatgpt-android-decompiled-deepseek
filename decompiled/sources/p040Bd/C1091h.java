package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.h */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1091h extends AbstractC1098i {
    public static final C1084g Companion = new C1084g();

    /* JADX INFO: renamed from: b */
    public final String f2986b;

    public C1091h(int i10, String str) {
        if ((i10 & 1) == 0) {
            this.f2986b = null;
        } else {
            this.f2986b = str;
        }
    }

    @Override // p040Bd.AbstractC1098i
    /* JADX INFO: renamed from: a */
    public final String mo1968a() {
        return "table";
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1091h)) {
            return false;
        }
        String str = ((C1091h) obj).f2986b;
        String str2 = this.f2986b;
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
        return zM18089b;
    }

    public final int hashCode() {
        String str = this.f2986b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
