package p281L3;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import bb.AbstractC11278C;
import bb.AbstractC11293S;
import bb.C11294T;
import bb.C11325r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import livekit.org.webrtc.MediaStreamTrack;
import p001A.C0013G0;
import p057C3.C1532J;
import p084D4.C1904b;
import p1016t3.C19765O;
import p1016t3.C19778e;
import p1016t3.C19788o;
import p1073w3.AbstractC20817s;
import p110E4.C2307e;
import p232J3.C4227a0;
import p525Vb.C8258a;

/* JADX INFO: renamed from: L3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4928o extends AbstractC4931r {

    /* JADX INFO: renamed from: i */
    public static final AbstractC11293S f16085i = new C11325r(new C0013G0(5));

    /* JADX INFO: renamed from: c */
    public final Object f16086c;

    /* JADX INFO: renamed from: d */
    public final C8258a f16087d;

    /* JADX INFO: renamed from: e */
    public final boolean f16088e;

    /* JADX INFO: renamed from: f */
    public final C4922i f16089f;

    /* JADX INFO: renamed from: g */
    public final C2307e f16090g;

    /* JADX INFO: renamed from: h */
    public C19778e f16091h;

    public C4928o(Context context) {
        C8258a c8258a = new C8258a();
        int i10 = C4922i.f16046A;
        C4922i c4922i = new C4922i(new C4921h(context));
        this.f16086c = new Object();
        context.getApplicationContext();
        this.f16087d = c8258a;
        this.f16089f = c4922i;
        this.f16091h = C19778e.f62665d;
        boolean zM21389C = AbstractC20817s.m21389C(context);
        this.f16088e = zM21389C;
        if (zM21389C || AbstractC20817s.f66106a < 32) {
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.f16090g = audioManager == null ? null : new C2307e(audioManager.getSpatializer());
    }

    /* JADX INFO: renamed from: b */
    public static int m5534b(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: c */
    public static int m5535c(C19788o c19788o, String str, boolean z6) {
        if (!TextUtils.isEmpty(str) && str.equals(c19788o.f62743d)) {
            return 4;
        }
        String strM5536e = m5536e(str);
        String strM5536e2 = m5536e(c19788o.f62743d);
        if (strM5536e2 == null || strM5536e == null) {
            return (z6 && strM5536e2 == null) ? 1 : 0;
        }
        if (strM5536e2.startsWith(strM5536e) || strM5536e.startsWith(strM5536e2)) {
            return 3;
        }
        int i10 = AbstractC20817s.f66106a;
        return strM5536e2.split("-", 2)[0].equals(strM5536e.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX INFO: renamed from: e */
    public static String m5536e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: g */
    public static Pair m5537g(int i10, C1904b c1904b, int[][][] iArr, InterfaceC4925l interfaceC4925l, Comparator comparator) {
        RandomAccess randomAccessM12695y;
        boolean z6;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < c1904b.f5565a; i11++) {
            if (i10 == ((int[]) c1904b.f5566b)[i11]) {
                C4227a0 c4227a0 = ((C4227a0[]) c1904b.f5567c)[i11];
                for (int i12 = 0; i12 < c4227a0.f13815a; i12++) {
                    C19765O c19765oM4999a = c4227a0.m4999a(i12);
                    C11294T c11294tMo393i = interfaceC4925l.mo393i(i11, c19765oM4999a, iArr[i11][i12]);
                    int i13 = c19765oM4999a.f62602a;
                    boolean[] zArr = new boolean[i13];
                    for (int i14 = 0; i14 < i13; i14++) {
                        AbstractC4926m abstractC4926m = (AbstractC4926m) c11294tMo393i.get(i14);
                        int iMo5527a = abstractC4926m.mo5527a();
                        if (!zArr[i14] && iMo5527a != 0) {
                            if (iMo5527a == 1) {
                                randomAccessM12695y = AbstractC11278C.m12695y(abstractC4926m);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC4926m);
                                for (int i15 = i14 + 1; i15 < i13; i15++) {
                                    AbstractC4926m abstractC4926m2 = (AbstractC4926m) c11294tMo393i.get(i15);
                                    if (abstractC4926m2.mo5527a() == 2 && abstractC4926m.mo5528b(abstractC4926m2)) {
                                        arrayList2.add(abstractC4926m2);
                                        z6 = true;
                                        zArr[i15] = true;
                                    } else {
                                        z6 = true;
                                    }
                                }
                                randomAccessM12695y = arrayList2;
                            }
                            arrayList.add(randomAccessM12695y);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((AbstractC4926m) list.get(i16)).f16068o0;
        }
        AbstractC4926m abstractC4926m3 = (AbstractC4926m) list.get(0);
        return Pair.create(new C4929p(abstractC4926m3.f16067Z, iArr2), Integer.valueOf(abstractC4926m3.f16066Y));
    }

    @Override // p281L3.AbstractC4931r
    /* JADX INFO: renamed from: a */
    public final void mo5538a() {
        C2307e c2307e;
        C4923j c4923j;
        synchronized (this.f16086c) {
            try {
                if (AbstractC20817s.f66106a >= 32 && (c2307e = this.f16090g) != null && (c4923j = (C4923j) c2307e.f7161q0) != null && ((Handler) c2307e.f7160p0) != null) {
                    ((Spatializer) c2307e.f7159o0).removeOnSpatializerStateChangedListener(c4923j);
                    ((Handler) c2307e.f7160p0).removeCallbacksAndMessages(null);
                    c2307e.f7160p0 = null;
                    c2307e.f7161q0 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f16094a = null;
        this.f16095b = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m5539d() {
        boolean z6;
        C1532J c1532j;
        C2307e c2307e;
        synchronized (this.f16086c) {
            try {
                z6 = this.f16089f.f16051v && !this.f16088e && AbstractC20817s.f66106a >= 32 && (c2307e = this.f16090g) != null && c2307e.f7158Z;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z6 || (c1532j = this.f16094a) == null) {
            return;
        }
        c1532j.f4161t0.m21379e(10);
    }

    /* JADX INFO: renamed from: f */
    public final void m5540f() {
        synchronized (this.f16086c) {
            this.f16089f.getClass();
        }
    }
}
