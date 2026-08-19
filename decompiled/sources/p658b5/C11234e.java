package p658b5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.appcompat.view.AbstractC10818a;
import androidx.appcompat.view.C10822e;
import androidx.core.view.GestureDetectorCompat;
import androidx.fragment.app.AbstractActivityC11001b;
import androidx.fragment.app.AbstractC11002c;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.lifecycle.C11069E;
import androidx.work.impl.WorkDatabase_Impl;
import ao.C11136J;
import ao.C11145T;
import ao.C11150Y;
import ao.C11184q;
import ao.InterfaceC11151Z;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import fo.C13711h;
import io.sentry.AbstractC15152P0;
import io.sentry.EnumC15147N1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15154Q;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17312o;
import mm.C17314q;
import p030B2.AbstractC0728I;
import p030B2.AbstractC0738T;
import p030B2.C0750c0;
import p035B7.C0846c;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p084D4.C1951y0;
import p084D4.InterfaceC1953z0;
import p087D7.AbstractC1976c;
import p1061vb.C20513d;
import p1095x1.AbstractC21075b0;
import p110E4.C2315m;
import p1113xn.AbstractC21322p;
import p113E7.InterfaceC2353a;
import p1140z1.AbstractC21678Y;
import p1140z1.C21658D;
import p1140z1.C21665K;
import p117Eb.C2392v;
import p137F7.C2675a;
import p137F7.C2676b;
import p178H.AbstractC3166q0;
import p178H.C3124Q;
import p178H.C3139d;
import p178H.C3141e;
import p178H.C3149i;
import p202I.C3525a;
import p202I.C3529e;
import p202I.C3537m;
import p202I.C3539o;
import p214Ib.C3671n;
import p214Ib.C3676s;
import p214Ib.C3678u;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p228J.C3791A;
import p228J.C3793B;
import p228J.C3799E;
import p228J.EnumC3868w;
import p283L5.AbstractC4941g;
import p301M.InterfaceC5221c;
import p320Mj.C5461n;
import p342Nj.InterfaceC5816j;
import p422R7.C6816a;
import p422R7.C6817b;
import p422R7.C6818c;
import p422R7.C6819d;
import p422R7.C6820e;
import p422R7.C6821f;
import p422R7.C6822g;
import p422R7.C6823h;
import p422R7.C6824i;
import p422R7.C6825j;
import p425Ra.C6830c;
import p425Ra.C6836i;
import p425Ra.C6840m;
import p468T2.C7208A;
import p468T2.C7230v;
import p468T2.C7231w;
import p468T2.InterfaceC7222n;
import p500Ua.C7597f;
import p509Uk.lpqL.SfpOlmlMATQ;
import p517V2.C7740a;
import p517V2.C7747h;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC7918J5;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8138m0;
import p524Va.C8256h;
import p544W9.AbstractC8488H2;
import p544W9.AbstractC8589Y2;
import p561X.C9005s;
import p561X.TextureViewSurfaceTextureListenerC9004r;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p572Xa.C9418l;
import p572Xa.InterfaceC9419m;
import p592Y7.AbstractC9667b;
import p592Y7.EnumC9668c;
import p592Y7.InterfaceC9670e;
import p661b7.C11254a;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p666bl.InterfaceC11491g;
import p692d0.C12959L;
import p746fa.C13599h;
import p746fa.C13606o;
import p746fa.InterfaceC13594c;
import p759g1.C13801c;
import p766g8.GestureDetectorOnGestureListenerC13826c;
import p773h0.C14314v0;
import p775h2.AbstractC14376f;
import p780h7.C14424f;
import p784hb.AbstractC14434c;
import p803i7.C14941d;
import p803i7.InterfaceC14938a;
import p817j$.util.Objects;
import p817j$.util.concurrent.ConcurrentHashMap;
import p893n.C17381m;
import p893n.LayoutInflaterFactory2C17390v;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p960q9.C18655i;
import p976r.MenuC18799A;
import p976r.MenuC18814l;

