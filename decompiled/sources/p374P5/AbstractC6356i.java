package p374P5;

import android.graphics.Bitmap;
import p033B5.AbstractC0833q;
import p033B5.C0827k;
import p033B5.C0828l;
import p1009s9.C19506i;
import p471T5.C7257a;
import p496U5.AbstractC7568j;
import p909nm.C17689w;

/* JADX INFO: renamed from: P5.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6356i {

    /* JADX INFO: renamed from: a */
    public static final C19506i f20684a;

    /* JADX INFO: renamed from: b */
    public static final C19506i f20685b;

    /* JADX INFO: renamed from: c */
    public static final C19506i f20686c;

    /* JADX INFO: renamed from: d */
    public static final C19506i f20687d;

    /* JADX INFO: renamed from: e */
    public static final C19506i f20688e;

    /* JADX INFO: renamed from: f */
    public static final C19506i f20689f;

    /* JADX INFO: renamed from: g */
    public static final C19506i f20690g;

    /* JADX INFO: renamed from: h */
    public static final C19506i f20691h;

    /* JADX INFO: renamed from: i */
    public static final C19506i f20692i;

    static {
        int i10 = 2;
        f20684a = new C19506i(C17689w.f56480Y, i10);
        f20685b = new C19506i(C7257a.f23025a, i10);
        int i11 = 2;
        f20686c = new C19506i(AbstractC7568j.f23972b, i11);
        Object obj = null;
        f20687d = new C19506i(obj, i11);
        Boolean bool = Boolean.TRUE;
        int i12 = 2;
        f20688e = new C19506i(bool, i12);
        f20689f = new C19506i(obj, i12);
        int i13 = 2;
        f20690g = new C19506i(bool, i13);
        f20691h = new C19506i(bool, i13);
        f20692i = new C19506i(Boolean.FALSE, 2);
    }

    /* JADX INFO: renamed from: a */
    public static final void m6974a(C6351d c6351d) {
        C0827k c0827k;
        Object obj = c6351d.f20636p;
        if (obj instanceof C0827k) {
            c0827k = (C0827k) obj;
        } else {
            if (!(obj instanceof C0828l)) {
                throw new AssertionError();
            }
            C0828l c0828l = (C0828l) obj;
            c0828l.getClass();
            C0827k c0827k2 = new C0827k(c0828l);
            c6351d.f20636p = c0827k2;
            c0827k = c0827k2;
        }
        c0827k.f2307a.put(f20691h, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b */
    public static final Bitmap.Config m6975b(C6361n c6361n) {
        return (Bitmap.Config) AbstractC0833q.m1892e(c6361n, f20686c);
    }
}
