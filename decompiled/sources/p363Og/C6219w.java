package p363Og;

import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: Og.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C6219w implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final boolean f20237a;

    public C6219w(boolean z6) {
        this.f20237a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6219w) && this.f20237a == ((C6219w) obj).f20237a;
    }

    public final int hashCode() {
        return this.f20237a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
