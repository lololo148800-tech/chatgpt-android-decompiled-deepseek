package p117Eb;

import am.C10752f;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11112u;
import gd.C13969n2;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.hints.C15370i;
import io.sentry.internal.debugmeta.C15384c;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.SdpObserver;
import livekit.org.webrtc.SessionDescription;
import mm.C17296C;
import mm.C17314q;
import mm.EnumC17307j;
import p001A.C0028O;
import p001A.C0063g0;
import p001A.C0072l;
import p001A.C0093v0;
import p001A.RunnableC0000A;
import p001A.RunnableC0046X0;
import p001A.RunnableC0068j;
import p001A.RunnableC0074m;
import p002A0.C0130g;
import p004A2.InterfaceC0310a;
import p025An.AbstractC0575H;
import p025An.C0565C;
import p025An.C0611f0;
import p025An.C0624m;
import p033B5.C0841y;
import p040Bd.C1193x2;
import p049Bm.InterfaceC1426a;
import p057C3.C1546Y;
import p084D4.C1920j;
import p092Dc.C1991h;
import p1061vb.C20513d;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1114xp.C21346q;
import p1138z.C21572a;
import p117Eb.C2392v;
import p138F8.vJO.anhfj;
import p140Fa.C2685e;
import p143Fd.AbstractC2714d;
import p143Fd.InterfaceC2719i;
import p178H.C3124Q;
import p178H.C3130X;
import p178H.C3131Y;
import p178H.C3132Z;
import p178H.C3145g;
import p178H.C3150i0;
import p178H.C3162o0;
import p178H.C3175v;
import p178H.InterfaceC3127U;
import p202I.C3525a;
import p202I.C3527c;
import p202I.C3528d;
import p202I.C3529e;
import p202I.C3530f;
import p202I.C3535k;
import p202I.C3537m;
import p202I.C3539o;
import p204I1.AbstractC3591g;
import p204I1.C3582M;
import p204I1.C3588d;
import p204I1.C3590f;
import p204I1.C3600p;
import p204I1.C3602r;
import p204I1.C3604t;
import p204I1.InterfaceC3603s;
import p228J.AbstractC3794B0;
import p228J.AbstractC3810L;
import p228J.AbstractC3842j;
import p228J.C3815Q;
import p228J.C3832e;
import p228J.C3836g;
import p228J.C3844k;
import p228J.C3846l;
import p228J.C3847l0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3816S;
import p228J.InterfaceC3820W;
import p228J.InterfaceC3870x;
import p229J0.C3935J4;
import p229J0.C4055g1;
import p229J0.InterfaceC3923H4;
import p230J1.AbstractC4194u;
import p230J1.C4187n;
import p275Kn.AbstractC4817d;
import p277L.ExecutorC4828a;
import p279L1.VOxZ.sVoFrD;
import p283L5.AbstractC4941g;
import p301M.AbstractC5229k;
import p301M.RunnableC5220b;
import p301M.RunnableC5228j;
import p326N.C5563e;
import p326N.C5565g;
import p326N.InterfaceC5566h;
import p328N1.InterfaceC5598n;
import p334Na.AbstractC5695b;
import p360Od.C6172d;
import p360Od.EnumC6170b;
import p393Q1.C6551c;
import p403Qd.AbstractC6605K;
import p403Qd.C6597C;
import p403Qd.C6600F;
import p403Qd.C6617X;
import p403Qd.EnumC6606L;
import p414R.C6768b;
import p414R.C6772f;
import p414R.C6776j;
import p414R.C6777k;
import p414R.C6778l;
import p414R.InterfaceC6780n;
import p439S.C6970a;
import p446S6.C7022a;
import p451Sb.C7102a;
import p465T.C7166b;
import p467T1.C7201k;
import p479Td.AbstractC7343b0;
import p479Td.C7351f0;
import p479Td.EnumC7359j0;
import p486Tl.C7502a;
import p486Tl.C7503b;
import p486Tl.C7504c;
import p486Tl.C7505d;
import p492U1.InterfaceC7537b;
import p499U9.C7591u;
import p523V9.AbstractC8042a0;
import p523V9.AbstractC8064c6;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8154o0;
import p525Vb.C8258a;
import p533Vl.AbstractC8394f;
import p533Vl.C8392d;
import p533Vl.C8393e;
import p536W.C8405a;
import p536W.C8406b;
import p536W.C8407c;
import p544W9.AbstractC8488H2;
import p544W9.AbstractC8577W2;
import p571X9.AbstractC9227W;
import p575Xd.C9433B;
import p575Xd.C9440I;
import p575Xd.C9463v;
import p610Z1.C10145l;
import p640a6.C10514i;
import p658b5.C11241l;
import p658b5.C11248s;
import p758g0.C13796x;
import p758g0.InterfaceC13772l;
import p779h6.AbstractC14413b;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;
import p882m1.clb.WGTYqNchEpHca;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p959q8.C18639a;
import p960q9.C18655i;
import p972qm.C18777j;
import p972qm.C18778k;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import p999s.C19341c1;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Eb.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2392v implements InterfaceC2719i, InterfaceC3603s, InterfaceC3923H4, SdpObserver {

    /* JADX INFO: renamed from: s0 */
    public static int f7433s0;

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ int f7434t0 = 0;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7435Y;

    /* JADX INFO: renamed from: Z */
    public Object f7436Z;

    /* JADX INFO: renamed from: o0 */
    public Object f7437o0;

    /* JADX INFO: renamed from: p0 */
    public Object f7438p0;

    /* JADX INFO: renamed from: q0 */
    public Object f7439q0;

    /* JADX INFO: renamed from: r0 */
    public Object f7440r0;

    public /* synthetic */ C2392v(int i10, boolean z6) {
        this.f7435Y = i10;
    }

    /* JADX INFO: renamed from: q */
    public static C2392v m3528q(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        C2392v c2392v = new C2392v(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) c2392v.f7439q0)) {
            try {
                ((ArrayDeque) c2392v.f7439q0).clear();
                String string = ((SharedPreferences) c2392v.f7436Z).getString((String) c2392v.f7437o0, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) c2392v.f7438p0)) {
                    String[] strArrSplit = string.split((String) c2392v.f7438p0, -1);
                    if (strArrSplit.length == 0) {
                        AbstractC15256t.m16465c("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) c2392v.f7439q0).add(str);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2392v;
    }

    /* JADX INFO: renamed from: A */
    public int m3529A(int i10, int i11) {
        while (i10 > i11) {
            char cCharAt = ((Layout) this.f7436Z).getText().charAt(i10 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((AbstractC16544l.m18096i(cCharAt, 8192) < 0 || AbstractC16544l.m18096i(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                break;
            }
            i10--;
        }
        return i10;
    }

    /* JADX INFO: renamed from: B */
    public void m3530B(InterfaceC3127U interfaceC3127U) throws Exception {
        AbstractC8488H2.m9140a();
        if (((C3535k) this.f7436Z) == null) {
            AbstractC8072d6.m8492i("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + interfaceC3127U);
            interfaceC3127U.close();
            return;
        }
        if (((Integer) interfaceC3127U.mo3968k0().mo3964c().f11718a.get(((C3535k) this.f7436Z).f10696h)) == null) {
            AbstractC8072d6.m8492i("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            interfaceC3127U.close();
            return;
        }
        AbstractC8488H2.m9140a();
        C3527c c3527c = (C3527c) this.f7438p0;
        Objects.requireNonNull(c3527c);
        c3527c.f10664a.accept(new C3528d((C3535k) this.f7436Z, interfaceC3127U));
        C3535k c3535k = (C3535k) this.f7436Z;
        this.f7436Z = null;
        int i10 = c3535k.f10699k;
        C3537m c3537m = c3535k.f10695g;
        if (i10 != -1 && i10 != 100) {
            c3535k.f10699k = 100;
            AbstractC8488H2.m9140a();
            if (!c3537m.f10708g) {
                C3530f c3530f = c3537m.f10702a;
                c3530f.f10673b.execute(new RunnableC0068j(c3530f));
            }
        }
        AbstractC8488H2.m9140a();
        if (c3537m.f10708g) {
            return;
        }
        if (!c3537m.f10709h) {
            c3537m.m4220b();
        }
        c3537m.f10706e.m10747a(null);
    }

    /* JADX INFO: renamed from: C */
    public void m3531C(C3535k c3535k) {
        AbstractC8488H2.m9140a();
        AbstractC4941g.m5559R("only one capture stage is supported.", c3535k.f10697i.size() == 1);
        AbstractC4941g.m5559R("Too many acquire images. Close image to be able to process next.", m3561s() > 0);
        this.f7436Z = c3535k;
        C15384c c15384c = new C15384c(this, c3535k, false, 7);
        ExecutorC4828a executorC4828aM9240b = AbstractC8577W2.m9240b();
        C10145l c10145l = c3535k.f10698j;
        c10145l.mo5766a(new RunnableC5228j(c10145l, 0, c15384c), executorC4828aM9240b);
    }

    /* JADX INFO: renamed from: D */
    public String m3532D() {
        String str;
        synchronized (((ArrayDeque) this.f7439q0)) {
            str = (String) ((ArrayDeque) this.f7439q0).peek();
        }
        return str;
    }

    /* JADX INFO: renamed from: E */
    public void m3533E(C8406b c8406b) {
        synchronized (this.f7436Z) {
            try {
                InterfaceC11112u interfaceC11112uM8949k = c8406b.m8949k();
                C5565g c5565g = c8406b.f26135o0;
                C8405a c8405a = new C8405a(interfaceC11112uM8949k, C5565g.m5954w(c5565g.f18037C0, c5565g.f18038D0));
                C8407c c8407cM3564v = m3564v(interfaceC11112uM8949k);
                Set hashSet = c8407cM3564v != null ? (Set) ((HashMap) this.f7438p0).get(c8407cM3564v) : new HashSet();
                hashSet.add(c8405a);
                ((HashMap) this.f7437o0).put(c8405a, c8406b);
                if (c8407cM3564v == null) {
                    C8407c c8407c = new C8407c(interfaceC11112uM8949k, this);
                    ((HashMap) this.f7438p0).put(c8407c, hashSet);
                    interfaceC11112uM8949k.mo7809i().mo7806a(c8407c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m3534F(Object obj) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.f7439q0)) {
            zRemove = ((ArrayDeque) this.f7439q0).remove(obj);
            if (zRemove) {
                ((ScheduledThreadPoolExecutor) this.f7440r0).execute(new RunnableC0000A(this, 12));
            }
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: G */
    public void m3535G(EnumC6606L replaceWithState) {
        C6172d c6172d = (C6172d) this.f7438p0;
        ArrayList arrayList = (ArrayList) this.f7439q0;
        if (c6172d == null) {
            if (((AbstractC7343b0) this.f7440r0) != null) {
                arrayList.add(new C6597C((C7351f0) AbstractC17680n.m19351a0((ArrayList) this.f7437o0)));
                return;
            }
            return;
        }
        if (AbstractC2714d.f8356a[AbstractC8042a0.m8415c((ArrayList) this.f7437o0).ordinal()] == 3) {
            replaceWithState = EnumC6606L.f21330p0;
        } else {
            EnumC6606L enumC6606L = c6172d.f20094d;
            enumC6606L.getClass();
            AbstractC16544l.m18094g(replaceWithState, "replaceWithState");
            if (AbstractC6605K.f21326a[enumC6606L.ordinal()] != 1) {
                replaceWithState = enumC6606L;
            }
        }
        C6172d c6172dM6722a = C6172d.m6722a(c6172d, null, replaceWithState, 23);
        arrayList.add(new C6600F(c6172dM6722a.f20094d, (ArrayList) this.f7437o0, (AbstractC7343b0) this.f7440r0, new C6617X(c6172dM6722a)));
        this.f7437o0 = new ArrayList();
        this.f7438p0 = null;
        this.f7440r0 = null;
    }

    /* JADX INFO: renamed from: H */
    public void m3536H(C3529e c3529e) {
        boolean z6;
        AbstractC8488H2.m9140a();
        C3535k c3535k = (C3535k) this.f7436Z;
        if (c3535k != null) {
            if (c3535k.f10689a == c3529e.f10670a) {
                C3537m c3537m = c3535k.f10695g;
                AbstractC8488H2.m9140a();
                if (c3537m.f10708g) {
                    return;
                }
                C3530f c3530f = c3537m.f10702a;
                AbstractC8488H2.m9140a();
                int i10 = c3530f.f10672a;
                if (i10 > 0) {
                    z6 = true;
                    c3530f.f10672a = i10 - 1;
                } else {
                    z6 = false;
                }
                C3124Q c3124q = c3529e.f10671b;
                if (!z6) {
                    AbstractC8488H2.m9140a();
                    c3530f.f10673b.execute(new RunnableC0074m(c3530f, 28, c3124q));
                }
                c3537m.m4219a();
                c3537m.f10706e.m10748b(c3124q);
                if (z6) {
                    C3539o c3539o = c3537m.f10703b;
                    c3539o.getClass();
                    AbstractC8488H2.m9140a();
                    AbstractC8072d6.m8486c("TakePictureManager", "Add a new request for retrying.");
                    c3539o.f10713Y.addFirst(c3530f);
                    c3539o.m4222c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m3537I(InterfaceC11112u interfaceC11112u) {
        synchronized (this.f7436Z) {
            try {
                if (m3568z(interfaceC11112u)) {
                    if (((ArrayDeque) this.f7439q0).isEmpty()) {
                        ((ArrayDeque) this.f7439q0).push(interfaceC11112u);
                    } else {
                        C1920j c1920j = (C1920j) this.f7440r0;
                        if (c1920j == null || c1920j.f5617o0 != 2) {
                            InterfaceC11112u interfaceC11112u2 = (InterfaceC11112u) ((ArrayDeque) this.f7439q0).peek();
                            if (!interfaceC11112u.equals(interfaceC11112u2)) {
                                m3541M(interfaceC11112u2);
                                ((ArrayDeque) this.f7439q0).remove(interfaceC11112u);
                                ((ArrayDeque) this.f7439q0).push(interfaceC11112u);
                            }
                        }
                    }
                    m3543O(interfaceC11112u);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m3538J(AbstractC8394f abstractC8394f) {
        List list = (List) AbstractC0575H.m1161I(C18777j.f59682Y, new C7504c(this, abstractC8394f, null));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC18770c) it.next()).resumeWith(abstractC8394f);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m3539K(InterfaceC11112u interfaceC11112u) {
        synchronized (this.f7436Z) {
            try {
                ((ArrayDeque) this.f7439q0).remove(interfaceC11112u);
                m3541M(interfaceC11112u);
                if (!((ArrayDeque) this.f7439q0).isEmpty()) {
                    m3543O((InterfaceC11112u) ((ArrayDeque) this.f7439q0).peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m3540L(AbstractC8394f abstractC8394f) {
        List list = (List) AbstractC0575H.m1161I(C18777j.f59682Y, new C7505d(this, abstractC8394f, null));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC18770c) it.next()).resumeWith(abstractC8394f);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m3541M(InterfaceC11112u interfaceC11112u) {
        synchronized (this.f7436Z) {
            try {
                C8407c c8407cM3564v = m3564v(interfaceC11112u);
                if (c8407cM3564v == null) {
                    return;
                }
                Iterator it = ((Set) ((HashMap) this.f7438p0).get(c8407cM3564v)).iterator();
                while (it.hasNext()) {
                    C8406b c8406b = (C8406b) ((HashMap) this.f7437o0).get((C8405a) it.next());
                    c8406b.getClass();
                    c8406b.m8952t();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m3542N() {
        synchronized (this.f7436Z) {
            try {
                Iterator it = ((HashMap) this.f7437o0).keySet().iterator();
                while (it.hasNext()) {
                    C8406b c8406b = (C8406b) ((HashMap) this.f7437o0).get((C8405a) it.next());
                    c8406b.m8953u();
                    m3539K(c8406b.m8949k());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m3543O(InterfaceC11112u interfaceC11112u) {
        synchronized (this.f7436Z) {
            try {
                Iterator it = ((Set) ((HashMap) this.f7438p0).get(m3564v(interfaceC11112u))).iterator();
                while (it.hasNext()) {
                    C8406b c8406b = (C8406b) ((HashMap) this.f7437o0).get((C8405a) it.next());
                    c8406b.getClass();
                    if (!c8406b.m8950l().isEmpty()) {
                        c8406b.m8954v();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p204I1.InterfaceC3603s
    /* JADX INFO: renamed from: a */
    public boolean mo3544a() {
        ArrayList arrayList = (ArrayList) this.f7440r0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C3602r) arrayList.get(i10)).f10975a.mo3544a()) {
                return true;
            }
        }
        return false;
    }

    @Override // p229J0.InterfaceC3923H4
    /* JADX INFO: renamed from: b */
    public C13796x mo3545b() {
        return (C13796x) this.f7438p0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p204I1.InterfaceC3603s
    /* JADX INFO: renamed from: c */
    public float mo3546c() {
        return ((Number) this.f7438p0.getValue()).floatValue();
    }

    @Override // p229J0.InterfaceC3923H4
    /* JADX INFO: renamed from: d */
    public InterfaceC13772l mo3547d() {
        return (InterfaceC13772l) this.f7437o0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p204I1.InterfaceC3603s
    /* JADX INFO: renamed from: e */
    public float mo3548e() {
        return ((Number) this.f7439q0.getValue()).floatValue();
    }

    @Override // p229J0.InterfaceC3923H4
    /* JADX INFO: renamed from: f */
    public boolean mo3549f() {
        return false;
    }

    @Override // p143Fd.InterfaceC2719i
    /* JADX INFO: renamed from: g */
    public List mo3550g(C1991h c1991h, EnumC6606L replaceInProgress) {
        AbstractC16544l.m18094g(replaceInProgress, "replaceInProgress");
        m3535G(replaceInProgress);
        return (ArrayList) this.f7439q0;
    }

    @Override // p229J0.InterfaceC3923H4
    public C3935J4 getState() {
        return (C3935J4) this.f7436Z;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014b  */
    /* JADX WARN: Code duplicated, block: B:101:0x014e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0155  */
    /* JADX WARN: Code duplicated, block: B:105:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x0160  */
    /* JADX WARN: Code duplicated, block: B:109:0x0167  */
    /* JADX WARN: Code duplicated, block: B:111:0x016b  */
    /* JADX WARN: Code duplicated, block: B:113:0x016f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0175  */
    /* JADX WARN: Code duplicated, block: B:116:0x0178  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f  */
    /* JADX WARN: Code duplicated, block: B:124:0x019f  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:69:0x0102  */
    /* JADX WARN: Code duplicated, block: B:71:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x010a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0117  */
    /* JADX WARN: Code duplicated, block: B:81:0x011e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0121  */
    /* JADX WARN: Code duplicated, block: B:85:0x0128  */
    /* JADX WARN: Code duplicated, block: B:86:0x012b  */
    /* JADX WARN: Code duplicated, block: B:88:0x012f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0137  */
    /* JADX WARN: Code duplicated, block: B:97:0x0144  */
    @Override // p143Fd.InterfaceC2719i
    /* JADX INFO: renamed from: h */
    public boolean mo3551h(C7351f0 c7351f0) {
        C6172d c6172d;
        String str;
        String strM21731r;
        String str2;
        String str3;
        String str4;
        EnumC6170b enumC6170b;
        EnumC6606L enumC6606L;
        C6172d c6172d2;
        C6172d c6172dM6722a;
        int iHashCode;
        int iHashCode2;
        C9463v c9463v;
        EnumC6606L enumC6606L2 = null;
        C9440I c9440i = c7351f0.f23300o;
        C9463v c9463v2 = c9440i != null ? c9440i.f28433d : null;
        C9433B c9433b = c9440i != null ? c9440i.f28434e : null;
        C1193x2 c1193x2 = c9440i != null ? c9440i.f28435f : null;
        String str5 = c7351f0.f23294i;
        EnumC7359j0 enumC7359j0 = c7351f0.f23290e;
        if (c1193x2 != null) {
            C6172d c6172d3 = (C6172d) this.f7438p0;
            if (!AbstractC16544l.m18089b(c6172d3 != null ? c6172d3.f20092b : null, str5)) {
                m3535G(EnumC6606L.f21328Z);
            }
            Integer num = c1193x2.f3149d;
            EnumC6606L enumC6606L3 = (num != null && num.intValue() == 200) ? EnumC6606L.f21328Z : EnumC6606L.f21330p0;
            C6172d c6172d4 = (C6172d) this.f7438p0;
            if (c6172d4 == null) {
                if (c9463v2 == null) {
                    c9463v2 = new C9463v(127, null, null, null, null);
                }
                EnumC6170b enumC6170b2 = EnumC6170b.f20085Y;
                c6172d4 = new C6172d(c9463v2, str5, enumC6606L2, 24);
            }
            this.f7438p0 = C6172d.m6722a(c6172d4, null, enumC6606L3, 23);
        } else if (c9463v2 != null) {
            C6172d c6172d5 = (C6172d) this.f7438p0;
            if (!c9463v2.equals(c6172d5 != null ? c6172d5.f20091a : null)) {
                C6172d c6172d6 = (C6172d) this.f7438p0;
                String str6 = (c6172d6 == null || (c9463v = c6172d6.f20091a) == null) ? null : c9463v.f28479a;
                if (str6 != null && !str6.equals("preview")) {
                    m3535G(EnumC6606L.f21328Z);
                }
                if (!AbstractC16544l.m18089b(c9463v2.f28479a, "denied_by_user")) {
                    EnumC6170b enumC6170b3 = !c9463v2.f28485g.isEmpty() ? EnumC6170b.f20088p0 : EnumC6170b.f20085Y;
                    EnumC6606L enumC6606L4 = EnumC6606L.f21327Y;
                    C17314q c17314q = (C17314q) this.f7436Z;
                    this.f7438p0 = new C6172d(c9463v2, c7351f0.f23294i, enumC6170b3, enumC6606L4, AbstractC16544l.m18089b((String) c17314q.getValue(), c9463v2.f28480b) && !AbstractC21322p.m21681O((String) c17314q.getValue()));
                }
            } else if (c9433b != null) {
                str4 = c9433b.f28415a;
                if (str4 == null) {
                    enumC6170b = EnumC6170b.f20088p0;
                } else {
                    iHashCode2 = str4.hashCode();
                    if (iHashCode2 != 3079692) {
                        if (iHashCode2 != 92906313) {
                            if (iHashCode2 != 1811836507) {
                                enumC6170b = EnumC6170b.f20088p0;
                            } else {
                                enumC6170b = EnumC6170b.f20086Z;
                            }
                        } else if (str4.equals("allow")) {
                            enumC6170b = EnumC6170b.f20086Z;
                        } else {
                            enumC6170b = EnumC6170b.f20088p0;
                        }
                    } else if (str4.equals("deny")) {
                        enumC6170b = EnumC6170b.f20087o0;
                    } else {
                        enumC6170b = EnumC6170b.f20088p0;
                    }
                }
                if (str4 == null) {
                    enumC6606L = EnumC6606L.f21327Y;
                } else {
                    iHashCode = str4.hashCode();
                    if (iHashCode != 3079692) {
                        if (iHashCode != 92906313) {
                            if (iHashCode != 1811836507) {
                                enumC6606L = EnumC6606L.f21327Y;
                            } else {
                                enumC6606L = EnumC6606L.f21328Z;
                            }
                        } else if (str4.equals("allow")) {
                            enumC6606L = EnumC6606L.f21327Y;
                        } else {
                            enumC6606L = EnumC6606L.f21327Y;
                        }
                    } else if (str4.equals("deny")) {
                        enumC6606L = EnumC6606L.f21329o0;
                    } else {
                        enumC6606L = EnumC6606L.f21327Y;
                    }
                }
                c6172d2 = (C6172d) this.f7438p0;
                if (c6172d2 != null) {
                    c6172dM6722a = C6172d.m6722a(c6172d2, enumC6170b, enumC6606L, 19);
                } else {
                    c6172dM6722a = null;
                }
                this.f7438p0 = c6172dM6722a;
            } else if (enumC7359j0 == EnumC7359j0.f23349t0) {
                c6172d = (C6172d) this.f7438p0;
                if (c6172d != null) {
                    str = c6172d.f20092b;
                } else {
                    str = null;
                }
                if (!AbstractC16544l.m18089b(str, str5)) {
                    if (str5 != null) {
                        strM21731r = null;
                    } else {
                        strM21731r = null;
                    }
                    if (str5 != null) {
                        str2 = (String) AbstractC17680n.m19353c0(AbstractC21322p.m21697e0(str5, new String[]{Separators.DOT}, 0, 6));
                    } else {
                        str2 = null;
                    }
                    m3535G(EnumC6606L.f21328Z);
                    C9463v c9463v3 = new C9463v(117, strM21731r, str2, null, null);
                    EnumC6170b enumC6170b4 = EnumC6170b.f20085Y;
                    this.f7438p0 = new C6172d(c9463v3, str5, AbstractC8042a0.m8417e(c7351f0), 16);
                }
            }
        } else if (c9433b != null) {
            str4 = c9433b.f28415a;
            if (str4 == null) {
                enumC6170b = EnumC6170b.f20088p0;
            } else {
                iHashCode2 = str4.hashCode();
                if (iHashCode2 != 3079692) {
                    if (iHashCode2 != 92906313) {
                        if (iHashCode2 != 1811836507 && str4.equals("oauth_success")) {
                            enumC6170b = EnumC6170b.f20086Z;
                        } else {
                            enumC6170b = EnumC6170b.f20088p0;
                        }
                    } else if (str4.equals("allow")) {
                        enumC6170b = EnumC6170b.f20088p0;
                    } else {
                        enumC6170b = EnumC6170b.f20086Z;
                    }
                } else if (str4.equals("deny")) {
                    enumC6170b = EnumC6170b.f20088p0;
                } else {
                    enumC6170b = EnumC6170b.f20087o0;
                }
            }
            if (str4 == null) {
                enumC6606L = EnumC6606L.f21327Y;
            } else {
                iHashCode = str4.hashCode();
                if (iHashCode != 3079692) {
                    if (iHashCode != 92906313) {
                        if (iHashCode != 1811836507 && str4.equals("oauth_success")) {
                            enumC6606L = EnumC6606L.f21328Z;
                        } else {
                            enumC6606L = EnumC6606L.f21327Y;
                        }
                    } else if (str4.equals("allow")) {
                        enumC6606L = EnumC6606L.f21327Y;
                    } else {
                        enumC6606L = EnumC6606L.f21327Y;
                    }
                } else if (str4.equals("deny")) {
                    enumC6606L = EnumC6606L.f21327Y;
                } else {
                    enumC6606L = EnumC6606L.f21329o0;
                }
            }
            c6172d2 = (C6172d) this.f7438p0;
            if (c6172d2 != null) {
                c6172dM6722a = C6172d.m6722a(c6172d2, enumC6170b, enumC6606L, 19);
            } else {
                c6172dM6722a = null;
            }
            this.f7438p0 = c6172dM6722a;
        } else if (enumC7359j0 == EnumC7359j0.f23349t0) {
            c6172d = (C6172d) this.f7438p0;
            if (c6172d != null) {
                str = c6172d.f20092b;
            } else {
                str = null;
            }
            if (!AbstractC16544l.m18089b(str, str5)) {
                if (str5 != null || (str3 = (String) AbstractC17680n.m19343S(AbstractC21322p.m21697e0(str5, new String[]{"__"}, 0, 6))) == null) {
                    strM21731r = null;
                } else {
                    strM21731r = AbstractC21329w.m21731r(str3, "_", Separators.DOT);
                }
                if (str5 != null) {
                    str2 = (String) AbstractC17680n.m19353c0(AbstractC21322p.m21697e0(str5, new String[]{Separators.DOT}, 0, 6));
                } else {
                    str2 = null;
                }
                m3535G(EnumC6606L.f21328Z);
                C9463v c9463v4 = new C9463v(117, strM21731r, str2, null, null);
                EnumC6170b enumC6170b5 = EnumC6170b.f20085Y;
                this.f7438p0 = new C6172d(c9463v4, str5, AbstractC8042a0.m8417e(c7351f0), 16);
            }
        }
        ((ArrayList) this.f7437o0).add(c7351f0);
        if (!AbstractC8042a0.m8419g(c7351f0) && !AbstractC8042a0.m8418f(c7351f0) && c1193x2 == null) {
            return false;
        }
        if (enumC7359j0 == EnumC7359j0.f23344o0) {
            this.f7440r0 = c7351f0.f23291f;
        }
        C6172d c6172d7 = (C6172d) this.f7438p0;
        if (c6172d7 != null) {
            int iOrdinal = AbstractC8042a0.m8417e(c7351f0).ordinal();
            EnumC6606L enumC6606L5 = c6172d7.f20094d;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    enumC6606L5 = EnumC6606L.f21329o0;
                } else if (iOrdinal == 3) {
                    enumC6606L5 = EnumC6606L.f21330p0;
                }
            } else if (enumC6606L5 == EnumC6606L.f21327Y) {
                enumC6606L5 = EnumC6606L.f21328Z;
            }
            this.f7438p0 = C6172d.m6722a(c6172d7, null, enumC6606L5, 23);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX INFO: renamed from: i */
    public Bidi m3552i(int i10) {
        Bidi bidi;
        boolean[] zArr = (boolean[]) this.f7439q0;
        boolean z6 = zArr[i10];
        ArrayList arrayList = (ArrayList) this.f7438p0;
        if (z6) {
            return (Bidi) arrayList.get(i10);
        }
        ArrayList arrayList2 = (ArrayList) this.f7437o0;
        int iIntValue = i10 == 0 ? 0 : ((Number) arrayList2.get(i10 - 1)).intValue();
        int iIntValue2 = ((Number) arrayList2.get(i10)).intValue();
        int i11 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f7440r0;
        if (cArr == null || cArr.length < i11) {
            cArr = new char[i11];
        }
        char[] cArr2 = cArr;
        Layout layout = (Layout) this.f7436Z;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i11)) {
            bidi = new Bidi(cArr2, 0, null, 0, i11, layout.getParagraphDirection(layout.getLineForOffset(m3567y(i10))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList.set(i10, bidi);
        zArr[i10] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f7440r0;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f7440r0 = cArr2;
        return bidi;
    }

    /* JADX INFO: renamed from: j */
    public Object m3553j(AbstractC19694j abstractC19694j) throws Throwable {
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(abstractC19694j));
        c0624m.m1262r();
        AbstractC8394f abstractC8394f = (AbstractC8394f) this.f7437o0;
        if (abstractC8394f != null) {
            c0624m.resumeWith(abstractC8394f);
        } else {
            AbstractC0575H.m1161I(C18777j.f59682Y, new C7502a(this, c0624m, null));
        }
        Object objM1261q = c0624m.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1261q;
    }

    /* JADX INFO: renamed from: k */
    public Object m3554k(AbstractC19694j abstractC19694j) throws Throwable {
        C18778k c18778k = new C18778k(AbstractC8154o0.m8714e(abstractC19694j));
        AbstractC8394f abstractC8394f = (AbstractC8394f) this.f7439q0;
        if (abstractC8394f != null) {
            c18778k.resumeWith(abstractC8394f);
        } else {
            AbstractC0575H.m1161I(C18777j.f59682Y, new C7503b(this, c18778k, null));
        }
        Object objM20051a = c18778k.m20051a();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM20051a;
    }

    /* JADX INFO: renamed from: l */
    public void m3555l(C8406b c8406b, List list, Collection collection, C1920j c1920j) {
        synchronized (this.f7436Z) {
            try {
                boolean z6 = true;
                AbstractC4941g.m5555N(!collection.isEmpty());
                this.f7440r0 = c1920j;
                InterfaceC11112u interfaceC11112uM8949k = c8406b.m8949k();
                C8407c c8407cM3564v = m3564v(interfaceC11112uM8949k);
                if (c8407cM3564v == null) {
                    return;
                }
                Set set = (Set) ((HashMap) this.f7438p0).get(c8407cM3564v);
                C1920j c1920j2 = (C1920j) this.f7440r0;
                if (c1920j2 == null || c1920j2.f5617o0 != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        C8406b c8406b2 = (C8406b) ((HashMap) this.f7437o0).get((C8405a) it.next());
                        c8406b2.getClass();
                        if (!c8406b2.equals(c8406b) && !c8406b2.m8950l().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    c8406b.f26135o0.m5962I();
                    c8406b.f26135o0.m5961G(list);
                    c8406b.m8948j(collection);
                    if (interfaceC11112uM8949k.mo7809i().mo7807b().compareTo(EnumC11104m.f33477p0) < 0) {
                        z6 = false;
                    }
                    if (z6) {
                        m3537I(interfaceC11112uM8949k);
                    }
                } catch (C5563e e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public C3832e m3556m() {
        String strM11052j = ((AbstractC3810L) this.f7436Z) == null ? " surface" : "";
        if (((List) this.f7437o0) == null) {
            strM11052j = strM11052j.concat(" sharedSurfaces");
        }
        if (((Integer) this.f7438p0) == null) {
            strM11052j = AbstractC10763a.m11052j(strM11052j, " mirrorMode");
        }
        if (((Integer) this.f7439q0) == null) {
            strM11052j = AbstractC10763a.m11052j(strM11052j, " surfaceGroupId");
        }
        if (((C3175v) this.f7440r0) == null) {
            strM11052j = AbstractC10763a.m11052j(strM11052j, " dynamicRange");
        }
        if (strM11052j.isEmpty()) {
            return new C3832e((AbstractC3810L) this.f7436Z, (List) this.f7437o0, ((Integer) this.f7438p0).intValue(), ((Integer) this.f7439q0).intValue(), (C3175v) this.f7440r0);
        }
        throw new IllegalStateException("Missing required properties:".concat(strM11052j));
    }

    /* JADX INFO: renamed from: o */
    public void m3558o() {
        AbstractC8488H2.m9140a();
        C2392v c2392v = (C2392v) this.f7438p0;
        c2392v.getClass();
        AbstractC8488H2.m9140a();
        C3525a c3525a = (C3525a) c2392v.f7439q0;
        Objects.requireNonNull(c3525a);
        C3150i0 c3150i0 = (C3150i0) c2392v.f7437o0;
        Objects.requireNonNull(c3150i0);
        C3150i0 c3150i1 = null;
        C3162o0 c3162o0 = c3525a.f10654b;
        Objects.requireNonNull(c3162o0);
        c3162o0.mo4507a();
        C3162o0 c3162o1 = c3525a.f10654b;
        Objects.requireNonNull(c3162o1);
        AbstractC5229k.m5780d(c3162o1.f11530e).mo5766a(new RunnableC0046X0(c3150i0, 1), AbstractC8577W2.m9243e());
        C3162o0 c3162o2 = c3525a.f10655c;
        if (c3162o2 != null) {
            c3162o2.mo4507a();
            AbstractC5229k.m5780d(c3525a.f10655c.f11530e).mo5766a(new RunnableC0046X0(c3150i1, 2), AbstractC8577W2.m9243e());
        }
        ((C1546Y) this.f7439q0).getClass();
    }

    @Override // livekit.org.webrtc.SdpObserver
    public void onCreateFailure(String str) {
        m3538J(new C8393e(str));
    }

    @Override // livekit.org.webrtc.SdpObserver
    public void onCreateSuccess(SessionDescription sessionDescription) {
        m3538J(sessionDescription == null ? new C8393e("empty sdp") : new C8392d(sessionDescription));
    }

    @Override // livekit.org.webrtc.SdpObserver
    public void onSetFailure(String str) {
        m3540L(new C8393e(str));
    }

    @Override // livekit.org.webrtc.SdpObserver
    public void onSetSuccess() {
        m3540L(new C8392d(C17296C.f55119a));
    }

    /* JADX INFO: renamed from: p */
    public void m3559p(InterfaceC3870x interfaceC3870x, InterfaceC3870x interfaceC3870x2, C6778l c6778l, C6778l c6778l2, Map.Entry entry) {
        C6778l c6778l3 = (C6778l) entry.getValue();
        C3145g c3145g = new C3145g(c6778l.f21768g.f11606a, ((C6970a) entry.getKey()).f22281a.f22777d, c6778l.f21764c ? interfaceC3870x : null, ((C6970a) entry.getKey()).f22281a.f22779f, ((C6970a) entry.getKey()).f22281a.f22780g);
        C3145g c3145g2 = new C3145g(c6778l2.f21768g.f11606a, ((C6970a) entry.getKey()).f22282b.f22777d, c6778l2.f21764c ? interfaceC3870x2 : null, ((C6970a) entry.getKey()).f22282b.f22779f, ((C6970a) entry.getKey()).f22282b.f22780g);
        C7166b c7166b = ((C6970a) entry.getKey()).f22281a;
        c6778l3.getClass();
        AbstractC8488H2.m9140a();
        c6778l3.m7223a();
        AbstractC4941g.m5559R("Consumer can only be linked once.", !c6778l3.f21771j);
        c6778l3.f21771j = true;
        C6777k c6777k = c6778l3.f21773l;
        RunnableC5220b runnableC5220bM5782f = AbstractC5229k.m5782f(c6777k.m4509c(), new C6776j(c6778l3, c6777k, c7166b.f22776c, c3145g, c3145g2), AbstractC8577W2.m9243e());
        runnableC5220bM5782f.mo5766a(new RunnableC5228j(runnableC5220bM5782f, 0, new C11248s(this, 12, c6778l3)), AbstractC8577W2.m9243e());
    }

    /* JADX INFO: renamed from: r */
    public C8406b m3560r(InterfaceC11112u interfaceC11112u, C5565g c5565g) {
        synchronized (this.f7436Z) {
            try {
                AbstractC4941g.m5554M("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", ((HashMap) this.f7437o0).get(new C8405a(interfaceC11112u, c5565g.f18045q0)) == null);
                C8406b c8406b = new C8406b(interfaceC11112u, c5565g);
                if (((ArrayList) c5565g.m5956A()).isEmpty()) {
                    c8406b.m8952t();
                }
                if (interfaceC11112u.mo7809i().mo7807b() == EnumC11104m.f33474Y) {
                    return c8406b;
                }
                m3533E(c8406b);
                return c8406b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public float m3562t(int i10, boolean z6) {
        Layout layout = (Layout) this.f7436Z;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i10));
        if (i10 > lineEnd) {
            i10 = lineEnd;
        }
        return z6 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
    }

    /* JADX INFO: renamed from: u */
    public float m3563u(int i10, boolean z6, boolean z10) {
        int i11;
        int i12;
        int iM3529A = i10;
        if (!z10) {
            return m3562t(i10, z6);
        }
        Layout layout = (Layout) this.f7436Z;
        int iM4891c = AbstractC4194u.m4891c(layout, iM3529A, z10);
        int lineStart = layout.getLineStart(iM4891c);
        int lineEnd = layout.getLineEnd(iM4891c);
        if (iM3529A != lineStart && iM3529A != lineEnd) {
            return m3562t(i10, z6);
        }
        if (iM3529A == 0 || iM3529A == layout.getText().length()) {
            return m3562t(i10, z6);
        }
        int iM3566x = m3566x(iM3529A, z10);
        boolean z11 = layout.getParagraphDirection(layout.getLineForOffset(m3567y(iM3566x))) == -1;
        int iM3529A2 = m3529A(lineEnd, lineStart);
        int iM3567y = m3567y(iM3566x);
        int i13 = lineStart - iM3567y;
        int i14 = iM3529A2 - iM3567y;
        Bidi bidiM3552i = m3552i(iM3566x);
        Bidi bidiCreateLineBidi = bidiM3552i != null ? bidiM3552i.createLineBidi(i13, i14) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z6 || z11 == zIsRtlCharAt) {
                z11 = !z11;
            }
            return iM3529A == lineStart ? z11 : !z11 ? layout.getLineLeft(iM4891c) : layout.getLineRight(iM4891c);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        C4187n[] c4187nArr = new C4187n[runCount];
        for (int i15 = 0; i15 < runCount; i15++) {
            c4187nArr[i15] = new C4187n(bidiCreateLineBidi.getRunStart(i15) + lineStart, bidiCreateLineBidi.getRunLimit(i15) + lineStart, bidiCreateLineBidi.getRunLevel(i15) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i16 = 0; i16 < runCount2; i16++) {
            bArr[i16] = (byte) bidiCreateLineBidi.getRunLevel(i16);
        }
        Bidi.reorderVisually(bArr, 0, c4187nArr, 0, runCount);
        if (iM3529A == lineStart) {
            int i17 = 0;
            while (true) {
                if (i17 >= runCount) {
                    i12 = -1;
                    break;
                }
                if (c4187nArr[i17].f13600a == iM3529A) {
                    i12 = i17;
                    break;
                }
                i17++;
            }
            boolean z12 = (z6 || z11 == c4187nArr[i12].f13602c) ? !z11 : z11;
            if (i12 == 0 && z12) {
                return layout.getLineLeft(iM4891c);
            }
            if (i12 != runCount - 1 || z12) {
                return z12 ? layout.getPrimaryHorizontal(c4187nArr[i12 - 1].f13600a) : layout.getPrimaryHorizontal(c4187nArr[i12 + 1].f13600a);
            }
            return layout.getLineRight(iM4891c);
        }
        if (iM3529A > iM3529A2) {
            iM3529A = m3529A(iM3529A, lineStart);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= runCount) {
                i11 = -1;
                break;
            }
            if (c4187nArr[i18].f13601b == iM3529A) {
                i11 = i18;
                break;
            }
            i18++;
        }
        boolean z13 = (z6 || z11 == c4187nArr[i11].f13602c) ? z11 : !z11;
        if (i11 == 0 && z13) {
            return layout.getLineLeft(iM4891c);
        }
        if (i11 != runCount - 1 || z13) {
            return z13 ? layout.getPrimaryHorizontal(c4187nArr[i11 - 1].f13601b) : layout.getPrimaryHorizontal(c4187nArr[i11 + 1].f13601b);
        }
        return layout.getLineRight(iM4891c);
    }

    /* JADX INFO: renamed from: v */
    public C8407c m3564v(InterfaceC11112u interfaceC11112u) {
        synchronized (this.f7436Z) {
            try {
                for (C8407c c8407c : ((HashMap) this.f7438p0).keySet()) {
                    if (interfaceC11112u.equals(c8407c.f26138Z)) {
                        return c8407c;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public Collection m3565w() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.f7436Z) {
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(((HashMap) this.f7437o0).values());
        }
        return collectionUnmodifiableCollection;
    }

    /* JADX INFO: renamed from: x */
    public int m3566x(int i10, boolean z6) {
        ArrayList arrayList = (ArrayList) this.f7437o0;
        int iM19379h = AbstractC17681o.m19379h(arrayList, Integer.valueOf(i10));
        int i11 = iM19379h < 0 ? -(iM19379h + 1) : iM19379h + 1;
        if (z6 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) arrayList.get(i12)).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: y */
    public int m3567y(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f7437o0).get(i10 - 1)).intValue();
    }

    /* JADX INFO: renamed from: z */
    public boolean m3568z(InterfaceC11112u interfaceC11112u) {
        synchronized (this.f7436Z) {
            try {
                C8407c c8407cM3564v = m3564v(interfaceC11112u);
                if (c8407cM3564v == null) {
                    return false;
                }
                Iterator it = ((Set) ((HashMap) this.f7438p0).get(c8407cM3564v)).iterator();
                while (it.hasNext()) {
                    C8406b c8406b = (C8406b) ((HashMap) this.f7437o0).get((C8405a) it.next());
                    c8406b.getClass();
                    if (!c8406b.m8950l().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ C2392v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f7435Y = i10;
        this.f7436Z = obj;
        this.f7437o0 = obj2;
        this.f7438p0 = obj3;
        this.f7439q0 = obj4;
        this.f7440r0 = obj5;
    }

    /* JADX INFO: renamed from: n */
    public C3836g m3557n() {
        String strM11052j = ((Size) this.f7436Z) == null ? sVoFrD.FqxZxWKVhx : "";
        if (((C3175v) this.f7437o0) == null) {
            strM11052j = strM11052j.concat(" dynamicRange");
        }
        if (((Range) this.f7438p0) == null) {
            strM11052j = AbstractC10763a.m11052j(strM11052j, " expectedFrameRateRange");
        }
        if (((Boolean) this.f7440r0) == null) {
            strM11052j = AbstractC10763a.m11052j(strM11052j, " zslDisabled");
        }
        if (strM11052j.isEmpty()) {
            return new C3836g((Size) this.f7436Z, (C3175v) this.f7437o0, (Range) this.f7438p0, (C21572a) this.f7439q0, ((Boolean) this.f7440r0).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strM11052j));
    }

    public String toString() {
        switch (this.f7435Y) {
            case 2:
                return "OutputFileOptions{mFile=" + ((File) this.f7436Z) + ", mContentResolver=" + ((ContentResolver) this.f7437o0) + WGTYqNchEpHca.AFOaw + ((Uri) this.f7438p0) + ", mContentValues=" + ((ContentValues) this.f7439q0) + ", mOutputStream=null, mMetadata=" + ((C3130X) this.f7440r0) + "}";
            default:
                return super.toString();
        }
    }

    public C2392v(C13969n2 c13969n2) {
        this.f7435Y = 1;
        this.f7436Z = AbstractC9227W.m9800c(new C0130g(c13969n2, 22));
        this.f7437o0 = new ArrayList();
        this.f7439q0 = new ArrayList();
    }

    /* JADX INFO: renamed from: s */
    public int m3561s() {
        boolean z6;
        int iMo350t;
        AbstractC8488H2.m9140a();
        if (((C3150i0) this.f7437o0) != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        AbstractC4941g.m5559R(anhfj.AeNuW, z6);
        C3150i0 c3150i0 = (C3150i0) this.f7437o0;
        synchronized (c3150i0.f9475Y) {
            iMo350t = c3150i0.f9478p0.mo350t() - c3150i0.f9476Z;
        }
        return iMo350t;
    }

    public C2392v(int i10) {
        this.f7435Y = i10;
        switch (i10) {
            case 17:
                this.f7436Z = new C21346q();
                this.f7437o0 = AbstractC0575H.m1174c(AbstractC5695b.m6138e(AbstractC0575H.m1176e(), new C0841y(C0565C.f1783Y, 3)));
                ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
                AbstractC16544l.m18093f(executorServiceNewCachedThreadPool, "newCachedThreadPool()");
                this.f7438p0 = new C0611f0(executorServiceNewCachedThreadPool);
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                AbstractC16544l.m18093f(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
                this.f7439q0 = new C0611f0(executorServiceNewSingleThreadExecutor);
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
                AbstractC16544l.m18093f(executorServiceNewFixedThreadPool, "newFixedThreadPool(2)");
                this.f7440r0 = new C0611f0(executorServiceNewFixedThreadPool);
                break;
            case 18:
                this.f7436Z = new Object();
                this.f7437o0 = new HashMap();
                this.f7438p0 = new HashMap();
                this.f7439q0 = new ArrayDeque();
                break;
            default:
                this.f7436Z = AbstractC4817d.m5451a();
                this.f7438p0 = new ArrayList();
                this.f7440r0 = new ArrayList();
                break;
        }
    }

    public C2392v(Layout layout) {
        this.f7435Y = 9;
        this.f7436Z = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM21678L = AbstractC21322p.m21678L(((Layout) this.f7436Z).getText(), '\n', length, false, 4);
            length = iM21678L < 0 ? ((Layout) this.f7436Z).getText().length() : iM21678L + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f7436Z).getText().length());
        this.f7437o0 = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f7438p0 = arrayList2;
        this.f7439q0 = new boolean[((ArrayList) this.f7437o0).size()];
        ((ArrayList) this.f7437o0).size();
    }

    public C2392v(Drawable.Callback callback) {
        this.f7435Y = 25;
        this.f7436Z = new C10514i(0);
        this.f7438p0 = new HashMap();
        this.f7439q0 = new HashMap();
        this.f7437o0 = ".ttf";
        if (!(callback instanceof View)) {
            AbstractC14413b.m15913b("LottieDrawable must be inside of a view for images to work.");
            this.f7440r0 = null;
        } else {
            this.f7440r0 = ((View) callback).getContext().getAssets();
        }
    }

    public C2392v(C19341c1 c19341c1) {
        this.f7435Y = 26;
        this.f7436Z = (C10752f) c19341c1.f61254Y;
        this.f7437o0 = (C15370i) c19341c1.f61256o0;
        this.f7438p0 = (C2685e) c19341c1.f61257p0;
        this.f7439q0 = (C8258a) c19341c1.f61258q0;
        this.f7440r0 = (C18655i) c19341c1.f61260s0;
    }

    public C2392v(C7022a c7022a, String str, HashMap map) {
        this.f7435Y = 13;
        this.f7436Z = c7022a;
        this.f7438p0 = str;
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        this.f7437o0 = strEncodeToString;
        byte[] bytes = strEncodeToString.getBytes(StandardCharsets.US_ASCII);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            this.f7439q0 = Base64.encodeToString(messageDigest.digest(), 11);
            this.f7440r0 = map;
        } catch (NoSuchAlgorithmException e10) {
            AbstractC15256t.m16466d("e", "Failed to get SHA-256 signature", e10);
            throw new IllegalStateException("Failed to get SHA-256 signature", e10);
        }
    }

    public C2392v(C3590f c3590f, C3582M c3582m, List list, InterfaceC7537b interfaceC7537b, InterfaceC5598n interfaceC5598n) {
        C3604t c3604t;
        String strSubstring;
        int i10;
        int i11;
        C3590f c3590f2 = c3590f;
        this.f7435Y = 5;
        this.f7436Z = c3590f2;
        this.f7437o0 = list;
        EnumC17307j enumC17307j = EnumC17307j.f55134Z;
        this.f7438p0 = AbstractC9227W.m9799b(enumC17307j, new C3600p(this, 1));
        this.f7439q0 = AbstractC9227W.m9799b(enumC17307j, new C3600p(this, 0));
        C3590f c3590f3 = AbstractC3591g.f10938a;
        int length = c3590f2.f10934Y.length();
        List list2 = c3590f2.f10936o0;
        list2 = list2 == null ? C17689w.f56480Y : list2;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            c3604t = c3582m.f10911b;
            if (i12 >= size) {
                break;
            }
            C3588d c3588d = (C3588d) list2.get(i12);
            C3604t c3604t2 = (C3604t) c3588d.f10930a;
            int i14 = c3588d.f10931b;
            if (i14 != i13) {
                arrayList.add(new C3588d(c3604t, i13, i14));
            }
            C3604t c3604tM4320a = c3604t.m4320a(c3604t2);
            int i15 = c3588d.f10932c;
            arrayList.add(new C3588d(c3604tM4320a, i14, i15));
            i12++;
            i13 = i15;
        }
        if (i13 != length) {
            arrayList.add(new C3588d(c3604t, i13, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C3588d(c3604t, 0, 0));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i16 = 0;
        while (i16 < size2) {
            C3588d c3588d2 = (C3588d) arrayList.get(i16);
            int i17 = c3588d2.f10931b;
            int i18 = c3588d2.f10932c;
            if (i17 != i18) {
                strSubstring = c3590f2.f10934Y.substring(i17, i18);
                AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = "";
            }
            C3590f c3590f4 = new C3590f(strSubstring, AbstractC3591g.m4303b(c3590f2, i17, i18), null, null);
            C3604t c3604t3 = (C3604t) c3588d2.f10930a;
            if (C7201k.m7598a(c3604t3.f10979b, Integer.MIN_VALUE)) {
                c3604t3 = new C3604t(c3604t3.f10978a, c3604t.f10979b, c3604t3.f10980c, c3604t3.f10981d, c3604t3.f10982e, c3604t3.f10983f, c3604t3.f10984g, c3604t3.f10985h, c3604t3.f10986i);
            }
            C3582M c3582m2 = new C3582M(c3582m.f10910a, c3604t.m4320a(c3604t3));
            List listM4299b = c3590f4.m4299b();
            List list3 = (List) this.f7437o0;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            int i19 = 0;
            while (true) {
                i10 = c3588d2.f10931b;
                if (i19 >= size3) {
                    break;
                }
                Object obj = list3.get(i19);
                C3588d c3588d3 = (C3588d) obj;
                int i20 = i18;
                if (AbstractC3591g.m4304c(i10, i20, c3588d3.f10931b, c3588d3.f10932c)) {
                    arrayList3.add(obj);
                }
                i19++;
                i18 = i20;
            }
            int i21 = i18;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size4 = arrayList3.size();
            for (int i22 = 0; i22 < size4; i22++) {
                C3588d c3588d4 = (C3588d) arrayList3.get(i22);
                int i23 = c3588d4.f10931b;
                if (i10 <= i23 && (i11 = c3588d4.f10932c) <= i21) {
                    arrayList4.add(new C3588d(c3588d4.f10930a, i23 - i10, i11 - i10));
                } else {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
                }
            }
            C3602r c3602r = new C3602r(new C6551c(strSubstring, c3582m2, listM4299b, arrayList4, interfaceC5598n, interfaceC7537b), i10, i21);
            ArrayList arrayList5 = arrayList2;
            arrayList5.add(c3602r);
            i16++;
            size2 = size2;
            arrayList2 = arrayList5;
            arrayList = arrayList;
            c3590f2 = c3590f;
        }
        this.f7440r0 = arrayList2;
    }

    public C2392v(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f7435Y = 0;
        this.f7439q0 = new ArrayDeque();
        this.f7436Z = sharedPreferences;
        this.f7437o0 = "topic_operation_queue";
        this.f7438p0 = Separators.COMMA;
        this.f7440r0 = scheduledThreadPoolExecutor;
    }

    public C2392v(InterfaceC3870x interfaceC3870x, InterfaceC3870x interfaceC3870x2, InterfaceC6780n interfaceC6780n) {
        this.f7435Y = 11;
        this.f7437o0 = interfaceC3870x;
        this.f7438p0 = interfaceC3870x2;
        this.f7436Z = interfaceC6780n;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0080  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00db  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:36:0x0121  */
    /* JADX WARN: Code duplicated, block: B:37:0x0123  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b9  */
    public C2392v(C3815Q c3815q, Size size, boolean z6) {
        int iIntValue;
        int i10;
        C3525a c3525a;
        boolean z10;
        AbstractC3842j c3131y;
        InterfaceC0310a interfaceC0310a;
        InterfaceC3820W interfaceC3820W;
        boolean z11;
        List listAsList;
        AbstractC3842j c3846l;
        final int i11 = 2;
        final int i12 = 1;
        this.f7435Y = 4;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        AbstractC8488H2.m9140a();
        this.f7436Z = c3815q;
        C0028O c0028o = (C0028O) c3815q.mo36M(InterfaceC3800E0.f11499y, null);
        if (c0028o != null) {
            C0063g0 c0063g0 = new C0063g0();
            c0028o.mo16a(c3815q, c0063g0);
            this.f7437o0 = c0063g0.m244d();
            final C2392v c2392v = new C2392v(3, z12);
            c2392v.f7436Z = null;
            c2392v.f7440r0 = null;
            this.f7438p0 = c2392v;
            Executor executor = (Executor) c3815q.mo36M(InterfaceC5566h.f18055P, AbstractC8577W2.m9242d());
            Objects.requireNonNull(executor);
            final C1546Y c1546y = new C1546Y(executor);
            this.f7439q0 = c1546y;
            int inputFormat = c3815q.getInputFormat();
            Integer num = (Integer) c3815q.mo36M(C3815Q.f11551q0, null);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                Integer num2 = (Integer) c3815q.mo36M(InterfaceC3816S.f11560j, null);
                if (num2 == null || num2.intValue() != 4101) {
                    iIntValue = 256;
                } else {
                    i10 = 4101;
                }
                if (c3815q.mo36M(C3815Q.f11553s0, null) == null) {
                    C6772f c6772f = new C6772f();
                    C6772f c6772f2 = new C6772f();
                    int i13 = i10;
                    c3525a = new C3525a(size, inputFormat, i10, z6, c6772f, c6772f2);
                    this.f7440r0 = c3525a;
                    if (((C3525a) c2392v.f7439q0) == null || ((C3150i0) c2392v.f7437o0) != null) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    AbstractC4941g.m5559R("CaptureNode does not support recreation yet.", z10);
                    c2392v.f7439q0 = c3525a;
                    c3131y = new C3131Y(c2392v, i12);
                    if (!z6) {
                        C3132Z c3132z = new C3132Z(size.getWidth(), size.getHeight(), inputFormat, 4);
                        listAsList = Arrays.asList(c3131y, c3132z.f9420Z);
                        if (listAsList.isEmpty()) {
                            c3846l = new C3846l();
                        } else {
                            if (listAsList.size() == 1) {
                                c3846l = (AbstractC3842j) listAsList.get(0);
                            } else {
                                c3131y = new C3844k(listAsList);
                            }
                            final boolean z15 = z14 ? 1 : 0;
                            interfaceC0310a = new InterfaceC0310a(c2392v) { // from class: I.h

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ C2392v f10683b;

                                {
                                    this.f10683b = c2392v;
                                }

                                @Override // p004A2.InterfaceC0310a
                                public final void accept(Object obj) {
                                    switch (z15) {
                                        case 0:
                                            this.f10683b.m3531C((C3535k) obj);
                                            break;
                                        case 1:
                                            C3535k c3535k = (C3535k) obj;
                                            C2392v c2392v2 = this.f10683b;
                                            c2392v2.m3531C(c3535k);
                                            C11241l c11241l = (C11241l) c2392v2.f7440r0;
                                            AbstractC4941g.m5559R("Pending request should be null", ((C3535k) c11241l.f34017Z) == null);
                                            c11241l.f34017Z = c3535k;
                                            break;
                                        default:
                                            this.f10683b.m3536H((C3529e) obj);
                                            break;
                                    }
                                }
                            };
                            interfaceC3820W = c3132z;
                        }
                        c3131y = c3846l;
                        final int z16 = z14 ? 1 : 0;
                        interfaceC0310a = new InterfaceC0310a(c2392v) { // from class: I.h

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ C2392v f10683b;

                            {
                                this.f10683b = c2392v;
                            }

                            @Override // p004A2.InterfaceC0310a
                            public final void accept(Object obj) {
                                switch (z16) {
                                    case 0:
                                        this.f10683b.m3531C((C3535k) obj);
                                        break;
                                    case 1:
                                        C3535k c3535k = (C3535k) obj;
                                        C2392v c2392v2 = this.f10683b;
                                        c2392v2.m3531C(c3535k);
                                        C11241l c11241l = (C11241l) c2392v2.f7440r0;
                                        AbstractC4941g.m5559R("Pending request should be null", ((C3535k) c11241l.f34017Z) == null);
                                        c11241l.f34017Z = c3535k;
                                        break;
                                    default:
                                        this.f10683b.m3536H((C3529e) obj);
                                        break;
                                }
                            }
                        };
                        interfaceC3820W = c3132z;
                    } else {
                        C0093v0 c0093v0M8472c = AbstractC8064c6.m8472c(size.getWidth(), size.getHeight(), inputFormat, 4);
                        C11241l c11241l = new C11241l();
                        c11241l.f34016Y = c0093v0M8472c;
                        c2392v.f7440r0 = c11241l;
                        interfaceC0310a = new InterfaceC0310a(c2392v) { // from class: I.h

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ C2392v f10683b;

                            {
                                this.f10683b = c2392v;
                            }

                            @Override // p004A2.InterfaceC0310a
                            public final void accept(Object obj) {
                                switch (i12) {
                                    case 0:
                                        this.f10683b.m3531C((C3535k) obj);
                                        break;
                                    case 1:
                                        C3535k c3535k = (C3535k) obj;
                                        C2392v c2392v2 = this.f10683b;
                                        c2392v2.m3531C(c3535k);
                                        C11241l c11241l2 = (C11241l) c2392v2.f7440r0;
                                        AbstractC4941g.m5559R("Pending request should be null", ((C3535k) c11241l2.f34017Z) == null);
                                        c11241l2.f34017Z = c3535k;
                                        break;
                                    default:
                                        this.f10683b.m3536H((C3529e) obj);
                                        break;
                                }
                            }
                        };
                        interfaceC3820W = c11241l;
                    }
                    c3525a.f10653a = c3131y;
                    Surface surface = interfaceC3820W.getSurface();
                    Objects.requireNonNull(surface);
                    if (c3525a.f10654b == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC4941g.m5559R("The surface is already set.", z11);
                    c3525a.f10654b = new C3162o0(surface, size, inputFormat);
                    c2392v.f7437o0 = new C3150i0(interfaceC3820W);
                    interfaceC3820W.mo347p(new C0072l(c2392v, 28), AbstractC8577W2.m9243e());
                    c6772f.f21735b = interfaceC0310a;
                    c6772f2.f21735b = new InterfaceC0310a(c2392v) { // from class: I.h

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C2392v f10683b;

                        {
                            this.f10683b = c2392v;
                        }

                        @Override // p004A2.InterfaceC0310a
                        public final void accept(Object obj) {
                            switch (i11) {
                                case 0:
                                    this.f10683b.m3531C((C3535k) obj);
                                    break;
                                case 1:
                                    C3535k c3535k = (C3535k) obj;
                                    C2392v c2392v2 = this.f10683b;
                                    c2392v2.m3531C(c3535k);
                                    C11241l c11241l2 = (C11241l) c2392v2.f7440r0;
                                    AbstractC4941g.m5559R("Pending request should be null", ((C3535k) c11241l2.f34017Z) == null);
                                    c11241l2.f34017Z = c3535k;
                                    break;
                                default:
                                    this.f10683b.m3536H((C3529e) obj);
                                    break;
                            }
                        }
                    };
                    C6772f c6772f3 = new C6772f();
                    C6772f c6772f4 = new C6772f();
                    C3527c c3527c = new C3527c(c6772f3, c6772f4, inputFormat, i13);
                    c2392v.f7438p0 = c3527c;
                    c1546y.f4239c = c3527c;
                    final boolean z17 = z13 ? 1 : 0;
                    c6772f3.f21735b = new InterfaceC0310a() { // from class: I.i
                        @Override // p004A2.InterfaceC0310a
                        public final void accept(Object obj) throws Exception {
                            final C3528d c3528d = (C3528d) obj;
                            switch (z17) {
                                case 0:
                                    final C1546Y c1546y2 = c1546y;
                                    if (!c3528d.f10668a.f10695g.f10708g) {
                                        final int i14 = 1;
                                        ((Executor) c1546y2.f4238b).execute(new Runnable() { // from class: I.j
                                            @Override // java.lang.Runnable
                                            public final void run() throws Exception {
                                                switch (i14) {
                                                    case 0:
                                                        C1546Y c1546y3 = c1546y2;
                                                        int i15 = ((C3527c) c1546y3.f4239c).f10667d;
                                                        AbstractC4941g.m5554M("Postview only support YUV and JPEG output formats. Output format: " + i15, i15 == 35 || i15 == 256);
                                                        C3528d c3528d2 = c3528d;
                                                        try {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3528d2.f10668a, 25, (Bitmap) ((C2685e) c1546y3.f4247k).m3667f((C6768b) ((C18639a) c1546y3.f4240d).m19999h(c3528d2))));
                                                        } catch (Exception e10) {
                                                            c3528d2.f10669b.close();
                                                            AbstractC8072d6.m8488e("ProcessingNode", "process postview input packet failed.", e10);
                                                            return;
                                                        }
                                                        break;
                                                    default:
                                                        C1546Y c1546y4 = c1546y2;
                                                        C3528d c3528d3 = c3528d;
                                                        C3535k c3535k = c3528d3.f10668a;
                                                        try {
                                                            if (c3535k.f10690b == null) {
                                                                AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 23, c1546y4.m2368h(c3528d3)));
                                                            } else {
                                                                AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 24, c1546y4.m2369i(c3528d3)));
                                                            }
                                                        } catch (C3124Q e11) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, e11));
                                                            return;
                                                        } catch (OutOfMemoryError e12) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed due to low memory.", e12)));
                                                            return;
                                                        } catch (RuntimeException e13) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed.", e13)));
                                                            return;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        c3528d.f10669b.close();
                                    }
                                    break;
                                default:
                                    final C1546Y c1546y3 = c1546y;
                                    if (!c3528d.f10668a.f10695g.f10708g) {
                                        final int i15 = 0;
                                        ((Executor) c1546y3.f4238b).execute(new Runnable() { // from class: I.j
                                            @Override // java.lang.Runnable
                                            public final void run() throws Exception {
                                                switch (i15) {
                                                    case 0:
                                                        C1546Y c1546y4 = c1546y3;
                                                        int i16 = ((C3527c) c1546y4.f4239c).f10667d;
                                                        AbstractC4941g.m5554M("Postview only support YUV and JPEG output formats. Output format: " + i16, i16 == 35 || i16 == 256);
                                                        C3528d c3528d2 = c3528d;
                                                        try {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3528d2.f10668a, 25, (Bitmap) ((C2685e) c1546y4.f4247k).m3667f((C6768b) ((C18639a) c1546y4.f4240d).m19999h(c3528d2))));
                                                        } catch (Exception e10) {
                                                            c3528d2.f10669b.close();
                                                            AbstractC8072d6.m8488e("ProcessingNode", "process postview input packet failed.", e10);
                                                            return;
                                                        }
                                                        break;
                                                    default:
                                                        C1546Y c1546y5 = c1546y3;
                                                        C3528d c3528d3 = c3528d;
                                                        C3535k c3535k = c3528d3.f10668a;
                                                        try {
                                                            if (c3535k.f10690b == null) {
                                                                AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 23, c1546y5.m2368h(c3528d3)));
                                                            } else {
                                                                AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 24, c1546y5.m2369i(c3528d3)));
                                                            }
                                                        } catch (C3124Q e11) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, e11));
                                                            return;
                                                        } catch (OutOfMemoryError e12) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed due to low memory.", e12)));
                                                            return;
                                                        } catch (RuntimeException e13) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed.", e13)));
                                                            return;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        AbstractC8072d6.m8492i("ProcessingNode", "The postview image is closed due to request aborted");
                                        c3528d.f10669b.close();
                                    }
                                    break;
                            }
                        }
                    };
                    c6772f4.f21735b = new InterfaceC0310a() { // from class: I.i
                        @Override // p004A2.InterfaceC0310a
                        public final void accept(Object obj) throws Exception {
                            final C3528d c3528d = (C3528d) obj;
                            switch (i12) {
                                case 0:
                                    final C1546Y c1546y2 = c1546y;
                                    if (!c3528d.f10668a.f10695g.f10708g) {
                                        final int i14 = 1;
                                        ((Executor) c1546y2.f4238b).execute(new Runnable() { // from class: I.j
                                            @Override // java.lang.Runnable
                                            public final void run() throws Exception {
                                                switch (i14) {
                                                    case 0:
                                                        C1546Y c1546y4 = c1546y2;
                                                        int i16 = ((C3527c) c1546y4.f4239c).f10667d;
                                                        AbstractC4941g.m5554M("Postview only support YUV and JPEG output formats. Output format: " + i16, i16 == 35 || i16 == 256);
                                                        C3528d c3528d2 = c3528d;
                                                        try {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3528d2.f10668a, 25, (Bitmap) ((C2685e) c1546y4.f4247k).m3667f((C6768b) ((C18639a) c1546y4.f4240d).m19999h(c3528d2))));
                                                        } catch (Exception e10) {
                                                            c3528d2.f10669b.close();
                                                            AbstractC8072d6.m8488e("ProcessingNode", "process postview input packet failed.", e10);
                                                            return;
                                                        }
                                                        break;
                                                    default:
                                                        C1546Y c1546y5 = c1546y2;
                                                        C3528d c3528d3 = c3528d;
                                                        C3535k c3535k = c3528d3.f10668a;
                                                        try {
                                                            if (c3535k.f10690b == null) {
                                                                AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 23, c1546y5.m2368h(c3528d3)));
                                                            } else {
                                                                AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 24, c1546y5.m2369i(c3528d3)));
                                                            }
                                                        } catch (C3124Q e11) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, e11));
                                                            return;
                                                        } catch (OutOfMemoryError e12) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed due to low memory.", e12)));
                                                            return;
                                                        } catch (RuntimeException e13) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed.", e13)));
                                                            return;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        c3528d.f10669b.close();
                                    }
                                    break;
                                default:
                                    final C1546Y c1546y3 = c1546y;
                                    if (!c3528d.f10668a.f10695g.f10708g) {
                                        final int i15 = 0;
                                        ((Executor) c1546y3.f4238b).execute(new Runnable() { // from class: I.j
                                            @Override // java.lang.Runnable
                                            public final void run() throws Exception {
                                                switch (i15) {
                                                    case 0:
                                                        C1546Y c1546y4 = c1546y3;
                                                        int i16 = ((C3527c) c1546y4.f4239c).f10667d;
                                                        AbstractC4941g.m5554M("Postview only support YUV and JPEG output formats. Output format: " + i16, i16 == 35 || i16 == 256);
                                                        C3528d c3528d2 = c3528d;
                                                        try {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3528d2.f10668a, 25, (Bitmap) ((C2685e) c1546y4.f4247k).m3667f((C6768b) ((C18639a) c1546y4.f4240d).m19999h(c3528d2))));
                                                        } catch (Exception e10) {
                                                            c3528d2.f10669b.close();
                                                            AbstractC8072d6.m8488e("ProcessingNode", "process postview input packet failed.", e10);
                                                            return;
                                                        }
                                                        break;
                                                    default:
                                                        C1546Y c1546y5 = c1546y3;
                                                        C3528d c3528d3 = c3528d;
                                                        C3535k c3535k = c3528d3.f10668a;
                                                        try {
                                                            if (c3535k.f10690b == null) {
                                                                AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 23, c1546y5.m2368h(c3528d3)));
                                                            } else {
                                                                AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 24, c1546y5.m2369i(c3528d3)));
                                                            }
                                                        } catch (C3124Q e11) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, e11));
                                                            return;
                                                        } catch (OutOfMemoryError e12) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed due to low memory.", e12)));
                                                            return;
                                                        } catch (RuntimeException e13) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed.", e13)));
                                                            return;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        AbstractC8072d6.m8492i("ProcessingNode", "The postview image is closed due to request aborted");
                                        c3528d.f10669b.close();
                                    }
                                    break;
                            }
                        }
                    };
                    int i14 = 7;
                    c1546y.f4240d = new C18639a(i14);
                    c1546y.f4241e = new C18655i((C3847l0) c1546y.f4248l);
                    c1546y.f4244h = new C7102a(i14);
                    c1546y.f4242f = new C20513d();
                    c1546y.f4243g = new C7591u(i14);
                    c1546y.f4245i = new C15370i(i14);
                    c1546y.f4247k = new C2685e();
                    if (inputFormat != 35 || c1546y.f4237a) {
                        c1546y.f4246j = new C8258a();
                        return;
                    }
                    return;
                }
                throw new ClassCastException();
            }
            i10 = iIntValue;
            if (c3815q.mo36M(C3815Q.f11553s0, null) == null) {
                C6772f c6772f5 = new C6772f();
                C6772f c6772f6 = new C6772f();
                int i15 = i10;
                c3525a = new C3525a(size, inputFormat, i10, z6, c6772f5, c6772f6);
                this.f7440r0 = c3525a;
                if (((C3525a) c2392v.f7439q0) == null) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                AbstractC4941g.m5559R("CaptureNode does not support recreation yet.", z10);
                c2392v.f7439q0 = c3525a;
                c3131y = new C3131Y(c2392v, i12);
                if (!z6) {
                    C3132Z c3132z2 = new C3132Z(size.getWidth(), size.getHeight(), inputFormat, 4);
                    listAsList = Arrays.asList(c3131y, c3132z2.f9420Z);
                    if (listAsList.isEmpty()) {
                        c3846l = new C3846l();
                    } else {
                        if (listAsList.size() == 1) {
                            c3846l = (AbstractC3842j) listAsList.get(0);
                        } else {
                            c3131y = new C3844k(listAsList);
                        }
                        final int z18 = z14 ? 1 : 0;
                        interfaceC0310a = new InterfaceC0310a(c2392v) { // from class: I.h

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ C2392v f10683b;

                            {
                                this.f10683b = c2392v;
                            }

                            @Override // p004A2.InterfaceC0310a
                            public final void accept(Object obj) {
                                switch (z18) {
                                    case 0:
                                        this.f10683b.m3531C((C3535k) obj);
                                        break;
                                    case 1:
                                        C3535k c3535k = (C3535k) obj;
                                        C2392v c2392v2 = this.f10683b;
                                        c2392v2.m3531C(c3535k);
                                        C11241l c11241l2 = (C11241l) c2392v2.f7440r0;
                                        AbstractC4941g.m5559R("Pending request should be null", ((C3535k) c11241l2.f34017Z) == null);
                                        c11241l2.f34017Z = c3535k;
                                        break;
                                    default:
                                        this.f10683b.m3536H((C3529e) obj);
                                        break;
                                }
                            }
                        };
                        interfaceC3820W = c3132z2;
                    }
                    c3131y = c3846l;
                    final int z19 = z14 ? 1 : 0;
                    interfaceC0310a = new InterfaceC0310a(c2392v) { // from class: I.h

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C2392v f10683b;

                        {
                            this.f10683b = c2392v;
                        }

                        @Override // p004A2.InterfaceC0310a
                        public final void accept(Object obj) {
                            switch (z19) {
                                case 0:
                                    this.f10683b.m3531C((C3535k) obj);
                                    break;
                                case 1:
                                    C3535k c3535k = (C3535k) obj;
                                    C2392v c2392v2 = this.f10683b;
                                    c2392v2.m3531C(c3535k);
                                    C11241l c11241l2 = (C11241l) c2392v2.f7440r0;
                                    AbstractC4941g.m5559R("Pending request should be null", ((C3535k) c11241l2.f34017Z) == null);
                                    c11241l2.f34017Z = c3535k;
                                    break;
                                default:
                                    this.f10683b.m3536H((C3529e) obj);
                                    break;
                            }
                        }
                    };
                    interfaceC3820W = c3132z2;
                } else {
                    C0093v0 c0093v0M8472c2 = AbstractC8064c6.m8472c(size.getWidth(), size.getHeight(), inputFormat, 4);
                    C11241l c11241l2 = new C11241l();
                    c11241l2.f34016Y = c0093v0M8472c2;
                    c2392v.f7440r0 = c11241l2;
                    interfaceC0310a = new InterfaceC0310a(c2392v) { // from class: I.h

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C2392v f10683b;

                        {
                            this.f10683b = c2392v;
                        }

                        @Override // p004A2.InterfaceC0310a
                        public final void accept(Object obj) {
                            switch (i12) {
                                case 0:
                                    this.f10683b.m3531C((C3535k) obj);
                                    break;
                                case 1:
                                    C3535k c3535k = (C3535k) obj;
                                    C2392v c2392v2 = this.f10683b;
                                    c2392v2.m3531C(c3535k);
                                    C11241l c11241l3 = (C11241l) c2392v2.f7440r0;
                                    AbstractC4941g.m5559R("Pending request should be null", ((C3535k) c11241l3.f34017Z) == null);
                                    c11241l3.f34017Z = c3535k;
                                    break;
                                default:
                                    this.f10683b.m3536H((C3529e) obj);
                                    break;
                            }
                        }
                    };
                    interfaceC3820W = c11241l2;
                }
                c3525a.f10653a = c3131y;
                Surface surface2 = interfaceC3820W.getSurface();
                Objects.requireNonNull(surface2);
                if (c3525a.f10654b == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC4941g.m5559R("The surface is already set.", z11);
                c3525a.f10654b = new C3162o0(surface2, size, inputFormat);
                c2392v.f7437o0 = new C3150i0(interfaceC3820W);
                interfaceC3820W.mo347p(new C0072l(c2392v, 28), AbstractC8577W2.m9243e());
                c6772f5.f21735b = interfaceC0310a;
                c6772f6.f21735b = new InterfaceC0310a(c2392v) { // from class: I.h

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C2392v f10683b;

                    {
                        this.f10683b = c2392v;
                    }

                    @Override // p004A2.InterfaceC0310a
                    public final void accept(Object obj) {
                        switch (i11) {
                            case 0:
                                this.f10683b.m3531C((C3535k) obj);
                                break;
                            case 1:
                                C3535k c3535k = (C3535k) obj;
                                C2392v c2392v2 = this.f10683b;
                                c2392v2.m3531C(c3535k);
                                C11241l c11241l3 = (C11241l) c2392v2.f7440r0;
                                AbstractC4941g.m5559R("Pending request should be null", ((C3535k) c11241l3.f34017Z) == null);
                                c11241l3.f34017Z = c3535k;
                                break;
                            default:
                                this.f10683b.m3536H((C3529e) obj);
                                break;
                        }
                    }
                };
                C6772f c6772f7 = new C6772f();
                C6772f c6772f8 = new C6772f();
                C3527c c3527c2 = new C3527c(c6772f7, c6772f8, inputFormat, i15);
                c2392v.f7438p0 = c3527c2;
                c1546y.f4239c = c3527c2;
                final int z110 = z13 ? 1 : 0;
                c6772f7.f21735b = new InterfaceC0310a() { // from class: I.i
                    @Override // p004A2.InterfaceC0310a
                    public final void accept(Object obj) throws Exception {
                        final C3528d c3528d = (C3528d) obj;
                        switch (z110) {
                            case 0:
                                final C1546Y c1546y2 = c1546y;
                                if (!c3528d.f10668a.f10695g.f10708g) {
                                    final int i16 = 1;
                                    ((Executor) c1546y2.f4238b).execute(new Runnable() { // from class: I.j
                                        @Override // java.lang.Runnable
                                        public final void run() throws Exception {
                                            switch (i16) {
                                                case 0:
                                                    C1546Y c1546y4 = c1546y2;
                                                    int i17 = ((C3527c) c1546y4.f4239c).f10667d;
                                                    AbstractC4941g.m5554M("Postview only support YUV and JPEG output formats. Output format: " + i17, i17 == 35 || i17 == 256);
                                                    C3528d c3528d2 = c3528d;
                                                    try {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3528d2.f10668a, 25, (Bitmap) ((C2685e) c1546y4.f4247k).m3667f((C6768b) ((C18639a) c1546y4.f4240d).m19999h(c3528d2))));
                                                    } catch (Exception e10) {
                                                        c3528d2.f10669b.close();
                                                        AbstractC8072d6.m8488e("ProcessingNode", "process postview input packet failed.", e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    C1546Y c1546y5 = c1546y2;
                                                    C3528d c3528d3 = c3528d;
                                                    C3535k c3535k = c3528d3.f10668a;
                                                    try {
                                                        if (c3535k.f10690b == null) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 23, c1546y5.m2368h(c3528d3)));
                                                        } else {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 24, c1546y5.m2369i(c3528d3)));
                                                        }
                                                    } catch (C3124Q e11) {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, e11));
                                                        return;
                                                    } catch (OutOfMemoryError e12) {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed due to low memory.", e12)));
                                                        return;
                                                    } catch (RuntimeException e13) {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed.", e13)));
                                                        return;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    c3528d.f10669b.close();
                                }
                                break;
                            default:
                                final C1546Y c1546y3 = c1546y;
                                if (!c3528d.f10668a.f10695g.f10708g) {
                                    final int i17 = 0;
                                    ((Executor) c1546y3.f4238b).execute(new Runnable() { // from class: I.j
                                        @Override // java.lang.Runnable
                                        public final void run() throws Exception {
                                            switch (i17) {
                                                case 0:
                                                    C1546Y c1546y4 = c1546y3;
                                                    int i18 = ((C3527c) c1546y4.f4239c).f10667d;
                                                    AbstractC4941g.m5554M("Postview only support YUV and JPEG output formats. Output format: " + i18, i18 == 35 || i18 == 256);
                                                    C3528d c3528d2 = c3528d;
                                                    try {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3528d2.f10668a, 25, (Bitmap) ((C2685e) c1546y4.f4247k).m3667f((C6768b) ((C18639a) c1546y4.f4240d).m19999h(c3528d2))));
                                                    } catch (Exception e10) {
                                                        c3528d2.f10669b.close();
                                                        AbstractC8072d6.m8488e("ProcessingNode", "process postview input packet failed.", e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    C1546Y c1546y5 = c1546y3;
                                                    C3528d c3528d3 = c3528d;
                                                    C3535k c3535k = c3528d3.f10668a;
                                                    try {
                                                        if (c3535k.f10690b == null) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 23, c1546y5.m2368h(c3528d3)));
                                                        } else {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 24, c1546y5.m2369i(c3528d3)));
                                                        }
                                                    } catch (C3124Q e11) {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, e11));
                                                        return;
                                                    } catch (OutOfMemoryError e12) {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed due to low memory.", e12)));
                                                        return;
                                                    } catch (RuntimeException e13) {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed.", e13)));
                                                        return;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    AbstractC8072d6.m8492i("ProcessingNode", "The postview image is closed due to request aborted");
                                    c3528d.f10669b.close();
                                }
                                break;
                        }
                    }
                };
                c6772f8.f21735b = new InterfaceC0310a() { // from class: I.i
                    @Override // p004A2.InterfaceC0310a
                    public final void accept(Object obj) throws Exception {
                        final C3528d c3528d = (C3528d) obj;
                        switch (i12) {
                            case 0:
                                final C1546Y c1546y2 = c1546y;
                                if (!c3528d.f10668a.f10695g.f10708g) {
                                    final int i16 = 1;
                                    ((Executor) c1546y2.f4238b).execute(new Runnable() { // from class: I.j
                                        @Override // java.lang.Runnable
                                        public final void run() throws Exception {
                                            switch (i16) {
                                                case 0:
                                                    C1546Y c1546y4 = c1546y2;
                                                    int i18 = ((C3527c) c1546y4.f4239c).f10667d;
                                                    AbstractC4941g.m5554M("Postview only support YUV and JPEG output formats. Output format: " + i18, i18 == 35 || i18 == 256);
                                                    C3528d c3528d2 = c3528d;
                                                    try {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3528d2.f10668a, 25, (Bitmap) ((C2685e) c1546y4.f4247k).m3667f((C6768b) ((C18639a) c1546y4.f4240d).m19999h(c3528d2))));
                                                    } catch (Exception e10) {
                                                        c3528d2.f10669b.close();
                                                        AbstractC8072d6.m8488e("ProcessingNode", "process postview input packet failed.", e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    C1546Y c1546y5 = c1546y2;
                                                    C3528d c3528d3 = c3528d;
                                                    C3535k c3535k = c3528d3.f10668a;
                                                    try {
                                                        if (c3535k.f10690b == null) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 23, c1546y5.m2368h(c3528d3)));
                                                        } else {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 24, c1546y5.m2369i(c3528d3)));
                                                        }
                                                    } catch (C3124Q e11) {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, e11));
                                                        return;
                                                    } catch (OutOfMemoryError e12) {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed due to low memory.", e12)));
                                                        return;
                                                    } catch (RuntimeException e13) {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed.", e13)));
                                                        return;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    c3528d.f10669b.close();
                                }
                                break;
                            default:
                                final C1546Y c1546y3 = c1546y;
                                if (!c3528d.f10668a.f10695g.f10708g) {
                                    final int i17 = 0;
                                    ((Executor) c1546y3.f4238b).execute(new Runnable() { // from class: I.j
                                        @Override // java.lang.Runnable
                                        public final void run() throws Exception {
                                            switch (i17) {
                                                case 0:
                                                    C1546Y c1546y4 = c1546y3;
                                                    int i18 = ((C3527c) c1546y4.f4239c).f10667d;
                                                    AbstractC4941g.m5554M("Postview only support YUV and JPEG output formats. Output format: " + i18, i18 == 35 || i18 == 256);
                                                    C3528d c3528d2 = c3528d;
                                                    try {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3528d2.f10668a, 25, (Bitmap) ((C2685e) c1546y4.f4247k).m3667f((C6768b) ((C18639a) c1546y4.f4240d).m19999h(c3528d2))));
                                                    } catch (Exception e10) {
                                                        c3528d2.f10669b.close();
                                                        AbstractC8072d6.m8488e("ProcessingNode", "process postview input packet failed.", e10);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    C1546Y c1546y5 = c1546y3;
                                                    C3528d c3528d3 = c3528d;
                                                    C3535k c3535k = c3528d3.f10668a;
                                                    try {
                                                        if (c3535k.f10690b == null) {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 23, c1546y5.m2368h(c3528d3)));
                                                        } else {
                                                            AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 24, c1546y5.m2369i(c3528d3)));
                                                        }
                                                    } catch (C3124Q e11) {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, e11));
                                                        return;
                                                    } catch (OutOfMemoryError e12) {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed due to low memory.", e12)));
                                                        return;
                                                    } catch (RuntimeException e13) {
                                                        AbstractC8577W2.m9243e().execute(new RunnableC0074m(c3535k, 26, new C3124Q("Processing failed.", e13)));
                                                        return;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    AbstractC8072d6.m8492i("ProcessingNode", "The postview image is closed due to request aborted");
                                    c3528d.f10669b.close();
                                }
                                break;
                        }
                    }
                };
                int i16 = 7;
                c1546y.f4240d = new C18639a(i16);
                c1546y.f4241e = new C18655i((C3847l0) c1546y.f4248l);
                c1546y.f4244h = new C7102a(i16);
                c1546y.f4242f = new C20513d();
                c1546y.f4243g = new C7591u(i16);
                c1546y.f4245i = new C15370i(i16);
                c1546y.f4247k = new C2685e();
                if (inputFormat != 35) {
                }
                c1546y.f4246j = new C8258a();
                return;
            }
            throw new ClassCastException();
        }
        throw new IllegalStateException("Implementation is missing option unpacker for " + AbstractC3794B0.m4480e(c3815q, c3815q.toString()));
    }

    public C2392v(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
        this.f7435Y = 2;
        this.f7436Z = file;
        this.f7437o0 = contentResolver;
        this.f7438p0 = uri;
        this.f7439q0 = contentValues;
        this.f7440r0 = new C3130X(2);
    }

    public C2392v(C3935J4 c3935j4, InterfaceC13772l interfaceC13772l, C13796x c13796x, InterfaceC1426a interfaceC1426a) {
        this.f7435Y = 8;
        this.f7436Z = c3935j4;
        this.f7437o0 = interfaceC13772l;
        this.f7438p0 = c13796x;
        this.f7439q0 = interfaceC1426a;
        this.f7440r0 = new C4055g1(this, 0);
    }
}
