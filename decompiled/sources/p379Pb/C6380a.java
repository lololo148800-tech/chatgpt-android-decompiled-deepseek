package p379Pb;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p214Ib.C3678u;
import p228J.AbstractC3794B0;
import p288Lb.C4975h;

/* JADX INFO: renamed from: Pb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6380a {

    /* JADX INFO: renamed from: a */
    public static C6380a f20774a;

    /* JADX INFO: renamed from: a */
    public static void m6991a(C6381b c6381b) throws IOException {
        if (c6381b instanceof C4975h) {
            C4975h c4975h = (C4975h) c6381b;
            c4975h.m5623b1(5);
            Map.Entry entry = (Map.Entry) ((Iterator) c4975h.m5629f1()).next();
            c4975h.m5632h1(entry.getValue());
            c4975h.m5632h1(new C3678u((String) entry.getKey()));
            return;
        }
        int iM7004m = c6381b.f20783t0;
        if (iM7004m == 0) {
            iM7004m = c6381b.m7004m();
        }
        if (iM7004m == 13) {
            c6381b.f20783t0 = 9;
            return;
        }
        if (iM7004m == 12) {
            c6381b.f20783t0 = 8;
        } else {
            if (iM7004m == 14) {
                c6381b.f20783t0 = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + AbstractC3794B0.m4474I(c6381b.mo5616N0()) + c6381b.m7006v0());
        }
    }
}
