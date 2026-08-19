package p204I1;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: I1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3588d {

    /* JADX INFO: renamed from: a */
    public final Object f10930a;

    /* JADX INFO: renamed from: b */
    public final int f10931b;

    /* JADX INFO: renamed from: c */
    public final int f10932c;

    /* JADX INFO: renamed from: d */
    public final String f10933d;

    public C3588d(Object obj, int i10, int i11, String str) {
        this.f10930a = obj;
        this.f10931b = i10;
        this.f10932c = i11;
        this.f10933d = str;
        if (i10 > i11) {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3588d)) {
            return false;
        }
        C3588d c3588d = (C3588d) obj;
        return AbstractC16544l.m18089b(this.f10930a, c3588d.f10930a) && this.f10931b == c3588d.f10931b && this.f10932c == c3588d.f10932c && AbstractC16544l.m18089b(this.f10933d, c3588d.f10933d);
    }

    public final int hashCode() {
        Object obj = this.f10930a;
        return this.f10933d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f10931b) * 31) + this.f10932c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f10930a);
        sb2.append(", start=");
        sb2.append(this.f10931b);
        sb2.append(", end=");
        sb2.append(this.f10932c);
        sb2.append(", tag=");
        return AbstractC9306j0.m9892k(sb2, this.f10933d, ')');
    }

    public C3588d(Object obj, int i10, int i11) {
        this(obj, i10, i11, "");
    }
}
