package p704dc;

import ac.C10539a;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import cc.C11696a;
import cc.C11697b;
import cc.C11699d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A.C0017I0;
import p013Ab.C0420b;
import p030B2.RunnableC0758g0;
import p038Ba.AbstractC0865o;
import p1009s9.C19506i;
import p1060v9.AbstractC20502t;
import p117Eb.C2392v;
import p117Eb.RunnableC2394x;
import p401Qb.C6584a;
import p501Ub.C7604f;
import p501Ub.EnumC7610l;
import p523V9.C8240y6;
import p571X9.C9173M4;
import p571X9.C9192Q;
import p571X9.EnumC9357r3;
import p571X9.EnumC9363s3;
import p571X9.EnumC9369t3;
import p664bc.C11334a;
import p664bc.C11337d;

/* JADX INFO: renamed from: dc.f */
/* JADX INFO: loaded from: classes.dex */
public final class C13065f extends AbstractC0865o {

    /* JADX INFO: renamed from: j */
    public static final AtomicBoolean f41499j = new AtomicBoolean(true);

    /* JADX INFO: renamed from: k */
    public static final C11337d f41500k = C11337d.f34274Y;

    /* JADX INFO: renamed from: d */
    public final C11699d f41501d;

    /* JADX INFO: renamed from: e */
    public final C9173M4 f41502e;

    /* JADX INFO: renamed from: f */
    public final C8240y6 f41503f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC13061b f41504g;

    /* JADX INFO: renamed from: h */
    public boolean f41505h;

    /* JADX INFO: renamed from: i */
    public final C11334a f41506i;

