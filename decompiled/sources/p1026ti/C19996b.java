package p1026ti;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ti.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C19996b implements InterfaceC19998d {

    /* JADX INFO: renamed from: a */
    public final String f63312a;

    public C19996b(String str) {
        this.f63312a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19996b) && AbstractC16544l.m18089b(this.f63312a, ((C19996b) obj).f63312a);
    }

    public final int hashCode() {
        String str = this.f63312a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
