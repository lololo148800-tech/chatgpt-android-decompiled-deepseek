package p329N3;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p650ui.platform.AndroidComposeView;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.auth0.android.request.internal.RunnableC11843b;
import com.google.android.material.timepicker.AbstractC12067e;
import com.revenuecat.purchases.amazon.AmazonBilling;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import fo.C13711h;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0053b0;
import p001A.C0083q0;
import p003A1.C0294u1;
import p003A1.C0297v1;
import p025An.AbstractC0563B;
import p049Bm.InterfaceC1436k;
import p1020t7.C19809g;
import p1072w2.AbstractC20798j;
import p1096x2.C21113h;
import p1113xn.C21307a;
import p117Eb.C2392v;
import p140Fa.C2685e;
import p156G1.C2963j;
import p156G1.C2968o;
import p156G1.C2971r;
import p156G1.C2974u;
import p178H.C3162o0;
import p204I1.C3590f;
import p214Ib.C3676s;
import p228J.AbstractC3810L;
import p239Ja.C4307j;
import p277L.ExecutorC4828a;
import p350O1.C6048F;
import p350O1.EnumC6047E;
import p392Q0.C6546d;
import p414R.C6771e;
import p414R.C6778l;
import p414R.C6779m;
import p414R.C6782p;
import p435Rl.C6934r;
import p439S.C6974e;
import p444S4.AbstractC7010p;
import p444S4.C6994B;
import p444S4.C7006l;
import p444S4.C7007m;
import p444S4.C7011q;
import p447S7.C7025a;
import p447S7.C7026b;
import p447S7.C7028d;
import p468T2.C7225q;
import p470T4.C7253r;
import p520V5.C7766D;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8020X;
import p523V9.AbstractC8027Y;
import p523V9.AbstractC8111i5;
import p523V9.AbstractC8206u4;
import p544W9.AbstractC8447A3;
import p563X1.C9028h;
import p566X4.AbstractC9050h;
import p571X9.AbstractC9172M3;
import p571X9.AbstractC9184O3;
import p613Z4.C10165l;
import p647ak.C10713l;
import p658b5.C11238i;
import p658b5.C11242m;
import p658b5.C11245p;
import p658b5.C11246q;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p670c1.ViewOnAttachStateChangeListenerC11560d;
import p676c7.C11685d;
import p676c7.C11688g;
import p692d0.C12982u;
import p697d5.C13018a;
import p697d5.C13027j;
import p720e6.C13287b;
import p720e6.C13288c;
import p723e9.C13352j;
import p741f5.AbstractC13543b;
import p741f5.RunnableC13542a;
import p745f9.C13589g;
import p779h6.AbstractC14418g;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p979r2.AbstractC18865f;

