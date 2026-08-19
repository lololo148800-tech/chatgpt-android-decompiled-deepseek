package p658b5;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.AbstractC10818a;
import androidx.appcompat.view.C10822e;
import androidx.work.impl.WorkDatabase_Impl;
import bm.C11508a;
import com.auth0.android.request.internal.RunnableC11843b;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import io.sentry.AbstractC15152P0;
import io.sentry.AbstractC15160S0;
import io.sentry.C15108A1;
import io.sentry.C15113C0;
import io.sentry.C15128H0;
import io.sentry.C15132I1;
import io.sentry.C15134J0;
import io.sentry.C15135J1;
import io.sentry.C15138K1;
import io.sentry.C15153P1;
import io.sentry.C15158R1;
import io.sentry.C15161S1;
import io.sentry.C15163T0;
import io.sentry.C15175X0;
import io.sentry.C15180a;
import io.sentry.C15321b1;
import io.sentry.C15326c1;
import io.sentry.C15347d1;
import io.sentry.C15416p;
import io.sentry.C15476t0;
import io.sentry.C15516w;
import io.sentry.C15520x0;
import io.sentry.C15524y1;
import io.sentry.CallableC15177Y0;
import io.sentry.CallableC15182a1;
import io.sentry.EnumC15112C;
import io.sentry.EnumC15129H1;
import io.sentry.EnumC15147N1;
import io.sentry.EnumC15359h;
import io.sentry.EnumC15361h1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15115D;
import io.sentry.InterfaceC15118E;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15130I;
import io.sentry.InterfaceC15151P;
import io.sentry.InterfaceC15154Q;
import io.sentry.InterfaceC15159S;
import io.sentry.InterfaceC15165U;
import io.sentry.InterfaceC15418p1;
import io.sentry.InterfaceC15456q1;
import io.sentry.InterfaceC15472s;
import io.sentry.RunnableC15414o0;
import io.sentry.SpotlightIntegration;
import io.sentry.android.core.C15184B;
import io.sentry.android.core.C15243l;
import io.sentry.android.core.C15254r;
import io.sentry.android.core.C15257u;
import io.sentry.android.core.internal.util.C15229a;
import io.sentry.clientreport.EnumC15337e;
import io.sentry.clientreport.InterfaceC15339g;
import io.sentry.exception.C15352b;
import io.sentry.hints.AbstractC15364c;
import io.sentry.hints.InterfaceC15363b;
import io.sentry.hints.InterfaceC15372k;
import io.sentry.metrics.C15409d;
import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15445r;
import io.sentry.protocol.C15447t;
import io.sentry.transport.InterfaceC15483f;
import io.sentry.util.AbstractC15502g;
import io.sentry.util.C15501f;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17314q;
import p001A.C0083q0;
import p001A.C0093v0;
import p011A9.p012Ra.ahZQMZ;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p033B5.C0819c;
import p033B5.C0823g;
import p033B5.C0827k;
import p033B5.C0828l;
import p033B5.C0831o;
import p033B5.C0835s;
import p033B5.C0840x;
import p049Bm.InterfaceC1439n;
import p077Cn.C1743k;
import p077Cn.C1748p;
import p077Cn.C1749q;
import p077Cn.C1750r;
import p077Cn.C1753u;
import p1015t2.InterfaceMenuItemC19750a;
import p1016t3.C19788o;
import p1037ub.InterfaceC20181a;
import p1073w3.AbstractC20817s;
import p1104xb.InterfaceC21170a;
import p110E4.C2315m;
import p1143z4.AbstractC21790t;
import p1143z4.C21787q;
import p1143z4.C21791u;
import p1143z4.C21792v;
import p1143z4.C21795y;
import p117Eb.C2392v;
import p117Eb.CallableC2378h;
import p133F3.C2658d;
import p133F3.InterfaceC2659e;
import p167Gb.C3032c;
import p189Ha.AbstractC3276j;
import p189Ha.C3272f;
import p189Ha.C3278l;
import p189Ha.C3279m;
import p200Hm.C3507f;
import p232J3.AbstractC4237i;
import p232J3.C4244p;
import p232J3.C4249u;
import p232J3.C4253y;
import p232J3.InterfaceC4203C;
import p283L5.AbstractC4941g;
import p321Mk.C5478p;
import p349O0.C6002f0;
import p351O2.AbstractC6101o;
import p351O2.C6098l;
import p374P5.C6352e;
import p468T2.C7227s;
import p468T2.C7230v;
import p493U2.C7551a;
import p493U2.C7552b;
import p523V9.AbstractC7910I5;
import p523V9.AbstractC7918J5;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8453B3;
import p544W9.AbstractC8459C3;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8634g;
import p544W9.AbstractC8698q3;
import p571X9.AbstractC9137G4;
import p571X9.AbstractC9227W;
import p582Xk.HXHG.bQBnquXS;
import p594Y9.C9895g4;
import p629Zl.C10424e;
import p629Zl.InterfaceC10420a;
import p690cp.AbstractC12919e;
import p690cp.AbstractC12920f;
import p690cp.AbstractC12935u;
import p690cp.C12911B;
import p690cp.C12912C;
import p690cp.C12913D;
import p690cp.C12916b;
import p690cp.C12917c;
import p690cp.C12918d;
import p690cp.C12922h;
import p690cp.C12923i;
import p690cp.C12924j;
import p690cp.C12925k;
import p690cp.C12926l;
import p690cp.C12927m;
import p690cp.C12928n;
import p690cp.C12929o;
import p690cp.C12930p;
import p690cp.C12931q;
import p690cp.C12932r;
import p690cp.C12934t;
import p690cp.C12937w;
import p690cp.C12938x;
import p690cp.C12939y;
import p690cp.InterfaceC12914E;
import p692d0.C12959L;
import p758g0.AbstractC13784r;
import p758g0.C13756d;
import p758g0.InterfaceC13727C;
import p758g0.InterfaceC13786s;
import p758g0.InterfaceC13787s0;
import p759g1.C13803e;
import p773h0.EnumC14284g0;
import p791hj.C14522e;
import p817j$.util.concurrent.ConcurrentHashMap;
import p878lo.C17096e;
import p890mb.C17220q;
import p890mb.C17221r;
import p890mb.InterfaceC17205b;
import p896n2.C17447A;
import p909nm.AbstractC17680n;
import p909nm.C17677k;
import p909nm.C17689w;
import p942p6.EnumC18300d;
import p942p6.InterfaceC18298b;
import p960q9.C18655i;
import p976r.MenuC18799A;
import p976r.MenuC18814l;
import p976r.MenuItemC18821s;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: b5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C11238i implements InterfaceC4203C, InterfaceC2659e, InterfaceC12914E, InterfaceC13787s0, InterfaceC15118E, InterfaceC17205b {

    /* JADX INFO: renamed from: q0 */
    public static C11238i f34007q0;

    /* JADX INFO: renamed from: Y */
    public Object f34008Y;

    /* JADX INFO: renamed from: Z */
    public Object f34009Z;

    /* JADX INFO: renamed from: o0 */
    public Object f34010o0;

    /* JADX INFO: renamed from: p0 */
    public Object f34011p0;

    public /* synthetic */ C11238i(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f34008Y = obj;
        this.f34009Z = obj2;
        this.f34010o0 = obj3;
        this.f34011p0 = obj4;
    }

    /* JADX INFO: renamed from: i0 */
    public static ArrayList m12528i0(C15516w c15516w) {
        ArrayList arrayList = new ArrayList(c15516w.f48467b);
        C15180a c15180a = c15516w.f48468c;
        if (c15180a != null) {
            arrayList.add(c15180a);
        }
        C15180a c15180a2 = c15516w.f48469d;
        if (c15180a2 != null) {
            arrayList.add(c15180a2);
        }
        C15180a c15180a3 = c15516w.f48470e;
        if (c15180a3 != null) {
            arrayList.add(c15180a3);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static C11238i m12530k0() {
        if (f34007q0 == null) {
            C11238i c11238i = new C11238i();
            c11238i.f34008Y = new Object();
            c11238i.f34009Z = new Handler(Looper.getMainLooper(), new C3278l(c11238i, 0));
            f34007q0 = c11238i;
        }
        return f34007q0;
    }

    /* JADX INFO: renamed from: t0 */
    public static C14522e m12531t0(C11238i c11238i, String url, int i10) {
        EnumC18300d enumC18300d = (EnumC18300d) c11238i.f34008Y;
        if ((i10 & 2) != 0) {
            url = (String) c11238i.f34009Z;
        }
        AbstractC16544l.m18094g(url, "url");
        C14522e c14522e = new C14522e(enumC18300d, url);
        InterfaceC18298b interfaceC18298b = (InterfaceC18298b) c11238i.f34011p0;
        if (interfaceC18298b != null) {
            c14522e.f45762Z = interfaceC18298b;
        }
        c14522e.m16013c((ArrayList) c11238i.f34010o0);
        return c14522e;
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: A */
    public void mo5146A(C12939y c12939y) {
        m12545L0(c12939y);
    }

    @Override // io.sentry.InterfaceC15118E
    /* JADX INFO: renamed from: B */
    public boolean mo12532B(InterfaceC15115D interfaceC15115D) {
        C15184B c15184b = (C15184B) this.f34010o0;
        c15184b.getClass();
        C15229a c15229a = new C15229a(this, interfaceC15115D);
        ((HashMap) this.f34011p0).put(interfaceC15115D, c15229a);
        return m12527A0((Context) this.f34008Y, (InterfaceC15127H) this.f34009Z, c15184b, c15229a);
    }

    /* JADX INFO: renamed from: B0 */
    public void m12533B0(C3272f c3272f) {
        synchronized (this.f34008Y) {
            try {
                if (m12571p0(c3272f)) {
                    C3279m c3279m = (C3279m) this.f34010o0;
                    if (c3279m.f9999c) {
                        c3279m.f9999c = false;
                        m12535C0(c3279m);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p890mb.InterfaceC17205b
    /* JADX INFO: renamed from: C */
    public Object mo12534C(C17220q c17220q) {
        if (((Set) this.f34008Y).contains(c17220q)) {
            return ((InterfaceC17205b) this.f34011p0).mo12534C(c17220q);
        }
        throw new C0644w("Attempting to request an undeclared dependency " + c17220q + Separators.DOT);
    }

    /* JADX INFO: renamed from: C0 */
    public void m12535C0(C3279m c3279m) {
        int i10 = c3279m.f9998b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        Handler handler = (Handler) this.f34009Z;
        handler.removeCallbacksAndMessages(c3279m);
        handler.sendMessageDelayed(Message.obtain(handler, 0, c3279m), i10);
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: D */
    public void mo3707D(C12911B c12911b) {
        m12545L0(c12911b);
    }

    /* JADX INFO: renamed from: D0 */
    public C15447t m12536D0(C11241l c11241l, C15516w c15516w) {
        C15524y1 c15524y1 = (C15524y1) this.f34008Y;
        InterfaceC15418p1 beforeEnvelopeCallback = c15524y1.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) beforeEnvelopeCallback;
                try {
                    spotlightIntegration.f47218o0.submit(new RunnableC11843b(spotlightIntegration, 10, c11241l));
                } catch (RejectedExecutionException e10) {
                    spotlightIntegration.f47217Z.mo16297h(EnumC15375i1.WARNING, "Spotlight envelope submission rejected.", e10);
                }
            } catch (Throwable th2) {
                c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "The BeforeEnvelope callback threw an exception.", th2);
            }
        }
        ((InterfaceC15483f) this.f34009Z).mo16671G(c11241l, c15516w);
        C15447t c15447t = ((C15175X0) c11241l.f34016Y).f47239Y;
        return c15447t != null ? c15447t : C15447t.f48216Z;
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: E */
    public void mo5147E(C12934t c12934t) {
        m12545L0(c12934t);
    }

    /* JADX INFO: renamed from: E0 */
    public Set m12537E0(Class cls) {
        return mo12557b(C17220q.m18953a(cls));
    }

    /* JADX INFO: renamed from: F0 */
    public void m12538F0(AbstractC12935u abstractC12935u, int i10) {
        Class<?> cls = abstractC12935u.getClass();
        C2392v c2392v = (C2392v) this.f34008Y;
        C11508a c11508a = (C11508a) ((Map) ((C18655i) c2392v.f7440r0).f59414Z).get(cls);
        if (c11508a != null) {
            Object objM12901a = c11508a.m12901a(c2392v, (C3032c) this.f34009Z);
            C10424e c10424e = (C10424e) this.f34010o0;
            StringBuilder sb2 = c10424e.f30890Y;
            int length = sb2.length();
            int length2 = sb2.length();
            if (length <= i10 || i10 < 0 || length > length2) {
                return;
            }
            C10424e.m10910c(c10424e, objM12901a, i10, length);
        }
    }

    @Override // io.sentry.InterfaceC15118E
    /* JADX INFO: renamed from: G */
    public void mo12539G(InterfaceC15115D interfaceC15115D) {
        ConnectivityManager.NetworkCallback networkCallback = (ConnectivityManager.NetworkCallback) ((HashMap) this.f34011p0).remove(interfaceC15115D);
        if (networkCallback != null) {
            ((C15184B) this.f34010o0).getClass();
            Context context = (Context) this.f34008Y;
            InterfaceC15127H interfaceC15127H = (InterfaceC15127H) this.f34009Z;
            ConnectivityManager connectivityManagerM12529j0 = m12529j0(context, interfaceC15127H);
            if (connectivityManagerM12529j0 == null) {
                return;
            }
            try {
                connectivityManagerM12529j0.unregisterNetworkCallback(networkCallback);
            } catch (Throwable th2) {
                interfaceC15127H.mo16297h(EnumC15375i1.WARNING, "unregisterNetworkCallback failed", th2);
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m12540G0(AbstractC15160S0 abstractC15160S0, C15516w c15516w) {
        if (AbstractC8465D3.m9093g(c15516w)) {
            return true;
        }
        ((C15524y1) this.f34008Y).getLogger().mo16298o(EnumC15375i1.DEBUG, "Event was cached so not applying scope: %s", abstractC15160S0.f47194Y);
        return false;
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: H */
    public void mo2750H(int i10, C4253y c4253y, C4249u c4249u) {
        if (m12573r0(i10, c4253y)) {
            ((C2658d) this.f34009Z).m3628a(m12574s0(c4249u, c4253y));
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m12541H0() {
        C3279m c3279m = (C3279m) this.f34011p0;
        if (c3279m != null) {
            this.f34010o0 = c3279m;
            this.f34011p0 = null;
            C3272f c3272f = (C3272f) c3279m.f9997a.get();
            if (c3272f == null) {
                this.f34010o0 = null;
            } else {
                Handler handler = AbstractC3276j.f9964A;
                handler.sendMessage(handler.obtainMessage(0, c3272f.f9949a));
            }
        }
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: I */
    public void mo2751I(int i10, C4253y c4253y, C4244p c4244p, C4249u c4249u, IOException iOException, boolean z6) {
        if (m12573r0(i10, c4253y)) {
            ((C2658d) this.f34009Z).m3631d(c4244p, m12574s0(c4249u, c4253y), iOException, z6);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public Object m12542I0(EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        Object objM1183l = AbstractC0575H.m1183l(new C17096e(this, enumC14284g0, interfaceC1439n, null), abstractC19687c);
        return objM1183l == EnumC19250a.f61036Y ? objM1183l : C17296C.f55119a;
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: J */
    public void mo5148J(C12931q c12931q) {
        m12545L0(c12931q);
    }

    /* JADX INFO: renamed from: J0 */
    public void m12543J0(long j10) {
        C6002f0 c6002f0 = (C6002f0) this.f34011p0;
        if (((C5478p) c6002f0.getValue()) != null) {
            float fFloatValue = ((Number) m12567m0().m15224e()).floatValue();
            C5478p c5478p = (C5478p) c6002f0.getValue();
            Float fValueOf = c5478p != null ? Float.valueOf(c5478p.f17888a) : null;
            if (fValueOf != null && fFloatValue == fValueOf.floatValue()) {
                float fFloatValue2 = ((Number) m12568n0().m15224e()).floatValue();
                C5478p c5478p2 = (C5478p) c6002f0.getValue();
                Float fValueOf2 = c5478p2 != null ? Float.valueOf(c5478p2.f17889b) : null;
                if (fValueOf2 != null && fFloatValue2 == fValueOf2.floatValue()) {
                    Float f10 = m12567m0().f43414f;
                    C5478p c5478p3 = (C5478p) c6002f0.getValue();
                    Float fValueOf3 = c5478p3 != null ? Float.valueOf(c5478p3.f17890c) : null;
                    if (f10 != null ? !(fValueOf3 == null || f10.floatValue() != fValueOf3.floatValue()) : fValueOf3 == null) {
                        Float f11 = m12568n0().f43414f;
                        C5478p c5478p4 = (C5478p) c6002f0.getValue();
                        Float fValueOf4 = c5478p4 != null ? Float.valueOf(c5478p4.f17891d) : null;
                        if (f11 == null) {
                            if (fValueOf4 == null) {
                                return;
                            }
                        } else if (fValueOf4 != null && f11.floatValue() == fValueOf4.floatValue()) {
                            return;
                        }
                    }
                }
            }
        }
        float fFloatValue3 = ((Number) m12567m0().m15224e()).floatValue();
        float fFloatValue4 = ((Number) m12568n0().m15224e()).floatValue();
        Float f12 = m12567m0().f43414f;
        float fFloatValue5 = f12 != null ? f12.floatValue() : 0.0f;
        Float f13 = m12568n0().f43414f;
        float fFloatValue6 = f13 != null ? f13.floatValue() : 0.0f;
        C13803e.m15333e(j10);
        C13803e.m15331c(j10);
        c6002f0.setValue(new C5478p(fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6));
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: K */
    public AbstractC13784r mo3877K(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        if (((AbstractC13784r) this.f34010o0) == null) {
            this.f34010o0 = abstractC13784r3.mo15285c();
        }
        AbstractC13784r abstractC13784r4 = (AbstractC13784r) this.f34010o0;
        if (abstractC13784r4 == null) {
            AbstractC16544l.m18103p("velocityVector");
            throw null;
        }
        int iMo15284b = abstractC13784r4.mo15284b();
        for (int i10 = 0; i10 < iMo15284b; i10++) {
            AbstractC13784r abstractC13784r5 = (AbstractC13784r) this.f34010o0;
            if (abstractC13784r5 == null) {
                AbstractC16544l.m18103p("velocityVector");
                throw null;
            }
            abstractC13784r5.mo15287e(i10, ((InterfaceC13786s) this.f34008Y).get(i10).mo15210b(j10, abstractC13784r.mo15283a(i10), abstractC13784r2.mo15283a(i10), abstractC13784r3.mo15283a(i10)));
        }
        AbstractC13784r abstractC13784r6 = (AbstractC13784r) this.f34010o0;
        if (abstractC13784r6 != null) {
            return abstractC13784r6;
        }
        AbstractC16544l.m18103p("velocityVector");
        throw null;
    }

    /* JADX INFO: renamed from: K0 */
    public void m12544K0() {
        Iterator it = ((ArrayList) this.f34011p0).iterator();
        while (it.hasNext()) {
            int i10 = ((C21787q) it.next()).f69119a;
            if (m12563g0(i10) == null) {
                int i11 = AbstractC21790t.f69129t0;
                StringBuilder sbM11058p = AbstractC10763a.m11058p("Navigation destination ", AbstractC8634g.m9294h((Context) this.f34008Y, i10), " cannot be found in the navigation graph ");
                sbM11058p.append((C21792v) this.f34010o0);
                throw new IllegalArgumentException(sbM11058p.toString());
            }
        }
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: L */
    public void mo2752L(int i10, C4253y c4253y, C4244p c4244p, C4249u c4249u) {
        if (m12573r0(i10, c4253y)) {
            ((C2658d) this.f34009Z).m3629b(c4244p, m12574s0(c4249u, c4253y));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m12545L0(AbstractC12935u abstractC12935u) {
        InterfaceC10420a interfaceC10420a = (InterfaceC10420a) ((Map) this.f34011p0).get(abstractC12935u.getClass());
        if (interfaceC10420a != null) {
            interfaceC10420a.mo10907a(this, abstractC12935u);
        } else {
            m12546M0(abstractC12935u);
        }
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: M */
    public void mo5149M(C12938x c12938x) {
        m12545L0(c12938x);
    }

    /* JADX INFO: renamed from: M0 */
    public void m12546M0(AbstractC12935u abstractC12935u) {
        AbstractC12935u abstractC12935u2 = abstractC12935u.f41093b;
        while (abstractC12935u2 != null) {
            AbstractC12935u abstractC12935u3 = abstractC12935u2.f41096e;
            abstractC12935u2.mo14588a(this);
            abstractC12935u2 = abstractC12935u3;
        }
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: O */
    public void mo5150O(AbstractC12920f abstractC12920f) {
        m12545L0(abstractC12920f);
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: P */
    public void mo5151P(C12925k c12925k) {
        m12545L0(c12925k);
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: Q */
    public void mo5152Q(C12918d c12918d) {
        m12545L0(c12918d);
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: R */
    public void mo5153R(C12926l c12926l) {
        m12545L0(c12926l);
    }

    /* JADX INFO: renamed from: S */
    public void m12547S(AbstractC15160S0 abstractC15160S0, C15134J0 c15134j0) {
        if (c15134j0 != null) {
            if (abstractC15160S0.f47197p0 == null) {
                abstractC15160S0.f47197p0 = c15134j0.f47116d;
            }
            if (abstractC15160S0.f47202u0 == null) {
                abstractC15160S0.f47202u0 = c15134j0.f47114b;
            }
            AbstractMap abstractMap = abstractC15160S0.f47198q0;
            ConcurrentHashMap concurrentHashMap = c15134j0.f47119g;
            if (abstractMap == null) {
                abstractC15160S0.f47198q0 = new HashMap(new HashMap(AbstractC8453B3.m9064a(concurrentHashMap)));
            } else {
                for (Map.Entry entry : AbstractC8453B3.m9064a(concurrentHashMap).entrySet()) {
                    if (!abstractC15160S0.f47198q0.containsKey(entry.getKey())) {
                        abstractC15160S0.f47198q0.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            List list = abstractC15160S0.f47206y0;
            C15153P1 c15153p1 = c15134j0.f47118f;
            if (list == null) {
                abstractC15160S0.f47206y0 = new ArrayList(new ArrayList(c15153p1));
            } else if (!c15153p1.isEmpty()) {
                list.addAll(c15153p1);
                Collections.sort(list, (C15163T0) this.f34010o0);
            }
            AbstractMap abstractMap2 = abstractC15160S0.f47193A0;
            ConcurrentHashMap concurrentHashMap2 = c15134j0.f47120h;
            if (abstractMap2 == null) {
                abstractC15160S0.f47193A0 = new HashMap(new HashMap(concurrentHashMap2));
            } else {
                for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                    if (!abstractC15160S0.f47193A0.containsKey(entry2.getKey())) {
                        abstractC15160S0.f47193A0.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            Iterator it = new C15430c(c15134j0.f47127o).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it.next();
                Object key = entry3.getKey();
                C15430c c15430c = abstractC15160S0.f47195Z;
                if (!c15430c.containsKey(key)) {
                    c15430c.put((String) entry3.getKey(), entry3.getValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void m12548T(AbstractC12935u abstractC12935u) {
        if (abstractC12935u.f41096e != null) {
            m12562f0();
            ((C10424e) this.f34010o0).m10911a('\n');
        }
    }

    /* JADX INFO: renamed from: U */
    public C0840x m12549U() {
        C0827k c0827k = (C0827k) this.f34011p0;
        c0827k.getClass();
        C0828l c0828l = new C0828l(AbstractC9137G4.m9681c(c0827k.f2307a));
        C6352e c6352e = (C6352e) this.f34009Z;
        C6352e c6352e2 = new C6352e(c6352e.f20638a, c6352e.f20639b, c6352e.f20640c, c6352e.f20641d, c6352e.f20642e, c6352e.f20643f, c6352e.f20644g, c6352e.f20645h, c6352e.f20646i, c6352e.f20647j, c6352e.f20648k, c6352e.f20649l, c6352e.f20650m, c0828l);
        C17314q c17314qM9800c = AbstractC9227W.m9800c(new C0819c(this, 1));
        C17314q c17314qM9800c2 = AbstractC9227W.m9800c(new C0831o(0));
        C0823g c0823g = (C0823g) this.f34010o0;
        if (c0823g == null) {
            C17689w c17689w = C17689w.f56480Y;
            c0823g = new C0823g(c17689w, c17689w, c17689w, c17689w, c17689w);
        }
        return new C0840x(new C0835s((Context) this.f34008Y, c6352e2, c17314qM9800c, c17314qM9800c2, c0823g));
    }

    /* JADX INFO: renamed from: V */
    public C11241l m12550V(AbstractC15160S0 abstractC15160S0, ArrayList arrayList, C15132I1 c15132i1, C15158R1 c15158r1, C15113C0 c15113c0) {
        C15447t c15447t;
        ArrayList arrayList2 = new ArrayList();
        C15524y1 c15524y1 = (C15524y1) this.f34008Y;
        if (abstractC15160S0 != null) {
            InterfaceC15151P serializer = c15524y1.getSerializer();
            Charset charset = C15321b1.f47862d;
            AbstractC8483G3.m9133c(serializer, "ISerializer is required.");
            C11234e c11234e = new C11234e(new CallableC2378h(serializer, 4, abstractC15160S0));
            arrayList2.add(new C15321b1(new C15326c1(EnumC15361h1.resolve(abstractC15160S0), new CallableC15177Y0(c11234e, 2), "application/json", (String) null, (String) null), new CallableC15177Y0(c11234e, 3)));
            c15447t = abstractC15160S0.f47194Y;
        } else {
            c15447t = null;
        }
        if (c15132i1 != null) {
            arrayList2.add(C15321b1.m16526b(c15524y1.getSerializer(), c15132i1));
        }
        if (c15113c0 != null) {
            long maxTraceFileSize = c15524y1.getMaxTraceFileSize();
            InterfaceC15151P serializer2 = c15524y1.getSerializer();
            Charset charset2 = C15321b1.f47862d;
            File file = c15113c0.f47035Y;
            C11234e c11234e2 = new C11234e(new CallableC15182a1(file, maxTraceFileSize, c15113c0, serializer2));
            arrayList2.add(new C15321b1(new C15326c1(EnumC15361h1.Profile, new CallableC15177Y0(c11234e2, 0), "application-json", file.getName(), (String) null), new CallableC15177Y0(c11234e2, 1)));
            if (c15447t == null) {
                c15447t = new C15447t(c15113c0.f47028I0);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C15180a c15180a = (C15180a) it.next();
                InterfaceC15151P serializer3 = c15524y1.getSerializer();
                InterfaceC15127H logger = c15524y1.getLogger();
                long maxAttachmentSize = c15524y1.getMaxAttachmentSize();
                Charset charset3 = C15321b1.f47862d;
                C11234e c11234e3 = new C11234e(new CallableC15182a1(c15180a, maxAttachmentSize, serializer3, logger));
                arrayList2.add(new C15321b1(new C15326c1(EnumC15361h1.Attachment, new CallableC15177Y0(c11234e3, 12), c15180a.f47257d, c15180a.f47256c, c15180a.f47258e), new CallableC15177Y0(c11234e3, 13)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new C11241l(new C15175X0(c15447t, c15524y1.getSdkVersion(), c15158r1), (Collection) arrayList2);
    }

    /* JADX INFO: renamed from: W */
    public C11241l m12551W(final C15108A1 c15108a1, final C15128H0 c15128h0, C15158R1 c15158r1, final boolean z6) {
        ArrayList arrayList = new ArrayList();
        C15524y1 c15524y1 = (C15524y1) this.f34008Y;
        final InterfaceC15151P serializer = c15524y1.getSerializer();
        final InterfaceC15127H logger = c15524y1.getLogger();
        Charset charset = C15321b1.f47862d;
        final File file = c15108a1.f47006B0;
        C11234e c11234e = new C11234e(new Callable() { // from class: io.sentry.Z0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC15151P interfaceC15151P = serializer;
                C15108A1 c15108a2 = c15108a1;
                File file2 = file;
                InterfaceC15127H interfaceC15127H = logger;
                boolean z10 = z6;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C15321b1.f47862d));
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            interfaceC15151P.mo16326f(c15108a2, bufferedWriter);
                            linkedHashMap.put(EnumC15361h1.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            C15128H0 c15128h1 = c15128h0;
                            if (c15128h1 != null) {
                                interfaceC15151P.mo16326f(c15128h1, bufferedWriter);
                                linkedHashMap.put(EnumC15361h1.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrM9079c = AbstractC8459C3.m9079c(10485760L, file2.getPath());
                                if (bArrM9079c.length > 0) {
                                    linkedHashMap.put(EnumC15361h1.ReplayVideo.getItemType(), bArrM9079c);
                                }
                            }
                            byte[] bArrM16527f = C15321b1.m16527f(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 == null) {
                                return bArrM16527f;
                            }
                            if (z10) {
                                AbstractC8459C3.m9077a(file2.getParentFile());
                                return bArrM16527f;
                            }
                            file2.delete();
                            return bArrM16527f;
                        } catch (Throwable th2) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Could not serialize replay recording", th6);
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z10) {
                                AbstractC8459C3.m9077a(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new C15321b1(new C15326c1(EnumC15361h1.ReplayVideo, new CallableC15177Y0(c11234e, 6), (String) null, (String) null, (String) null), new CallableC15177Y0(c11234e, 8)));
        return new C11241l(new C15175X0(c15108a1.f47194Y, c15524y1.getSdkVersion(), c15158r1), (Collection) arrayList);
    }

    /* JADX INFO: renamed from: X */
    public boolean m12552X(C3279m c3279m, int i10) {
        C3272f c3272f = (C3272f) c3279m.f9997a.get();
        if (c3272f == null) {
            return false;
        }
        ((Handler) this.f34009Z).removeCallbacksAndMessages(c3279m);
        Handler handler = AbstractC3276j.f9964A;
        handler.sendMessage(handler.obtainMessage(1, i10, 0, c3272f.f9949a));
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public C15447t m12553Y(C11241l c11241l, C15516w c15516w) {
        if (c15516w == null) {
            c15516w = new C15516w();
        }
        try {
            c15516w.m16727a();
            return m12536D0(c11241l, c15516w);
        } catch (IOException e10) {
            ((C15524y1) this.f34008Y).getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to capture envelope.", e10);
            return C15447t.f48216Z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0279  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c8  */
    /* JADX INFO: renamed from: Z */
    public C15447t m12554Z(C15347d1 c15347d1, C15134J0 c15134j0, C15516w c15516w) {
        C15132I1 c15132i1M16301a;
        C15132I1 c15132i1M16309f;
        C15132I1 c15132i1;
        C15347d1 c15347d2;
        boolean z6;
        InterfaceC15159S interfaceC15159S;
        C15158R1 c15158r1M356z;
        C15158R1 c15158r1;
        C15447t c15447t;
        C15135J1 c15135j1Mo16281l;
        if (c15516w == null) {
            c15516w = new C15516w();
        }
        if (m12540G0(c15347d1, c15516w) && c15134j0 != null) {
            c15516w.f48467b.addAll(new CopyOnWriteArrayList(c15134j0.f47128p));
        }
        InterfaceC15127H logger = ((C15524y1) this.f34008Y).getLogger();
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        logger.mo16298o(enumC15375i1, "Capturing event: %s", c15347d1.f47194Y);
        Throwable thM16339a = c15347d1.m16339a();
        if (thM16339a != null && ((C15524y1) this.f34008Y).containsIgnoredExceptionForType(thM16339a)) {
            ((C15524y1) this.f34008Y).getLogger().mo16298o(enumC15375i1, "Event was dropped as the exception %s is ignored", thM16339a.getClass());
            ((C15524y1) this.f34008Y).getClientReportRecorder().mo7942e(EnumC15337e.EVENT_PROCESSOR, EnumC15359h.Error);
            return C15447t.f48216Z;
        }
        if (m12540G0(c15347d1, c15516w)) {
            if (c15134j0 != null) {
                m12547S(c15347d1, c15134j0);
                if (c15347d1.f47920H0 == null) {
                    InterfaceC15159S interfaceC15159S2 = c15134j0.f47113a;
                    c15347d1.f47920H0 = interfaceC15159S2 != null ? interfaceC15159S2.getName() : null;
                }
                if (c15347d1.f47921I0 == null) {
                    ArrayList arrayList = c15134j0.f47117e;
                    c15347d1.f47921I0 = arrayList != null ? new ArrayList(arrayList) : null;
                }
                InterfaceC15159S interfaceC15159S3 = c15134j0.f47113a;
                if (interfaceC15159S3 != null && (c15135j1Mo16281l = interfaceC15159S3.mo16281l()) != null) {
                    interfaceC15159S3 = c15135j1Mo16281l;
                }
                C15430c c15430c = c15347d1.f47195Z;
                if (c15430c.m16660a() == null) {
                    if (interfaceC15159S3 == null) {
                        c15430c.m16662c((C15138K1) C15161S1.m16342a(c15134j0.f47129q));
                    } else {
                        c15430c.m16662c(interfaceC15159S3.mo16288s());
                    }
                }
                c15347d1 = m12580y0(c15347d1, c15516w, c15134j0.f47121i);
            }
            if (c15347d1 == null) {
                ((C15524y1) this.f34008Y).getLogger().mo16298o(enumC15375i1, "Event was dropped by applyScope", new Object[0]);
                return C15447t.f48216Z;
            }
        }
        C15347d1 c15347d1M12580y0 = m12580y0(c15347d1, c15516w, ((C15524y1) this.f34008Y).getEventProcessors());
        if (c15347d1M12580y0 != null) {
            C15524y1 c15524y1 = (C15524y1) this.f34008Y;
            InterfaceC15456q1 beforeSend = c15524y1.getBeforeSend();
            if (beforeSend != null) {
                try {
                    c15347d1M12580y0 = ((C15243l) beforeSend).m16444a(c15347d1M12580y0, c15516w);
                } catch (Throwable th2) {
                    c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
                    c15347d1M12580y0 = null;
                }
            }
            if (c15347d1M12580y0 == null) {
                ((C15524y1) this.f34008Y).getLogger().mo16298o(EnumC15375i1.DEBUG, "Event was dropped by beforeSend", new Object[0]);
                ((C15524y1) this.f34008Y).getClientReportRecorder().mo7942e(EnumC15337e.BEFORE_SEND, EnumC15359h.Error);
            }
        }
        if (c15347d1M12580y0 == null) {
            return C15447t.f48216Z;
        }
        if (c15134j0 != null) {
            synchronized (c15134j0.f47124l) {
                try {
                    c15132i1M16301a = c15134j0.f47123k != null ? c15134j0.f47123k.clone() : null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            c15132i1M16301a = null;
        }
        if (c15132i1M16301a == null || c15132i1M16301a.f47105s0 == EnumC15129H1.Ok) {
            if (!AbstractC8465D3.m9093g(c15516w)) {
                c15132i1M16309f = null;
            } else if (c15134j0 != null) {
                c15132i1M16309f = c15134j0.m16309f(new C0083q0(this, c15347d1M12580y0, c15516w, 12));
            } else {
                ((C15524y1) this.f34008Y).getLogger().mo16298o(EnumC15375i1.INFO, "Scope is null on client.captureEvent", new Object[0]);
                c15132i1M16309f = null;
            }
            c15132i1 = c15132i1M16309f;
        } else {
            c15132i1 = null;
        }
        C15524y1 c15524y2 = (C15524y1) this.f34008Y;
        C15501f c15501f = c15524y2.getSampleRate() == null ? null : (C15501f) AbstractC15502g.f48424a.get();
        if (c15524y2.getSampleRate() == null || c15501f == null || c15524y2.getSampleRate().doubleValue() >= c15501f.m16686b()) {
            c15347d2 = c15347d1M12580y0;
        } else {
            ((C15524y1) this.f34008Y).getLogger().mo16298o(EnumC15375i1.DEBUG, "Event %s was dropped due to sampling decision.", c15347d1M12580y0.f47194Y);
            ((C15524y1) this.f34008Y).getClientReportRecorder().mo7942e(EnumC15337e.SAMPLE_RATE, EnumC15359h.Error);
            c15347d2 = null;
        }
        if (c15132i1 != null) {
            if (c15132i1M16301a != null) {
                EnumC15129H1 enumC15129H1 = c15132i1.f47105s0;
                EnumC15129H1 enumC15129H2 = EnumC15129H1.Crashed;
                if ((enumC15129H1 != enumC15129H2 || c15132i1M16301a.f47105s0 == enumC15129H2) && (c15132i1.f47101o0.get() <= 0 || c15132i1M16301a.f47101o0.get() > 0)) {
                    z6 = false;
                }
            }
            z6 = true;
        } else {
            z6 = false;
        }
        if (c15347d2 == null && !z6) {
            ((C15524y1) this.f34008Y).getLogger().mo16298o(EnumC15375i1.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return C15447t.f48216Z;
        }
        C15447t c15447tM12536D0 = C15447t.f48216Z;
        if (c15347d2 != null && (c15447t = c15347d2.f47194Y) != null) {
            c15447tM12536D0 = c15447t;
        }
        boolean zIsInstance = InterfaceC15363b.class.isInstance(AbstractC8465D3.m9088b(c15516w));
        if (c15347d2 != null && !zIsInstance && (c15347d2.m16576e() || c15347d2.m16575d() != null)) {
            ((C15524y1) this.f34008Y).getReplayController().mo16266k(Boolean.valueOf(c15347d2.m16575d() != null));
        }
        try {
            if (zIsInstance) {
                if (c15347d2 != null) {
                    c15158r1M356z = C0093v0.m336m(c15347d2, (C15524y1) this.f34008Y).m356z();
                    c15158r1 = c15158r1M356z;
                } else {
                    c15158r1 = null;
                }
            } else if (c15134j0 != null) {
                InterfaceC15159S interfaceC15159S4 = c15134j0.f47113a;
                if (interfaceC15159S4 != null) {
                    c15158r1M356z = interfaceC15159S4.mo16273d();
                } else {
                    C0093v0 c0093v0 = (C0093v0) c15134j0.m16308e(new C15254r((C15524y1) this.f34008Y, 6, c15134j0)).f17486p0;
                    c15158r1M356z = c0093v0 != null ? c0093v0.m356z() : null;
                }
                c15158r1 = c15158r1M356z;
            } else {
                c15158r1 = null;
            }
            C11241l c11241lM12550V = m12550V(c15347d2, c15347d2 != null ? m12528i0(c15516w) : null, c15132i1, c15158r1, null);
            c15516w.m16727a();
            if (c11241lM12550V != null) {
                c15447tM12536D0 = m12536D0(c11241lM12550V, c15516w);
            }
        } catch (C15352b e10) {
            e = e10;
            ((C15524y1) this.f34008Y).getLogger().mo16296g(EnumC15375i1.WARNING, e, "Capturing event %s failed.", c15447tM12536D0);
            c15447tM12536D0 = C15447t.f48216Z;
        } catch (IOException e11) {
            e = e11;
            ((C15524y1) this.f34008Y).getLogger().mo16296g(EnumC15375i1.WARNING, e, "Capturing event %s failed.", c15447tM12536D0);
            c15447tM12536D0 = C15447t.f48216Z;
        }
        if (c15134j0 != null && (interfaceC15159S = c15134j0.f47113a) != null && InterfaceC15372k.class.isInstance(AbstractC8465D3.m9088b(c15516w))) {
            Object objM9088b = AbstractC8465D3.m9088b(c15516w);
            if (objM9088b instanceof AbstractC15364c) {
                ((AbstractC15364c) objM9088b).mo16358g(interfaceC15159S.mo16283n());
                interfaceC15159S.mo16275f(EnumC15147N1.ABORTED, false, c15516w);
            } else {
                interfaceC15159S.mo16275f(EnumC15147N1.ABORTED, false, null);
            }
        }
        return c15447tM12536D0;
    }

    @Override // p890mb.InterfaceC17205b
    /* JADX INFO: renamed from: a */
    public Object mo12555a(Class cls) {
        if (!((Set) this.f34008Y).contains(C17220q.m18953a(cls))) {
            throw new C0644w("Attempting to request an undeclared dependency " + cls + Separators.DOT);
        }
        Object objMo12555a = ((InterfaceC17205b) this.f34011p0).mo12555a(cls);
        if (!cls.equals(InterfaceC20181a.class)) {
            return objMo12555a;
        }
        return new C17221r();
    }

    /* JADX INFO: renamed from: a0 */
    public C15447t m12556a0(C15108A1 c15108a1, C15134J0 c15134j0, C15516w c15516w) {
        C15430c c15430c;
        C15135J1 c15135j1Mo16281l;
        if (c15516w == null) {
            c15516w = new C15516w();
        }
        if (m12540G0(c15108a1, c15516w) && c15134j0 != null) {
            if (c15108a1.f47197p0 == null) {
                c15108a1.f47197p0 = c15134j0.f47116d;
            }
            if (c15108a1.f47202u0 == null) {
                c15108a1.f47202u0 = c15134j0.f47114b;
            }
            AbstractMap abstractMap = c15108a1.f47198q0;
            ConcurrentHashMap concurrentHashMap = c15134j0.f47119g;
            if (abstractMap == null) {
                c15108a1.f47198q0 = new HashMap(new HashMap(AbstractC8453B3.m9064a(concurrentHashMap)));
            } else {
                for (Map.Entry entry : AbstractC8453B3.m9064a(concurrentHashMap).entrySet()) {
                    if (!c15108a1.f47198q0.containsKey(entry.getKey())) {
                        c15108a1.f47198q0.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            Iterator it = new C15430c(c15134j0.f47127o).entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c15430c = c15108a1.f47195Z;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                if (!c15430c.containsKey(entry2.getKey())) {
                    c15430c.put((String) entry2.getKey(), entry2.getValue());
                }
            }
            InterfaceC15159S interfaceC15159S = c15134j0.f47113a;
            if (interfaceC15159S != null && (c15135j1Mo16281l = interfaceC15159S.mo16281l()) != null) {
                interfaceC15159S = c15135j1Mo16281l;
            }
            if (c15430c.m16660a() == null) {
                if (interfaceC15159S == null) {
                    c15430c.m16662c((C15138K1) C15161S1.m16342a(c15134j0.f47129q));
                } else {
                    c15430c.m16662c(interfaceC15159S.mo16288s());
                }
            }
        }
        C15524y1 c15524y1 = (C15524y1) this.f34008Y;
        c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Capturing session replay: %s", c15108a1.f47194Y);
        C15447t c15447t = C15447t.f48216Z;
        C15447t c15447t2 = c15108a1.f47194Y;
        if (c15447t2 != null) {
            c15447t = c15447t2;
        }
        for (InterfaceC15472s interfaceC15472s : c15524y1.getEventProcessors()) {
            try {
                c15108a1 = interfaceC15472s.mo16376a(c15108a1, c15516w);
            } catch (Throwable th2) {
                c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "An exception occurred while processing replay event by processor: %s", interfaceC15472s.getClass().getName());
            }
            if (c15108a1 == null) {
                c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Replay event was dropped by a processor: %s", interfaceC15472s.getClass().getName());
                c15524y1.getClientReportRecorder().mo7942e(EnumC15337e.EVENT_PROCESSOR, EnumC15359h.Replay);
                break;
            }
        }
        if (c15108a1 != null) {
            c15524y1.getBeforeSendReplay();
        }
        if (c15108a1 == null) {
            return C15447t.f48216Z;
        }
        C15158R1 c15158r1M356z = null;
        if (c15134j0 != null) {
            try {
                InterfaceC15159S interfaceC15159S2 = c15134j0.f47113a;
                if (interfaceC15159S2 != null) {
                    c15158r1M356z = interfaceC15159S2.mo16273d();
                } else {
                    C0093v0 c0093v0 = (C0093v0) c15134j0.m16308e(new C15254r(c15524y1, 6, c15134j0)).f17486p0;
                    if (c0093v0 != null) {
                        c15158r1M356z = c0093v0.m356z();
                    }
                }
            } catch (IOException e10) {
                c15524y1.getLogger().mo16296g(EnumC15375i1.WARNING, e10, "Capturing event %s failed.", c15447t);
                return C15447t.f48216Z;
            }
        }
        C11241l c11241lM12551W = m12551W(c15108a1, c15516w.f48471f, c15158r1M356z, InterfaceC15363b.class.isInstance(AbstractC8465D3.m9088b(c15516w)));
        c15516w.m16727a();
        ((InterfaceC15483f) this.f34009Z).mo16671G(c11241lM12551W, c15516w);
        return c15447t;
    }

    @Override // p890mb.InterfaceC17205b
    /* JADX INFO: renamed from: b */
    public Set mo12557b(C17220q c17220q) {
        if (((Set) this.f34010o0).contains(c17220q)) {
            return ((InterfaceC17205b) this.f34011p0).mo12557b(c17220q);
        }
        throw new C0644w("Attempting to request an undeclared dependency Set<" + c17220q + ">.");
    }

    /* JADX INFO: renamed from: b0 */
    public void m12558b0(C15132I1 c15132i1, C15516w c15516w) {
        AbstractC8483G3.m9133c(c15132i1, "Session is required.");
        C15524y1 c15524y1 = (C15524y1) this.f34008Y;
        String str = c15132i1.f47111y0;
        if (str == null || str.isEmpty()) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            InterfaceC15151P serializer = c15524y1.getSerializer();
            C15445r sdkVersion = c15524y1.getSdkVersion();
            AbstractC8483G3.m9133c(serializer, "Serializer is required.");
            m12553Y(new C11241l((C15447t) null, sdkVersion, C15321b1.m16526b(serializer, c15132i1)), c15516w);
        } catch (IOException e10) {
            c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to capture session.", e10);
        }
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: c */
    public void mo5154c(C12913D c12913d) {
        m12545L0(c12913d);
    }

    /* JADX INFO: renamed from: c0 */
    public C15447t m12559c0(C15421A c15421a, C15158R1 c15158r1, C15134J0 c15134j0, C15516w c15516w, C15113C0 c15113c0) {
        C15421A c15421aM12582z0 = c15421a;
        C15516w c15516w2 = c15516w == null ? new C15516w() : c15516w;
        if (m12540G0(c15421a, c15516w2) && c15134j0 != null) {
            c15516w2.f48467b.addAll(new CopyOnWriteArrayList(c15134j0.f47128p));
        }
        C15524y1 c15524y1 = (C15524y1) this.f34008Y;
        InterfaceC15127H logger = c15524y1.getLogger();
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        logger.mo16298o(enumC15375i1, "Capturing transaction: %s", c15421aM12582z0.f47194Y);
        C15447t c15447t = C15447t.f48216Z;
        C15447t c15447t2 = c15421aM12582z0.f47194Y;
        C15447t c15447t3 = c15447t2 != null ? c15447t2 : c15447t;
        if (m12540G0(c15421a, c15516w2)) {
            m12547S(c15421a, c15134j0);
            if (c15134j0 != null) {
                c15421aM12582z0 = m12582z0(c15421a, c15516w2, c15134j0.f47121i);
            }
            if (c15421aM12582z0 == null) {
                c15524y1.getLogger().mo16298o(enumC15375i1, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (c15421aM12582z0 != null) {
            c15421aM12582z0 = m12582z0(c15421aM12582z0, c15516w2, c15524y1.getEventProcessors());
        }
        if (c15421aM12582z0 == null) {
            c15524y1.getLogger().mo16298o(enumC15375i1, "Transaction was dropped by Event processors.", new Object[0]);
            return c15447t;
        }
        ArrayList arrayList = c15421aM12582z0.f48054E0;
        int size = arrayList.size();
        c15524y1.getBeforeSendTransaction();
        int size2 = arrayList.size();
        if (size2 < size) {
            int i10 = size - size2;
            c15524y1.getLogger().mo16298o(enumC15375i1, VjclRfeKsMflo.aBMewjfwzD, Integer.valueOf(i10));
            c15524y1.getClientReportRecorder().mo7944v(EnumC15337e.BEFORE_SEND, EnumC15359h.Span, i10);
        }
        try {
            ArrayList arrayListM12528i0 = m12528i0(c15516w2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayListM12528i0.iterator();
            while (it.hasNext()) {
                ((C15180a) it.next()).getClass();
            }
            C11241l c11241lM12550V = m12550V(c15421aM12582z0, arrayList2, null, c15158r1, c15113c0);
            c15516w2.m16727a();
            return c11241lM12550V != null ? m12536D0(c11241lM12550V, c15516w2) : c15447t3;
        } catch (C15352b | IOException e10) {
            c15524y1.getLogger().mo16296g(EnumC15375i1.WARNING, e10, "Capturing transaction %s failed.", c15447t3);
            return C15447t.f48216Z;
        }
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean mo3881d() {
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public void m12560d0(boolean z6) {
        long shutdownTimeoutMillis;
        InterfaceC15483f interfaceC15483f = (InterfaceC15483f) this.f34009Z;
        C15524y1 c15524y1 = (C15524y1) this.f34008Y;
        c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Closing SentryClient.", new Object[0]);
        try {
            ((InterfaceC15130I) this.f34011p0).close();
        } catch (IOException e10) {
            c15524y1.getLogger().mo16297h(EnumC15375i1.WARNING, "Failed to close the metrics aggregator.", e10);
        }
        if (z6) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = c15524y1.getShutdownTimeoutMillis();
            } catch (IOException e11) {
                c15524y1.getLogger().mo16297h(EnumC15375i1.WARNING, "Failed to close the connection to the Sentry Server.", e11);
            }
        }
        interfaceC15483f.mo16675r(shutdownTimeoutMillis);
        interfaceC15483f.mo16672d(z6);
        for (InterfaceC15472s interfaceC15472s : c15524y1.getEventProcessors()) {
            if (interfaceC15472s instanceof Closeable) {
                try {
                    ((Closeable) interfaceC15472s).close();
                } catch (IOException e12) {
                    c15524y1.getLogger().mo16298o(EnumC15375i1.WARNING, "Failed to close the event processor {}.", interfaceC15472s, e12);
                }
            }
        }
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: e */
    public void mo5155e(C12916b c12916b) {
        m12545L0(c12916b);
    }

    /* JADX INFO: renamed from: e0 */
    public C17447A m12561e0() {
        C21792v c21792v = (C21792v) this.f34010o0;
        if (c21792v == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        ArrayList arrayList = (ArrayList) this.f34011p0;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        AbstractC21790t abstractC21790t = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            Context context = (Context) this.f34008Y;
            int i10 = 0;
            if (!zHasNext) {
                int[] iArrM19321B0 = AbstractC17680n.m19321B0(arrayList2);
                Intent intent = (Intent) this.f34009Z;
                intent.putExtra("android-support-nav:controller:deepLinkIds", iArrM19321B0);
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                C17447A c17447a = new C17447A(context);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(c17447a.f55786Z.getPackageManager());
                }
                if (component != null) {
                    c17447a.m19124f(component);
                }
                ArrayList arrayList4 = c17447a.f55785Y;
                arrayList4.add(intent2);
                int size = arrayList4.size();
                while (i10 < size) {
                    Intent intent3 = (Intent) arrayList4.get(i10);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i10++;
                }
                return c17447a;
            }
            C21787q c21787q = (C21787q) it.next();
            int i11 = c21787q.f69119a;
            AbstractC21790t abstractC21790tM12563g0 = m12563g0(i11);
            if (abstractC21790tM12563g0 == null) {
                int i12 = AbstractC21790t.f69129t0;
                throw new IllegalArgumentException("Navigation destination " + AbstractC8634g.m9294h(context, i11) + " cannot be found in the navigation graph " + c21792v);
            }
            int[] iArrM22280m = abstractC21790tM12563g0.m22280m(abstractC21790t);
            int length = iArrM22280m.length;
            while (i10 < length) {
                arrayList2.add(Integer.valueOf(iArrM22280m[i10]));
                arrayList3.add(c21787q.f69120b);
                i10++;
            }
            abstractC21790t = abstractC21790tM12563g0;
        }
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: f */
    public void mo3708f(C12912C c12912c) {
        m12545L0(c12912c);
    }

    /* JADX INFO: renamed from: f0 */
    public void m12562f0() {
        C10424e c10424e = (C10424e) this.f34010o0;
        StringBuilder sb2 = c10424e.f30890Y;
        if (sb2.length() <= 0 || '\n' == sb2.charAt(sb2.length() - 1)) {
            return;
        }
        c10424e.m10911a('\n');
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: g */
    public void mo5156g(C12922h c12922h) {
        m12545L0(c12922h);
    }

    /* JADX INFO: renamed from: g0 */
    public AbstractC21790t m12563g0(int i10) {
        C17677k c17677k = new C17677k();
        C21792v c21792v = (C21792v) this.f34010o0;
        AbstractC16544l.m18091d(c21792v);
        c17677k.addLast(c21792v);
        while (!c17677k.isEmpty()) {
            AbstractC21790t abstractC21790t = (AbstractC21790t) c17677k.removeFirst();
            if (abstractC21790t.f69135r0 == i10) {
                return abstractC21790t;
            }
            if (abstractC21790t instanceof C21792v) {
                C21791u c21791u = new C21791u((C21792v) abstractC21790t);
                while (c21791u.hasNext()) {
                    c17677k.addLast((AbstractC21790t) c21791u.next());
                }
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC15118E
    /* JADX INFO: renamed from: h */
    public String mo12564h() {
        C15184B c15184b = (C15184B) this.f34010o0;
        Context context = (Context) this.f34008Y;
        InterfaceC15127H interfaceC15127H = (InterfaceC15127H) this.f34009Z;
        ConnectivityManager connectivityManagerM12529j0 = m12529j0(context, interfaceC15127H);
        String str = null;
        if (connectivityManagerM12529j0 != null) {
            if (AbstractC8698q3.m9399a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                try {
                    c15184b.getClass();
                    Network activeNetwork = connectivityManagerM12529j0.getActiveNetwork();
                    if (activeNetwork == null) {
                        interfaceC15127H.mo16298o(EnumC15375i1.INFO, "Network is null and cannot check network status", new Object[0]);
                    } else {
                        NetworkCapabilities networkCapabilities = connectivityManagerM12529j0.getNetworkCapabilities(activeNetwork);
                        if (networkCapabilities == null) {
                            interfaceC15127H.mo16298o(EnumC15375i1.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                        } else {
                            boolean zHasTransport = networkCapabilities.hasTransport(3);
                            boolean zHasTransport2 = networkCapabilities.hasTransport(1);
                            boolean zHasTransport3 = networkCapabilities.hasTransport(0);
                            if (zHasTransport) {
                                str = "ethernet";
                            } else if (zHasTransport2) {
                                str = "wifi";
                            } else if (zHasTransport3) {
                                str = "cellular";
                            }
                        }
                    }
                } catch (Throwable th2) {
                    interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Failed to retrieve network info", th2);
                }
            } else {
                interfaceC15127H.mo16298o(EnumC15375i1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: h0 */
    public C10822e m12565h0(AbstractC10818a abstractC10818a) {
        ArrayList arrayList = (ArrayList) this.f34010o0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C10822e c10822e = (C10822e) arrayList.get(i10);
            if (c10822e != null && c10822e.f32093b == abstractC10818a) {
                return c10822e;
            }
        }
        C10822e c10822e2 = new C10822e((Context) this.f34009Z, abstractC10818a);
        arrayList.add(c10822e2);
        return c10822e2;
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: i */
    public void mo5157i(C12932r c12932r) {
        m12545L0(c12932r);
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: j */
    public void mo2762j(int i10, C4253y c4253y, C4244p c4244p, C4249u c4249u) {
        if (m12573r0(i10, c4253y)) {
            ((C2658d) this.f34009Z).m3632e(c4244p, m12574s0(c4249u, c4253y));
        }
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: k */
    public void mo5158k(C12937w c12937w) {
        m12545L0(c12937w);
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: l */
    public void mo5159l(C12929o c12929o) {
        m12545L0(c12929o);
    }

    /* JADX INFO: renamed from: l0 */
    public C11236g m12566l0(C11239j c11239j) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        C11236g c11236g = null;
        String string = null;
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str = c11239j.f34012a;
        if (str == null) {
            c2315mM3418a.mo3426s0(1);
        } else {
            c2315mM3418a.mo3422c(1, str);
        }
        c2315mM3418a.mo3420V(2, c11239j.f34013b);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34008Y;
        workDatabase_Impl.m12339b();
        Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
        try {
            int iM8210c = AbstractC7910I5.m8210c(cursorM8212b, "work_spec_id");
            int iM8210c2 = AbstractC7910I5.m8210c(cursorM8212b, "generation");
            int iM8210c3 = AbstractC7910I5.m8210c(cursorM8212b, "system_id");
            if (cursorM8212b.moveToFirst()) {
                if (!cursorM8212b.isNull(iM8210c)) {
                    string = cursorM8212b.getString(iM8210c);
                }
                c11236g = new C11236g(string, cursorM8212b.getInt(iM8210c2), cursorM8212b.getInt(iM8210c3));
            }
            return c11236g;
        } finally {
            cursorM8212b.close();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c2315mM3418a.m3425m();
        }
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: m */
    public void mo5160m(C12923i c12923i) {
        m12545L0(c12923i);
    }

    /* JADX INFO: renamed from: m0 */
    public C13756d m12567m0() {
        C13756d c13756d = (C13756d) this.f34009Z;
        if (c13756d != null) {
            return c13756d;
        }
        AbstractC16544l.m18103p("translateX");
        throw null;
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: n */
    public void mo5161n(C12930p c12930p) {
        m12545L0(c12930p);
    }

    /* JADX INFO: renamed from: n0 */
    public C13756d m12568n0() {
        C13756d c13756d = (C13756d) this.f34010o0;
        if (c13756d != null) {
            return c13756d;
        }
        AbstractC16544l.m18103p("translateY");
        throw null;
    }

    @Override // p890mb.InterfaceC17205b
    /* JADX INFO: renamed from: o */
    public InterfaceC21170a mo12569o(Class cls) {
        return mo12575t(C17220q.m18953a(cls));
    }

    /* JADX INFO: renamed from: o0 */
    public void m12570o0(C11236g c11236g) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34008Y;
        workDatabase_Impl.m12339b();
        workDatabase_Impl.m12340c();
        try {
            ((C11231b) this.f34009Z).m12485t(c11236g);
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
        }
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: p */
    public void mo5162p(C12927m c12927m) {
        m12545L0(c12927m);
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m12571p0(C3272f c3272f) {
        C3279m c3279m = (C3279m) this.f34010o0;
        return (c3279m == null || c3272f == null || c3279m.f9997a.get() != c3272f) ? false : true;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: q */
    public long mo3882q(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        C3507f c3507fM4198f = AbstractC8301I.m8929t(0, abstractC13784r.mo15284b()).iterator();
        long jMax = 0;
        while (c3507fM4198f.f10596o0) {
            int iMo4199a = c3507fM4198f.mo4199a();
            jMax = Math.max(jMax, ((InterfaceC13786s) this.f34008Y).get(iMo4199a).mo15211c(abstractC13784r.mo15283a(iMo4199a), abstractC13784r2.mo15283a(iMo4199a), abstractC13784r3.mo15283a(iMo4199a)));
        }
        return jMax;
    }

    /* JADX INFO: renamed from: q0 */
    public int m12572q0() {
        return ((C10424e) this.f34010o0).f30890Y.length();
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: r */
    public void mo2770r(int i10, C4253y c4253y, C4244p c4244p, C4249u c4249u) {
        if (m12573r0(i10, c4253y)) {
            ((C2658d) this.f34009Z).m3630c(c4244p, m12574s0(c4249u, c4253y));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m12573r0(int i10, C4253y c4253y) {
        C4253y c4253yMo4936s;
        Object obj = this.f34008Y;
        AbstractC4237i abstractC4237i = (AbstractC4237i) this.f34011p0;
        if (c4253y != null) {
            c4253yMo4936s = abstractC4237i.mo4936s(obj, c4253y);
            if (c4253yMo4936s == null) {
                return false;
            }
        } else {
            c4253yMo4936s = null;
        }
        int iMo5003u = abstractC4237i.mo5003u(i10, obj);
        C2658d c2658d = (C2658d) this.f34009Z;
        if (c2658d.f8168a != iMo5003u || !AbstractC20817s.m21400a(c2658d.f8169b, c4253yMo4936s)) {
            this.f34009Z = new C2658d(abstractC4237i.f13809c.f8170c, iMo5003u, c4253yMo4936s);
        }
        C2658d c2658d2 = (C2658d) this.f34010o0;
        if (c2658d2.f8168a == iMo5003u && AbstractC20817s.m21400a(c2658d2.f8169b, c4253yMo4936s)) {
            return true;
        }
        this.f34010o0 = new C2658d(abstractC4237i.f13810d.f8170c, iMo5003u, c4253yMo4936s);
        return true;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: s */
    public AbstractC13784r mo3883s(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        if (((AbstractC13784r) this.f34011p0) == null) {
            this.f34011p0 = abstractC13784r3.mo15285c();
        }
        AbstractC13784r abstractC13784r4 = (AbstractC13784r) this.f34011p0;
        if (abstractC13784r4 == null) {
            AbstractC16544l.m18103p("endVelocityVector");
            throw null;
        }
        int iMo15284b = abstractC13784r4.mo15284b();
        for (int i10 = 0; i10 < iMo15284b; i10++) {
            AbstractC13784r abstractC13784r5 = (AbstractC13784r) this.f34011p0;
            if (abstractC13784r5 == null) {
                AbstractC16544l.m18103p("endVelocityVector");
                throw null;
            }
            abstractC13784r5.mo15287e(i10, ((InterfaceC13786s) this.f34008Y).get(i10).mo15212d(abstractC13784r.mo15283a(i10), abstractC13784r2.mo15283a(i10), abstractC13784r3.mo15283a(i10)));
        }
        AbstractC13784r abstractC13784r6 = (AbstractC13784r) this.f34011p0;
        if (abstractC13784r6 != null) {
            return abstractC13784r6;
        }
        AbstractC16544l.m18103p("endVelocityVector");
        throw null;
    }

    /* JADX INFO: renamed from: s0 */
    public C4249u m12574s0(C4249u c4249u, C4253y c4253y) {
        AbstractC4237i abstractC4237i = (AbstractC4237i) this.f34011p0;
        Object obj = this.f34008Y;
        long j10 = c4249u.f13892Z;
        long jMo5002t = abstractC4237i.mo5002t(j10, obj);
        long j11 = c4249u.f13893o0;
        long jMo5002t2 = abstractC4237i.mo5002t(j11, obj);
        return (jMo5002t == j10 && jMo5002t2 == j11) ? c4249u : new C4249u(c4249u.f13891Y, (C19788o) c4249u.f13894p0, jMo5002t, jMo5002t2);
    }

    @Override // p890mb.InterfaceC17205b
    /* JADX INFO: renamed from: t */
    public InterfaceC21170a mo12575t(C17220q c17220q) {
        if (((Set) this.f34009Z).contains(c17220q)) {
            return ((InterfaceC17205b) this.f34011p0).mo12575t(c17220q);
        }
        throw new C0644w("Attempting to request an undeclared dependency Provider<" + c17220q + ">.");
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: u */
    public AbstractC13784r mo3884u(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        if (((AbstractC13784r) this.f34009Z) == null) {
            this.f34009Z = abstractC13784r.mo15285c();
        }
        AbstractC13784r abstractC13784r4 = (AbstractC13784r) this.f34009Z;
        if (abstractC13784r4 == null) {
            AbstractC16544l.m18103p("valueVector");
            throw null;
        }
        int iMo15284b = abstractC13784r4.mo15284b();
        for (int i10 = 0; i10 < iMo15284b; i10++) {
            AbstractC13784r abstractC13784r5 = (AbstractC13784r) this.f34009Z;
            if (abstractC13784r5 == null) {
                AbstractC16544l.m18103p("valueVector");
                throw null;
            }
            abstractC13784r5.mo15287e(i10, ((InterfaceC13786s) this.f34008Y).get(i10).mo15213e(j10, abstractC13784r.mo15283a(i10), abstractC13784r2.mo15283a(i10), abstractC13784r3.mo15283a(i10)));
        }
        AbstractC13784r abstractC13784r6 = (AbstractC13784r) this.f34009Z;
        if (abstractC13784r6 != null) {
            return abstractC13784r6;
        }
        AbstractC16544l.m18103p("valueVector");
        throw null;
    }

    /* JADX INFO: renamed from: u0 */
    public void m12576u0(AbstractC6101o abstractC6101o) throws Throwable {
        Object objMo2524p = ((C1743k) this.f34010o0).mo2524p(abstractC6101o);
        if (objMo2524p instanceof C1748p) {
            Throwable thM2559a = C1750r.m2559a(objMo2524p);
            if (thM2559a != null) {
                throw thM2559a;
            }
            throw new C1753u("Channel was closed normally");
        }
        if (objMo2524p instanceof C1749q) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.f34011p0).getAndIncrement() == 0) {
            AbstractC0575H.m1156D((InterfaceC0571F) this.f34008Y, null, null, new C6098l(this, null), 3);
        }
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: v */
    public void mo5163v(C12928n c12928n) {
        m12545L0(c12928n);
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m12577v0(AbstractC10818a abstractC10818a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f34008Y).onActionItemClicked(m12565h0(abstractC10818a), new MenuItemC18821s((Context) this.f34009Z, (InterfaceMenuItemC19750a) menuItem));
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: w */
    public void mo5164w(C12917c c12917c) {
        m12545L0(c12917c);
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m12578w0(AbstractC10818a abstractC10818a, MenuC18814l menuC18814l) {
        C10822e c10822eM12565h0 = m12565h0(abstractC10818a);
        C12959L c12959l = (C12959L) this.f34011p0;
        Menu menuC18799A = (Menu) c12959l.get(menuC18814l);
        if (menuC18799A == null) {
            menuC18799A = new MenuC18799A((Context) this.f34009Z, menuC18814l);
            c12959l.put(menuC18814l, menuC18799A);
        }
        return ((ActionMode.Callback) this.f34008Y).onCreateActionMode(c10822eM12565h0, menuC18799A);
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: x */
    public void mo5165x(C12924j c12924j) {
        m12545L0(c12924j);
    }

    /* JADX INFO: renamed from: x0 */
    public void m12579x0(C3272f c3272f) {
        synchronized (this.f34008Y) {
            try {
                if (m12571p0(c3272f)) {
                    C3279m c3279m = (C3279m) this.f34010o0;
                    if (!c3279m.f9999c) {
                        c3279m.f9999c = true;
                        ((Handler) this.f34009Z).removeCallbacksAndMessages(c3279m);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: y */
    public void mo5166y(AbstractC12919e abstractC12919e) {
        m12545L0(abstractC12919e);
    }

    /* JADX INFO: renamed from: y0 */
    public C15347d1 m12580y0(C15347d1 c15347d1, C15516w c15516w, List list) {
        C15524y1 c15524y1 = (C15524y1) this.f34008Y;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC15472s interfaceC15472s = (InterfaceC15472s) it.next();
            try {
                boolean z6 = interfaceC15472s instanceof C15257u;
                boolean zIsInstance = InterfaceC15363b.class.isInstance(AbstractC8465D3.m9088b(c15516w));
                if (zIsInstance && z6) {
                    c15347d1 = ((C15257u) interfaceC15472s).mo16380e(c15347d1, c15516w);
                } else if (!zIsInstance && !z6) {
                    c15347d1 = interfaceC15472s.mo16380e(c15347d1, c15516w);
                }
            } catch (Throwable th2) {
                c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "An exception occurred while processing event by processor: %s", interfaceC15472s.getClass().getName());
            }
            if (c15347d1 == null) {
                c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Event was dropped by a processor: %s", interfaceC15472s.getClass().getName());
                c15524y1.getClientReportRecorder().mo7942e(EnumC15337e.EVENT_PROCESSOR, EnumC15359h.Error);
                break;
            }
        }
        return c15347d1;
    }

    @Override // io.sentry.InterfaceC15118E
    /* JADX INFO: renamed from: z */
    public EnumC15112C mo12581z() {
        EnumC15112C enumC15112C;
        Context context = (Context) this.f34008Y;
        InterfaceC15127H interfaceC15127H = (InterfaceC15127H) this.f34009Z;
        ConnectivityManager connectivityManagerM12529j0 = m12529j0(context, interfaceC15127H);
        if (connectivityManagerM12529j0 == null) {
            return EnumC15112C.UNKNOWN;
        }
        if (!AbstractC8698q3.m9399a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            interfaceC15127H.mo16298o(EnumC15375i1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return EnumC15112C.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerM12529j0.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                interfaceC15127H.mo16298o(EnumC15375i1.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                enumC15112C = EnumC15112C.DISCONNECTED;
            } else {
                enumC15112C = activeNetworkInfo.isConnected() ? EnumC15112C.CONNECTED : EnumC15112C.DISCONNECTED;
            }
            return enumC15112C;
        } catch (Throwable th2) {
            interfaceC15127H.mo16297h(EnumC15375i1.WARNING, "Could not retrieve Connection Status", th2);
            return EnumC15112C.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public C15421A m12582z0(C15421A c15421a, C15516w c15516w, List list) {
        C15524y1 c15524y1 = (C15524y1) this.f34008Y;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC15472s interfaceC15472s = (InterfaceC15472s) it.next();
            int size = c15421a.f48054E0.size();
            try {
                c15421a = interfaceC15472s.mo16381k(c15421a, c15516w);
            } catch (Throwable th2) {
                c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "An exception occurred while processing transaction by processor: %s", interfaceC15472s.getClass().getName());
            }
            int size2 = c15421a == null ? 0 : c15421a.f48054E0.size();
            if (c15421a == null) {
                c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Transaction was dropped by a processor: %s", interfaceC15472s.getClass().getName());
                InterfaceC15339g clientReportRecorder = c15524y1.getClientReportRecorder();
                EnumC15337e enumC15337e = EnumC15337e.EVENT_PROCESSOR;
                clientReportRecorder.mo7942e(enumC15337e, EnumC15359h.Transaction);
                c15524y1.getClientReportRecorder().mo7944v(enumC15337e, EnumC15359h.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i10 = size - size2;
                c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i10), interfaceC15472s.getClass().getName());
                c15524y1.getClientReportRecorder().mo7944v(EnumC15337e.EVENT_PROCESSOR, EnumC15359h.Span, i10);
            }
        }
        return c15421a;
    }

    public C11238i(C21795y navController) {
        Intent launchIntentForPackage;
        AbstractC16544l.m18094g(navController, "navController");
        Context context = navController.f33529a;
        AbstractC16544l.m18094g(context, "context");
        this.f34008Y = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f34009Z = launchIntentForPackage;
        this.f34011p0 = new ArrayList();
        this.f34010o0 = navController.m12190j();
    }

    /* JADX INFO: renamed from: j0 */
    public static ConnectivityManager m12529j0(Context context, InterfaceC15127H interfaceC15127H) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            interfaceC15127H.mo16298o(EnumC15375i1.INFO, ahZQMZ.dAj, new Object[0]);
        }
        return connectivityManager;
    }

    /* JADX INFO: renamed from: A0 */
    public static boolean m12527A0(Context context, InterfaceC15127H interfaceC15127H, C15184B c15184b, ConnectivityManager.NetworkCallback networkCallback) {
        c15184b.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerM12529j0 = m12529j0(context, interfaceC15127H);
        if (connectivityManagerM12529j0 == null) {
            return false;
        }
        if (AbstractC8698q3.m9399a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                connectivityManagerM12529j0.registerDefaultNetworkCallback(networkCallback);
                return true;
            } catch (Throwable th2) {
                interfaceC15127H.mo16297h(EnumC15375i1.WARNING, bQBnquXS.chAHchOSJdPez, th2);
                return false;
            }
        }
        interfaceC15127H.mo16298o(EnumC15375i1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
        return false;
    }

    public C11238i(C15524y1 c15524y1) {
        Object runnableC15414o0;
        this.f34010o0 = new C15163T0();
        this.f34008Y = c15524y1;
        InterfaceC15165U transportFactory = c15524y1.getTransportFactory();
        if (transportFactory instanceof C15520x0) {
            transportFactory = new C15476t0(5);
            c15524y1.setTransportFactory(transportFactory);
        }
        C15416p c15416pRetrieveParsedDsn = c15524y1.retrieveParsedDsn();
        URI uri = c15416pRetrieveParsedDsn.f48044c;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        StringBuilder sb2 = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb2.append(c15524y1.getSentryClientName());
        sb2.append(",sentry_key=");
        sb2.append(c15416pRetrieveParsedDsn.f48043b);
        String str = c15416pRetrieveParsedDsn.f48042a;
        sb2.append((str == null || str.length() <= 0) ? "" : ",sentry_secret=".concat(str));
        String string2 = sb2.toString();
        String sentryClientName = c15524y1.getSentryClientName();
        HashMap map = new HashMap();
        map.put(SIPHeaderNames.USER_AGENT, sentryClientName);
        map.put("X-Sentry-Auth", string2);
        C11232c c11232c = new C11232c();
        AbstractC8483G3.m9133c(string, "url is required");
        try {
            c11232c.f33996Y = URI.create(string).toURL();
            c11232c.f33997Z = map;
            this.f34009Z = transportFactory.mo16348b(c15524y1, c11232c);
            if (c15524y1.isEnableMetrics()) {
                runnableC15414o0 = new RunnableC15414o0(c15524y1, this);
            } else {
                runnableC15414o0 = C15409d.f48030Y;
            }
            this.f34011p0 = runnableC15414o0;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e10);
        }
    }

    public C11238i(Typeface typeface, C7552b c7552b) {
        int i10;
        int i11;
        this.f34011p0 = typeface;
        this.f34008Y = c7552b;
        this.f34010o0 = new C7227s(1024);
        int iM1537a = c7552b.m1537a(6);
        if (iM1537a != 0) {
            int i12 = iM1537a + c7552b.f2085Y;
            i10 = ((ByteBuffer) c7552b.f2088p0).getInt(((ByteBuffer) c7552b.f2088p0).getInt(i12) + i12);
        } else {
            i10 = 0;
        }
        this.f34009Z = new char[i10 * 2];
        int iM1537a2 = c7552b.m1537a(6);
        if (iM1537a2 != 0) {
            int i13 = iM1537a2 + c7552b.f2085Y;
            i11 = ((ByteBuffer) c7552b.f2088p0).getInt(((ByteBuffer) c7552b.f2088p0).getInt(i13) + i13);
        } else {
            i11 = 0;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            C7230v c7230v = new C7230v(this, i14);
            C7551a c7551aM7633c = c7230v.m7633c();
            int iM1537a3 = c7551aM7633c.m1537a(4);
            Character.toChars(iM1537a3 != 0 ? ((ByteBuffer) c7551aM7633c.f2088p0).getInt(iM1537a3 + c7551aM7633c.f2085Y) : 0, (char[]) this.f34009Z, i14 * 2);
            AbstractC4941g.m5554M("invalid metadata codepoint length", c7230v.m7632b() > 0);
            ((C7227s) this.f34010o0).m7625a(c7230v, 0, c7230v.m7632b() - 1);
        }
    }

    public C11238i(Context context) {
        this.f34008Y = context.getApplicationContext();
        this.f34009Z = C6352e.f20637o;
        this.f34010o0 = null;
        this.f34011p0 = new C0827k();
    }

    public C11238i(InterfaceC13786s interfaceC13786s) {
        this.f34008Y = interfaceC13786s;
    }

    public C11238i(InterfaceC13727C interfaceC13727C) {
        this(new C9895g4(interfaceC13727C));
    }
}
