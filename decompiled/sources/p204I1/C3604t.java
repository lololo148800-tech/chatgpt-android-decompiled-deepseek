package p204I1;

import kotlin.jvm.internal.AbstractC16544l;
import p467T1.C7194d;
import p467T1.C7195e;
import p467T1.C7197g;
import p467T1.C7199i;
import p467T1.C7201k;
import p467T1.C7206p;
import p467T1.C7207q;
import p492U1.C7548m;

/* JADX INFO: renamed from: I1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C3604t {

    /* JADX INFO: renamed from: a */
    public final int f10978a;

    /* JADX INFO: renamed from: b */
    public final int f10979b;

    /* JADX INFO: renamed from: c */
    public final long f10980c;

    /* JADX INFO: renamed from: d */
    public final C7206p f10981d;

    /* JADX INFO: renamed from: e */
    public final C3607w f10982e;

    /* JADX INFO: renamed from: f */
    public final C7197g f10983f;

    /* JADX INFO: renamed from: g */
    public final int f10984g;

    /* JADX INFO: renamed from: h */
    public final int f10985h;

    /* JADX INFO: renamed from: i */
    public final C7207q f10986i;

    public C3604t(int i10, int i11, long j10, C7206p c7206p, C3607w c3607w, C7197g c7197g, int i12, int i13, C7207q c7207q) {
        this.f10978a = i10;
        this.f10979b = i11;
        this.f10980c = j10;
        this.f10981d = c7206p;
        this.f10982e = c3607w;
        this.f10983f = c7197g;
        this.f10984g = i12;
        this.f10985h = i13;
        this.f10986i = c7207q;
        if (C7548m.m7893a(j10, C7548m.f23909c) || C7548m.m7895c(j10) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + C7548m.m7895c(j10) + ')').toString());
    }

    /* JADX INFO: renamed from: a */
    public final C3604t m4320a(C3604t c3604t) {
        if (c3604t == null) {
            return this;
        }
        return AbstractC3605u.m4321a(this, c3604t.f10978a, c3604t.f10979b, c3604t.f10980c, c3604t.f10981d, c3604t.f10982e, c3604t.f10983f, c3604t.f10984g, c3604t.f10985h, c3604t.f10986i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3604t)) {
            return false;
        }
        C3604t c3604t = (C3604t) obj;
        return C7199i.m7596a(this.f10978a, c3604t.f10978a) && C7201k.m7598a(this.f10979b, c3604t.f10979b) && C7548m.m7893a(this.f10980c, c3604t.f10980c) && AbstractC16544l.m18089b(this.f10981d, c3604t.f10981d) && AbstractC16544l.m18089b(this.f10982e, c3604t.f10982e) && AbstractC16544l.m18089b(this.f10983f, c3604t.f10983f) && this.f10984g == c3604t.f10984g && C7194d.m7592a(this.f10985h, c3604t.f10985h) && AbstractC16544l.m18089b(this.f10986i, c3604t.f10986i);
    }

    public final int hashCode() {
        int iM7896d = (C7548m.m7896d(this.f10980c) + (((this.f10978a * 31) + this.f10979b) * 31)) * 31;
        C7206p c7206p = this.f10981d;
        int iHashCode = (iM7896d + (c7206p != null ? c7206p.hashCode() : 0)) * 31;
        C3607w c3607w = this.f10982e;
        int iHashCode2 = (iHashCode + (c3607w != null ? c3607w.hashCode() : 0)) * 31;
        C7197g c7197g = this.f10983f;
        int iHashCode3 = (((((iHashCode2 + (c7197g != null ? c7197g.hashCode() : 0)) * 31) + this.f10984g) * 31) + this.f10985h) * 31;
        C7207q c7207q = this.f10986i;
        return iHashCode3 + (c7207q != null ? c7207q.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) C7199i.m7597b(this.f10978a)) + ", textDirection=" + ((Object) C7201k.m7599b(this.f10979b)) + ", lineHeight=" + ((Object) C7548m.m7897e(this.f10980c)) + ", textIndent=" + this.f10981d + ", platformStyle=" + this.f10982e + ", lineHeightStyle=" + this.f10983f + ", lineBreak=" + ((Object) C7195e.m7594a(this.f10984g)) + ", hyphens=" + ((Object) C7194d.m7593b(this.f10985h)) + ", textMotion=" + this.f10986i + ')';
    }

    public C3604t(int i10, int i11, long j10, C7206p c7206p, int i12) {
        this((i12 & 1) != 0 ? Integer.MIN_VALUE : i10, (i12 & 2) != 0 ? Integer.MIN_VALUE : i11, (i12 & 4) != 0 ? C7548m.f23909c : j10, (i12 & 8) != 0 ? null : c7206p, null, null, 0, Integer.MIN_VALUE, null);
    }
}