    public C13065f(C9173M4 c9173m4, C11699d c11699d, InterfaceC13061b interfaceC13061b) {
        super(3);
        this.f41506i = new C11334a();
        AbstractC20502t.m21158i(c11699d, "FaceDetectorOptions can not be null");
        this.f41501d = c11699d;
        this.f41502e = c9173m4;
        this.f41504g = interfaceC13061b;
        this.f41503f = new C8240y6(C7604f.m7950c().m7952b(), 1);
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: j */
    public final synchronized void mo1937j() {
        this.f41505h = this.f41504g.mo191c();
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: n */
    public final synchronized void mo1941n() {
        try {
            this.f41504g.mo190b();
            f41499j.set(true);
            C9173M4 c9173m4 = this.f41502e;
            C0017I0 c0017i0 = new C0017I0();
            c0017i0.f66o0 = this.f41505h ? EnumC9357r3.TYPE_THICK : EnumC9357r3.TYPE_THIN;
            EnumC7610l.f24056Y.execute(new RunnableC0758g0(c9173m4, new C0420b(c0017i0, 0), EnumC9369t3.ON_DEVICE_FACE_CLOSE, c9173m4.m9727c(), 3));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x011c A[Catch: all -> 0x002b, a -> 0x00e8, TryCatch #0 {a -> 0x00e8, blocks: (B:50:0x0116, B:57:0x012a, B:56:0x0125, B:53:0x011c, B:34:0x00a4, B:36:0x00c8, B:37:0x00d0, B:39:0x00d6, B:44:0x00f0, B:47:0x0103, B:49:0x010e), top: B:69:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:56:0x0125 A[Catch: all -> 0x002b, a -> 0x00e8, TryCatch #0 {a -> 0x00e8, blocks: (B:50:0x0116, B:57:0x012a, B:56:0x0125, B:53:0x011c, B:34:0x00a4, B:36:0x00c8, B:37:0x00d0, B:39:0x00d6, B:44:0x00f0, B:47:0x0103, B:49:0x010e), top: B:69:0x00a4 }] */
    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: q */
    public final Object mo1944q(C10539a c10539a) {
        long j10;
        List arrayList;
        Iterator it;
        Iterator it2;
        Rect rect;
        List list;
        int size;
        int size2;
        synchronized (this) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f41506i.m12769a(c10539a);
                try {
                    Pair pairMo189a = this.f41504g.mo189a(c10539a);
                    List list2 = (List) pairMo189a.first;
                    List list3 = (List) pairMo189a.second;
                    if (list2 == null && list3 == null) {
                        throw new C6584a("No detector is enabled", 13);
                    }
                    if (list2 == null) {
                        AbstractC20502t.m21157h(list3);
                        list = list3;
                    } else if (list3 == null) {
                        list = list2;
                    } else {
                        HashSet hashSet = new HashSet();
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            C11696a c11696a = (C11696a) it3.next();
                            Iterator it4 = list2.iterator();
                            boolean z6 = false;
                            while (it4.hasNext()) {
                                C11696a c11696a2 = (C11696a) it4.next();
                                Rect rect2 = c11696a.f35480a;
                                if (rect2 == null || (rect = c11696a2.f35480a) == null || !rect2.intersect(rect)) {
                                    it = it3;
                                    it2 = it4;
                                    j10 = jElapsedRealtime;
                                } else {
                                    it = it3;
                                    it2 = it4;
                                    j10 = jElapsedRealtime;
                                    double dMin = (Math.min(rect2.bottom, rect.bottom) - Math.max(rect2.top, rect.top)) * (Math.min(rect2.right, rect.right) - Math.max(rect2.left, rect.left));
                                    try {
                                        if (dMin / ((((double) ((rect2.bottom - rect2.top) * (rect2.right - rect2.left))) + ((double) ((rect.bottom - rect.top) * (rect.right - rect.left)))) - dMin) > 0.6d) {
                                            SparseArray sparseArray = c11696a.f35489j;
                                            SparseArray sparseArray2 = c11696a2.f35489j;
                                            sparseArray2.clear();
                                            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                                                sparseArray2.put(sparseArray.keyAt(i10), (C11697b) sparseArray.valueAt(i10));
                                            }
                                            z6 = true;
                                        }
                                    } catch (C6584a e10) {
                                        e = e10;
                                        m14801s(e.f21271Y == 14 ? EnumC9363s3.MODEL_NOT_DOWNLOADED : EnumC9363s3.UNKNOWN_ERROR, j10, c10539a, 0, 0);
                                        throw e;
                                    }
                                }
                                hashSet.add(c11696a2);
                                it3 = it;
                                it4 = it2;
                                jElapsedRealtime = j10;
                            }
                            Iterator it5 = it3;
                            long j11 = jElapsedRealtime;
                            if (!z6) {
                                hashSet.add(c11696a);
                            }
                            it3 = it5;
                            jElapsedRealtime = j11;
                        }
                        j10 = jElapsedRealtime;
                        arrayList = new ArrayList(hashSet);
                        EnumC9363s3 enumC9363s3 = EnumC9363s3.NO_ERROR;
                        if (list3 == null) {
                            size = 0;
                        } else {
                            size = list3.size();
                        }
                        if (list2 == null) {
                            size2 = 0;
                        } else {
                            size2 = list2.size();
                        }
                        m14801s(enumC9363s3, j10, c10539a, size, size2);
                        f41499j.set(false);
                    }
                    arrayList = list;
                    j10 = jElapsedRealtime;
                    EnumC9363s3 enumC9363s4 = EnumC9363s3.NO_ERROR;
                    if (list3 == null) {
                        size = 0;
                    } else {
                        size = list3.size();
                    }
                    if (list2 == null) {
                        size2 = 0;
                    } else {
                        size2 = list2.size();
                    }
                    m14801s(enumC9363s4, j10, c10539a, size, size2);
                    f41499j.set(false);
                } catch (C6584a e11) {
                    e = e11;
                    j10 = jElapsedRealtime;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized void m14801s(EnumC9363s3 enumC9363s3, long j10, C10539a c10539a, int i10, int i11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f41502e.m9726b(new C13064e(this, jElapsedRealtime, enumC9363s3, i10, i11, c10539a), EnumC9369t3.ON_DEVICE_FACE_DETECT);
        C2392v c2392v = new C2392v(19, false);
        c2392v.f7436Z = enumC9363s3;
        c2392v.f7437o0 = Boolean.valueOf(f41499j.get());
        c2392v.f7439q0 = Integer.valueOf(i10 & Integer.MAX_VALUE);
        c2392v.f7440r0 = Integer.valueOf(i11 & Integer.MAX_VALUE);
        c2392v.f7438p0 = AbstractC13066g.m14802a(this.f41501d);
        EnumC7610l.f24056Y.execute(new RunnableC2394x(this.f41502e, new C9192Q(c2392v), jElapsedRealtime, new C19506i(this, 26), 2));
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f41503f.m8887a(true != this.f41505h ? 24303 : 24304, enumC9363s3.f28211Y, jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }
}
