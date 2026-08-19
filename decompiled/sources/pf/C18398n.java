package pf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: pf.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C18398n implements InterfaceC2062k {

    /* JADX INFO: renamed from: l */
    public static final ArrayList f58685l;

    /* JADX INFO: renamed from: a */
    public final boolean f58686a;

    /* JADX INFO: renamed from: b */
    public final String f58687b;

    /* JADX INFO: renamed from: c */
    public final long f58688c;

    /* JADX INFO: renamed from: d */
    public final boolean f58689d;

    /* JADX INFO: renamed from: e */
    public final boolean f58690e;

    /* JADX INFO: renamed from: f */
    public final String f58691f;

    /* JADX INFO: renamed from: g */
    public final boolean f58692g;

    /* JADX INFO: renamed from: h */
    public final boolean f58693h;

    /* JADX INFO: renamed from: i */
    public final boolean f58694i;

    /* JADX INFO: renamed from: j */
    public final boolean f58695j;

    /* JADX INFO: renamed from: k */
    public final List f58696k;

    static {
        ArrayList arrayList = new ArrayList(100);
        for (int i10 = 0; i10 < 100; i10++) {
            arrayList.add(Float.valueOf(0.0f));
        }
        f58685l = arrayList;
    }

    public C18398n(boolean z6, String counter, long j10, boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, boolean z15, List waveform) {
        AbstractC16544l.m18094g(counter, "counter");
        AbstractC16544l.m18094g(waveform, "waveform");
        this.f58686a = z6;
        this.f58687b = counter;
        this.f58688c = j10;
        this.f58689d = z10;
        this.f58690e = z11;
        this.f58691f = str;
        this.f58692g = z12;
        this.f58693h = z13;
        this.f58694i = z14;
        this.f58695j = z15;
        this.f58696k = waveform;
    }

    /* JADX INFO: renamed from: e */
    public static C18398n m19867e(C18398n c18398n, boolean z6, String str, long j10, boolean z10, boolean z11, String str2, boolean z12, boolean z13, List list, int i10) {
        boolean z14 = (i10 & 1) != 0 ? c18398n.f58686a : z6;
        String counter = (i10 & 2) != 0 ? c18398n.f58687b : str;
        long j11 = (i10 & 4) != 0 ? c18398n.f58688c : j10;
        boolean z15 = (i10 & 8) != 0 ? c18398n.f58689d : z10;
        boolean z16 = (i10 & 16) != 0 ? c18398n.f58690e : z11;
        String str3 = (i10 & 32) != 0 ? c18398n.f58691f : str2;
        boolean z17 = c18398n.f58692g;
        boolean z18 = (i10 & 128) != 0 ? c18398n.f58693h : z12;
        boolean z19 = c18398n.f58694i;
        boolean z20 = (i10 & 512) != 0 ? c18398n.f58695j : z13;
        List waveform = (i10 & 1024) != 0 ? c18398n.f58696k : list;
        c18398n.getClass();
        AbstractC16544l.m18094g(counter, "counter");
        AbstractC16544l.m18094g(waveform, "waveform");
        return new C18398n(z14, counter, j11, z15, z16, str3, z17, z18, z19, z20, waveform);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18398n)) {
            return false;
        }
        C18398n c18398n = (C18398n) obj;
        return this.f58686a == c18398n.f58686a && AbstractC16544l.m18089b(this.f58687b, c18398n.f58687b) && this.f58688c == c18398n.f58688c && this.f58689d == c18398n.f58689d && this.f58690e == c18398n.f58690e && AbstractC16544l.m18089b(this.f58691f, c18398n.f58691f) && this.f58692g == c18398n.f58692g && this.f58693h == c18398n.f58693h && this.f58694i == c18398n.f58694i && this.f58695j == c18398n.f58695j && AbstractC16544l.m18089b(this.f58696k, c18398n.f58696k);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p((this.f58686a ? 1231 : 1237) * 31, 31, this.f58687b);
        long j10 = this.f58688c;
        int i10 = (((((iM527p + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f58689d ? 1231 : 1237)) * 31) + (this.f58690e ? 1231 : 1237)) * 31;
        String str = this.f58691f;
        return this.f58696k.hashCode() + ((((((((((i10 + (str == null ? 0 : str.hashCode())) * 31) + (this.f58692g ? 1231 : 1237)) * 31) + (this.f58693h ? 1231 : 1237)) * 31) + (this.f58694i ? 1231 : 1237)) * 31) + (this.f58695j ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
