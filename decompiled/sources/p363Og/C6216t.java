package p363Og;

import ve.EnumC20582f;

/* JADX INFO: renamed from: Og.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C6216t implements InterfaceC6217u {

    /* JADX INFO: renamed from: a */
    public final EnumC20582f f20228a;

    /* JADX INFO: renamed from: b */
    public final boolean f20229b;

    public C6216t(EnumC20582f enumC20582f, boolean z6) {
        this.f20228a = enumC20582f;
        this.f20229b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6216t)) {
            return false;
        }
        C6216t c6216t = (C6216t) obj;
        return this.f20228a == c6216t.f20228a && this.f20229b == c6216t.f20229b;
    }

    public final int hashCode() {
        return (this.f20228a.hashCode() * 31) + (this.f20229b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
