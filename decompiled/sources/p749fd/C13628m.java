package p749fd;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.C11114w;
import com.google.protobuf.AbstractC12107L1;
import com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel;
import com.openai.feature.onboarding.viewmodel.CollectEmailViewModel;
import fk.EnumC13681b;
import fo.C13711h;
import fo.C13718o;
import io.sentry.android.replay.C15300n;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.AbstractC15275f;
import io.sentry.android.replay.capture.InterfaceC15284o;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import kg.C16417w;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import mm.C17309l;
import ng.C17611b;
import p003A1.AbstractC0237c1;
import p025An.C0644w;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p179H0.C3186d;
import p198Hk.C3459b;
import p329N3.C5621k;
import p349O0.C5996c0;
import p478Tc.C7299c;
import p492U1.C7540e;
import p492U1.C7543h;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8104h6;
import p523V9.AbstractC8112i6;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8443A;
import p544W9.AbstractC8501J3;
import p547Wc.C8816z;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9113C4;
import p582Xk.C9525b;
import p582Xk.C9530g;
import p604Yk.C10077b;
import p658b5.C11232c;
import p693d1.C12989b;
import p715e1.C13257c;
import p736f0.C13463A;
import p758g0.C13775m0;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13802d;
import p759g1.C13803e;
import p769gj.ViewOnAttachStateChangeListenerC14162d;
import p773h0.C14303q;
import p773h0.C14305r;
import p773h0.C14307s;
import p773h0.C14309t;
import p773h0.C14315w;
import p773h0.C14322z0;
import p774h1.AbstractC14332J;
import p774h1.AbstractC14334L;
import p774h1.C14326D;
import p774h1.C14329G;
import p774h1.C14330H;
import p774h1.C14331I;
import p774h1.C14336N;
import p774h1.C14340S;
import p774h1.C14341T;
import p774h1.C14351g;
import p774h1.C14353i;
import p774h1.C14356l;
import p774h1.C14358n;
import p774h1.C14365u;
import p774h1.InterfaceC14333K;
import p774h1.InterfaceC14362r;
import p775h2.AbstractC14376f;
import p791hj.ViewOnAttachStateChangeListenerC14519b;
import p796i0.C14897d;
import p801i5.C14932d;
import p803i7.C14941d;
import p814ik.C15031c;
import p821j1.C16036a;
import p821j1.C16037b;
import p821j1.C16042g;
import p821j1.C16043h;
import p821j1.InterfaceC16039d;
import p823j3.C16089k;
import p825j5.C16124a;
import p825j5.C16127d;
import p834jd.AbstractC16201j;
import p834jd.C16194c;
import p836jh.C16209a;
import p836jh.C16210b;
import p836jh.C16211c;
import p838jj.AbstractC16236q;
import p842k0.C16303l;
import p842k0.C16305n;
import p843k1.C16308b;
import p868l9.C16833a;
import p871lf.C16931o;
import p871lf.C16934r;
import p871lf.C16940x;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17665J;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: fd.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C13628m extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43061Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f43062Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13628m(Object obj, int i10) {
        super(1);
        this.f43061Y = i10;
        this.f43062Z = obj;
    }

    /* JADX INFO: renamed from: a */
    private final Object m15152a(Object obj) {
        C16089k c16089k = (C16089k) this.f43062Z;
        synchronized (c16089k.f49831s0) {
            c16089k.f49832t0 = c16089k.f49826Z;
            c16089k.f49834v0 = null;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x041d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0450  */
    /* JADX WARN: Type inference failed for: r2v87, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v88, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        float fCeil;
        int i10;
        C14356l c14356l;
        C13711h c13711h;
        float f10;
        C3459b c3459b;
        int i11 = 6;
        int i12 = 0;
        boolean zContains = false;
        int i13 = 1;
        InterfaceC18770c interfaceC18770c = null;
        switch (this.f43061Y) {
            case 0:
                long j10 = ((C13800b) obj).f43584a;
                float fM15306g = C13800b.m15306g(j10);
                C13616a c13616a = (C13616a) this.f43062Z;
                float f11 = fM15306g - c13616a.f43007b;
                float f12 = c13616a.f43006a;
                return new C13800b(AbstractC8088f6.m8536b(f11 * f12, (C13800b.m15307h(j10) - c13616a.f43008c) * f12));
            case 1:
                String line = (String) obj;
                AbstractC16544l.m18094g(line, "line");
                List listM21697e0 = AbstractC21322p.m21697e0(line, new String[]{Separators.COMMA}, 0, 6);
                String str = (String) listM21697e0.get(0);
                if (AbstractC16544l.m18089b((String) listM21697e0.get(2), "com.withpersona.sdk2.inquiry.nfc")) {
                    EnumC13681b[] enumC13681bArr = EnumC13681b.f43176Y;
                    if (AbstractC16544l.m18089b(str, "Error")) {
                        StringBuilder sb2 = (StringBuilder) this.f43062Z;
                        sb2.append(line);
                        sb2.append(Separators.RETURN);
                    }
                }
                return C17296C.f55119a;
            case 2:
                return (Handler.Callback) ((C8816z) this.f43062Z).f26999Z;
            case 3:
                Handler.Callback callback = (Handler.Callback) obj;
                ((C13718o) this.f43062Z).f43278e = new C8816z(this, 21, callback);
                return new C5621k(this, callback);
            case 4:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                ((C16127d) this.f43062Z).f50045e.add(it);
                return C17296C.f55119a;
            case 5:
                String it2 = (String) obj;
                AbstractC16544l.m18094g(it2, "it");
                ((LinkedHashSet) this.f43062Z).add(it2);
                return C17296C.f55119a;
            case 6:
                C16124a cursor = (C16124a) obj;
                AbstractC16544l.m18094g(cursor, "cursor");
                ArrayList arrayList = new ArrayList();
                while (Boolean.valueOf(cursor.f50035a.moveToNext()).booleanValue()) {
                    arrayList.add(((AbstractC0237c1) this.f43062Z).f881Y.invoke(cursor));
                }
                return new C14932d(arrayList);
            case 7:
                MotionEvent it3 = (MotionEvent) obj;
                AbstractC16544l.m18094g(it3, "it");
                C7299c c7299c = (C7299c) this.f43062Z;
                c7299c.getClass();
                c7299c.f23108a.setValue(new C7543h(AbstractC9101A4.m9631a((int) it3.getX(), (int) it3.getY())));
                return Boolean.FALSE;
            case 8:
                ((ViewOnAttachStateChangeListenerC14162d) this.f43062Z).f44534Y.clear();
                return C17296C.f55119a;
            case 9:
                CharSequence charSequence = (CharSequence) obj;
                String string = charSequence == null ? null : charSequence.toString();
                if (string == null) {
                    string = "";
                }
                ((C11232c) this.f43062Z).m12493q(string);
                return C17296C.f55119a;
            case 10:
                C13257c c13257c = (C13257c) obj;
                C14309t c14309t = (C14309t) this.f43062Z;
                if (c13257c.getDensity() * c14309t.f44924C0 < 0.0f || C13803e.m15332d(c13257c.f41873Y.mo14854i()) <= 0.0f) {
                    return c13257c.m14856a(C14305r.f44907Z);
                }
                if (C7540e.m7873a(c14309t.f44924C0, 0.0f)) {
                    fCeil = 1.0f;
                } else {
                    fCeil = (float) Math.ceil(c13257c.getDensity() * c14309t.f44924C0);
                }
                float f13 = 2;
                float fMin = Math.min(fCeil, (float) Math.ceil(C13803e.m15332d(c13257c.f41873Y.mo14854i()) / f13));
                float f14 = fMin / f13;
                long jM8536b = AbstractC8088f6.m8536b(f14, f14);
                long jM8603a = AbstractC8112i6.m8603a(C13803e.m15333e(c13257c.f41873Y.mo14854i()) - fMin, C13803e.m15331c(c13257c.f41873Y.mo14854i()) - fMin);
                float f15 = fMin * f13;
                boolean z6 = f15 > C13803e.m15332d(c13257c.f41873Y.mo14854i());
                AbstractC14332J abstractC14332JMo4178o = c14309t.f44926E0.mo4178o(c13257c.f41873Y.mo14854i(), c13257c.f41873Y.getLayoutDirection(), c13257c);
                if (!(abstractC14332JMo4178o instanceof C14329G)) {
                    if (!(abstractC14332JMo4178o instanceof C14331I)) {
                        if (!(abstractC14332JMo4178o instanceof C14330H)) {
                            throw new C0644w();
                        }
                        C14341T c14341t = c14309t.f44925D0;
                        if (z6) {
                            jM8536b = 0;
                        }
                        if (z6) {
                            jM8603a = c13257c.f41873Y.mo14854i();
                        }
                        return c13257c.m14856a(new C13463A(c14341t, jM8536b, jM8603a, z6 ? C16042g.f49483a : new C16043h(fMin, 0.0f, 0, 0, 30), 1));
                    }
                    C14341T c14341t2 = c14309t.f44925D0;
                    C13802d c13802d = ((C14331I) abstractC14332JMo4178o).f44971a;
                    if (AbstractC8104h6.m8584c(c13802d)) {
                        return c13257c.m14856a(new C14307s(z6, c14341t2, c13802d.f43594e, f14, fMin, jM8536b, jM8603a, new C16043h(fMin, 0.0f, 0, 0, 30)));
                    }
                    if (c14309t.f44923B0 == null) {
                        c14309t.f44923B0 = new C14303q();
                    }
                    C14303q c14303q = c14309t.f44923B0;
                    AbstractC16544l.m18091d(c14303q);
                    InterfaceC14333K interfaceC14333K = c14303q.f44906d;
                    InterfaceC14333K interfaceC14333K2 = interfaceC14333K;
                    if (interfaceC14333K == null) {
                        C14353i c14353iM15631i = AbstractC14334L.m15631i();
                        c14303q.f44906d = c14353iM15631i;
                        interfaceC14333K2 = c14353iM15631i;
                    }
                    C14353i c14353i = (C14353i) interfaceC14333K2;
                    c14353i.m15733e();
                    AbstractC12107L1.m13812c(c14353i, c13802d);
                    if (!z6) {
                        InterfaceC14333K interfaceC14333KM15631i = AbstractC14334L.m15631i();
                        AbstractC12107L1.m13812c(interfaceC14333KM15631i, new C13802d(fMin, fMin, c13802d.m15328b() - fMin, c13802d.m15327a() - fMin, AbstractC8443A.m9047c(fMin, c13802d.f43594e), AbstractC8443A.m9047c(fMin, c13802d.f43595f), AbstractC8443A.m9047c(fMin, c13802d.f43596g), AbstractC8443A.m9047c(fMin, c13802d.f43597h)));
                        c14353i.m15732d(c14353i, interfaceC14333KM15631i, 0);
                    }
                    return c13257c.m14856a(new C13775m0(c14353i, 7, c14341t2));
                }
                C14341T c14341t3 = c14309t.f44925D0;
                C14329G c14329g = (C14329G) abstractC14332JMo4178o;
                if (z6) {
                    return c13257c.m14856a(new C13775m0(c14329g, i11, c14341t3));
                }
                if (c14341t3 instanceof C14341T) {
                    long j11 = c14341t3.f45021a;
                    C14356l c14356l2 = new C14356l(j11, 5, Build.VERSION.SDK_INT >= 29 ? C14358n.f45047a.m15769a(j11, 5) : new PorterDuffColorFilter(AbstractC14334L.m15617F(j11), AbstractC14334L.m15621J(5)));
                    i10 = 1;
                    c14356l = c14356l2;
                } else {
                    i10 = 0;
                    c14356l = null;
                }
                C14353i c14353i2 = c14329g.f44969a;
                C13801c c13801cM15729a = c14353i2.m15729a();
                if (c14309t.f44923B0 == null) {
                    c14309t.f44923B0 = new C14303q();
                }
                C14303q c14303q2 = c14309t.f44923B0;
                AbstractC16544l.m18091d(c14303q2);
                InterfaceC14333K interfaceC14333KM15631i2 = c14303q2.f44906d;
                if (interfaceC14333KM15631i2 == null) {
                    interfaceC14333KM15631i2 = AbstractC14334L.m15631i();
                    c14303q2.f44906d = interfaceC14333KM15631i2;
                }
                InterfaceC14333K interfaceC14333K3 = interfaceC14333KM15631i2;
                C14353i c14353i3 = (C14353i) interfaceC14333K3;
                c14353i3.m15733e();
                AbstractC12107L1.m13811b(interfaceC14333K3, c13801cM15729a);
                c14353i3.m15732d(c14353i3, c14353i2, 0);
                C16525B c16525b = new C16525B();
                long jM9643a = AbstractC9113C4.m9643a((int) Math.ceil(c13801cM15729a.m15321h()), (int) Math.ceil(c13801cM15729a.m15318e()));
                C14303q c14303q3 = c14309t.f44923B0;
                AbstractC16544l.m18091d(c14303q3);
                C14351g c14351gM15628f = c14303q3.f44903a;
                InterfaceC14362r interfaceC14362rM15623a = c14303q3.f44904b;
                C14326D c14326d = c14351gM15628f != null ? new C14326D(c14351gM15628f.m15728a()) : null;
                if (!(c14326d == null ? false : C14326D.m15601a(c14326d.f44962a, 0))) {
                    C14326D c14326d2 = c14351gM15628f != null ? new C14326D(c14351gM15628f.m15728a()) : null;
                    i12 = (c14326d2 instanceof C14326D) && i10 == c14326d2.f44962a ? 1 : 0;
                }
                if (c14351gM15628f == null || interfaceC14362rM15623a == null) {
                    c14351gM15628f = AbstractC14334L.m15628f((int) (jM9643a >> 32), (int) (jM9643a & 4294967295L), i10);
                    c14303q3.f44903a = c14351gM15628f;
                    interfaceC14362rM15623a = AbstractC14334L.m15623a(c14351gM15628f);
                    c14303q3.f44904b = interfaceC14362rM15623a;
                } else {
                    float fM15333e = C13803e.m15333e(c13257c.f41873Y.mo14854i());
                    Bitmap bitmap = c14351gM15628f.f45036a;
                    if (fM15333e > bitmap.getWidth() || C13803e.m15331c(c13257c.f41873Y.mo14854i()) > bitmap.getHeight() || i12 == 0) {
                        c14351gM15628f = AbstractC14334L.m15628f((int) (jM9643a >> 32), (int) (jM9643a & 4294967295L), i10);
                        c14303q3.f44903a = c14351gM15628f;
                        interfaceC14362rM15623a = AbstractC14334L.m15623a(c14351gM15628f);
                        c14303q3.f44904b = interfaceC14362rM15623a;
                    }
                }
                C14351g c14351g = c14351gM15628f;
                InterfaceC14362r interfaceC14362r = interfaceC14362rM15623a;
                C16037b c16037b = c14303q3.f44905c;
                if (c16037b == null) {
                    c16037b = new C16037b();
                    c14303q3.f44905c = c16037b;
                }
                long jM9645c = AbstractC9113C4.m9645c(jM9643a);
                EnumC7546k layoutDirection = c13257c.f41873Y.getLayoutDirection();
                C16036a c16036a = c16037b.f49478Y;
                InterfaceC7537b interfaceC7537b = c16036a.f49474a;
                EnumC7546k enumC7546k = c16036a.f49475b;
                InterfaceC14362r interfaceC14362r2 = c16036a.f49476c;
                long j12 = c16036a.f49477d;
                c16036a.f49474a = c13257c;
                c16036a.f49475b = layoutDirection;
                c16036a.f49476c = interfaceC14362r;
                c16036a.f49477d = jM9645c;
                interfaceC14362r.mo15706e();
                AbstractC14376f.m15850p(c16037b, C14365u.f45052b, 0L, jM9645c, 0.0f, 58);
                float f16 = -c13801cM15729a.f43586a;
                float f17 = -c13801cM15729a.f43587b;
                C13711h c13711h2 = c16037b.f49479Z;
                ((C10077b) c13711h2.f43259Z).m10665M(f16, f17);
                try {
                    try {
                        AbstractC14376f.m15847m(c16037b, c14329g.f44969a, c14341t3, 0.0f, new C16043h(f15, 0.0f, 0, 0, 30), 52);
                        float f18 = 1;
                        float fM15333e2 = (C13803e.m15333e(c13711h2.m15202x()) + f18) / C13803e.m15333e(c13711h2.m15202x());
                        float fM15331c = (C13803e.m15331c(c13711h2.m15202x()) + f18) / C13803e.m15331c(c13711h2.m15202x());
                        long jMo17604o0 = c16037b.mo17604o0();
                        long jM15202x = c13711h2.m15202x();
                        c13711h2.m15196m().mo15706e();
                        c13711h = c13711h2;
                        try {
                            ((C10077b) c13711h.f43259Z).m10664L(fM15333e2, fM15331c, jMo17604o0);
                            AbstractC14376f.m15847m(c16037b, interfaceC14333K3, c14341t3, 0.0f, null, 28);
                            try {
                                c13711h.m15196m().mo15719r();
                                c13711h.m15189L(jM15202x);
                                ((C10077b) c13711h.f43259Z).m10665M(-f16, -f17);
                                interfaceC14362r.mo15719r();
                                c16036a.f49474a = interfaceC7537b;
                                c16036a.f49475b = enumC7546k;
                                c16036a.f49476c = interfaceC14362r2;
                                c16036a.f49477d = j12;
                                c14351g.f45036a.prepareToDraw();
                                c16525b.f51262Y = c14351g;
                                return c13257c.m14856a(new C3186d(c13801cM15729a, c16525b, jM9643a, c14356l, 2));
                            } catch (Throwable th2) {
                                th = th2;
                                f10 = f17;
                                ((C10077b) c13711h.f43259Z).m10665M(-f16, -f10);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            f10 = f17;
                            try {
                                c13711h.m15196m().mo15719r();
                                c13711h.m15189L(jM15202x);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                ((C10077b) c13711h.f43259Z).m10665M(-f16, -f10);
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        c13711h = c13711h2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    c13711h = c13711h2;
                    f10 = f17;
                }
                break;
            case 11:
                long j13 = ((C13800b) obj).f43584a;
                C14315w c14315w = (C14315w) this.f43062Z;
                if (c14315w.f44844F0) {
                    c14315w.f44845G0.invoke();
                }
                return C17296C.f55119a;
            case 12:
                float fFloatValue = ((Number) obj).floatValue();
                C14322z0 c14322z0 = (C14322z0) this.f43062Z;
                float fM6412g = c14322z0.f44952a.m6412g() + fFloatValue + c14322z0.f44956e;
                float fM8920k = AbstractC8301I.m8920k(fM6412g, 0.0f, c14322z0.f44955d.m6412g());
                boolean z10 = fM6412g == fM8920k;
                C5996c0 c5996c0 = c14322z0.f44952a;
                float fM6412g2 = fM8920k - c5996c0.m6412g();
                int iRound = Math.round(fM6412g2);
                c5996c0.m6413h(c5996c0.m6412g() + iRound);
                c14322z0.f44956e = fM6412g2 - iRound;
                if (!z10) {
                    fFloatValue = fM6412g2;
                }
                return Float.valueOf(fFloatValue);
            case 13:
                C14336N c14336n = (C14336N) obj;
                C14340S c14340s = (C14340S) this.f43062Z;
                c14336n.m15655g(c14340s.f45020z0);
                c14336n.m15656h(c14340s.f45004A0);
                c14336n.m15649a(c14340s.f45005B0);
                c14336n.m15661o(c14340s.f45006C0);
                c14336n.m15662p(c14340s.f45007D0);
                c14336n.m15657j(c14340s.f45008E0);
                c14336n.m15652d(c14340s.f45009F0);
                c14336n.m15653e(c14340s.f45010G0);
                c14336n.m15654f(c14340s.f45011H0);
                float f19 = c14340s.f45012I0;
                if (c14336n.f44996y0 != f19) {
                    c14336n.f44984Y |= 2048;
                    c14336n.f44996y0 = f19;
                }
                c14336n.m15660n(c14340s.f45013J0);
                c14336n.m15658k(c14340s.f45014K0);
                c14336n.m15651c(c14340s.f45015L0);
                if (!AbstractC16544l.m18089b(null, null)) {
                    c14336n.f44984Y |= 131072;
                }
                c14336n.m15650b(c14340s.f45016M0);
                c14336n.m15659l(c14340s.f45017N0);
                int i14 = c14340s.f45018O0;
                if (!AbstractC14334L.m15640r(c14336n.f44979C0, i14)) {
                    c14336n.f44984Y |= 32768;
                    c14336n.f44979C0 = i14;
                }
                return C17296C.f55119a;
            case 14:
                String it4 = (String) obj;
                AbstractC16544l.m18094g(it4, "it");
                ((CollectEmailViewModel) this.f43062Z).m14395k(new C17611b(it4));
                return C17296C.f55119a;
            case 15:
                String it5 = (String) obj;
                AbstractC16544l.m18094g(it5, "it");
                ((VerifyPhoneViewModel) this.f43062Z).m14395k(new C16417w(it5));
                return C17296C.f55119a;
            case 16:
                AbstractC8501J3.m9166b((C14897d) this.f43062Z, (C12989b) obj);
                return C17296C.f55119a;
            case 17:
                String it6 = (String) obj;
                AbstractC16544l.m18094g(it6, "it");
                ((C14941d) this.f43062Z).getClass();
                int iM21678L = AbstractC21322p.m21678L(it6, ':', 0, false, 6);
                if (iM21678L > 0) {
                    String strSubstring = it6.substring(0, iM21678L);
                    AbstractC16544l.m18093f(strSubstring, "substring(...)");
                    zContains = C14941d.f46551c.contains(strSubstring);
                }
                if (zContains) {
                    return null;
                }
                return it6;
            case 18:
                C16194c update = (C16194c) obj;
                AbstractC16544l.m18094g(update, "$this$update");
                return C16194c.m17803a(update, false, false, false, 0, AbstractC17665J.m19267g(update.f50271e, (AbstractC16201j) this.f43062Z), 15);
            case 19:
                String str2 = ((C16833a) obj).f54005a;
                AbstractC16544l.m18093f(str2, "getId(...)");
                ((C15031c) this.f43062Z).f46728a = str2;
                return C17296C.f55119a;
            case 20:
                Date newTimestamp = (Date) obj;
                AbstractC16544l.m18094g(newTimestamp, "newTimestamp");
                ReplayIntegration replayIntegration = (ReplayIntegration) this.f43062Z;
                InterfaceC15284o interfaceC15284o = replayIntegration.f47666x0;
                if (interfaceC15284o != null) {
                    ((AbstractC15275f) interfaceC15284o).m16501m(Integer.valueOf(((AbstractC15275f) interfaceC15284o).m16499k()).intValue() + 1);
                }
                InterfaceC15284o interfaceC15284o2 = replayIntegration.f47666x0;
                if (interfaceC15284o2 != null) {
                    ((AbstractC15275f) interfaceC15284o2).m16503o(newTimestamp);
                }
                return C17296C.f55119a;
            case 21:
                ArrayList mViews = (ArrayList) obj;
                AbstractC16544l.m18094g(mViews, "mViews");
                C15300n c15300n = (C15300n) this.f43062Z;
                synchronized (c15300n.f47792Z) {
                    c3459b = c15300n.f47794p0;
                    c3459b.addAll(mViews);
                }
                return c3459b;
            case 22:
                return m15152a(obj);
            case 23:
                ((InterfaceC0627n0) this.f43062Z).mo1275e(null);
                return C17296C.f55119a;
            case 24:
                C9525b createClientPlugin = (C9525b) obj;
                AbstractC16544l.m18094g(createClientPlugin, "$this$createClientPlugin");
                createClientPlugin.m10029a(C9530g.f28676b, new C16209a((C16210b) this.f43062Z, interfaceC18770c, i12));
                return C17296C.f55119a;
            case 25:
                C9525b createClientPlugin2 = (C9525b) obj;
                AbstractC16544l.m18094g(createClientPlugin2, "$this$createClientPlugin");
                createClientPlugin2.m10029a(C9530g.f28676b, new C16209a((C16211c) this.f43062Z, interfaceC18770c, i13));
                return C17296C.f55119a;
            case 26:
                AbstractC16544l.m18094g((View) obj, "it");
                C11114w c11114w = ((ViewOnAttachStateChangeListenerC14519b) ((AbstractC16236q) this.f43062Z).getParentLifecycleOwner()).f45756o0;
                AbstractC16544l.m18093f(c11114w, "parentLifecycleOwner.lifecycle");
                return c11114w;
            case 27:
                ((C16305n) this.f43062Z).f50513a.setValue(new C16303l(((C13800b) obj).f43584a));
                return C17296C.f55119a;
            case 28:
                InterfaceC16039d interfaceC16039d = (InterfaceC16039d) obj;
                C16308b c16308b = (C16308b) this.f43062Z;
                C14353i c14353i4 = c16308b.f50530l;
                if (c16308b.f50532n && c16308b.f50540v && c14353i4 != null) {
                    ?? r6 = c16308b.f50522d;
                    C13711h c13711hMo17601f0 = interfaceC16039d.mo17601f0();
                    long jM15202x2 = c13711hMo17601f0.m15202x();
                    c13711hMo17601f0.m15196m().mo15706e();
                    try {
                        ((C13711h) ((C10077b) c13711hMo17601f0.f43259Z).f29833Z).m15196m().mo15722u(c14353i4, 1);
                        r6.invoke(interfaceC16039d);
                    } finally {
                        AbstractC12107L1.m13830u(c13711hMo17601f0, jM15202x2);
                    }
                } else {
                    c16308b.f50522d.invoke(interfaceC16039d);
                }
                return C17296C.f55119a;
            default:
                C16940x jawbones = (C16940x) obj;
                AbstractC16544l.m18094g(jawbones, "jawbones");
                C16931o c16931o = (C16931o) this.f43062Z;
                return C16940x.m18591a(jawbones, AbstractC17659D.m19249k(jawbones.f54388a, new C17309l(new C16934r(c16931o.f54369a), c16931o)), null, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13628m(StringBuilder sb2) {
        super(1);
        this.f43061Y = 1;
        EnumC13681b[] enumC13681bArr = EnumC13681b.f43176Y;
        this.f43062Z = sb2;
    }
}
