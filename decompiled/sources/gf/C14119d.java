package gf;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: gf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C14119d implements InterfaceC14124i {

    /* JADX INFO: renamed from: a */
    public final String f44454a;

    public C14119d(String str) {
        this.f44454a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14119d) && AbstractC16544l.m18089b(this.f44454a, ((C14119d) obj).f44454a);
    }

    public final int hashCode() {
        String str = this.f44454a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
