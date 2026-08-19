package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C20239C {

    /* JADX INFO: renamed from: a */
    public final String f64033a;

    public C20239C(String str) {
        this.f64033a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20239C) && AbstractC16544l.m18089b(this.f64033a, ((C20239C) obj).f64033a);
    }

    public final int hashCode() {
        String str = this.f64033a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
