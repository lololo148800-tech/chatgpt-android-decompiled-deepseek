package p310M9;

import android.content.ClipDescription;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import androidx.lifecycle.AbstractServiceC11115x;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11103l;
import bb.AbstractC11278C;
import bb.AbstractC11320m;
import bb.C11276A;
import bb.C11294T;
import bb.C11333z;
import com.google.android.gms.internal.play_billing.C11963i;
import com.openai.feature.conversations.impl.input.AbstractC12341a;
import fo.C13711h;
import io.sentry.C15144M1;
import io.sentry.InterfaceC15127H;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.internal.debugmeta.C15384c;
import io.sentry.protocol.C15447t;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import lc.C16842b;
import lc.EnumC16841a;
import mc.AbstractC17223b;
import mc.C17225d;
import mc.C17226e;
import p001A.AbstractC0010F;
import p001A.C0018J;
import p001A.C0042V0;
import p001A.C0093v0;
import p001A.RunnableC0008E;
import p001A.RunnableC0014H;
import p003A1.RunnableC0153B;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p082D2.InterfaceC1862i;
import p087D7.AbstractC1976c;
import p087D7.C1974a;
import p1014t1.C19728e;
import p1025te.C19866Q;
import p1061vb.C20513d;
import p1073w3.AbstractC20800b;
import p1095x1.InterfaceC21098s;
import p1116y0.InterfaceC21354c;
import p1142z3.InterfaceC21740h;
import p117Eb.C2385o;
import p140Fa.C2685e;
import p163G7.InterfaceExecutorServiceC3006a;
import p166Ga.C3029c;
import p167Gb.C3032c;
import p178H.C3164p0;
import p225Im.InterfaceC3759g;
import p228J.AbstractC3842j;
import p228J.InterfaceC3866v;
import p232J3.C4213M;
import p232J3.C4229b0;
import p265Kb.C4612e;
import p277L.ExecutorC4828a;
import p277L.RunnableScheduledFutureC4830c;
import p283L5.AbstractC4941g;
import p301M.AbstractC5229k;
import p301M.InterfaceC5221c;
import p334Na.C5697d;
import p334Na.C5700g;
import p349O0.C5996c0;
import p349O0.C6021p;
import p357Oa.InterfaceC6150c;
import p371P1.C6305a;
import p371P1.C6306b;
import p371P1.InterfaceC6307c;
import p372P3.C6330l;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6336r;
import p392Q0.C6546d;
import p444S4.C6998d;
import p444S4.C7001g;
import p444S4.C7013s;
import p444S4.EnumC7019y;
import p468T2.C7212d;
import p468T2.C7224p;
import p468T2.C7227s;
import p468T2.C7230v;
import p468T2.C7231w;
import p468T2.InterfaceC7222n;
import p470T4.C7253r;
import p493U2.C7551a;
import p523V9.AbstractC7889G0;
import p523V9.C7917J4;
import p523V9.C7999U;
import p523V9.C8006V;
import p537W0.C8410b;
import p544W9.AbstractC8577W2;
import p544W9.C8622e;
import p571X9.AbstractC9306j0;
import p571X9.C9120E;
import p571X9.C9126F;
import p571X9.C9250Z4;
import p571X9.C9375u3;
import p588Y2.C9642z;
import p594Y9.C9741I;
import p604Yk.C10077b;
import p610Z1.C10142i;
import p610Z1.C10147n;
import p610Z1.InterfaceC10143j;
import p613Z4.AbstractC10159f;
import p635a1.AbstractC10458p;
import p658b5.C11238i;
import p658b5.C11245p;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p674c5.RunnableC11649b;
import p692d0.AbstractC12957J;
import p692d0.C12949B;
import p692d0.C12977p;
import p692d0.C12985x;
import p747fb.InterfaceFutureC13608b;
import p901n7.InterfaceC17512a;
import p904nb.RunnableC17544a;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;
import p960q9.C18655i;
import p961qb.C18661b;
import p961qb.InterfaceC18663d;
import p979r2.AbstractC18863d;
import p987rb.InterfaceC18910a;