/* JADX INFO: renamed from: b5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11234e implements InterfaceC5221c, InterfaceC2353a, InterfaceC9419m, InterfaceC7222n, InterfaceC13594c, InterfaceC11151Z, InterfaceC11491g {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f34000Y;

    /* JADX INFO: renamed from: Z */
    public Object f34001Z;

    /* JADX INFO: renamed from: o0 */
    public Object f34002o0;

    public /* synthetic */ C11234e(Object obj, int i10, Object obj2) {
        this.f34000Y = i10;
        this.f34001Z = obj;
        this.f34002o0 = obj2;
    }

    /* JADX INFO: renamed from: v */
    public static void m12496v(C11234e c11234e, C11241l c11241l) {
        long[] jArr = (long[]) ((C13711h) c11234e.f34001Z).f43259Z;
        C13711h c13711h = (C13711h) c11241l.f34016Y;
        long[] jArr2 = (long[]) c13711h.f43259Z;
        long[] jArr3 = (long[]) c11241l.f34017Z;
        AbstractC14434c.m15942g(jArr, jArr2, jArr3);
        C13711h c13711h2 = (C13711h) c11234e.f34001Z;
        long[] jArr4 = (long[]) c13711h2.f43260o0;
        long[] jArr5 = (long[]) c13711h.f43260o0;
        long[] jArr6 = (long[]) c13711h.f43261p0;
        AbstractC14434c.m15942g(jArr4, jArr5, jArr6);
        AbstractC14434c.m15942g((long[]) c13711h2.f43261p0, jArr6, jArr3);
        AbstractC14434c.m15942g((long[]) c11234e.f34002o0, (long[]) c13711h.f43259Z, (long[]) c13711h.f43260o0);
    }

    /* JADX INFO: renamed from: A */
    public Long m12497A(String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        Long lValueOf = null;
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.PreferenceDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT long_value FROM Preference where `key`=?");
        c2315mM3418a.mo3422c(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34001Z;
        workDatabase_Impl.m12339b();
        Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
        try {
            if (cursorM8212b.moveToFirst() && !cursorM8212b.isNull(0)) {
                lValueOf = Long.valueOf(cursorM8212b.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM8212b.close();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c2315mM3418a.m3425m();
        }
    }

    /* JADX INFO: renamed from: B */
    public Float m12498B() {
        float fFloatValue = Float.valueOf(((C2675a) this.f34001Z).f8214Z).floatValue();
        float f10 = 0.0f;
        EnumC11255b enumC11255b = EnumC11255b.f34098Y;
        if (fFloatValue >= 0.0f) {
            f10 = 100.0f;
            if (fFloatValue > 100.0f) {
                InterfaceC11256c.f34102a.getClass();
                AbstractC7889G0.m8184b(C11254a.f34097b, 4, enumC11255b, new C2675a(2, fFloatValue), null, false, 56);
            }
            return Float.valueOf(fFloatValue);
        }
        InterfaceC11256c.f34102a.getClass();
        AbstractC7889G0.m8184b(C11254a.f34097b, 4, enumC11255b, new C2675a(1, fFloatValue), null, false, 56);
        fFloatValue = f10;
        return Float.valueOf(fFloatValue);
    }

    /* JADX INFO: renamed from: C */
    public void m12499C(C11233d c11233d) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.PreferenceDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34001Z;
        workDatabase_Impl.m12339b();
        workDatabase_Impl.m12340c();
        try {
            ((C11231b) this.f34002o0).m12485t(c11233d);
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

    /* JADX INFO: renamed from: D */
    public boolean m12500D(View view) {
        InterfaceC1953z0 interfaceC1953z0 = (InterfaceC1953z0) this.f34001Z;
        int iMo3136t = interfaceC1953z0.mo3136t();
        int iMo3137z = interfaceC1953z0.mo3137z();
        int iMo3135d = interfaceC1953z0.mo3135d(view);
        int iMo3134L = interfaceC1953z0.mo3134L(view);
        C1951y0 c1951y0 = (C1951y0) this.f34002o0;
        c1951y0.f5778b = iMo3136t;
        c1951y0.f5779c = iMo3137z;
        c1951y0.f5780d = iMo3135d;
        c1951y0.f5781e = iMo3134L;
        c1951y0.f5777a = 24579;
        return c1951y0.m3132a();
    }

    /* JADX INFO: renamed from: E */
    public void m12501E(AbstractC10818a abstractC10818a) {
        C11238i c11238i = (C11238i) this.f34001Z;
        ((ActionMode.Callback) c11238i.f34008Y).onDestroyActionMode(c11238i.m12565h0(abstractC10818a));
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) this.f34002o0;
        if (layoutInflaterFactory2C17390v.f55534I0 != null) {
            layoutInflaterFactory2C17390v.f55573x0.getDecorView().removeCallbacks(layoutInflaterFactory2C17390v.f55535J0);
        }
        if (layoutInflaterFactory2C17390v.f55533H0 != null) {
            C0750c0 c0750c0 = layoutInflaterFactory2C17390v.f55536K0;
            if (c0750c0 != null) {
                c0750c0.m1600b();
            }
            C0750c0 c0750c0M1573a = AbstractC0738T.m1573a(layoutInflaterFactory2C17390v.f55533H0);
            c0750c0M1573a.m1599a(0.0f);
            layoutInflaterFactory2C17390v.f55536K0 = c0750c0M1573a;
            c0750c0M1573a.m1602d(new C17381m(this, 2));
        }
        layoutInflaterFactory2C17390v.f55532G0 = null;
        ViewGroup viewGroup = layoutInflaterFactory2C17390v.f55538M0;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        AbstractC0728I.m1543c(viewGroup);
        layoutInflaterFactory2C17390v.m19097M();
    }

    /* JADX INFO: renamed from: F */
    public boolean m12502F(AbstractC10818a abstractC10818a, MenuC18814l menuC18814l) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C17390v) this.f34002o0).f55538M0;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        AbstractC0728I.m1543c(viewGroup);
        C11238i c11238i = (C11238i) this.f34001Z;
        C10822e c10822eM12565h0 = c11238i.m12565h0(abstractC10818a);
        C12959L c12959l = (C12959L) c11238i.f34011p0;
        Menu menuC18799A = (Menu) c12959l.get(menuC18814l);
        if (menuC18799A == null) {
            menuC18799A = new MenuC18799A((Context) c11238i.f34009Z, menuC18814l);
            c12959l.put(menuC18814l, menuC18799A);
        }
        return ((ActionMode.Callback) c11238i.f34008Y).onPrepareActionMode(c10822eM12565h0, menuC18799A);
    }

    /* JADX INFO: renamed from: G */
    public void m12503G(MotionEvent event) {
        View viewM15470a;
        AbstractC16544l.m18094g(event, "event");
        ((GestureDetectorCompat) this.f34002o0).f32901a.onTouchEvent(event);
        if (event.getActionMasked() == 1) {
            GestureDetectorOnGestureListenerC13826c gestureDetectorOnGestureListenerC13826c = (GestureDetectorOnGestureListenerC13826c) this.f34001Z;
            gestureDetectorOnGestureListenerC13826c.getClass();
            Window window = (Window) gestureDetectorOnGestureListenerC13826c.f43850b.get();
            View decorView = window != null ? window.getDecorView() : null;
            EnumC9668c enumC9668c = gestureDetectorOnGestureListenerC13826c.f43855g;
            if (enumC9668c != null) {
                InterfaceC9670e interfaceC9670eM10254a = AbstractC9667b.m10254a(gestureDetectorOnGestureListenerC13826c.f43849a);
                View view = (View) gestureDetectorOnGestureListenerC13826c.f43856h.get();
                if (decorView != null && view != null) {
                    interfaceC9670eM10254a.mo10259o(enumC9668c, gestureDetectorOnGestureListenerC13826c.m15471c(view, AbstractC8128k6.m8641g((Context) gestureDetectorOnGestureListenerC13826c.f43852d.get(), view.getId()), event));
                }
            } else if (decorView != null && (viewM15470a = gestureDetectorOnGestureListenerC13826c.m15470a(decorView, gestureDetectorOnGestureListenerC13826c.f43857i, gestureDetectorOnGestureListenerC13826c.f43858j)) == gestureDetectorOnGestureListenerC13826c.m15470a(decorView, event.getX(), event.getY()) && viewM15470a != null) {
                gestureDetectorOnGestureListenerC13826c.m15472d(viewM15470a);
            }
            gestureDetectorOnGestureListenerC13826c.f43856h.clear();
            gestureDetectorOnGestureListenerC13826c.f43855g = null;
            gestureDetectorOnGestureListenerC13826c.f43858j = 0.0f;
            gestureDetectorOnGestureListenerC13826c.f43857i = 0.0f;
        }
    }

    /* JADX INFO: renamed from: H */
    public boolean m12504H() {
        float fFloatValue = m12498B().floatValue();
        if (fFloatValue == 0.0f) {
            return false;
        }
        return fFloatValue == 100.0f || ((SecureRandom) ((C17314q) this.f34002o0).getValue()).nextFloat() * ((float) 100) <= fFloatValue;
    }

    /* JADX INFO: renamed from: I */
    public void m12505I(EnumC3868w enumC3868w, C3141e c3141e) {
        C3139d c3139d;
        switch (enumC3868w) {
            case RELEASED:
            case CLOSED:
                c3139d = new C3139d(5, c3141e);
                break;
            case RELEASING:
            case CLOSING:
                c3139d = new C3139d(4, c3141e);
                break;
            case PENDING_OPEN:
                C3793B c3793b = (C3793B) this.f34001Z;
                synchronized (c3793b.f11466b) {
                    Iterator it = c3793b.f11469e.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c3139d = new C3139d(1, null);
                        } else if (((C3791A) ((Map.Entry) it.next()).getValue()).f11459a == EnumC3868w.CLOSING) {
                            c3139d = new C3139d(2, null);
                        }
                    }
                }
                break;
            case OPENING:
                c3139d = new C3139d(2, c3141e);
                break;
            case OPEN:
            case CONFIGURED:
                c3139d = new C3139d(3, c3141e);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + enumC3868w);
        }
        AbstractC8072d6.m8486c("CameraStateMachine", "New public camera state " + c3139d + " from " + enumC3868w + " and " + c3141e);
        if (Objects.equals((C3139d) ((C11069E) this.f34002o0).mo129d(), c3139d)) {
            return;
        }
        AbstractC8072d6.m8486c("CameraStateMachine", "Publishing new public camera state " + c3139d);
        ((C11069E) this.f34002o0).m12124k(c3139d);
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) {
        switch (this.f34000Y) {
            case 8:
                C11232c c11232c = (C11232c) this.f34001Z;
                if (((C3537m) c11232c.f33997Z).f10708g) {
                    return;
                }
                int iM4503a = ((C3799E) ((ArrayList) c11232c.f33996Y).get(0)).m4503a();
                boolean z6 = th2 instanceof C3124Q;
                C3539o c3539o = (C3539o) this.f34002o0;
                if (z6) {
                    C2392v c2392v = c3539o.f10715o0;
                    C3529e c3529e = new C3529e(iM4503a, (C3124Q) th2);
                    c2392v.getClass();
                    AbstractC8488H2.m9140a();
                    ((C3525a) c2392v.f7440r0).f10661i.accept(c3529e);
                } else {
                    C2392v c2392v2 = c3539o.f10715o0;
                    C3529e c3529e2 = new C3529e(iM4503a, new C3124Q("Failed to submit capture request", th2));
                    c2392v2.getClass();
                    AbstractC8488H2.m9140a();
                    ((C3525a) c2392v2.f7440r0).f10661i.accept(c3529e2);
                }
                c3539o.f10714Z.m11090x();
                return;
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
        }
    }

    @Override // p468T2.InterfaceC7222n
    /* JADX INFO: renamed from: a */
    public Object mo5355a() {
        return (C7208A) this.f34001Z;
    }

    @Override // p468T2.InterfaceC7222n
    /* JADX INFO: renamed from: b */
    public boolean mo5356b(CharSequence charSequence, int i10, int i11, C7230v c7230v) {
        if ((c7230v.f22935c & 4) > 0) {
            return true;
        }
        if (((C7208A) this.f34001Z) == null) {
            this.f34001Z = new C7208A(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C20513d) this.f34002o0).getClass();
        ((C7208A) this.f34001Z).setSpan(new C7231w(c7230v), i10, i11, 33);
        return true;
    }

    @Override // ao.InterfaceC11151Z
    /* JADX INFO: renamed from: c */
    public Object mo12376c(InterfaceC3756d interfaceC3756d, ArrayList arrayList) {
        Object objM9806b;
        Object obj = ((C11184q) this.f34002o0).get(AbstractC8138m0.m8667b(interfaceC3756d));
        AbstractC16544l.m18093f(obj, "get(...)");
        C11145T c11145t = (C11145T) obj;
        Object c11150y = c11145t.f33782a.get();
        if (c11150y == null) {
            synchronized (c11145t) {
                c11150y = c11145t.f33782a.get();
                if (c11150y == null) {
                    c11150y = new C11150Y();
                    c11145t.f33782a = new SoftReference(c11150y);
                }
            }
        }
        C11150Y c11150y2 = (C11150Y) c11150y;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C11136J((InterfaceC3777y) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = c11150y2.f33788a;
        Object obj2 = concurrentHashMap.get(arrayList2);
        if (obj2 == null) {
            try {
                objM9806b = (KSerializer) ((InterfaceC1439n) this.f34001Z).invoke(interfaceC3756d, arrayList);
            } catch (Throwable th2) {
                objM9806b = AbstractC9233X.m9806b(th2);
            }
            C17312o c17312o = new C17312o(objM9806b);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, c17312o);
            obj2 = objPutIfAbsent == null ? c17312o : objPutIfAbsent;
        }
        return ((C17312o) obj2).f55139Y;
    }

    @Override // p572Xa.InterfaceC9420n
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ Object mo3447d() {
        return new C6830c((C6836i) ((C9418l) this.f34001Z).mo3447d(), (C6840m) ((C9418l) this.f34002o0).mo3447d());
    }

    /* JADX INFO: renamed from: e */
    public void m12506e(boolean z6) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = ((AbstractC11002c) this.f34002o0).f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12506e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m12507f(boolean z6) {
        AbstractC11002c abstractC11002c = (AbstractC11002c) this.f34002o0;
        AbstractActivityC11001b abstractActivityC11001b = abstractC11002c.f33204u.f29051Z;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = abstractC11002c.f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12507f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m12508h(boolean z6) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = ((AbstractC11002c) this.f34002o0).f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12508h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m12509i(boolean z6) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = ((AbstractC11002c) this.f34002o0).f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12509i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m12510j(boolean z6) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = ((AbstractC11002c) this.f34002o0).f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12510j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m12511k(boolean z6) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = ((AbstractC11002c) this.f34002o0).f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12511k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m12512l(boolean z6) {
        AbstractC11002c abstractC11002c = (AbstractC11002c) this.f34002o0;
        AbstractActivityC11001b abstractActivityC11001b = abstractC11002c.f33204u.f29051Z;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = abstractC11002c.f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12512l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m12513m(boolean z6) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = ((AbstractC11002c) this.f34002o0).f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12513m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m12514n(boolean z6) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = ((AbstractC11002c) this.f34002o0).f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12514n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m12515o(boolean z6) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = ((AbstractC11002c) this.f34002o0).f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12515o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        switch (this.f34000Y) {
            case 8:
                ((C3539o) this.f34002o0).f10714Z.m11090x();
                break;
            default:
                AbstractC4941g.m5559R("Unexpected result from SurfaceRequest. Surface was provided twice.", ((C3149i) ((AbstractC3166q0) obj)).f9473a != 3);
                AbstractC8072d6.m8486c("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                ((SurfaceTexture) this.f34001Z).release();
                C9005s c9005s = ((TextureViewSurfaceTextureListenerC9004r) this.f34002o0).f27473Y;
                if (c9005s.f27479j != null) {
                    c9005s.f27479j = null;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m12516p(boolean z6) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = ((AbstractC11002c) this.f34002o0).f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12516p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m12517q(boolean z6) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = ((AbstractC11002c) this.f34002o0).f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12517q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m12518r(boolean z6) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = ((AbstractC11002c) this.f34002o0).f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12518r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m12519s(boolean z6) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = ((AbstractC11002c) this.f34002o0).f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            abstractComponentCallbacksC11000a.m11754q().f33196m.m12519s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34001Z).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    @Override // p746fa.InterfaceC13594c
    /* JADX INFO: renamed from: t */
    public void mo258t(C13606o c13606o) {
        C8256h c8256h = (C8256h) this.f34001Z;
        C13599h c13599h = (C13599h) this.f34002o0;
        synchronized (c8256h.f25748f) {
            c8256h.f25747e.remove(c13599h);
        }
    }

    /* JADX INFO: renamed from: u */
    public View m12520u(int i10, int i11, int i12, int i13) {
        InterfaceC1953z0 interfaceC1953z0 = (InterfaceC1953z0) this.f34001Z;
        int iMo3136t = interfaceC1953z0.mo3136t();
        int iMo3137z = interfaceC1953z0.mo3137z();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewMo3133A = interfaceC1953z0.mo3133A(i10);
            int iMo3135d = interfaceC1953z0.mo3135d(viewMo3133A);
            int iMo3134L = interfaceC1953z0.mo3134L(viewMo3133A);
            C1951y0 c1951y0 = (C1951y0) this.f34002o0;
            c1951y0.f5778b = iMo3136t;
            c1951y0.f5779c = iMo3137z;
            c1951y0.f5780d = iMo3135d;
            c1951y0.f5781e = iMo3134L;
            if (i12 != 0) {
                c1951y0.f5777a = i12;
                if (c1951y0.m3132a()) {
                    return viewMo3133A;
                }
            }
            if (i13 != 0) {
                c1951y0.f5777a = i13;
                if (c1951y0.m3132a()) {
                    view = viewMo3133A;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX INFO: renamed from: w */
    public CctBackendFactory m12521w(String str) {
        Bundle bundle;
        Map mapEmptyMap;
        Object obj;
        if (((Map) this.f34002o0) == null) {
            Context context = (Context) this.f34001Z;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    AbstractC15256t.m16482t("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        AbstractC15256t.m16482t("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        AbstractC15256t.m16482t("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        mapEmptyMap = Collections.emptyMap();
                    } else {
                        HashMap map = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(Separators.COMMA, -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        mapEmptyMap = map;
                    }
                    this.f34002o0 = mapEmptyMap;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC15256t.m16482t("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                AbstractC15256t.m16482t("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                mapEmptyMap = Collections.emptyMap();
            } else {
                HashMap map2 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                mapEmptyMap = map2;
            }
            this.f34002o0 = mapEmptyMap;
        }
        String str4 = (String) ((Map) this.f34002o0).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            AbstractC15256t.m16483u("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            AbstractC15256t.m16483u("BackendRegistry", "Could not instantiate " + str4 + Separators.DOT, e11);
            return null;
        } catch (InstantiationException e12) {
            AbstractC15256t.m16483u("BackendRegistry", "Could not instantiate " + str4 + Separators.DOT, e12);
            return null;
        } catch (NoSuchMethodException e13) {
            AbstractC15256t.m16483u("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            AbstractC15256t.m16483u("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public byte[] m12522x() {
        Callable callable;
        if (((byte[]) this.f34001Z) == null && (callable = (Callable) this.f34002o0) != null) {
            this.f34001Z = (byte[]) callable.call();
        }
        byte[] bArr = (byte[]) this.f34001Z;
        return bArr != null ? bArr : new byte[0];
    }

    @Override // p666bl.InterfaceC11491g
    /* JADX INFO: renamed from: y */
    public void mo12523y(String message) {
        AbstractC16544l.m18094g(message, "message");
        C18655i c18655i = (C18655i) this.f34001Z;
        Method method = (Method) this.f34002o0;
        if (method == null) {
            c18655i.mo12523y(message);
            return;
        }
        try {
            method.invoke(null, "Ktor Client", message);
        } catch (Throwable unused) {
            c18655i.mo12523y(message);
        }
    }

    /* JADX INFO: renamed from: z */
    public C13801c m12524z(C21658D c21658d) {
        Field field = (Field) this.f34002o0;
        if (field == null) {
            return null;
        }
        try {
            AbstractC21678Y abstractC21678YM22107a = ((C21665K) field.get(c21658d)).m22107a();
            abstractC21678YM22107a.getClass();
            return AbstractC21075b0.m21565f(abstractC21678YM22107a);
        } catch (Exception e10) {
            ((InterfaceC15127H) this.f34001Z).mo16297h(EnumC15375i1.WARNING, "Could not fetch position for LayoutNode", e10);
            return null;
        }
    }

    public /* synthetic */ C11234e(Object obj, Object obj2, boolean z6, int i10) {
        this.f34000Y = i10;
        this.f34002o0 = obj;
        this.f34001Z = obj2;
    }

    @Override // p113E7.InterfaceC2353a
    /* JADX INFO: renamed from: g */
    public String mo3437g(Object obj) {
        EnumC11255b enumC11255b;
        String str;
        C6825j model = (C6825j) obj;
        AbstractC16544l.m18094g(model, "model");
        List listM21697e0 = AbstractC21322p.m21697e0(model.f21905k, new String[]{Separators.COMMA}, 0, 6);
        C14941d c14941d = (C14941d) ((InterfaceC14938a) this.f34002o0);
        c14941d.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM21697e0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC11255b = EnumC11255b.f34098Y;
            if (!zHasNext) {
                break;
            }
            String str2 = (String) it.next();
            Iterator it2 = c14941d.f46553b.iterator();
            String str3 = str2;
            while (it2.hasNext()) {
                str3 = str3 == null ? null : (String) ((InterfaceC1436k) it2.next()).invoke(str3);
            }
            if (str3 == null) {
                AbstractC7889G0.m8184b(c14941d.f46552a, 5, enumC11255b, new C0846c(str2, 22), null, false, 56);
            } else if (!str3.equals(str2)) {
                AbstractC7889G0.m8184b(c14941d.f46552a, 4, enumC11255b, new C14424f(2, str2, str3), null, true, 40);
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
        }
        int size = arrayList.size() - 100;
        if (size > 0) {
            AbstractC7889G0.m8184b(c14941d.f46552a, 4, enumC11255b, new C14314v0(size, 1), null, false, 56);
        }
        String ddtags = AbstractC17680n.m19349Y(AbstractC17680n.m19373w0(arrayList, 100), Separators.COMMA, null, null, 0, null, null, 62);
        LinkedHashMap linkedHashMapM9252b = AbstractC8589Y2.m9252b((InterfaceC14938a) this.f34002o0, model.f21906l, null, null, null, 14);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapM9252b.entrySet()) {
            if (!AbstractC21322p.m21681O((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        InterfaceC11256c interfaceC11256c = (InterfaceC11256c) this.f34001Z;
        C6824i c6824i = model.f21901g;
        C6824i c6824i2 = c6824i != null ? new C6824i(c6824i.f21890a, c6824i.f21891b, c6824i.f21892c, AbstractC17659D.m19256r(AbstractC1976c.m3150g(AbstractC8589Y2.m9252b((InterfaceC14938a) this.f34002o0, c6824i.f21893d, "usr", "user extra information", null, 8), interfaceC11256c))) : null;
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(AbstractC1976c.m3150g(linkedHashMap, interfaceC11256c));
        int i10 = model.f21895a;
        AbstractC14376f.m15825D(i10, "status");
        String service = model.f21896b;
        AbstractC16544l.m18094g(service, "service");
        String message = model.f21897c;
        AbstractC16544l.m18094g(message, "message");
        String str4 = model.f21898d;
        C6820e c6820e = model.f21899e;
        C6817b c6817b = model.f21900f;
        AbstractC16544l.m18094g(ddtags, "ddtags");
        C3676s c3676s = new C3676s();
        switch (i10) {
            case 1:
                str = "critical";
                break;
            case 2:
                str = "error";
                break;
            case 3:
                str = "warn";
                break;
            case 4:
                str = ParameterNames.INFO;
                break;
            case 5:
                str = "debug";
                break;
            case 6:
                str = "trace";
                break;
            case 7:
                str = "emergency";
                break;
            default:
                throw null;
        }
        c3676s.m4391s("status", new C3678u(str));
        c3676s.m4394v(ReferencesHeader.SERVICE, service);
        c3676s.m4394v("message", message);
        c3676s.m4394v("date", str4);
        C3676s c3676s2 = new C3676s();
        c3676s2.m4394v(DiagnosticsEntry.NAME_KEY, c6820e.f21879a);
        String str5 = c6820e.f21880b;
        if (str5 != null) {
            c3676s2.m4394v("thread_name", str5);
        }
        c3676s2.m4394v("version", c6820e.f21881c);
        c3676s.m4391s("logger", c3676s2);
        C3676s c3676s3 = new C3676s();
        C6818c c6818c = c6817b.f21871a;
        C3676s c3676s4 = new C3676s();
        c3676s4.m4394v("architecture", c6818c.f21872a);
        c3676s3.m4391s("device", c3676s4);
        c3676s.m4391s("_dd", c3676s3);
        if (c6824i2 != null) {
            C3676s c3676s5 = new C3676s();
            String str6 = c6824i2.f21890a;
            if (str6 != null) {
                c3676s5.m4394v(ParameterNames.f31999ID, str6);
            }
            String str7 = c6824i2.f21891b;
            if (str7 != null) {
                c3676s5.m4394v(DiagnosticsEntry.NAME_KEY, str7);
            }
            String str8 = c6824i2.f21892c;
            if (str8 != null) {
                c3676s5.m4394v("email", str8);
            }
            for (Map.Entry entry2 : c6824i2.f21893d.entrySet()) {
                String str9 = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (!AbstractC17678l.m19298e(str9, C6824i.f21889e)) {
                    c3676s5.m4391s(str9, AbstractC1976c.m3153j(value));
                }
            }
            c3676s.m4391s("usr", c3676s5);
        }
        C6821f c6821f = model.f21902h;
        if (c6821f != null) {
            C3676s c3676s6 = new C3676s();
            C6816a c6816a = c6821f.f21882a;
            C3676s c3676s7 = new C3676s();
            C6822g c6822g = c6816a.f21866a;
            if (c6822g != null) {
                C3676s c3676s8 = new C3676s();
                String str10 = c6822g.f21883a;
                if (str10 != null) {
                    c3676s8.m4394v(ParameterNames.f31999ID, str10);
                }
                String str11 = c6822g.f21884b;
                if (str11 != null) {
                    c3676s8.m4394v(DiagnosticsEntry.NAME_KEY, str11);
                }
                c3676s7.m4391s("sim_carrier", c3676s8);
            }
            String str12 = c6816a.f21867b;
            if (str12 != null) {
                c3676s7.m4394v("signal_strength", str12);
            }
            String str13 = c6816a.f21868c;
            if (str13 != null) {
                c3676s7.m4394v("downlink_kbps", str13);
            }
            String str14 = c6816a.f21869d;
            if (str14 != null) {
                c3676s7.m4394v("uplink_kbps", str14);
            }
            c3676s7.m4394v("connectivity", c6816a.f21870e);
            c3676s6.m4391s("client", c3676s7);
            c3676s.m4391s("network", c3676s6);
        }
        C6819d c6819d = model.f21903i;
        if (c6819d != null) {
            C3676s c3676s9 = new C3676s();
            String str15 = c6819d.f21873a;
            if (str15 != null) {
                c3676s9.m4394v("kind", str15);
            }
            String str16 = c6819d.f21874b;
            if (str16 != null) {
                c3676s9.m4394v("message", str16);
            }
            String str17 = c6819d.f21875c;
            if (str17 != null) {
                c3676s9.m4394v("stack", str17);
            }
            String str18 = c6819d.f21876d;
            if (str18 != null) {
                c3676s9.m4394v("source_type", str18);
            }
            String str19 = c6819d.f21877e;
            if (str19 != null) {
                c3676s9.m4394v(SfpOlmlMATQ.UYVSX, str19);
            }
            List<C6823h> list = c6819d.f21878f;
            if (list != null) {
                C3671n c3671n = new C3671n(list.size());
                for (C6823h c6823h : list) {
                    c6823h.getClass();
                    C3676s c3676s10 = new C3676s();
                    c3676s10.m4394v(DiagnosticsEntry.NAME_KEY, c6823h.f21885a);
                    c3676s10.m4392t(Boolean.valueOf(c6823h.f21886b), "crashed");
                    c3676s10.m4394v("stack", c6823h.f21887c);
                    c3676s10.m4394v("state", c6823h.f21888d);
                    c3671n.m4385s(c3676s10);
                }
                c3676s9.m4391s("threads", c3671n);
            }
            c3676s.m4391s("error", c3676s9);
        }
        String str20 = model.f21904j;
        if (str20 != null) {
            c3676s.m4394v("build_id", str20);
        }
        c3676s.m4394v("ddtags", ddtags);
        for (Map.Entry entry3 : linkedHashMapM19256r.entrySet()) {
            String str21 = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (!AbstractC17678l.m19298e(str21, C6825j.f21894m)) {
                c3676s.m4391s(str21, AbstractC1976c.m3153j(value2));
            }
        }
        String string = c3676s.toString();
        AbstractC16544l.m18093f(string, "sanitizeTagsAndAttribute…odel).toJson().toString()");
        return string;
    }

    public C11234e(C7597f c7597f) {
        this.f34000Y = 15;
        this.f34002o0 = new Handler(Looper.getMainLooper());
        this.f34001Z = c7597f;
    }

    public C11234e(InterfaceC15127H interfaceC15127H) {
        this.f34000Y = 26;
        this.f34002o0 = null;
        this.f34001Z = interfaceC15127H;
        try {
            Field declaredField = C21658D.class.getDeclaredField("layoutDelegate");
            this.f34002o0 = declaredField;
            declaredField.setAccessible(true);
        } catch (Exception unused) {
            interfaceC15127H.mo16298o(EnumC15375i1.WARNING, "Could not find LayoutNode.layoutDelegate field", new Object[0]);
        }
    }

    public C11234e(InterfaceC11256c internalLogger) {
        this.f34000Y = 11;
        C14941d c14941d = new C14941d(internalLogger);
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f34001Z = internalLogger;
        this.f34002o0 = c14941d;
    }

    public C11234e(Context context, GestureDetectorOnGestureListenerC13826c gestureDetectorOnGestureListenerC13826c) {
        this.f34000Y = 22;
        AbstractC16544l.m18094g(context, "context");
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(context, gestureDetectorOnGestureListenerC13826c);
        this.f34001Z = gestureDetectorOnGestureListenerC13826c;
        this.f34002o0 = gestureDetectorCompat;
    }

    public C11234e(float f10) {
        this.f34000Y = 6;
        this.f34001Z = new C2675a(0, f10);
        this.f34002o0 = AbstractC9227W.m9800c(C2676b.f8215Y);
    }

    public C11234e(WorkDatabase_Impl workDatabase_Impl) {
        this.f34000Y = 0;
        this.f34001Z = workDatabase_Impl;
        this.f34002o0 = new C11231b(workDatabase_Impl, 1);
    }

    public C11234e(C3793B c3793b) {
        this.f34000Y = 2;
        this.f34001Z = c3793b;
        C11069E c11069e = new C11069E();
        this.f34002o0 = c11069e;
        c11069e.m12124k(new C3139d(5, null));
    }

    public C11234e(Class cls, C18655i c18655i) {
        Method declaredMethod;
        this.f34000Y = 21;
        this.f34001Z = c18655i;
        try {
            declaredMethod = cls.getDeclaredMethod("i", String.class, String.class);
        } catch (Throwable unused) {
            declaredMethod = null;
        }
        this.f34002o0 = declaredMethod;
    }

    public C11234e(AbstractC11002c abstractC11002c) {
        this.f34000Y = 18;
        this.f34001Z = new CopyOnWriteArrayList();
        this.f34002o0 = abstractC11002c;
    }

    public C11234e(Context context) {
        this.f34000Y = 19;
        this.f34002o0 = null;
        this.f34001Z = context;
    }

    public C11234e(InterfaceC5816j service, C5461n fallbackModeManager) {
        this.f34000Y = 9;
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(fallbackModeManager, "fallbackModeManager");
        this.f34001Z = service;
        this.f34002o0 = fallbackModeManager;
    }

    public C11234e(InterfaceC1439n interfaceC1439n) {
        this.f34000Y = 20;
        this.f34001Z = interfaceC1439n;
        this.f34002o0 = new C11184q();
    }

    public C11234e(InterfaceC1953z0 interfaceC1953z0) {
        this.f34000Y = 5;
        this.f34001Z = interfaceC1953z0;
        C1951y0 c1951y0 = new C1951y0();
        c1951y0.f5777a = 0;
        this.f34002o0 = c1951y0;
    }

    public C11234e(Handler handler) {
        this.f34000Y = 3;
        this.f34001Z = new HashMap();
        this.f34002o0 = handler;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11234e(int i10) {
        this(new C13711h(21), 23, new long[10]);
        this.f34000Y = i10;
        switch (i10) {
            case 23:
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11234e(C11241l c11241l) {
        this(23);
        this.f34000Y = 23;
        m12496v(this, c11241l);
    }

    public C11234e(EditText editText) {
        this.f34000Y = 1;
        this.f34001Z = editText;
        C7747h c7747h = new C7747h(editText);
        this.f34002o0 = c7747h;
        editText.addTextChangedListener(c7747h);
        if (C7740a.f24409b == null) {
            synchronized (C7740a.f24408a) {
                try {
                    if (C7740a.f24409b == null) {
                        C7740a c7740a = new C7740a();
                        try {
                            C7740a.f24410c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C7740a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C7740a.f24409b = c7740a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        editText.setEditableFactory(C7740a.f24409b);
    }

    public C11234e(Callable callable) {
        this.f34000Y = 25;
        this.f34002o0 = callable;
    }
}
