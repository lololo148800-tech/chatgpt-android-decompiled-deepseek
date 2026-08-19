package p1098x5;

import p523V9.AbstractC7870D5;

/* JADX INFO: renamed from: x5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21122a extends AbstractC7870D5 {

    /* JADX INFO: renamed from: b */
    public final int f67118b;

    public C21122a(int i10) {
        this.f67118b = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21122a) {
            if (this.f67118b == ((C21122a) obj).f67118b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f67118b;
    }

    public final String toString() {
        return String.valueOf(this.f67118b);
    }
}
