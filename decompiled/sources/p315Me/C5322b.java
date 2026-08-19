package p315Me;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Me.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5322b {

    /* JADX INFO: renamed from: a */
    public final int f17510a;

    /* JADX INFO: renamed from: b */
    public final int f17511b;

    /* JADX INFO: renamed from: c */
    public final Throwable f17512c;

    public C5322b(int i10, int i11, Throwable th2) {
        this.f17510a = i10;
        this.f17511b = i11;
        this.f17512c = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5322b)) {
            return false;
        }
        C5322b c5322b = (C5322b) obj;
        return this.f17510a == c5322b.f17510a && this.f17511b == c5322b.f17511b && AbstractC16544l.m18089b(this.f17512c, c5322b.f17512c);
    }

    public final int hashCode() {
        int i10 = ((this.f17510a * 31) + this.f17511b) * 31;
        Throwable th2 = this.f17512c;
        return i10 + (th2 == null ? 0 : th2.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
