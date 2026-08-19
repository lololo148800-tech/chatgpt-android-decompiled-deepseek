package p117Eb;

import am.C10747a;
import am.C10748b;
import am.C10749c;
import am.C10752f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.util.SparseArray;
import android.widget.TextView;
import bm.C11508a;
import bo.C11527o;
import cm.C11790h;
import cm.C11791i;
import fj.C13674f;
import fj.C13676h;
import fj.C13677i;
import fj.C13679k;
import io.sentry.C15358g1;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.hints.C15370i;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16644c;
import mk.C17282c;
import mm.C17296C;
import mm.C17309l;
import no.AbstractC17708b;
import no.ThreadFactoryC17707a;
import p001A.InterfaceC0040U0;
import p004A2.C0312c;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0622l;
import p028B.C0703j;
import p041Be.AbstractC1220M;
import p041Be.C1245q;
import p041Be.C1246r;
import p041Be.EnumC1227U;
import p049Bm.InterfaceC1440o;
import p077Cn.C1743k;
import p087D7.AbstractC1976c;
import p1007s7.InterfaceC19469h;
import p103Dn.C2134H;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2186j;
import p1053v3.C20421b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1073w3.InterfaceC20802d;
import p109E3.C2292p;
import p1113xn.AbstractC21322p;
import p1126yd.C21415F;
import p1139z0.C21585H;
import p1145z7.InterfaceC21813j;
import p114E8.C2354a;
import p129En.C2599j;
import p140Fa.C2685e;
import p153Fn.AbstractC2935m;
import p167Gb.C3032c;
import p186H7.C3262b;
import p201Hn.C3516e;
import p228J.AbstractC3794B0;
import p232J3.C4227a0;
import p279L1.VOxZ.sVoFrD;
import p372P3.C6337s;
import p408Qj.C6749o;
import p451Sb.C7102a;
import p499U9.C7591u;
import p514V.C7730d;
import p521V6.AbstractC7807J;
import p521V6.C7806I;
import p521V6.C7815h;
import p521V6.C7817j;
import p523V9.AbstractC8215v5;
import p525Vb.C8258a;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.bQBnquXS;
import p610Z1.C10142i;
import p629Zl.C10422c;
import p629Zl.C10423d;
import p629Zl.C10424e;
import p658b5.C11232c;
import p658b5.C11238i;
import p661b7.InterfaceC11256c;
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
import p690cp.C12934t;
import p690cp.C12937w;
import p690cp.C12938x;
import p690cp.C12939y;
import p692d0.C12959L;
import p692d0.C12966e;
import p692d0.C12977p;
import p699d7.InterfaceC13037a;
import p712dp.C13187c;
import p712dp.C13189e;
import p729ej.C13415f;
import p729ej.C13425p;
import p775h2.AbstractC14376f;
import p780h7.InterfaceC14425g;
import p794hp.C14883a;
import p794hp.C14884b;
import p794hp.C14885c;
import p812ii.C15006f;
import p812ii.C15012l;
import p812ii.C15014n;
import p812ii.EnumC15004d;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;
import p849k7.C16354g;
import p849k7.InterfaceC16348a;
import p885m4.C17153c;
import p885m4.C17162l;
import p885m4.InterfaceC17157g;
import p885m4.InterfaceC17163m;
import p887m7.InterfaceC17178d;
import p887m7.InterfaceC17183i;
import p887m7.RunnableC17177c;
import p905nd.C17584l;
import p905nd.C17591s;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.C17690x;
import p929oi.AbstractC18201b;
import p940p4.C18295a;
import p949pj.C18433F;
import p956q3.C18621a;
import p960q9.C18655i;
import p974qo.C18792h;
import p974qo.RunnableC18789e;
import p983r7.InterfaceC18886d;
import p993rj.C19026F;
import p996rm.EnumC19250a;
import p999s.C19341c1;
import sj.hJY.CsqksqyPE;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Eb.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2391u implements InterfaceC0040U0, InterfaceC13037a, InterfaceC17183i, InterfaceC17163m {

    /* JADX INFO: renamed from: r0 */
    public static C2391u f7427r0;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7428Y;

    /* JADX INFO: renamed from: Z */
    public Object f7429Z;

    /* JADX INFO: renamed from: o0 */
    public Object f7430o0;

    /* JADX INFO: renamed from: p0 */
    public Object f7431p0;

    /* JADX INFO: renamed from: q0 */
    public Object f7432q0;

    public /* synthetic */ C2391u(int i10, boolean z6) {
        this.f7428Y = i10;
    }

    /* JADX INFO: renamed from: t */
    public static C2391u m3502t(Context context) {
        ArrayList<C10749c> arrayList = new ArrayList(3);
        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
        arrayList.add(new C10749c());
        arrayList.add(new C10749c());
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        HashSet hashSet = new HashSet(3);
        for (C10749c c10749c : arrayList) {
            if (!arrayList2.contains(c10749c)) {
                if (hashSet.contains(c10749c)) {
                    throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
                }
                hashSet.add(c10749c);
                c10749c.getClass();
                hashSet.remove(c10749c);
                if (!arrayList2.contains(c10749c)) {
                    if (C10749c.class.isAssignableFrom(c10749c.getClass())) {
                        arrayList2.add(0, c10749c);
                    } else {
                        arrayList2.add(c10749c);
                    }
                }
            }
        }
        C13187c c13187c = new C13187c(0);
        float f10 = context.getResources().getDisplayMetrics().density;
        C10752f c10752f = new C10752f();
        c10752f.f31952d = (int) ((8 * f10) + 0.5f);
        c10752f.f31949a = (int) ((24 * f10) + 0.5f);
        int i10 = (int) ((4 * f10) + 0.5f);
        c10752f.f31950b = i10;
        int i11 = (int) ((1 * f10) + 0.5f);
        c10752f.f31951c = i11;
        c10752f.f31953e = i11;
        c10752f.f31954f = i10;
        C19341c1 c19341c1 = new C19341c1();
        C2354a c2354a = new C2354a(2);
        HashMap map = new HashMap(3);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C10749c c10749c2 = (C10749c) it.next();
            c10749c2.getClass();
            c2354a.m3439b(C12912C.class, new C10748b(c10749c2));
            c2354a.m3439b(C12911B.class, new C10747a(6));
            c2354a.m3439b(C12923i.class, new C10747a(7));
            c2354a.m3439b(C12916b.class, new C10747a(8));
            c2354a.m3439b(C12918d.class, new C10747a(9));
            c2354a.m3439b(C12924j.class, new C10747a(10));
            c2354a.m3439b(C12930p.class, new C10747a(11));
            c2354a.m3439b(C12929o.class, new C10747a(12));
            c2354a.m3439b(C12917c.class, new C10747a(14));
            c2354a.m3439b(C12937w.class, new C10747a(14));
            c2354a.m3439b(C12934t.class, new C10747a(13));
            c2354a.m3439b(C12913D.class, new C10747a(0));
            c2354a.m3439b(C12926l.class, new C10747a(1));
            ArrayList arrayList3 = arrayList2;
            c2354a.m3439b(C12939y.class, new C10747a(2));
            c2354a.m3439b(C12925k.class, new C10747a(3));
            c2354a.m3439b(C12938x.class, new C10747a(4));
            c2354a.m3439b(C12931q.class, new C10747a(5));
            C11508a c11508a = new C11508a(1);
            map.put(C12911B.class, new C11508a(7));
            map.put(C12923i.class, new C11508a(3));
            map.put(C12916b.class, new C11508a(0));
            map.put(C12918d.class, new C11508a(2));
            map.put(C12924j.class, c11508a);
            map.put(C12930p.class, c11508a);
            map.put(C12934t.class, new C11508a(6));
            map.put(C12926l.class, new C11508a(4));
            map.put(C12931q.class, new C11508a(5));
            map.put(C12913D.class, new C11508a(8));
            it = it;
            bufferType = bufferType;
            arrayList2 = arrayList3;
            c13187c = c13187c;
            c2354a = c2354a;
        }
        C13187c c13187c2 = c13187c;
        ArrayList arrayList4 = arrayList2;
        TextView.BufferType bufferType2 = bufferType;
        C2354a c2354a2 = c2354a;
        C10752f c10752f2 = new C10752f();
        c10752f2.f31949a = c10752f.f31949a;
        c10752f2.f31950b = c10752f.f31950b;
        c10752f2.f31951c = c10752f.f31951c;
        c10752f2.f31952d = c10752f.f31952d;
        c10752f2.f31953e = c10752f.f31953e;
        c10752f2.f31954f = c10752f.f31954f;
        C18655i c18655i = new C18655i(DesugarCollections.unmodifiableMap(map), 23);
        c19341c1.f61254Y = c10752f2;
        c19341c1.f61260s0 = c18655i;
        if (((C7102a) c19341c1.f61255Z) == null) {
            c19341c1.f61255Z = new C7102a(24);
        }
        if (((C15370i) c19341c1.f61256o0) == null) {
            c19341c1.f61256o0 = new C15370i(25);
        }
        if (((C2685e) c19341c1.f61257p0) == null) {
            c19341c1.f61257p0 = new C2685e();
        }
        if (((C8258a) c19341c1.f61258q0) == null) {
            c19341c1.f61258q0 = new C8258a();
        }
        if (((C7591u) c19341c1.f61259r0) == null) {
            c19341c1.f61259r0 = new C7591u(24);
        }
        return new C2391u(bufferType2, new C13189e(c13187c2), new C11232c(c2354a2, new C2392v(c19341c1)), DesugarCollections.unmodifiableList(arrayList4), 10);
    }

    /* JADX INFO: renamed from: y */
    public static synchronized C2391u m3503y() {
        try {
            if (f7427r0 == null) {
                f7427r0 = new C2391u(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f7427r0;
    }

    /* JADX INFO: renamed from: A */
    public boolean m3504A(Context context) {
        if (((Boolean) this.f7431p0) == null) {
            this.f7431p0 = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f7430o0).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f7431p0).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: C */
    public Object m3506C(InterfaceC2186j interfaceC2186j, String str, String str2, AbstractC19687c abstractC19687c) {
        C1246r c1246r;
        C15006f c15006f;
        Integer num;
        Map mapM19249k;
        C2391u c2391u;
        C15006f c15006f2;
        Map map;
        int iIntValue = 0;
        if (abstractC19687c instanceof C1246r) {
            c1246r = (C1246r) abstractC19687c;
            int i10 = c1246r.f3286r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1246r.f3286r0 = i10 - Integer.MIN_VALUE;
            } else {
                c1246r = new C1246r(this, abstractC19687c);
            }
        } else {
            c1246r = new C1246r(this, abstractC19687c);
        }
        Object obj = c1246r.f3284p0;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c1246r.f3286r0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(obj);
            }
            if (i11 == 2) {
                map = c1246r.f3283o0;
                c15006f2 = c1246r.f3282Z;
                c2391u = c1246r.f3281Y;
                AbstractC9233X.m9807c(obj);
                mapM19249k = map;
                c15006f = c15006f2;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        if (AbstractC16544l.m18089b(str, "delta_encoding")) {
            String strM21712t0 = AbstractC21322p.m21712t0(str2, '\"');
            AbstractC16645d abstractC16645d = AbstractC1220M.f3218a;
            this.f7430o0 = AbstractC16544l.m18089b(strM21712t0, "v1") ? EnumC1227U.f3235Z : EnumC1227U.f3234Y;
            Object c21415f = new C21415F(strM21712t0);
            c1246r.f3286r0 = 1;
            return interfaceC2186j.mo395a(c21415f, c1246r) == obj2 ? obj2 : c17296c;
        }
        if (AbstractC16544l.m18089b(str, "delta") && ((EnumC1227U) this.f7430o0) == EnumC1227U.f3235Z) {
            C11527o c11527o = AbstractC18201b.f58034a;
            c11527o.getClass();
            C15006f newPatch = (C15006f) c11527o.m12903b(str2, C15006f.Companion.serializer());
            C15006f previousPatch = (C15006f) this.f7431p0;
            AbstractC16544l.m18094g(previousPatch, "previousPatch");
            AbstractC16544l.m18094g(newPatch, "newPatch");
            EnumC15004d enumC15004d = newPatch.f46696a;
            if (enumC15004d == null) {
                enumC15004d = previousPatch.f46696a;
            }
            EnumC15004d enumC15004d2 = enumC15004d;
            C15012l c15012l = newPatch.f46697b;
            if (c15012l == null) {
                c15012l = previousPatch.f46697b;
            }
            C15012l c15012l2 = c15012l;
            AbstractC16643b abstractC16643b = newPatch.f46698c;
            if (abstractC16643b == null) {
                abstractC16643b = previousPatch.f46698c;
            }
            AbstractC16643b abstractC16643b2 = abstractC16643b;
            String str3 = newPatch.f46699d;
            if (str3 == null) {
                str3 = previousPatch.f46699d;
            }
            String str4 = str3;
            Integer num2 = newPatch.f46700e;
            if (num2 == null) {
                num2 = previousPatch.f46700e;
            }
            c15006f = new C15006f(enumC15004d2, c15012l2, abstractC16643b2, str4, num2);
            C15014n c15014n = C15014n.f46708a;
            Map targets = (Map) this.f7432q0;
            AbstractC16544l.m18094g(targets, "targets");
            Set setKeySet = targets.keySet();
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else if (setKeySet.size() > 1 && (num = (Integer) AbstractC17680n.m19354d0(setKeySet)) != null) {
                iIntValue = num.intValue();
            }
            AbstractC16643b c16644c = (AbstractC16643b) targets.get(Integer.valueOf(iIntValue));
            if (c16644c == null) {
                c16644c = new C16644c(C17690x.f56481Y);
            }
            AbstractC16643b abstractC16643bM16143a = c15014n.m16143a(c16644c, c15006f, c11527o);
            mapM19249k = AbstractC17659D.m19249k(targets, new C17309l(Integer.valueOf(iIntValue), abstractC16643bM16143a));
            String strM12905d = c11527o.m12905d(AbstractC16643b.Companion.serializer(), abstractC16643bM16143a);
            C1245q.f3280d.getClass();
            Object objM1970e = C1245q.m1970e(strM12905d);
            if (objM1970e != null) {
                c1246r.f3281Y = this;
                c1246r.f3282Z = c15006f;
                c1246r.f3283o0 = mapM19249k;
                c1246r.f3286r0 = 2;
                if (interfaceC2186j.mo395a(objM1970e, c1246r) == obj2) {
                    return obj2;
                }
                c2391u = this;
                c15006f2 = c15006f;
                map = mapM19249k;
                mapM19249k = map;
                c15006f = c15006f2;
            } else {
                c2391u = this;
            }
        } else {
            C1245q.f3280d.getClass();
            Object objM1970e2 = C1245q.m1970e(str2);
            if (objM1970e2 != null) {
                c1246r.f3286r0 = 3;
                if (interfaceC2186j.mo395a(objM1970e2, c1246r) == obj2) {
                    return obj2;
                }
            }
        }
        return c17296c;
        c2391u.f7431p0 = c15006f;
        c2391u.f7432q0 = mapM19249k;
        return c17296c;
    }

    /* JADX INFO: renamed from: D */
    public void m3507D() {
        byte[] bArr = AbstractC17708b.f56536a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f7432q0).iterator();
                AbstractC16544l.m18093f(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    RunnableC18789e runnableC18789e = (RunnableC18789e) it.next();
                    if (((ArrayDeque) this.f7430o0).size() >= 64) {
                        break;
                    }
                    if (runnableC18789e.f59714Z.get() < 5) {
                        it.remove();
                        runnableC18789e.f59714Z.incrementAndGet();
                        arrayList.add(runnableC18789e);
                        ((ArrayDeque) this.f7430o0).add(runnableC18789e);
                    }
                }
                m3508E();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            RunnableC18789e runnableC18789e2 = (RunnableC18789e) arrayList.get(i10);
            ExecutorService executorServiceM3524v = m3524v();
            runnableC18789e2.getClass();
            C18792h c18792h = runnableC18789e2.f59715o0;
            C2391u c2391u = c18792h.f59721Y.f55357Y;
            byte[] bArr2 = AbstractC17708b.f56536a;
            try {
                try {
                    ((ThreadPoolExecutor) executorServiceM3524v).execute(runnableC18789e2);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    c18792h.m20067i(interruptedIOException);
                    runnableC18789e2.f59713Y.mo1007h(c18792h, interruptedIOException);
                    c18792h.f59721Y.f55357Y.m3526x(runnableC18789e2);
                }
            } catch (Throwable th3) {
                c18792h.f59721Y.f55357Y.m3526x(runnableC18789e2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public synchronized int m3508E() {
        return ((ArrayDeque) this.f7430o0).size() + ((ArrayDeque) this.f7431p0).size();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00dd -> B:44:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e3 -> B:19:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: F */
    public java.lang.Object m3509F(p103Dn.InterfaceC2186j r11, io.ktor.utils.p815io.InterfaceC15088n r12, sm.AbstractC19687c r13) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p117Eb.C2391u.m3509F(Dn.j, io.ktor.utils.io.n, sm.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: G */
    public void m3510G(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        List list = (List) this.f7432q0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C10749c) it.next()).getClass();
            C11790h[] c11790hArr = (C11790h[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C11790h.class);
            if (c11790hArr != null) {
                TextPaint paint = textView.getPaint();
                for (C11790h c11790h : c11790hArr) {
                    c11790h.f35754p0 = (int) (paint.measureText(c11790h.f35752Z) + 0.5f);
                }
            }
            C11791i[] c11791iArr = (C11791i[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C11791i.class);
            if (c11791iArr != null) {
                for (C11791i c11791i : c11791iArr) {
                    spannableStringBuilder.removeSpan(c11791i);
                }
            }
            C11791i c11791i2 = new C11791i();
            new WeakReference(textView);
            spannableStringBuilder.setSpan(c11791i2, 0, spannableStringBuilder.length(), 18);
        }
        textView.setText(spannableStringBuilder, (TextView.BufferType) this.f7429Z);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((C10749c) it2.next()).getClass();
            if (textView.getMovementMethod() == null) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public SpannableStringBuilder m3511H(String str) {
        List list = (List) this.f7432q0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C10749c) it.next()).getClass();
        }
        AbstractC12935u abstractC12935uM14846a = ((C13189e) this.f7430o0).m14846a(str);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((C10749c) it2.next()).getClass();
        }
        C11232c c11232c = (C11232c) this.f7431p0;
        C3032c c3032c = new C3032c(25);
        C2354a c2354a = (C2354a) c11232c.f33996Y;
        C10424e c10424e = new C10424e();
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(c2354a.f7308b);
        C2392v c2392v = (C2392v) c11232c.f33997Z;
        C11238i c11238i = new C11238i();
        c11238i.f34008Y = c2392v;
        c11238i.f34009Z = c3032c;
        c11238i.f34010o0 = c10424e;
        c11238i.f34011p0 = mapUnmodifiableMap;
        abstractC12935uM14846a.mo14588a(c11238i);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((C10749c) it3.next()).getClass();
        }
        C10424e c10424e2 = (C10424e) c11238i.f34010o0;
        C10423d c10423d = new C10423d(c10424e2.f30890Y);
        for (C10422c c10422c : c10424e2.f30891Z) {
            c10423d.setSpan(c10422c.f30886a, c10422c.f30887b, c10422c.f30888c, c10422c.f30889d);
        }
        return (!TextUtils.isEmpty(c10423d) || TextUtils.isEmpty(str)) ? c10423d : new SpannableStringBuilder(str);
    }

    @Override // p699d7.InterfaceC13037a
    /* JADX INFO: renamed from: a */
    public void mo3513a() {
        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) this.f7432q0);
        ((AtomicBoolean) this.f7431p0).set(false);
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: b */
    public void mo198b(TotalCaptureResult totalCaptureResult) {
        if (((C10142i) this.f7431p0) != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = (Rect) this.f7432q0;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            ((C10142i) this.f7431p0).m10747a(null);
            this.f7431p0 = null;
            this.f7432q0 = null;
        }
    }

    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void mo3514c() {
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: d */
    public void mo199d(float f10, C10142i c10142i) {
        Rect rect = (Rect) ((C0703j) this.f7429Z).m1476a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        float fWidth = rect.width() / f10;
        float fHeight = rect.height() / f10;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        this.f7430o0 = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        C10142i c10142i2 = (C10142i) this.f7431p0;
        if (c10142i2 != null) {
            c10142i2.m10748b(new C2292p("There is a new zoomRatio being set"));
        }
        this.f7432q0 = (Rect) this.f7430o0;
        this.f7431p0 = c10142i;
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: e */
    public float mo200e() {
        Float f10 = (Float) ((C0703j) this.f7429Z).m1476a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 != null && f10.floatValue() >= 1.0f) {
            return f10.floatValue();
        }
        return 1.0f;
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: g */
    public float mo201g() {
        return 1.0f;
    }

    @Override // p699d7.InterfaceC13037a
    public String getName() {
        return (String) this.f7429Z;
    }

    @Override // p887m7.InterfaceC17183i
    /* JADX INFO: renamed from: h */
    public void mo3515h() {
        AbstractC1976c.m3146c((ScheduledThreadPoolExecutor) this.f7430o0, AbstractC9306j0.m9891j((String) this.f7429Z, ": data upload", new StringBuilder()), (InterfaceC11256c) this.f7431p0, (RunnableC17177c) this.f7432q0);
    }

    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: i */
    public /* synthetic */ InterfaceC17157g mo3516i(byte[] bArr, int i10, int i11) {
        return AbstractC14376f.m15838d(this, bArr, i11);
    }

    @Override // p699d7.InterfaceC13037a
    /* JADX INFO: renamed from: k */
    public void mo3517k(Context appContext) {
        AbstractC16544l.m18094g(appContext, "appContext");
        this.f7432q0 = Thread.getDefaultUncaughtExceptionHandler();
        C3262b c3262b = new C3262b((C16354g) this.f7430o0, appContext);
        c3262b.f9935o0 = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(c3262b);
        ((AtomicBoolean) this.f7431p0).set(true);
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: l */
    public Rect mo202l() {
        Rect rect = (Rect) this.f7430o0;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) ((C0703j) this.f7429Z).m1476a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    @Override // p887m7.InterfaceC17183i
    /* JADX INFO: renamed from: m */
    public void mo3518m() {
        ((ScheduledThreadPoolExecutor) this.f7430o0).remove((RunnableC17177c) this.f7432q0);
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: n */
    public void mo203n(C7730d c7730d) {
        Rect rect = (Rect) this.f7430o0;
        if (rect != null) {
            c7730d.m7996a(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: o */
    public void mo3519o(byte[] bArr, int i10, int i11, C17162l c17162l, InterfaceC20802d interfaceC20802d) {
        char c9;
        C20811m c20811m;
        int i12;
        int i13;
        C20421b c20421b;
        C20811m c20811m2;
        int i14;
        int i15;
        int iM21368w;
        int i16 = 4;
        int i17 = 128;
        C20811m c20811m3 = (C20811m) this.f7429Z;
        c20811m3.m21342D(i10 + i11, bArr);
        c20811m3.m21344F(i10);
        char c10 = 255;
        int i18 = 0;
        int i19 = 2;
        if (c20811m3.m21346a() > 0 && (c20811m3.f66092a[c20811m3.f66093b] & 255) == 120) {
            if (((Inflater) this.f7432q0) == null) {
                this.f7432q0 = new Inflater();
            }
            Inflater inflater = (Inflater) this.f7432q0;
            int i20 = AbstractC20817s.f66106a;
            if (c20811m3.m21346a() > 0) {
                C20811m c20811m4 = (C20811m) this.f7430o0;
                if (c20811m4.f66092a.length < c20811m3.m21346a()) {
                    c20811m4.m21347b(c20811m3.m21346a() * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                Inflater inflater2 = inflater;
                inflater2.setInput(c20811m3.f66092a, c20811m3.f66093b, c20811m3.m21346a());
                int iInflate = 0;
                while (true) {
                    try {
                        byte[] bArr2 = c20811m4.f66092a;
                        iInflate += inflater2.inflate(bArr2, iInflate, bArr2.length - iInflate);
                        if (!inflater2.finished()) {
                            if (!inflater2.needsDictionary() && !inflater2.needsInput()) {
                                byte[] bArr3 = c20811m4.f66092a;
                                if (iInflate == bArr3.length) {
                                    c20811m4.m21347b(bArr3.length * 2);
                                }
                            }
                            inflater2.reset();
                            break;
                        }
                        c20811m4.m21343E(iInflate);
                        inflater2.reset();
                        c20811m3.m21342D(c20811m4.f66094c, c20811m4.f66092a);
                        break;
                    } catch (DataFormatException unused) {
                    } catch (Throwable th2) {
                        inflater2.reset();
                        throw th2;
                    }
                }
            }
        }
        C18295a c18295a = (C18295a) this.f7431p0;
        c18295a.f58392d = 0;
        c18295a.f58393e = 0;
        c18295a.f58394f = 0;
        c18295a.f58395g = 0;
        c18295a.f58396h = 0;
        c18295a.f58397i = 0;
        C20811m c20811m5 = c18295a.f58389a;
        c20811m5.m21341C(0);
        c18295a.f58391c = false;
        ArrayList arrayList = new ArrayList();
        while (c20811m3.m21346a() >= 3) {
            int i21 = c20811m3.f66094c;
            int iM21365t = c20811m3.m21365t();
            int iM21371z = c20811m3.m21371z();
            int i22 = c20811m3.f66093b + iM21371z;
            C20421b c20421b2 = null;
            if (i22 > i21) {
                c20811m3.m21344F(i21);
                i12 = i17;
                i13 = i18;
                c20811m = c20811m5;
                c20421b = null;
                c9 = c10;
            } else {
                int[] iArr = c18295a.f58390b;
                if (iM21365t != i17) {
                    switch (iM21365t) {
                        case 20:
                            if (iM21371z % 5 == i19) {
                                c20811m3.m21345G(i19);
                                Arrays.fill(iArr, i18);
                                int i23 = iM21371z / 5;
                                int i24 = i18;
                                while (i24 < i23) {
                                    int iM21365t2 = c20811m3.m21365t();
                                    double dM21365t = c20811m3.m21365t();
                                    double dM21365t2 = c20811m3.m21365t() - 128;
                                    double dM21365t3 = c20811m3.m21365t() - 128;
                                    iArr[iM21365t2] = (AbstractC20817s.m21408i((int) ((1.402d * dM21365t2) + dM21365t), 0, 255) << 16) | (c20811m3.m21365t() << 24) | (AbstractC20817s.m21408i((int) ((dM21365t - (0.34414d * dM21365t3)) - (dM21365t2 * 0.71414d)), 0, 255) << 8) | AbstractC20817s.m21408i((int) ((dM21365t3 * 1.772d) + dM21365t), 0, 255);
                                    i24++;
                                    c20811m5 = c20811m5;
                                    c10 = 255;
                                }
                                c9 = c10;
                                c20811m2 = c20811m5;
                                c18295a.f58391c = true;
                            } else {
                                c9 = c10;
                                c20811m2 = c20811m5;
                            }
                            break;
                        case 21:
                            if (iM21371z >= i16) {
                                c20811m3.m21345G(3);
                                int i25 = iM21371z - 4;
                                if (((c20811m3.m21365t() & i17) != 0 ? 1 : i18) == 0) {
                                    i14 = c20811m5.f66093b;
                                    i15 = c20811m5.f66094c;
                                    if (i14 < i15 && i25 > 0) {
                                        int iMin = Math.min(i25, i15 - i14);
                                        c20811m3.m21350e(c20811m5.f66092a, i14, iMin);
                                        c20811m5.m21344F(i14 + iMin);
                                    }
                                } else if (i25 >= 7 && (iM21368w = c20811m3.m21368w()) >= i16) {
                                    c18295a.f58396h = c20811m3.m21371z();
                                    c18295a.f58397i = c20811m3.m21371z();
                                    c20811m5.m21341C(iM21368w - i16);
                                    i25 = iM21371z - 11;
                                    i14 = c20811m5.f66093b;
                                    i15 = c20811m5.f66094c;
                                    if (i14 < i15) {
                                        int iMin2 = Math.min(i25, i15 - i14);
                                        c20811m3.m21350e(c20811m5.f66092a, i14, iMin2);
                                        c20811m5.m21344F(i14 + iMin2);
                                    }
                                }
                            }
                            c9 = c10;
                            c20811m2 = c20811m5;
                            break;
                        case 22:
                            if (iM21371z >= 19) {
                                c18295a.f58392d = c20811m3.m21371z();
                                c18295a.f58393e = c20811m3.m21371z();
                                c20811m3.m21345G(11);
                                c18295a.f58394f = c20811m3.m21371z();
                                c18295a.f58395g = c20811m3.m21371z();
                            }
                            c9 = c10;
                            c20811m2 = c20811m5;
                            break;
                        default:
                            c9 = c10;
                            c20811m2 = c20811m5;
                            break;
                    }
                    c20811m = c20811m2;
                    i13 = 0;
                    i12 = 128;
                } else {
                    c9 = c10;
                    C20811m c20811m6 = c20811m5;
                    if (c18295a.f58392d == 0 || c18295a.f58393e == 0 || c18295a.f58396h == 0 || c18295a.f58397i == 0) {
                        c20811m = c20811m6;
                    } else {
                        c20811m = c20811m6;
                        int i26 = c20811m.f66094c;
                        if (i26 != 0 && c20811m.f66093b == i26 && c18295a.f58391c) {
                            c20811m.m21344F(0);
                            int i27 = c18295a.f58396h * c18295a.f58397i;
                            int[] iArr2 = new int[i27];
                            int i28 = 0;
                            while (i28 < i27) {
                                int iM21365t3 = c20811m.m21365t();
                                if (iM21365t3 != 0) {
                                    iArr2[i28] = iArr[iM21365t3];
                                    i28++;
                                } else {
                                    int iM21365t4 = c20811m.m21365t();
                                    if (iM21365t4 != 0) {
                                        int iM21365t5 = ((iM21365t4 & 64) == 0 ? iM21365t4 & 63 : ((iM21365t4 & 63) << 8) | c20811m.m21365t()) + i28;
                                        Arrays.fill(iArr2, i28, iM21365t5, (iM21365t4 & 128) == 0 ? iArr[0] : iArr[c20811m.m21365t()]);
                                        i28 = iM21365t5;
                                    }
                                }
                            }
                            i12 = 128;
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, c18295a.f58396h, c18295a.f58397i, Bitmap.Config.ARGB_8888);
                            float f10 = c18295a.f58394f;
                            float f11 = c18295a.f58392d;
                            float f12 = f10 / f11;
                            float f13 = c18295a.f58395g;
                            float f14 = c18295a.f58393e;
                            c20421b2 = new C20421b(null, null, null, bitmapCreateBitmap, f13 / f14, 0, 0, f12, 0, Integer.MIN_VALUE, -3.4028235E38f, c18295a.f58396h / f11, c18295a.f58397i / f14, false, -16777216, Integer.MIN_VALUE, 0.0f);
                        }
                        i13 = 0;
                        c18295a.f58392d = 0;
                        c18295a.f58393e = 0;
                        c18295a.f58394f = 0;
                        c18295a.f58395g = 0;
                        c18295a.f58396h = 0;
                        c18295a.f58397i = 0;
                        c20811m.m21341C(0);
                        c18295a.f58391c = false;
                    }
                    i12 = 128;
                    i13 = 0;
                    c18295a.f58392d = 0;
                    c18295a.f58393e = 0;
                    c18295a.f58394f = 0;
                    c18295a.f58395g = 0;
                    c18295a.f58396h = 0;
                    c18295a.f58397i = 0;
                    c20811m.m21341C(0);
                    c18295a.f58391c = false;
                }
                c20811m3.m21344F(i22);
                c20421b = c20421b2;
            }
            if (c20421b != null) {
                arrayList.add(c20421b);
            }
            c20811m5 = c20811m;
            c10 = c9;
            i17 = i12;
            i19 = 2;
            i18 = i13;
            i16 = 4;
        }
        interfaceC20802d.accept(new C17153c(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p001A.InterfaceC0040U0
    /* JADX INFO: renamed from: p */
    public void mo204p() {
        this.f7432q0 = null;
        this.f7430o0 = null;
        C10142i c10142i = (C10142i) this.f7431p0;
        if (c10142i != null) {
            c10142i.m10748b(new C2292p("Camera is not active."));
            this.f7431p0 = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m3520q(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size >= 0) {
            throw AbstractC14376f.m15860z(size, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.f7431p0;
        if (arrayList2.size() <= 0) {
            return;
        }
        int size2 = arrayList2.size();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = (ArrayList) this.f7432q0;
            if (i10 >= size2) {
                for (int size3 = arrayList3.size() - 1; -1 < size3; size3--) {
                    arrayList2.remove(((Number) arrayList3.get(size3)).intValue());
                }
                if (arrayList2.size() > 0) {
                    throw AbstractC14376f.m15860z(0, arrayList2);
                }
                arrayList2.clear();
                arrayList3.clear();
                return;
            }
            if (!arrayList3.contains(Integer.valueOf(i10))) {
                if (arrayList2.get(i10) != null) {
                    throw new ClassCastException();
                }
                int i11 = i10 + 1;
                if (i11 < arrayList2.size()) {
                    throw AbstractC14376f.m15860z(i11, arrayList2);
                }
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: r */
    public Object m3521r(Context context, C17584l c17584l) throws Throwable {
        C3516e c3516e = AbstractC0593T.f1824a;
        Object objM1168P = AbstractC0575H.m1168P(AbstractC2935m.f8797a.f3819q0, new C7806I(this, context, null), c17584l);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        C17296C c17296c = C17296C.f55119a;
        if (objM1168P != enumC19250a) {
            objM1168P = c17296c;
        }
        return objM1168P == enumC19250a ? objM1168P : c17296c;
    }

    /* JADX INFO: renamed from: s */
    public void m3522s() {
        synchronized (((ArrayList) this.f7430o0)) {
            try {
                int size = ((ArrayList) this.f7430o0).size() - 1;
                if (-1 < size) {
                    if (((ArrayList) this.f7430o0).get(size) != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m3523u(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C12959L) this.f7430o0).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                m3523u(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: v */
    public synchronized ExecutorService m3524v() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f7429Z) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = AbstractC17708b.f56542g + " Dispatcher";
                AbstractC16544l.m18094g(name, "name");
                this.f7429Z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC17707a(name, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f7429Z;
            AbstractC16544l.m18091d(threadPoolExecutor);
        } catch (Throwable th2) {
            throw th2;
        }
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: w */
    public void m3525w(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m3507D();
    }

    /* JADX INFO: renamed from: x */
    public void m3526x(RunnableC18789e call) {
        AbstractC16544l.m18094g(call, "call");
        call.f59714Z.decrementAndGet();
        m3525w((ArrayDeque) this.f7430o0, call);
    }

    public /* synthetic */ C2391u(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f7428Y = i10;
        this.f7429Z = obj;
        this.f7430o0 = obj2;
        this.f7431p0 = obj3;
        this.f7432q0 = obj4;
    }

    /* JADX INFO: renamed from: B */
    public boolean m3505B(Context context) {
        if (((Boolean) this.f7430o0) == null) {
            this.f7430o0 = Boolean.valueOf(context.checkCallingOrSelfPermission(bQBnquXS.QsEauXnIyoRmMQ) == 0);
        }
        if (!((Boolean) this.f7430o0).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f7430o0).booleanValue();
    }

    /* JADX INFO: renamed from: I */
    public void m3512I() {
        Locale locale = Locale.ROOT;
        AbstractC16544l.m18093f(locale, CsqksqyPE.PrFvIAqE);
        String lowerCase = "com.openai.chatgpt".toLowerCase(locale);
        AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!"com.openai.chatgpt".equals(lowerCase)) {
            AbstractC15256t.m16482t(AbstractC7807J.f24699a, "Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
        }
        this.f7429Z = "com.openai.chatgpt";
    }

    /* JADX INFO: renamed from: z */
    public void m3527z(long j10, long j11, ArrayList arrayList) {
        AbstractC16544l.m18094g(arrayList, sVoFrD.LBwjNYkSf);
        synchronized (((ArrayList) this.f7430o0)) {
            arrayList.clear();
            m3520q((ArrayList) this.f7429Z);
            m3520q((ArrayList) this.f7430o0);
        }
    }

    public C2391u(C16354g c16354g) {
        this.f7428Y = 4;
        this.f7430o0 = c16354g;
        this.f7431p0 = new AtomicBoolean(false);
        this.f7432q0 = Thread.getDefaultUncaughtExceptionHandler();
        this.f7429Z = "crash";
    }

    public C2391u(C18621a c18621a, C6749o c6749o, C2153Q0 props, C13425p c13425p, C13415f interceptor) {
        this.f7428Y = 13;
        AbstractC16544l.m18094g(props, "props");
        AbstractC16544l.m18094g(interceptor, "interceptor");
        this.f7429Z = c6749o;
        C6337s c6337s = new C6337s();
        this.f7430o0 = props.getValue();
        this.f7431p0 = new C2599j(new C2134H(props, new C13679k(this, null), 2), null, 0, null, 14).mo3257k(c18621a);
        this.f7432q0 = new C13676h(new C13677i(AbstractC8215v5.m8842d(c6749o), ""), c6749o, this.f7430o0, c13425p, c18621a.f59313Y, C13674f.f43156Y, null, interceptor, c6337s);
    }

    public C2391u(int i10, InterfaceC11256c internalLogger, InterfaceC14425g interfaceC14425g, String featureName, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, InterfaceC16348a contextProvider, InterfaceC17178d dataUploader, InterfaceC18886d networkInfoProvider, InterfaceC19469h storage, InterfaceC21813j systemInfoProvider) {
        this.f7428Y = 18;
        AbstractC16544l.m18094g(featureName, "featureName");
        AbstractC16544l.m18094g(storage, "storage");
        AbstractC16544l.m18094g(dataUploader, "dataUploader");
        AbstractC16544l.m18094g(contextProvider, "contextProvider");
        AbstractC16544l.m18094g(networkInfoProvider, "networkInfoProvider");
        AbstractC16544l.m18094g(systemInfoProvider, "systemInfoProvider");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f7429Z = featureName;
        this.f7430o0 = scheduledThreadPoolExecutor;
        this.f7431p0 = internalLogger;
        this.f7432q0 = new RunnableC17177c(i10, internalLogger, interfaceC14425g, featureName, scheduledThreadPoolExecutor, contextProvider, dataUploader, networkInfoProvider, storage, systemInfoProvider);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2391u(Boolean bool, Double d10) {
        this(bool, d10, Boolean.FALSE, (Double) null);
        this.f7428Y = 15;
    }

    public C2391u(Boolean bool, Double d10, Boolean bool2, Double d11) {
        this.f7428Y = 15;
        this.f7430o0 = bool;
        this.f7429Z = d10;
        this.f7431p0 = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f7432q0 = d11;
    }

    public C2391u(Context context, C18433F cameraXControllerFactory, C19026F camera2ManagerFactoryFactory, C17282c navigationStateManager) {
        this.f7428Y = 3;
        AbstractC16544l.m18094g(cameraXControllerFactory, "cameraXControllerFactory");
        AbstractC16544l.m18094g(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        AbstractC16544l.m18094g(navigationStateManager, "navigationStateManager");
        this.f7429Z = context;
        this.f7430o0 = cameraXControllerFactory;
        this.f7431p0 = camera2ManagerFactoryFactory;
        this.f7432q0 = navigationStateManager;
    }

    public C2391u(C0703j c0703j) {
        this.f7428Y = 1;
        this.f7430o0 = null;
        this.f7432q0 = null;
        this.f7429Z = c0703j;
    }

    public C2391u(C17591s account) {
        this.f7428Y = 9;
        AbstractC16544l.m18094g(account, "account");
        this.f7430o0 = account;
        this.f7429Z = "https";
        this.f7432q0 = new C7817j((C7815h) C7817j.m8082b().f9127Z);
    }

    public C2391u(int i10) {
        this.f7428Y = i10;
        switch (i10) {
            case 7:
                this.f7429Z = new C12966e(0);
                this.f7430o0 = new SparseArray();
                this.f7431p0 = new C12977p((Object) null);
                this.f7432q0 = new C12966e(0);
                break;
            case 17:
                this.f7429Z = new C0312c(10);
                this.f7430o0 = new C12959L(0);
                this.f7431p0 = new ArrayList();
                this.f7432q0 = new HashSet();
                break;
            case 19:
                this.f7432q0 = new ArrayDeque();
                this.f7430o0 = new ArrayDeque();
                this.f7431p0 = new ArrayDeque();
                break;
            case 20:
                this.f7429Z = new C20811m();
                this.f7430o0 = new C20811m();
                this.f7431p0 = new C18295a();
                break;
            case 21:
                this.f7429Z = new ArrayList();
                this.f7430o0 = new ArrayList();
                this.f7431p0 = new ArrayList();
                this.f7432q0 = new ArrayList();
                new ArrayList();
                break;
            default:
                this.f7429Z = null;
                this.f7430o0 = null;
                this.f7431p0 = null;
                this.f7432q0 = new ArrayDeque();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2391u(C1743k c1743k, InterfaceC1440o interfaceC1440o, InterfaceC1440o interfaceC1440o2, C0622l c0622l) {
        this.f7428Y = 5;
        this.f7429Z = c1743k;
        this.f7430o0 = (AbstractC16541i) interfaceC1440o;
        this.f7431p0 = (AbstractC16541i) interfaceC1440o2;
        this.f7432q0 = c0622l;
    }

    public C2391u(C15358g1 c15358g1, C14885c c14885c) {
        this.f7428Y = 14;
        this.f7432q0 = c15358g1;
        this.f7431p0 = new C21585H(12, (byte) 0);
        this.f7429Z = c14885c;
        ArrayList arrayList = (ArrayList) c15358g1.f47945Y;
        this.f7430o0 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            Iterator it2 = ((ArrayList) c15358g1.f47946Z).iterator();
            while (it2.hasNext()) {
                ((C14884b) it2.next()).getClass();
                C14883a c14883a = new C14883a(this);
                C21585H c21585h = (C21585H) this.f7431p0;
                ((ArrayList) c21585h.f68344Z).add(c14883a);
                Class[] clsArr = {C12922h.class, C12926l.class, C12938x.class, C12916b.class, C12917c.class, C12924j.class, C12927m.class, C12913D.class, C12930p.class, C12931q.class, C12934t.class, C12937w.class, C12929o.class, C12923i.class, C12911B.class, C12912C.class, C12918d.class, C12928n.class, C12939y.class, C12925k.class};
                HashSet hashSet = new HashSet(20);
                for (int i10 = 0; i10 < 20; i10++) {
                    Class cls = clsArr[i10];
                    Objects.requireNonNull(cls);
                    if (!hashSet.add(cls)) {
                        throw new IllegalArgumentException("duplicate element: " + cls);
                    }
                }
                Iterator it3 = DesugarCollections.unmodifiableSet(hashSet).iterator();
                while (it3.hasNext()) {
                    p817j$.util.Map.EL.putIfAbsent((HashMap) c21585h.f68345o0, (Class) it3.next(), c14883a);
                }
            }
            return;
        }
        throw AbstractC3794B0.m4497v(it);
    }

    public C2391u(C4227a0 c4227a0, boolean[] zArr) {
        this.f7428Y = 6;
        this.f7429Z = c4227a0;
        this.f7430o0 = zArr;
        int i10 = c4227a0.f13815a;
        this.f7431p0 = new boolean[i10];
        this.f7432q0 = new boolean[i10];
    }
}
