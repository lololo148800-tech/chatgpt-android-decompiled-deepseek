package p204I1;

import p467T1.C7194d;
import p467T1.C7197g;
import p467T1.C7199i;
import p467T1.C7201k;
import p467T1.C7206p;
import p467T1.C7207q;
import p492U1.C7548m;
import p492U1.C7549n;
import p571X9.AbstractC9119D4;

/* JADX INFO: renamed from: I1.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3605u {

    /* JADX INFO: renamed from: a */
    public static final long f10987a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f10988b = 0;

    static {
        C7549n[] c7549nArr = C7548m.f23908b;
        f10987a = C7548m.f23909c;
    }

    /* JADX INFO: renamed from: a */
    public static final C3604t m4321a(C3604t c3604t, int i10, int i11, long j10, C7206p c7206p, C3607w c3607w, C7197g c7197g, int i12, int i13, C7207q c7207q) {
        long j11;
        int i14 = i10;
        int i15 = i11;
        C7206p c7206p2 = c7206p;
        C3607w c3607w2 = c3607w;
        C7197g c7197g2 = c7197g;
        int i16 = i12;
        int i17 = i13;
        C7207q c7207q2 = c7207q;
        if (C7199i.m7596a(i10, Integer.MIN_VALUE) || C7199i.m7596a(i10, c3604t.f10978a)) {
            if (AbstractC9119D4.m9651d(j10)) {
                j11 = j10;
            } else {
                j11 = j10;
                if (C7548m.m7893a(j11, c3604t.f10980c)) {
                }
            }
            if ((c7206p2 == null || c7206p2.equals(c3604t.f10981d)) && ((C7201k.m7598a(i15, Integer.MIN_VALUE) || C7201k.m7598a(i15, c3604t.f10979b)) && ((c3607w2 == null || c3607w2.equals(c3604t.f10982e)) && ((c7197g2 == null || c7197g2.equals(c3604t.f10983f)) && ((i16 == 0 || i16 == c3604t.f10984g) && ((C7194d.m7592a(i17, Integer.MIN_VALUE) || C7194d.m7592a(i17, c3604t.f10985h)) && (c7207q2 == null || c7207q2.equals(c3604t.f10986i)))))))) {
                return c3604t;
            }
        } else {
            j11 = j10;
        }
        long j12 = AbstractC9119D4.m9651d(j10) ? c3604t.f10980c : j11;
        if (c7206p2 == null) {
            c7206p2 = c3604t.f10981d;
        }
        if (C7199i.m7596a(i10, Integer.MIN_VALUE)) {
            i14 = c3604t.f10978a;
        }
        if (C7201k.m7598a(i15, Integer.MIN_VALUE)) {
            i15 = c3604t.f10979b;
        }
        C3607w c3607w3 = c3604t.f10982e;
        if (c3607w3 != null && c3607w2 == null) {
            c3607w2 = c3607w3;
        }
        if (c7197g2 == null) {
            c7197g2 = c3604t.f10983f;
        }
        if (i16 == 0) {
            i16 = c3604t.f10984g;
        }
        if (C7194d.m7592a(i17, Integer.MIN_VALUE)) {
            i17 = c3604t.f10985h;
        }
        if (c7207q2 == null) {
            c7207q2 = c3604t.f10986i;
        }
        return new C3604t(i14, i15, j12, c7206p2, c3607w2, c7197g2, i16, i17, c7207q2);
    }
}