/* JADX INFO: renamed from: M9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5311e implements InterfaceC1862i, InterfaceC5221c, InterfaceC10143j, InterfaceC6150c, InterfaceC6307c, InterfaceC18910a, InterfaceC21354c, InterfaceC17512a {

    /* JADX INFO: renamed from: q0 */
    public static C5311e f17482q0;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17483Y;

    /* JADX INFO: renamed from: Z */
    public Object f17484Z;

    /* JADX INFO: renamed from: o0 */
    public Object f17485o0;

    /* JADX INFO: renamed from: p0 */
    public Object f17486p0;

    public /* synthetic */ C5311e(Object obj, Object obj2, Object obj3, int i10) {
        this.f17483Y = i10;
        this.f17484Z = obj;
        this.f17485o0 = obj2;
        this.f17486p0 = obj3;
    }

    /* JADX INFO: renamed from: G */
    public static final SharedPreferences m5843G(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* JADX INFO: renamed from: H */
    public static final void m5844H(Context context) {
        if (m5843G(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        AbstractC15256t.m16465c("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new C5310d("Failed to store the app set ID last used time.");
    }

    /* JADX INFO: renamed from: q */
    public static boolean m5845q(Editable editable, KeyEvent keyEvent, boolean z6) {
        C7231w[] c7231wArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c7231wArr = (C7231w[]) editable.getSpans(selectionStart, selectionEnd, C7231w.class)) != null && c7231wArr.length > 0) {
            for (C7231w c7231w : c7231wArr) {
                int spanStart = editable.getSpanStart(c7231w);
                int spanEnd = editable.getSpanEnd(c7231w);
                if ((z6 && spanStart == selectionStart) || ((!z6 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public void m5846A(Object obj) {
        AbstractC1976c.m3152i((InterfaceExecutorServiceC3006a) this.f17485o0, "Data writing", (InterfaceC11256c) this.f17486p0, new RunnableC17544a(this, 4, obj));
    }

    /* JADX INFO: renamed from: B */
    public void m5847B(String str, float f10) {
        String strValueOf = String.valueOf(f10);
        C9250Z4 c9250z4 = new C9250Z4(16, false);
        ((C13711h) this.f17486p0).f43261p0 = c9250z4;
        this.f17486p0 = c9250z4;
        c9250z4.f43260o0 = strValueOf;
        c9250z4.f43259Z = str;
    }

    /* JADX INFO: renamed from: C */
    public byte[] m5848C(C7917J4 c7917j4) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap map = (HashMap) this.f17484Z;
            C8006V c8006v = new C8006V(byteArrayOutputStream, map, (HashMap) this.f17485o0, (C7999U) this.f17486p0);
            InterfaceC18663d interfaceC18663d = (InterfaceC18663d) map.get(C7917J4.class);
            if (interfaceC18663d == null) {
                throw new C18661b("No encoder for ".concat(String.valueOf(C7917J4.class)));
            }
            interfaceC18663d.mo3472a(c7917j4, c8006v);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: D */
    public byte[] m5849D(C9375u3 c9375u3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap map = (HashMap) this.f17484Z;
            C9126F c9126f = new C9126F(byteArrayOutputStream, map, (HashMap) this.f17485o0, (C9120E) this.f17486p0);
            InterfaceC18663d interfaceC18663d = (InterfaceC18663d) map.get(C9375u3.class);
            if (interfaceC18663d == null) {
                throw new C18661b("No encoder for ".concat(String.valueOf(C9375u3.class)));
            }
            interfaceC18663d.mo3472a(c9375u3, c9126f);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: E */
    public void m5850E(int i10, String str) {
        String strValueOf = String.valueOf(i10);
        C9250Z4 c9250z4 = new C9250Z4(16, false);
        ((C13711h) this.f17486p0).f43261p0 = c9250z4;
        this.f17486p0 = c9250z4;
        c9250z4.f43260o0 = strValueOf;
        c9250z4.f43259Z = str;
    }

    /* JADX INFO: renamed from: F */
    public void m5851F(Object obj, String str) {
        C13711h c13711h = new C13711h(16, false);
        ((C13711h) this.f17486p0).f43261p0 = c13711h;
        this.f17486p0 = c13711h;
        c13711h.f43260o0 = obj;
        c13711h.f43259Z = str;
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) {
        switch (this.f17483Y) {
            case 4:
                boolean z6 = th2 instanceof CancellationException;
                C10142i c10142i = (C10142i) this.f17485o0;
                if (!z6) {
                    c10142i.m10747a(null);
                } else {
                    AbstractC4941g.m5559R(null, c10142i.m10748b(new C3164p0(AbstractC9306j0.m9891j((String) this.f17486p0, " cancelled.", new StringBuilder()), th2)));
                }
                break;
            default:
                ((C0042V0) this.f17486p0).f209r0 = null;
                ArrayList arrayList = (ArrayList) this.f17484Z;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC3866v) this.f17485o0).mo140e((AbstractC3842j) it.next());
                    }
                    arrayList.clear();
                }
                break;
        }
    }

    @Override // p357Oa.InterfaceC6150c
    /* JADX INFO: renamed from: a */
    public Object mo3914a() {
        Object objMo3914a = ((InterfaceC6150c) this.f17484Z).mo3914a();
        return new C5697d((C5700g) objMo3914a, (Context) ((C18655i) ((C3032c) this.f17486p0).f9127Z).f59414Z);
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        RunnableC0153B runnableC0153B = new RunnableC0153B(this, 5);
        ExecutorC4828a executorC4828aM9240b = AbstractC8577W2.m9240b();
        C10147n c10147n = c10142i.f30066c;
        if (c10147n != null) {
            c10147n.mo5766a(runnableC0153B, executorC4828aM9240b);
        }
        ((RunnableScheduledFutureC4830c) this.f17486p0).f15725Y.set(c10142i);
        return "HandlerScheduledFuture-" + ((Callable) this.f17485o0).toString();
    }

    @Override // p082D2.InterfaceC1862i
    /* JADX INFO: renamed from: c */
    public Uri mo2741c() {
        return (Uri) this.f17484Z;
    }

    @Override // p901n7.InterfaceC17512a
    /* JADX INFO: renamed from: e */
    public void mo5853e() {
        Context context = (Context) ((WeakReference) this.f17486p0).get();
        if (context == null || C7253r.m7689e() == null) {
            return;
        }
        String instanceName = (String) this.f17484Z;
        AbstractC16544l.m18094g(instanceName, "instanceName");
        InterfaceC11256c internalLogger = (InterfaceC11256c) this.f17485o0;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        try {
            C7253r c7253rM7690f = C7253r.m7690f(context);
            c7253rM7690f.f22999d.m14897a(new RunnableC11649b(c7253rM7690f, "DatadogBackgroundUpload/".concat(instanceName), 0));
        } catch (IllegalStateException e10) {
            AbstractC7889G0.m8185c(internalLogger, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), C1974a.f5842q0, e10, 48);
        }
    }

    @Override // p082D2.InterfaceC1862i
    /* JADX INFO: renamed from: g */
    public Uri mo2743g() {
        return (Uri) this.f17486p0;
    }

    @Override // p082D2.InterfaceC1862i
    public ClipDescription getDescription() {
        return (ClipDescription) this.f17485o0;
    }

    @Override // p371P1.InterfaceC6307c
    /* JADX INFO: renamed from: i */
    public C6306b mo5855i() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((C2685e) this.f17486p0)) {
            try {
                C6306b c6306b = (C6306b) this.f17485o0;
                if (c6306b != null && localeList == ((LocaleList) this.f17484Z)) {
                    return c6306b;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(new C6305a(localeList.get(i10)));
                }
                C6306b c6306b2 = new C6306b(arrayList);
                this.f17484Z = localeList;
                this.f17485o0 = c6306b2;
                return c6306b2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p082D2.InterfaceC1862i
    /* JADX INFO: renamed from: j */
    public Object mo2744j() {
        return null;
    }

    @Override // p1116y0.InterfaceC21354c
    /* JADX INFO: renamed from: k */
    public void mo5856k(C8410b c8410b, C6021p c6021p, int i10) {
        c6021p.m6524S(-1136516629);
        AbstractC12341a.m14267d((C19866Q) this.f17484Z, ((C5996c0) this.f17486p0).m6412g(), (InterfaceC1436k) ((InterfaceC3759g) this.f17485o0), c8410b, null, c6021p, 3072);
        c6021p.m6553p(false);
    }

    @Override // p987rb.InterfaceC18910a
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ InterfaceC18910a mo5857l(Class cls, InterfaceC18663d interfaceC18663d) {
        switch (this.f17483Y) {
            case 14:
                ((HashMap) this.f17484Z).put(cls, interfaceC18663d);
                ((HashMap) this.f17485o0).remove(cls);
                break;
            default:
                ((HashMap) this.f17484Z).put(cls, interfaceC18663d);
                ((HashMap) this.f17485o0).remove(cls);
                break;
        }
        return this;
    }

    @Override // p901n7.InterfaceC17512a
    /* JADX INFO: renamed from: m */
    public void mo5858m() throws Throwable {
        Context context = (Context) ((WeakReference) this.f17486p0).get();
        if (context == null || C7253r.m7689e() == null) {
            return;
        }
        AbstractC1976c.m3154k(context, (String) this.f17484Z, (InterfaceC11256c) this.f17485o0);
    }

    @Override // p371P1.InterfaceC6307c
    /* JADX INFO: renamed from: n */
    public Locale mo5859n(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (AbstractC16544l.m18089b(localeForLanguageTag.toLanguageTag(), "und")) {
            AbstractC15256t.m16465c("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX INFO: renamed from: o */
    public void m5860o(long j10, List list, boolean z6) {
        long[] jArr;
        boolean z10;
        long[] jArr2;
        boolean z11;
        int i10;
        C19728e c19728e;
        Object objM14712e;
        Object obj;
        C10077b c10077b = (C10077b) this.f17485o0;
        C12985x c12985x = (C12985x) this.f17486p0;
        c12985x.f41225e = 0;
        long[] jArr3 = c12985x.f41221a;
        char c9 = 7;
        if (jArr3 != AbstractC12957J.f41150a) {
            AbstractC17678l.m19313t(jArr3);
            long[] jArr4 = c12985x.f41221a;
            int i11 = c12985x.f41224d;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr4[i12] = (jArr4[i12] & (~j11)) | j11;
        }
        AbstractC17678l.m19311r(c12985x.f41223c, null, 0, c12985x.f41224d);
        c12985x.f41226f = AbstractC12957J.m14637c(c12985x.f41224d) - c12985x.f41225e;
        int size = list.size();
        boolean z12 = true;
        C10077b c10077b2 = c10077b;
        boolean z13 = true;
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC10458p abstractC10458p = (AbstractC10458p) list.get(i13);
            if (z13) {
                C6546d c6546d = (C6546d) c10077b2.f29833Z;
                int i14 = c6546d.f21184o0;
                if (i14 <= 0) {
                    obj = null;
                    break;
                }
                Object[] objArr = c6546d.f21182Y;
                int i15 = 0;
                while (true) {
                    obj = objArr[i15];
                    if (AbstractC16544l.m18089b(((C19728e) obj).f62452o0, abstractC10458p)) {
                        break;
                    }
                    int i16 = i15 + 1;
                    if (i16 >= i14) {
                        obj = null;
                        break;
                    }
                    i15 = i16;
                }
                c19728e = (C19728e) obj;
                if (c19728e != null) {
                    c19728e.f62458u0 = true;
                    c19728e.f62453p0.m20922b(j10);
                    Object objM14712e2 = c12985x.m14712e(j10);
                    if (objM14712e2 == null) {
                        objM14712e2 = new C12949B();
                        int iM14710c = c12985x.m14710c(j10);
                        c12985x.f41222b[iM14710c] = j10;
                        c12985x.f41223c[iM14710c] = objM14712e2;
                    }
                    ((C12949B) objM14712e2).m14607a(c19728e);
                } else {
                    z13 = false;
                    c19728e = new C19728e(abstractC10458p);
                    c19728e.f62453p0.m20922b(j10);
                    objM14712e = c12985x.m14712e(j10);
                    if (objM14712e == null) {
                        objM14712e = new C12949B();
                        int iM14710c2 = c12985x.m14710c(j10);
                        c12985x.f41222b[iM14710c2] = j10;
                        c12985x.f41223c[iM14710c2] = objM14712e;
                    }
                    ((C12949B) objM14712e).m14607a(c19728e);
                    ((C6546d) c10077b2.f29833Z).m7099c(c19728e);
                }
            } else {
                c19728e = new C19728e(abstractC10458p);
                c19728e.f62453p0.m20922b(j10);
                objM14712e = c12985x.m14712e(j10);
                if (objM14712e == null) {
                    objM14712e = new C12949B();
                    int iM14710c3 = c12985x.m14710c(j10);
                    c12985x.f41222b[iM14710c3] = j10;
                    c12985x.f41223c[iM14710c3] = objM14712e;
                }
                ((C12949B) objM14712e).m14607a(c19728e);
                ((C6546d) c10077b2.f29833Z).m7099c(c19728e);
            }
            c10077b2 = c19728e;
        }
        if (!z6) {
            return;
        }
        long[] jArr5 = c12985x.f41222b;
        Object[] objArr2 = c12985x.f41223c;
        long[] jArr6 = c12985x.f41221a;
        int length = jArr6.length - 2;
        if (length < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j12 = jArr6[i17];
            if ((((~j12) << c9) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i18 = 8;
                int i19 = 8 - ((~(i17 - length)) >>> 31);
                int i20 = 0;
                while (i20 < i19) {
                    if ((j12 & 255) < 128) {
                        int i21 = (i17 << 3) + i20;
                        long j13 = jArr5[i21];
                        C12949B c12949b = (C12949B) objArr2[i21];
                        C6546d c6546d2 = (C6546d) c10077b.f29833Z;
                        int i22 = c6546d2.f21184o0;
                        if (i22 > 0) {
                            Object[] objArr3 = c6546d2.f21182Y;
                            int i23 = 0;
                            while (true) {
                                ((C19728e) objArr3[i23]).m20675R(j13, c12949b);
                                jArr2 = jArr5;
                                z11 = true;
                                int i24 = i23 + 1;
                                if (i24 >= i22) {
                                    break;
                                }
                                i23 = i24;
                                jArr5 = jArr2;
                            }
                        } else {
                            jArr2 = jArr5;
                            z11 = true;
                        }
                        i10 = 8;
                    } else {
                        jArr2 = jArr5;
                        z11 = z12;
                        i10 = i18;
                    }
                    j12 >>= i10;
                    i20++;
                    z12 = z11;
                    i18 = i10;
                    jArr5 = jArr2;
                }
                jArr = jArr5;
                z10 = z12;
                if (i19 != i18) {
                    return;
                }
            } else {
                jArr = jArr5;
                z10 = z12;
            }
            if (i17 == length) {
                return;
            }
            i17++;
            z12 = z10;
            jArr5 = jArr;
            c9 = 7;
        }
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        switch (this.f17483Y) {
            case 4:
                AbstractC5229k.m5781e(true, (InterfaceFutureC13608b) this.f17484Z, (C10142i) this.f17485o0, AbstractC8577W2.m9240b());
                break;
            default:
                ((C0042V0) this.f17486p0).f209r0 = null;
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public C7013s m5861p() {
        C7013s c7013s = new C7013s((UUID) this.f17484Z, (C11245p) this.f17485o0, (Set) this.f17486p0);
        C6998d c6998d = ((C11245p) this.f17485o0).f34050j;
        boolean z6 = (Build.VERSION.SDK_INT >= 24 && c6998d.m7400a()) || c6998d.f22395d || c6998d.f22393b || c6998d.f22394c;
        C11245p c11245p = (C11245p) this.f17485o0;
        if (c11245p.f34057q) {
            if (z6) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (c11245p.f34047g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC16544l.m18093f(uuidRandomUUID, "randomUUID()");
        this.f17484Z = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        AbstractC16544l.m18093f(string, "id.toString()");
        C11245p other = (C11245p) this.f17485o0;
        AbstractC16544l.m18094g(other, "other");
        this.f17485o0 = new C11245p(string, other.f34042b, other.f34043c, other.f34044d, new C7001g(other.f34045e), new C7001g(other.f34046f), other.f34047g, other.f34048h, other.f34049i, new C6998d(other.f34050j), other.f34051k, other.f34052l, other.f34053m, other.f34054n, other.f34055o, other.f34056p, other.f34057q, other.f34058r, other.f34059s, other.f34061u, other.f34062v, other.f34063w, 524288);
        return c7013s;
    }

    /* JADX INFO: renamed from: r */
    public boolean m5862r(C0093v0 c0093v0, boolean z6) {
        boolean z10;
        boolean z11;
        C10077b c10077b = (C10077b) this.f17485o0;
        if (!c10077b.mo10673x((C12977p) c0093v0.f404o0, (InterfaceC21098s) this.f17484Z, c0093v0, z6)) {
            return false;
        }
        C6546d c6546d = (C6546d) c10077b.f29833Z;
        int i10 = c6546d.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546d.f21182Y;
            int i11 = 0;
            z10 = false;
            do {
                z10 = ((C19728e) objArr[i11]).m20674Q(c0093v0, z6) || z10;
                i11++;
            } while (i11 < i10);
        } else {
            z10 = false;
        }
        int i12 = c6546d.f21184o0;
        if (i12 > 0) {
            Object[] objArr2 = c6546d.f21182Y;
            int i13 = 0;
            z11 = false;
            do {
                z11 = ((C19728e) objArr2[i13]).m20673P(c0093v0) || z11;
                i13++;
            } while (i13 < i12);
        } else {
            z11 = false;
        }
        c10077b.mo10674y(c0093v0);
        return z11 || z10;
    }

    /* JADX INFO: renamed from: s */
    public long m5863s() {
        C6330l c6330l = (C6330l) this.f17486p0;
        if (c6330l != null) {
            return c6330l.f20548p0;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: t */
    public int m5864t(C16842b c16842b) {
        int i10 = 0;
        for (C17226e c17226e : (ArrayList) this.f17484Z) {
            EnumC16841a enumC16841a = c17226e.f54974a;
            int iM18572a = enumC16841a.m18572a(c16842b);
            int iM11068z = iM18572a + 4;
            int iOrdinal = enumC16841a.ordinal();
            int i11 = c17226e.f54977d;
            if (iOrdinal == 1) {
                int iM11068z2 = AbstractC10763a.m11068z(i11, 3, 10, iM11068z);
                int i12 = i11 % 3;
                iM11068z = iM11068z2 + (i12 != 1 ? i12 == 2 ? 7 : 0 : 4);
            } else if (iOrdinal == 2) {
                iM11068z = AbstractC10763a.m11068z(i11, 2, 11, iM11068z) + (i11 % 2 != 1 ? 0 : 6);
            } else if (iOrdinal == 4) {
                iM11068z += c17226e.m18964a() * 8;
            } else if (iOrdinal == 5) {
                iM11068z = iM18572a + 12;
            } else if (iOrdinal == 6) {
                iM11068z += i11 * 13;
            }
            i10 += iM11068z;
        }
        return i10;
    }

    public String toString() {
        String str = "";
        switch (this.f17483Y) {
            case 17:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f17484Z);
                sb2.append('{');
                C13711h c13711h = (C13711h) ((C13711h) this.f17485o0).f43261p0;
                while (c13711h != null) {
                    Object obj = c13711h.f43260o0;
                    sb2.append(str);
                    String str2 = (String) c13711h.f43259Z;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c13711h = (C13711h) c13711h.f43261p0;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 21:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f17484Z);
                sb3.append('{');
                C11963i c11963i = ((C11963i) this.f17485o0).f36276b;
                while (c11963i != null) {
                    Object obj2 = c11963i.f36275a;
                    sb3.append(str);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        String strDeepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) strDeepToString2, 1, strDeepToString2.length() - 1);
                    }
                    c11963i = c11963i.f36276b;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 24:
                StringBuilder sb4 = new StringBuilder();
                C17226e c17226e = null;
                for (C17226e c17226e2 : (ArrayList) this.f17484Z) {
                    if (c17226e != null) {
                        sb4.append(Separators.COMMA);
                    }
                    sb4.append(c17226e2.toString());
                    c17226e = c17226e2;
                }
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m5865u(CharSequence charSequence, int i10, int i11, C7230v c7230v) {
        if ((c7230v.f22935c & 3) == 0) {
            C7212d c7212d = (C7212d) this.f17486p0;
            C7551a c7551aM7633c = c7230v.m7633c();
            int iM1537a = c7551aM7633c.m1537a(8);
            if (iM1537a != 0) {
                ((ByteBuffer) c7551aM7633c.f2088p0).getShort(iM1537a + c7551aM7633c.f2085Y);
            }
            c7212d.getClass();
            ThreadLocal threadLocal = C7212d.f22885b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = c7212d.f22886a;
            String string = sb2.toString();
            int i12 = AbstractC18863d.f60090a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i13 = c7230v.f22935c & 4;
            c7230v.f22935c = zHasGlyph ? i13 | 2 : i13 | 1;
        }
        return (c7230v.f22935c & 3) == 2;
    }

    /* JADX INFO: renamed from: v */
    public void m5866v(InterfaceC21740h interfaceC21740h, Uri uri, Map map, long j10, long j11, C4213M c4213m) throws C4229b0 {
        boolean z6;
        boolean z10 = true;
        C6330l c6330l = new C6330l(interfaceC21740h, j10, j11);
        this.f17486p0 = c6330l;
        if (((InterfaceC6333o) this.f17485o0) != null) {
            return;
        }
        InterfaceC6333o[] interfaceC6333oArrMo6949d = ((InterfaceC6336r) this.f17484Z).mo6949d(uri, map);
        int length = interfaceC6333oArrMo6949d.length;
        C11276A c11276a = AbstractC11278C.f34162Z;
        AbstractC11320m.m12724c(length, "expectedSize");
        C11333z c11333z = new C11333z(length);
        if (interfaceC6333oArrMo6949d.length == 1) {
            this.f17485o0 = interfaceC6333oArrMo6949d[0];
        } else {
            for (InterfaceC6333o interfaceC6333o : interfaceC6333oArrMo6949d) {
                try {
                    if (interfaceC6333o.mo6856c(c6330l)) {
                        this.f17485o0 = interfaceC6333o;
                        c6330l.f20550r0 = 0;
                        break;
                    } else {
                        c11333z.m12764d(interfaceC6333o.mo6858g());
                        z6 = ((InterfaceC6333o) this.f17485o0) != null || c6330l.f20548p0 == j10;
                    }
                } catch (EOFException unused) {
                    z6 = ((InterfaceC6333o) this.f17485o0) != null || c6330l.f20548p0 == j10;
                } catch (Throwable th2) {
                    if (((InterfaceC6333o) this.f17485o0) == null && c6330l.f20548p0 != j10) {
                        z10 = false;
                    }
                    AbstractC20800b.m21320h(z10);
                    c6330l.f20550r0 = 0;
                    throw th2;
                }
                AbstractC20800b.m21320h(z6);
                c6330l.f20550r0 = 0;
            }
            if (((InterfaceC6333o) this.f17485o0) == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                C9642z c9642z = new C9642z(", ");
                Iterator it = AbstractC11320m.m12740t(AbstractC11278C.m12692u(interfaceC6333oArrMo6949d), new C2385o(8)).iterator();
                StringBuilder sb3 = new StringBuilder();
                c9642z.m10202O(sb3, it);
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                String string = sb2.toString();
                uri.getClass();
                C11294T c11294tM12768j = c11333z.m12768j();
                C4229b0 c4229b0 = new C4229b0(string, null, false, 1);
                AbstractC11278C.m12691t(c11294tM12768j);
                throw c4229b0;
            }
        }
        ((InterfaceC6333o) this.f17485o0).mo6860i(c4213m);
    }

    /* JADX INFO: renamed from: w */
    public void m5867w() {
        Iterator it = ((LinkedList) this.f17486p0).iterator();
        while (it.hasNext()) {
            ((InterfaceC1426a) it.next()).invoke();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m5868x(EnumC11103l enumC11103l) {
        RunnableC0014H runnableC0014H = (RunnableC0014H) this.f17486p0;
        if (runnableC0014H != null) {
            runnableC0014H.run();
        }
        RunnableC0014H runnableC0014H2 = new RunnableC0014H((C11114w) this.f17484Z, enumC11103l);
        this.f17486p0 = runnableC0014H2;
        ((Handler) this.f17485o0).postAtFrontOfQueue(runnableC0014H2);
    }

    /* JADX INFO: renamed from: y */
    public Object m5869y(CharSequence charSequence, int i10, int i11, int i12, boolean z6, InterfaceC7222n interfaceC7222n) {
        int i13;
        char c9;
        C7224p c7224p = new C7224p((C7227s) ((C11238i) this.f17485o0).f34010o0);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        boolean zMo5356b = true;
        int i14 = 0;
        int iCharCount = i10;
        loop0: while (true) {
            i13 = iCharCount;
            while (true) {
                if (iCharCount < i11 && i14 < i12 && zMo5356b) {
                    SparseArray sparseArray = ((C7227s) c7224p.f22915e).f22926a;
                    C7227s c7227s = sparseArray == null ? null : (C7227s) sparseArray.get(iCodePointAt);
                    if (c7224p.f22911a == 2) {
                        if (c7227s != null) {
                            c7224p.f22915e = c7227s;
                            c7224p.f22913c++;
                        } else {
                            if (iCodePointAt == 65038) {
                                c7224p.m7620b();
                            } else if (iCodePointAt != 65039) {
                                C7227s c7227s2 = (C7227s) c7224p.f22915e;
                                if (c7227s2.f22927b != null) {
                                    if (c7224p.f22913c != 1) {
                                        c7224p.f22916f = c7227s2;
                                        c7224p.m7620b();
                                    } else if (c7224p.m7621c()) {
                                        c7224p.f22916f = (C7227s) c7224p.f22915e;
                                        c7224p.m7620b();
                                    } else {
                                        c7224p.m7620b();
                                    }
                                    c9 = 3;
                                } else {
                                    c7224p.m7620b();
                                }
                            }
                            c9 = 1;
                        }
                        c9 = 2;
                    } else if (c7227s == null) {
                        c7224p.m7620b();
                        c9 = 1;
                    } else {
                        c7224p.f22911a = 2;
                        c7224p.f22915e = c7227s;
                        c7224p.f22913c = 1;
                        c9 = 2;
                    }
                    c7224p.f22912b = iCodePointAt;
                    if (c9 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                        if (iCharCount >= i11) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c9 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c9 == 3) {
                        if (!z6 && m5865u(charSequence, i13, iCharCount, ((C7227s) c7224p.f22916f).f22927b)) {
                            break;
                        }
                        zMo5356b = interfaceC7222n.mo5356b(charSequence, i13, iCharCount, ((C7227s) c7224p.f22916f).f22927b);
                        i14++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (c7224p.f22911a == 2 && ((C7227s) c7224p.f22915e).f22927b != null && ((c7224p.f22913c > 1 || c7224p.m7621c()) && i14 < i12 && zMo5356b && (z6 || !m5865u(charSequence, i13, iCharCount, ((C7227s) c7224p.f22915e).f22927b)))) {
            interfaceC7222n.mo5356b(charSequence, i13, iCharCount, ((C7227s) c7224p.f22915e).f22927b);
        }
        return interfaceC7222n.mo5355a();
    }

    /* JADX INFO: renamed from: z */
    public void m5870z(long j10, TimeUnit timeUnit) {
        AbstractC16544l.m18094g(timeUnit, "timeUnit");
        ((C11245p) this.f17485o0).f34047g = timeUnit.toMillis(j10);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= ((C11245p) this.f17485o0).f34047g) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public /* synthetic */ C5311e(Object obj, Object obj2, boolean z6, Object obj3, int i10) {
        this.f17483Y = i10;
        this.f17486p0 = obj;
        this.f17484Z = obj2;
        this.f17485o0 = obj3;
    }

    public C5311e(String str, int i10) {
        this.f17483Y = i10;
        switch (i10) {
            case 21:
                C11963i c11963i = new C11963i();
                this.f17485o0 = c11963i;
                this.f17486p0 = c11963i;
                this.f17484Z = str;
                break;
            default:
                C13711h c13711h = new C13711h(16, false);
                this.f17485o0 = c13711h;
                this.f17486p0 = c13711h;
                this.f17484Z = str;
                break;
        }
    }

    public C5311e(Context context, int i10) {
        this.f17483Y = i10;
        switch (i10) {
            case 27:
                this.f17484Z = context;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                AbstractC16544l.m18093f(layoutInflaterFrom, "from(...)");
                this.f17485o0 = layoutInflaterFrom;
                this.f17486p0 = new LinkedList();
                break;
            default:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f17485o0 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                this.f17486p0 = Executors.newSingleThreadExecutor();
                this.f17484Z = context;
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new RunnableC0153B(this, 11), 0L, 86400L, TimeUnit.SECONDS);
                break;
        }
    }

    public C5311e(AbstractC10159f abstractC10159f, InterfaceExecutorServiceC3006a interfaceExecutorServiceC3006a, InterfaceC11256c internalLogger) {
        this.f17483Y = 29;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f17484Z = abstractC10159f;
        this.f17485o0 = interfaceExecutorServiceC3006a;
        this.f17486p0 = internalLogger;
    }

    public C5311e(Context appContext, String instanceName, InterfaceC11256c internalLogger) {
        this.f17483Y = 25;
        AbstractC16544l.m18094g(appContext, "appContext");
        AbstractC16544l.m18094g(instanceName, "instanceName");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f17484Z = instanceName;
        this.f17485o0 = internalLogger;
        this.f17486p0 = new WeakReference(appContext);
    }

    public C5311e(AbstractServiceC11115x abstractServiceC11115x) {
        this.f17483Y = 20;
        this.f17484Z = new C11114w(abstractServiceC11115x, true);
        this.f17485o0 = new Handler();
    }

    @Override // p901n7.InterfaceC17512a
    /* JADX INFO: renamed from: d */
    public void mo5852d() {
    }

    @Override // p082D2.InterfaceC1862i
    /* JADX INFO: renamed from: f */
    public void mo2742f() {
    }

    @Override // p901n7.InterfaceC17512a
    /* JADX INFO: renamed from: h */
    public void mo5854h() {
    }

    public C5311e(InterfaceC21098s interfaceC21098s) {
        this.f17483Y = 28;
        this.f17484Z = interfaceC21098s;
        this.f17485o0 = new C10077b(20);
        this.f17486p0 = new C12985x(10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5311e(int i10) {
        this(new C15447t((UUID) null), new C15144M1(), (Object) null, 22);
        this.f17483Y = i10;
        switch (i10) {
            case 10:
                this.f17484Z = new WeakHashMap();
                this.f17485o0 = new WeakHashMap();
                this.f17486p0 = new WeakHashMap();
                break;
            case 14:
                this.f17484Z = new HashMap();
                this.f17485o0 = new HashMap();
                this.f17486p0 = C8622e.f26457c;
                break;
            case 18:
                this.f17484Z = new HashMap();
                this.f17485o0 = new HashMap();
                this.f17486p0 = C9741I.f29264c;
                break;
            case 19:
                break;
            case 22:
                break;
            default:
                this.f17486p0 = new C2685e();
                break;
        }
    }

    public C5311e(InterfaceC6336r interfaceC6336r) {
        this.f17483Y = 5;
        this.f17484Z = interfaceC6336r;
    }

    public C5311e(Class cls) {
        this.f17483Y = 11;
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC16544l.m18093f(uuidRandomUUID, "randomUUID()");
        this.f17484Z = uuidRandomUUID;
        String string = ((UUID) this.f17484Z).toString();
        AbstractC16544l.m18093f(string, "id.toString()");
        this.f17485o0 = new C11245p(string, (EnumC7019y) null, cls.getName(), (String) null, (C7001g) null, (C7001g) null, 0L, 0L, 0L, (C6998d) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, 8388602);
        this.f17486p0 = AbstractC17665J.m19265e(cls.getName());
    }

    public C5311e(C5311e c5311e) {
        C0093v0 c0093v0;
        this.f17483Y = 22;
        C15447t c15447t = (C15447t) c5311e.f17484Z;
        C15144M1 c15144m1 = (C15144M1) c5311e.f17485o0;
        C0093v0 c0093v1 = (C0093v0) c5311e.f17486p0;
        if (c0093v1 != null) {
            c0093v0 = new C0093v0((HashMap) c0093v1.f404o0, c0093v1.f403Z, (InterfaceC15127H) c0093v1.f405p0, 9);
        } else {
            c0093v0 = null;
        }
        this(c15447t, c15144m1, c0093v0, 22);
    }

    public C5311e(C11238i c11238i, C20513d c20513d, C7212d c7212d, Set set) {
        this.f17483Y = 12;
        this.f17484Z = c20513d;
        this.f17485o0 = c11238i;
        this.f17486p0 = c7212d;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m5869y(str, 0, str.length(), 1, true, new C4612e(str, 2));
        }
    }

    public C5311e(C3029c c3029c, C16842b c16842b, C17225d c17225d) {
        EnumC16841a enumC16841a;
        int i10;
        int i11;
        int i12;
        this.f17483Y = 24;
        this.f17486p0 = c3029c;
        this.f17484Z = new ArrayList();
        C17225d c17225d2 = c17225d;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            enumC16841a = EnumC16841a.ECI;
            i10 = 1;
            if (c17225d2 == null) {
                break;
            }
            int i15 = i13 + c17225d2.f54971d;
            EnumC16841a enumC16841a2 = EnumC16841a.BYTE;
            EnumC16841a enumC16841a3 = c17225d2.f54968a;
            int i16 = c17225d2.f54970c;
            C17225d c17225d3 = c17225d2.f54972e;
            boolean z6 = (enumC16841a3 == enumC16841a2 && c17225d3 == null && i16 != 0) || !(c17225d3 == null || i16 == c17225d3.f54970c);
            i10 = z6 ? 1 : i14;
            if (c17225d3 == null || c17225d3.f54968a != enumC16841a3 || z6) {
                ((ArrayList) this.f17484Z).add(0, new C17226e(this, enumC16841a3, c17225d2.f54969b, i16, i15));
                i12 = 0;
            } else {
                i12 = i15;
            }
            if (z6) {
                ((ArrayList) this.f17484Z).add(0, new C17226e(this, enumC16841a, c17225d2.f54969b, c17225d2.f54970c, 0));
            }
            i14 = i10;
            i13 = i12;
            c17225d2 = c17225d3;
        }
        if (c3029c.f9118c) {
            C17226e c17226e = (C17226e) ((ArrayList) this.f17484Z).get(0);
            if (c17226e != null && c17226e.f54974a != enumC16841a && i14 != 0) {
                ((ArrayList) this.f17484Z).add(0, new C17226e(this, enumC16841a, 0, 0, 0));
            }
            ((ArrayList) this.f17484Z).add(((C17226e) ((ArrayList) this.f17484Z).get(0)).f54974a == enumC16841a ? 1 : 0, new C17226e(this, EnumC16841a.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i17 = c16842b.f54021a;
        int i18 = 26;
        int iM24h = AbstractC0010F.m24h(i17 <= 9 ? 1 : i17 <= 26 ? 2 : 3);
        if (iM24h == 0) {
            i18 = 9;
        } else if (iM24h != 1) {
            i10 = 27;
            i18 = 40;
        } else {
            i10 = 10;
        }
        int iM5864t = m5864t(c16842b);
        while (true) {
            i11 = c3029c.f9117b;
            if (i17 >= i18 || AbstractC17223b.m18956c(iM5864t, C16842b.m18573a(i17), i11)) {
                break;
            } else {
                i17++;
            }
        }
        while (i17 > i10 && AbstractC17223b.m18956c(iM5864t, C16842b.m18573a(i17 - 1), i11)) {
            i17--;
        }
        this.f17485o0 = C16842b.m18573a(i17);
    }

    public C5311e(C15384c c15384c) {
        this.f17483Y = 1;
        this.f17486p0 = c15384c;
        this.f17485o0 = new AtomicBoolean(false);
        this.f17484Z = ((C0018J) c15384c.f47968o0).f93p0.schedule(new RunnableC0008E(this, 0), 2000L, TimeUnit.MILLISECONDS);
    }
}
