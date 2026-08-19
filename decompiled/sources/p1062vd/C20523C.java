package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: vd.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C20523C implements InterfaceC20539T {

    /* JADX INFO: renamed from: a */
    public final String f65150a;

    public C20523C(String str) {
        this.f65150a = str;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20523C)) {
            return false;
        }
        String str = ((C20523C) obj).f65150a;
        String str2 = this.f65150a;
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
        String str = this.f65150a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
