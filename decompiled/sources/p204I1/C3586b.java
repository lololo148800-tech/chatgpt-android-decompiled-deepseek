package p204I1;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: I1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3586b {

    /* JADX INFO: renamed from: a */
    public final Object f10921a;

    /* JADX INFO: renamed from: b */
    public final int f10922b;

    /* JADX INFO: renamed from: c */
    public int f10923c;

    /* JADX INFO: renamed from: d */
    public final String f10924d;

    public C3586b(Object obj, int i10, int i11, String str) {
        this.f10921a = obj;
        this.f10922b = i10;
        this.f10923c = i11;
        this.f10924d = str;
    }

    /* JADX INFO: renamed from: a */
    public final C3588d m4288a(int i10) {
        int i11 = this.f10923c;
        if (i11 != Integer.MIN_VALUE) {
            i10 = i11;
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalStateException("Item.end should be set first");
        }
        return new C3588d(this.f10921a, this.f10922b, i10, this.f10924d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3586b)) {
            return false;
        }
        C3586b c3586b = (C3586b) obj;
        return AbstractC16544l.m18089b(this.f10921a, c3586b.f10921a) && this.f10922b == c3586b.f10922b && this.f10923c == c3586b.f10923c && AbstractC16544l.m18089b(this.f10924d, c3586b.f10924d);
    }

    public final int hashCode() {
        Object obj = this.f10921a;
        return this.f10924d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f10922b) * 31) + this.f10923c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableRange(item=");
        sb2.append(this.f10921a);
        sb2.append(", start=");
        sb2.append(this.f10922b);
        sb2.append(", end=");
        sb2.append(this.f10923c);
        sb2.append(", tag=");
        return AbstractC9306j0.m9892k(sb2, this.f10924d, ')');
    }

    public /* synthetic */ C3586b(Object obj, int i10, int i11, String str, int i12) {
        this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
    }
}