/* JADX INFO: renamed from: N3.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5611a implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18162Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f18163Z;

    public /* synthetic */ RunnableC5611a(Object obj, int i10) {
        this.f18162Y = i10;
        this.f18163Z = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m5998a() {
        C7225q c7225q = (C7225q) this.f18163Z;
        synchronized (c7225q.f22920p0) {
            try {
                if (c7225q.f22924t0 == null) {
                    return;
                }
                try {
                    C21113h c21113hM7624c = c7225q.m7624c();
                    int i10 = c21113hM7624c.f67067e;
                    if (i10 == 2) {
                        synchronized (c7225q.f22920p0) {
                        }
                    }
                    if (i10 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i10 + Separators.RPAREN);
                    }
                    try {
                        int i11 = AbstractC20798j.f66061a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        C2685e c2685e = c7225q.f22919o0;
                        Context context = c7225q.f22917Y;
                        c2685e.getClass();
                        C21113h[] c21113hArr = {c21113hM7624c};
                        AbstractC8020X abstractC8020X = AbstractC18865f.f60093a;
                        Trace.beginSection(AbstractC8447A3.m9053f("TypefaceCompat.createFromFontInfo"));
                        try {
                            Typeface typefaceMo8358h = AbstractC18865f.f60093a.mo8358h(context, c21113hArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferM8376g = AbstractC8027Y.m8376g(c7225q.f22917Y, c21113hM7624c.f67063a);
                            if (mappedByteBufferM8376g == null || typefaceMo8358h == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                C11238i c11238i = new C11238i(typefaceMo8358h, AbstractC9184O3.m9741b(mappedByteBufferM8376g));
                                Trace.endSection();
                                Trace.endSection();
                                synchronized (c7225q.f22920p0) {
                                    try {
                                        AbstractC9172M3 abstractC9172M3 = c7225q.f22924t0;
                                        if (abstractC9172M3 != null) {
                                            abstractC9172M3.mo7604b(c11238i);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                c7225q.m7622a();
                            } catch (Throwable th3) {
                                int i12 = AbstractC20798j.f66061a;
                                Trace.endSection();
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        int i13 = AbstractC20798j.f66061a;
                        Trace.endSection();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    synchronized (c7225q.f22920p0) {
                        try {
                            AbstractC9172M3 abstractC9172M4 = c7225q.f22924t0;
                            if (abstractC9172M4 != null) {
                                abstractC9172M4.mo7603a(th6);
                            }
                            c7225q.m7622a();
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                }
            } catch (Throwable th8) {
                throw th8;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v47, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, mm.i] */
    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        boolean z6;
        long[] jArr;
        int i10;
        C12982u c12982u;
        int[] iArr;
        int i11;
        int[] iArr2;
        int i12 = 8;
        int i13 = 0;
        switch (this.f18162Y) {
            case 0:
                C5616f c5616f = (C5616f) this.f18163Z;
                int i14 = c5616f.f18188k - 1;
                c5616f.f18188k = i14;
                if (i14 > 0) {
                    return;
                }
                if (i14 < 0) {
                    throw new IllegalStateException(String.valueOf(c5616f.f18188k));
                }
                c5616f.f18180c.m6040a();
                return;
            case 1:
                C6048F c6048f = (C6048F) this.f18163Z;
                Boolean bool2 = null;
                c6048f.f19705n = null;
                C6546d c6546d = c6048f.f19704m;
                int i15 = c6546d.f21184o0;
                if (i15 > 0) {
                    Object[] objArr = c6546d.f21182Y;
                    Boolean bool3 = null;
                    Boolean boolValueOf = null;
                    int i16 = 0;
                    do {
                        EnumC6047E enumC6047E = (EnumC6047E) objArr[i16];
                        int iOrdinal = enumC6047E.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                bool3 = Boolean.FALSE;
                            } else if ((iOrdinal == 2 || iOrdinal == 3) && !AbstractC16544l.m18089b(bool3, Boolean.FALSE)) {
                                boolValueOf = Boolean.valueOf(enumC6047E == EnumC6047E.f19689o0);
                            }
                            i16++;
                        } else {
                            bool3 = Boolean.TRUE;
                        }
                        boolValueOf = bool3;
                        i16++;
                    } while (i16 < i15);
                    bool = bool3;
                    bool2 = boolValueOf;
                } else {
                    bool = null;
                }
                c6546d.m7104i();
                boolean zM18089b = AbstractC16544l.m18089b(bool, Boolean.TRUE);
                C13711h c13711h = c6048f.f19693b;
                if (zM18089b) {
                    ((InputMethodManager) c13711h.f43260o0.getValue()).restartInput((View) c13711h.f43259Z);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((C13287b) ((C13288c) c13711h.f43261p0).f42001Y).mo1819s();
                    } else {
                        ((C13287b) ((C13288c) c13711h.f43261p0).f42001Y).mo1818l();
                    }
                }
                if (AbstractC16544l.m18089b(bool, Boolean.FALSE)) {
                    ((InputMethodManager) c13711h.f43260o0.getValue()).restartInput((View) c13711h.f43259Z);
                    return;
                }
                return;
            case 2:
                ((C6779m) this.f18163Z).close();
                return;
            case 3:
                C6771e c6771e = (C6771e) this.f18163Z;
                c6771e.f21732v0 = true;
                c6771e.m7203c();
                return;
            case 4:
                ((C3162o0) this.f18163Z).mo4507a();
                return;
            case 5:
                ((AbstractC3810L) this.f18163Z).m4508b();
                return;
            case 6:
                C6782p c6782p = (C6782p) ((C11242m) this.f18163Z).f34020o0;
                if (c6782p != null) {
                    Iterator it = c6782p.values().iterator();
                    while (it.hasNext()) {
                        ((C6778l) it.next()).m7224b();
                    }
                    return;
                }
                return;
            case 7:
                C6934r this$0 = (C6934r) this.f18163Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                if (!this$0.mo5401d().equals(this$0.f22208b) ? true : this$0.mo5400b()) {
                    this$0.m7315c();
                    return;
                }
                return;
            case 8:
                C6974e c6974e = (C6974e) this.f18163Z;
                c6974e.f22298r0 = true;
                c6974e.m7335c();
                return;
            case 9:
                C6782p c6782p2 = (C6782p) ((C2392v) this.f18163Z).f7439q0;
                if (c6782p2 != null) {
                    Iterator it2 = c6782p2.values().iterator();
                    while (it2.hasNext()) {
                        ((C6778l) it2.next()).m7224b();
                    }
                    return;
                }
                return;
            case 10:
                CoroutineWorker this$1 = (CoroutineWorker) this.f18163Z;
                AbstractC16544l.m18094g(this$1, "this$0");
                if (this$1.f33692r0.f41326Y instanceof C13018a) {
                    this$1.f33691q0.mo1275e(null);
                    return;
                }
                return;
            case 11:
                C7026b this$2 = (C7026b) this.f18163Z;
                AbstractC16544l.m18094g(this$2, "this$0");
                File file = this$2.f22473u0;
                InterfaceC11256c interfaceC11256c = this$2.f22469q0;
                try {
                    if (AbstractC8206u4.m8824f(file, interfaceC11256c)) {
                        try {
                            this$2.f22474v0 = (C3676s) this$2.f22471s0.invoke();
                            File[] fileArrM8826h = AbstractC8206u4.m8826h(file, interfaceC11256c);
                            if (fileArrM8826h != null) {
                                for (File file2 : fileArrM8826h) {
                                    String name = file2.getName();
                                    if (name != null) {
                                        int iHashCode = name.hashCode();
                                        C19809g c19809g = this$2.f22470r0;
                                        if (iHashCode != -528983909) {
                                            if (iHashCode != 408381112) {
                                                if (iHashCode == 1847397036 && name.equals("crash_log")) {
                                                    String strM8828j = AbstractC8206u4.m8828j(file2, C21307a.f67720a, interfaceC11256c);
                                                    this$2.f22477y0 = strM8828j != null ? (C7028d) this$2.f22466Z.mo3913N(strM8828j) : null;
                                                }
                                            } else if (name.equals("user_information")) {
                                                String strM7424b = this$2.m7424b(file2, c19809g);
                                                this$2.f22475w0 = strM7424b != null ? (C11688g) this$2.f22468p0.mo3913N(strM7424b) : null;
                                            }
                                        } else if (name.equals("network_information")) {
                                            String strM7424b2 = this$2.m7424b(file2, c19809g);
                                            this$2.f22476x0 = strM7424b2 != null ? (C11685d) this$2.f22467o0.mo3913N(strM7424b2) : null;
                                        }
                                    }
                                }
                            }
                        } catch (SecurityException e10) {
                            AbstractC7889G0.m8185c(this$2.f22469q0, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), C7025a.f22460o0, e10, 48);
                        }
                        return;
                    }
                    return;
                } finally {
                    this$2.m7423a();
                }
            case 12:
                m5998a();
                return;
            case 13:
                AbstractC14418g.m15931b((ByteArrayInputStream) this.f18163Z);
                return;
            case 14:
                ((C7766D) this.f18163Z).m8035d();
                return;
            case 15:
                ((C0053b0) this.f18163Z).m235a();
                return;
            case 16:
                ((C0083q0) this.f18163Z).m271f();
                return;
            case 17:
                ((C9028h) this.f18163Z).invoke();
                return;
            case 18:
                ((C9028h) this.f18163Z).invoke();
                return;
            case 19:
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = (AbstractComponentCallbacksC11000a) this.f18163Z;
                abstractComponentCallbacksC11000a.f33146Z0.f28942r0.m349s(abstractComponentCallbacksC11000a.f33154p0);
                abstractComponentCallbacksC11000a.f33154p0 = null;
                return;
            case 20:
                TextView this_animateIn = (TextView) this.f18163Z;
                AbstractC16544l.m18094g(this_animateIn, "$this_animateIn");
                this_animateIn.setAlpha(1.0f);
                this_animateIn.setVisibility(8);
                return;
            case 21:
                C10713l this$3 = (C10713l) this.f18163Z;
                AbstractC16544l.m18094g(this$3, "this$0");
                ?? r6 = this$3.f31838f;
                if (r6 != 0) {
                    r6.invoke();
                }
                this$3.m11033b();
                return;
            case 22:
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f33399u0;
                ProcessLifecycleOwner this$4 = (ProcessLifecycleOwner) this.f18163Z;
                AbstractC16544l.m18094g(this$4, "this$0");
                int i17 = this$4.f33401Z;
                C11114w c11114w = this$4.f33405r0;
                if (i17 == 0) {
                    z6 = true;
                    this$4.f33402o0 = true;
                    c11114w.m12170f(EnumC11103l.ON_PAUSE);
                } else {
                    z6 = true;
                }
                if (this$4.f33400Y == 0 && this$4.f33402o0) {
                    c11114w.m12170f(EnumC11103l.ON_STOP);
                    this$4.f33403p0 = z6;
                    return;
                }
                return;
            case 23:
                ViewOnAttachStateChangeListenerC11560d viewOnAttachStateChangeListenerC11560d = (ViewOnAttachStateChangeListenerC11560d) this.f18163Z;
                if (viewOnAttachStateChangeListenerC11560d.m12957c()) {
                    AndroidComposeView androidComposeView = viewOnAttachStateChangeListenerC11560d.f34941Y;
                    androidComposeView.m11345s(true);
                    viewOnAttachStateChangeListenerC11560d.m12961h(androidComposeView.getSemanticsOwner().m3805a(), viewOnAttachStateChangeListenerC11560d.f34938A0);
                    viewOnAttachStateChangeListenerC11560d.m12959f(androidComposeView.getSemanticsOwner().m3805a(), viewOnAttachStateChangeListenerC11560d.f34938A0);
                    C12982u c12982uM12956b = viewOnAttachStateChangeListenerC11560d.m12956b();
                    int[] iArr3 = c12982uM12956b.f41205b;
                    long[] jArr2 = c12982uM12956b.f41204a;
                    int length = jArr2.length - 2;
                    C12982u c12982u2 = viewOnAttachStateChangeListenerC11560d.f34954z0;
                    long j10 = 128;
                    if (length >= 0) {
                        while (true) {
                            long j11 = jArr2[i13];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i18 = 8 - ((~(i13 - length)) >>> 31);
                                int i19 = 0;
                                while (i19 < i18) {
                                    if ((j11 & 255) < j10) {
                                        int i20 = iArr3[(i13 << 3) + i19];
                                        C0294u1 c0294u1 = (C0294u1) c12982u2.m14694f(i20);
                                        C0297v1 c0297v1 = (C0297v1) c12982uM12956b.m14694f(i20);
                                        C2968o c2968o = c0297v1 != null ? c0297v1.f1070a : null;
                                        if (c2968o == null) {
                                            AbstractC8111i5.m8593d("no value for specified key");
                                            throw null;
                                        }
                                        C2963j c2963j = c2968o.f8889d;
                                        int i21 = c2968o.f8892g;
                                        LinkedHashMap linkedHashMap = c2963j.f8880Y;
                                        if (c0294u1 == null) {
                                            Iterator it3 = c2963j.iterator();
                                            while (it3.hasNext()) {
                                                Object key = ((Map.Entry) it3.next()).getKey();
                                                Iterator it4 = it3;
                                                C2974u c2974u = C2971r.f8935u;
                                                if (AbstractC16544l.m18089b(key, c2974u)) {
                                                    Object obj = linkedHashMap.get(c2974u);
                                                    if (obj == null) {
                                                        obj = null;
                                                    }
                                                    List list = (List) obj;
                                                    viewOnAttachStateChangeListenerC11560d.m12960g(i21, String.valueOf(list != null ? (C3590f) AbstractC17680n.m19343S(list) : null));
                                                }
                                                it3 = it4;
                                            }
                                        } else {
                                            Iterator it5 = c2963j.iterator();
                                            while (it5.hasNext()) {
                                                Iterator it6 = it5;
                                                C2974u c2974u2 = (C2974u) ((Map.Entry) it5.next()).getKey();
                                                int[] iArr4 = iArr3;
                                                C2974u c2974u3 = C2971r.f8935u;
                                                if (AbstractC16544l.m18089b(c2974u2, c2974u3)) {
                                                    Object obj2 = c0294u1.f1064a.f8880Y.get(c2974u3);
                                                    if (obj2 == null) {
                                                        obj2 = null;
                                                    }
                                                    List list2 = (List) obj2;
                                                    C3590f c3590f = list2 != null ? (C3590f) AbstractC17680n.m19343S(list2) : null;
                                                    Object obj3 = linkedHashMap.get(c2974u3);
                                                    if (obj3 == null) {
                                                        obj3 = null;
                                                    }
                                                    List list3 = (List) obj3;
                                                    C3590f c3590f2 = list3 != null ? (C3590f) AbstractC17680n.m19343S(list3) : null;
                                                    if (!AbstractC16544l.m18089b(c3590f, c3590f2)) {
                                                        viewOnAttachStateChangeListenerC11560d.m12960g(i21, String.valueOf(c3590f2));
                                                    }
                                                }
                                                iArr3 = iArr4;
                                                it5 = it6;
                                            }
                                        }
                                        iArr2 = iArr3;
                                        i12 = 8;
                                    } else {
                                        iArr2 = iArr3;
                                    }
                                    j11 >>= i12;
                                    i19++;
                                    c12982uM12956b = c12982uM12956b;
                                    iArr3 = iArr2;
                                    j10 = 128;
                                }
                                c12982u = c12982uM12956b;
                                iArr = iArr3;
                                i11 = 1;
                                if (i18 == i12) {
                                }
                            } else {
                                c12982u = c12982uM12956b;
                                iArr = iArr3;
                                i11 = 1;
                            }
                            if (i13 != length) {
                                i13 += i11;
                                c12982uM12956b = c12982u;
                                iArr3 = iArr;
                                i12 = 8;
                                j10 = 128;
                            }
                        }
                    }
                    c12982u2.m14689a();
                    C12982u c12982uM12956b2 = viewOnAttachStateChangeListenerC11560d.m12956b();
                    int[] iArr5 = c12982uM12956b2.f41205b;
                    Object[] objArr2 = c12982uM12956b2.f41206c;
                    long[] jArr3 = c12982uM12956b2.f41204a;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i22 = 0;
                        while (true) {
                            long j12 = jArr3[i22];
                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                int i24 = 0;
                                while (i24 < i23) {
                                    if ((j12 & 255) < 128) {
                                        int i25 = (i22 << 3) + i24;
                                        c12982u2.m14697i(iArr5[i25], new C0294u1(((C0297v1) objArr2[i25]).f1070a, viewOnAttachStateChangeListenerC11560d.m12956b()));
                                    }
                                    j12 >>= 8;
                                    i24++;
                                    jArr3 = jArr3;
                                }
                                jArr = jArr3;
                                i10 = 1;
                                if (i23 == 8) {
                                }
                            } else {
                                jArr = jArr3;
                                i10 = 1;
                            }
                            if (i22 != length2) {
                                i22 += i10;
                                jArr3 = jArr;
                            }
                        }
                    }
                    viewOnAttachStateChangeListenerC11560d.f34938A0 = new C0294u1(androidComposeView.getSemanticsOwner().m3805a(), viewOnAttachStateChangeListenerC11560d.m12956b());
                    viewOnAttachStateChangeListenerC11560d.f34939B0 = false;
                    return;
                }
                return;
            case 24:
                ((AbstractC12067e) this.f18163Z).mo13685l();
                return;
            case 25:
                ((InterfaceC1436k) this.f18163Z).invoke(null);
                return;
            case 26:
                AmazonBilling.startConnectionOnMainThread$lambda$0((AmazonBilling) this.f18163Z);
                return;
            case 27:
                C13352j c13352j = (C13352j) this.f18163Z;
                c13352j.getClass();
                ((C13589g) c13352j.f42371d).m15108P(new C4307j(c13352j, 19));
                return;
            case 28:
                int i26 = SelfieOverlayView.f40876S0;
                ImageView this_switchImageDrawable = (ImageView) this.f18163Z;
                AbstractC16544l.m18094g(this_switchImageDrawable, "$this_switchImageDrawable");
                this_switchImageDrawable.setImageDrawable(null);
                return;
            default:
                ConstraintTrackingWorker this$5 = (ConstraintTrackingWorker) this.f18163Z;
                AbstractC16544l.m18094g(this$5, "this$0");
                if (this$5.f33740t0.f41326Y instanceof C13018a) {
                    return;
                }
                Object obj4 = this$5.f22417Z.f33697b.f22408a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                String str = obj4 instanceof String ? (String) obj4 : null;
                C7011q c7011qM7408d = C7011q.m7408d();
                AbstractC16544l.m18093f(c7011qM7408d, "get()");
                if (str == null || str.length() == 0) {
                    c7011qM7408d.m7411b(AbstractC13543b.f42866a, "No worker to delegate to.");
                    C13027j future = this$5.f33740t0;
                    AbstractC16544l.m18093f(future, "future");
                    future.m14769k(new C7006l());
                    return;
                }
                C6994B c6994b = this$5.f22417Z.f33701f;
                Context context = this$5.f22416Y;
                WorkerParameters workerParameters = this$5.f33737q0;
                c6994b.getClass();
                AbstractC7010p abstractC7010pM7399a = C6994B.m7399a(context, str, workerParameters);
                this$5.f33741u0 = abstractC7010pM7399a;
                if (abstractC7010pM7399a == null) {
                    c7011qM7408d.m7410a(AbstractC13543b.f42866a, "No worker to delegate to.");
                    C13027j future2 = this$5.f33740t0;
                    AbstractC16544l.m18093f(future2, "future");
                    future2.m14769k(new C7006l());
                    return;
                }
                C7253r c7253rM7690f = C7253r.m7690f(this$5.f22416Y);
                C11246q c11246qMo12356t = c7253rM7690f.f22998c.mo12356t();
                String string = this$5.f22417Z.f33696a.toString();
                AbstractC16544l.m18093f(string, "id.toString()");
                C11245p c11245pM12646p = c11246qMo12356t.m12646p(string);
                if (c11245pM12646p == null) {
                    C13027j future3 = this$5.f33740t0;
                    AbstractC16544l.m18093f(future3, "future");
                    String str2 = AbstractC13543b.f42866a;
                    future3.m14769k(new C7006l());
                    return;
                }
                C10165l c10165l = c7253rM7690f.f23005j;
                AbstractC16544l.m18093f(c10165l, "workManagerImpl.trackers");
                C13288c c13288c = new C13288c(c10165l);
                AbstractC0563B abstractC0563B = c7253rM7690f.f22999d.f41991b;
                AbstractC16544l.m18093f(abstractC0563B, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
                this$5.f33740t0.mo5766a(new RunnableC13542a(AbstractC9050h.m9609a(c13288c, c11245pM12646p, abstractC0563B, this$5), i13), new ExecutorC4828a(1));
                if (!c13288c.m14913N(c11245pM12646p)) {
                    c7011qM7408d.m7410a(AbstractC13543b.f42866a, "Constraints not met for delegate " + str + ". Requesting retry.");
                    C13027j future4 = this$5.f33740t0;
                    AbstractC16544l.m18093f(future4, "future");
                    future4.m14769k(new C7007m());
                    return;
                }
                c7011qM7408d.m7410a(AbstractC13543b.f42866a, "Constraints met for delegate ".concat(str));
                try {
                    AbstractC7010p abstractC7010p = this$5.f33741u0;
                    AbstractC16544l.m18091d(abstractC7010p);
                    C13027j c13027jMo7406d = abstractC7010p.mo7406d();
                    AbstractC16544l.m18093f(c13027jMo7406d, "delegate!!.startWork()");
                    c13027jMo7406d.mo5766a(new RunnableC11843b(this$5, 5, c13027jMo7406d), this$5.f22417Z.f33699d);
                    return;
                } catch (Throwable th2) {
                    String str3 = AbstractC13543b.f42866a;
                    String strM11054l = AbstractC10763a.m11054l("Delegated worker ", str, " threw exception in startWork.");
                    if (c7011qM7408d.f22422a <= 3) {
                        Log.d(str3, strM11054l, th2);
                    }
                    synchronized (this$5.f33738r0) {
                        try {
                            if (!this$5.f33739s0) {
                                C13027j future5 = this$5.f33740t0;
                                AbstractC16544l.m18093f(future5, "future");
                                future5.m14769k(new C7006l());
                                return;
                            } else {
                                c7011qM7408d.m7410a(str3, "Constraints were unmet, Retrying.");
                                C13027j future6 = this$5.f33740t0;
                                AbstractC16544l.m18093f(future6, "future");
                                future6.m14769k(new C7007m());
                                return;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
        }
    }
}
