package p017Af;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import android.view.View;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import com.openai.chatgpt.R;
import fo.C13711h;
import io.sentry.AbstractC15152P0;
import java.util.List;
import kg.C16396b;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p001A.RunnableC0074m;
import p003A1.AbstractC0168G;
import p019Ah.EnumC0511a;
import p040Bd.C1119l0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p049Bm.InterfaceC1441p;
import p080D0.AbstractC1807h0;
import p080D0.C1803f0;
import p080D0.C1826r;
import p098Di.InterfaceC2062k;
import p103Dn.InterfaceC2149O0;
import p1095x1.AbstractC21073a0;
import p1095x1.InterfaceC21098s;
import p1139z0.AbstractC21627m;
import p1139z0.C21585H;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1143z4.C21778h;
import p127El.C2577c;
import p127El.ExecutorC2575a;
import p148Fi.AbstractC2841n;
import p148Fi.C2853t;
import p178H.InterfaceC3153k;
import p178H.InterfaceC3180x0;
import p207I4.InterfaceC3619f;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p233J4.C4261g;
import p328N1.AbstractC5599o;
import p328N1.C5583J;
import p328N1.C5600p;
import p328N1.C5605u;
import p328N1.C5606v;
import p328N1.C5609y;
import p328N1.InterfaceC5584K;
import p341Ni.InterfaceC5798r;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p393Q1.C6551c;
import p429Re.C6876j;
import p429Re.C6877k;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8106i0;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8175q5;
import p526Vd.C8262d;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8739x2;
import p544W9.AbstractC8753z4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p729ej.AbstractC13422m;
import p729ej.C13414e;
import p729ej.InterfaceC13410a;
import p736f0.C13489g;
import p747fb.InterfaceFutureC13608b;
import p759g1.C13800b;
import p759g1.C13801c;
import p769gj.C14183y;
import p858ko.C16484C;
import p858ko.C16501d;
import p858ko.InterfaceC16502e;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.C17781r0;
import p911o0.C17790w;

/* JADX INFO: renamed from: Af.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C0485p extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1574Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1575Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0485p(InterfaceC1436k interfaceC1436k) {
        super(4);
        this.f1574Y = 11;
        this.f1575Z = (AbstractC16546n) interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r3v63, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object outerRendering, Object obj3) {
        int i10;
        InterfaceC3153k interfaceC3153k;
        InterfaceC3180x0 interfaceC3180x0;
        switch (this.f1574Y) {
            case 0:
                InterfaceC7537b appendInlineContent = (InterfaceC7537b) obj;
                String it = (String) obj2;
                C6021p c6021p = (C6021p) outerRendering;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(appendInlineContent, "$this$appendInlineContent");
                AbstractC16544l.m18094g(it, "it");
                if ((iIntValue & 129) == 128 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    ((C1119l0) this.f1575Z).getClass();
                    EnumC0511a enumC0511a = EnumC0511a.f1649Y;
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.lock_key_hole, c6021p, 0), null, AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23184a), 0L, c6021p, 48, 8);
                }
                return C17296C.f55119a;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                InterfaceC21098s interfaceC21098s = (InterfaceC21098s) obj2;
                long jM21962j = ((C13800b) outerRendering).f43584a;
                C1826r c1826r = (C1826r) obj3;
                long jMo21524k = interfaceC21098s.mo21524k();
                C13801c c13801c = new C13801c(0.0f, 0.0f, (int) (jMo21524k >> 32), (int) (jMo21524k & 4294967295L));
                if (!AbstractC1807h0.m2631t(jM21962j, c13801c)) {
                    jM21962j = AbstractC21627m.m21962j(jM21962j, c13801c);
                }
                C1803f0 c1803f0 = (C1803f0) this.f1575Z;
                long jM2589a = C1803f0.m2589a(c1803f0, interfaceC21098s, jM21962j);
                if (AbstractC8088f6.m8538d(jM2589a)) {
                    c1803f0.m2600l(zBooleanValue);
                    c1803f0.f5195r = null;
                    c1803f0.m2603o(jM2589a, 9205357640488583168L, false, c1826r);
                    c1803f0.f5185h.m15073b();
                    c1803f0.f5196s = false;
                    c1803f0.m2604p();
                }
                return C17296C.f55119a;
            case 2:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj3;
                AbstractC16544l.m18091d(sQLiteQuery);
                ((InterfaceC3619f) this.f1575Z).mo3423e(new C4261g(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) outerRendering, sQLiteQuery);
            case 3:
                C10845a c10845a = (C10845a) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C6021p c6021p2 = (C6021p) outerRendering;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    i10 = iIntValue3 | (c6021p2.m6542f(c10845a) ? 4 : 2);
                } else {
                    i10 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i10 |= c6021p2.m6538d(iIntValue2) ? 32 : 16;
                }
                if ((i10 & 147) == 146 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    Object obj4 = ((List) this.f1575Z).get(iIntValue2);
                    int i11 = i10 & 126;
                    c6021p2.m6524S(-188023825);
                    if (obj4 instanceof AbstractC2841n) {
                        c6021p2.m6524S(-187989881);
                        AbstractC8739x2.m9473b(iIntValue2, obj4.toString(), null, c6021p2, (i11 >> 3) & 14, 4);
                        c6021p2.m6553p(false);
                    } else if (obj4 instanceof InterfaceC5798r) {
                        c6021p2.m6524S(-187743896);
                        AbstractC8739x2.m9473b(iIntValue2, obj4.toString(), AbstractC8142m4.m8676d(R.string.voice_debug_connection_state, c6021p2), c6021p2, (i11 >> 3) & 14, 0);
                        c6021p2.m6553p(false);
                    } else if (obj4 instanceof C2853t) {
                        c6021p2.m6524S(-187406585);
                        ((C2853t) obj4).getClass();
                        AbstractC8739x2.m9473b(iIntValue2, "█", null, c6021p2, (i11 >> 3) & 14, 4);
                        c6021p2.m6553p(false);
                    } else {
                        c6021p2.m6524S(-187195444);
                        c6021p2.m6553p(false);
                    }
                    c6021p2.m6553p(false);
                }
                return C17296C.f55119a;
            case 4:
                long j10 = ((C13800b) obj).f43584a;
                long j11 = ((C13800b) obj2).f43584a;
                float fFloatValue = ((Number) outerRendering).floatValue();
                ((Number) obj3).floatValue();
                C2577c c2577c = (C2577c) this.f1575Z;
                synchronized (c2577c) {
                    try {
                        InterfaceC2149O0 interfaceC2149O0 = c2577c.f8011a;
                        if (interfaceC2149O0 != null && (interfaceC3153k = (InterfaceC3153k) interfaceC2149O0.getValue()) != null && (interfaceC3180x0 = (InterfaceC3180x0) interfaceC3153k.mo105a().mo147l().mo129d()) != null) {
                            Float f10 = c2577c.f8012b;
                            float fFloatValue2 = f10 != null ? f10.floatValue() : interfaceC3180x0.mo229c();
                            float fM8920k = AbstractC8301I.m8920k(fFloatValue * fFloatValue2, interfaceC3180x0.mo228b(), interfaceC3180x0.mo227a());
                            if (fM8920k != fFloatValue2) {
                                c2577c.f8012b = Float.valueOf(fM8920k);
                                InterfaceFutureC13608b interfaceFutureC13608bMo303g = interfaceC3153k.mo107c().mo303g(fM8920k);
                                AbstractC16544l.m18093f(interfaceFutureC13608bMo303g, "setZoomRatio(...)");
                                c2577c.f8013c.add(interfaceFutureC13608bMo303g);
                                interfaceFutureC13608bMo303g.mo5766a(new RunnableC0074m(c2577c, 18, interfaceFutureC13608bMo303g), new ExecutorC2575a(0));
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return C17296C.f55119a;
            case 5:
                InterfaceC2062k anonymous$parameter$0$ = (InterfaceC2062k) obj;
                InterfaceC1436k anonymous$parameter$1$ = (InterfaceC1436k) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(anonymous$parameter$0$, "$anonymous$parameter$0$");
                AbstractC16544l.m18094g(anonymous$parameter$1$, "$anonymous$parameter$1$");
                ((InterfaceC1439n) this.f1575Z).invoke((C6021p) outerRendering, 0);
                return C17296C.f55119a;
            case 6:
                C13489g composable = (C13489g) obj;
                C21778h backStackEntry = (C21778h) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(composable, "$this$composable");
                AbstractC16544l.m18094g(backStackEntry, "backStackEntry");
                AbstractC15152P0.m16327a("Rendering destination: " + backStackEntry.f69074Z.f69136s0);
                ((InterfaceC1441p) this.f1575Z).mo985d(composable, backStackEntry, (C6021p) outerRendering, Integer.valueOf(iIntValue4 & 126));
                return C17296C.f55119a;
            case 7:
                int i12 = ((C5605u) outerRendering).f18148a;
                int i13 = ((C5606v) obj3).f18149a;
                C6551c c6551c = (C6551c) this.f1575Z;
                InterfaceC5584K interfaceC5584KM5991b = ((C5600p) c6551c.f21201q0).m5991b((AbstractC5599o) obj, (C5609y) obj2, i12, i13);
                if (interfaceC5584KM5991b instanceof C5583J) {
                    Object obj5 = ((C5583J) interfaceC5584KM5991b).f18090Y;
                    AbstractC16544l.m18092e(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                C13711h c13711h = new C13711h(interfaceC5584KM5991b, c6551c.f21206v0);
                c6551c.f21206v0 = c13711h;
                Object obj6 = c13711h.f43261p0;
                AbstractC16544l.m18092e(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj6;
            case 8:
                C10845a items = (C10845a) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C6021p c6021p3 = (C6021p) outerRendering;
                int iIntValue6 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(items, "$this$items");
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= c6021p3.m6538d(iIntValue5) ? 32 : 16;
                }
                if ((iIntValue6 & 145) == 144 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C6876j c6876j = (C6876j) ((C6877k) this.f1575Z).f22056e.get(iIntValue5);
                    C10456n c10456n = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p3, 0);
                    int i14 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11244d);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C21694h c21694h = C21698j.f68873f;
                    C5997d.m6439Z(c21694h, c6021p3, c17781r0M19506b);
                    C21694h c21694h2 = C21698j.f68872e;
                    C5997d.m6439Z(c21694h2, c6021p3, interfaceC6008i0M6550m);
                    C21694h c21694h3 = C21698j.f68874g;
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i14))) {
                        AbstractC0168G.m537z(i14, c6021p3, i14, c21694h3);
                    }
                    C21694h c21694h4 = C21698j.f68871d;
                    C5997d.m6439Z(c21694h4, c6021p3, interfaceC10459qM10923d);
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(c6876j.f22050c, c6021p3, 0), null, AbstractC10844c.m11252l(AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, AbstractC7313q.f23201f, 0.0f, 11), AbstractC7312p.f23187d), 0L, c6021p3, 48, 8);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p3, 0);
                    int i15 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p3, c10456n);
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C5997d.m6439Z(c21694h, c6021p3, c17790wM19515a);
                    C5997d.m6439Z(c21694h2, c6021p3, interfaceC6008i0M6550m2);
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i15))) {
                        AbstractC0168G.m537z(i15, c6021p3, i15, c21694h3);
                    }
                    C5997d.m6439Z(c21694h4, c6021p3, interfaceC10459qM10923d2);
                    AbstractC4124r4.m4768b(c6876j.f22048a, AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, 0.0f, AbstractC7313q.f23198c, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p3.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p3, 0, 0, 65532);
                    AbstractC4124r4.m4769c(c6876j.f22049b, null, ((C3949M0) c6021p3.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c6021p3, 0, 0, 262138);
                    c6021p3.m6553p(true);
                    c6021p3.m6553p(true);
                }
                return C17296C.f55119a;
            case 9:
                C16396b anonymous$parameter$0$2 = (C16396b) obj;
                InterfaceC1436k anonymous$parameter$1$2 = (InterfaceC1436k) obj2;
                C6021p c6021p4 = (C6021p) outerRendering;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(anonymous$parameter$0$2, "$anonymous$parameter$0$");
                AbstractC16544l.m18094g(anonymous$parameter$1$2, "$anonymous$parameter$1$");
                AbstractC8106i0.m8588c((InterfaceC1426a) this.f1575Z, AbstractC8126k4.m8631b(R.drawable.arrow_left, c6021p4, 0), null, c6021p4, 0);
                return C17296C.f55119a;
            case 10:
                AbstractC13422m iChild = (AbstractC13422m) obj;
                String iKey = (String) outerRendering;
                InterfaceC1436k iHandler = (InterfaceC1436k) obj3;
                AbstractC16544l.m18094g(iChild, "iChild");
                AbstractC16544l.m18094g(iKey, "iKey");
                AbstractC16544l.m18094g(iHandler, "iHandler");
                return ((InterfaceC13410a) ((C13414e) this.f1575Z).f42490Y).mo3404p(iChild, obj2, iKey, iHandler);
            case 11:
                View noName_0 = (View) obj;
                InterfaceC1439n innerShowRendering = (InterfaceC1439n) obj2;
                C14183y viewEnvironment = (C14183y) obj3;
                AbstractC16544l.m18094g(noName_0, "$noName_0");
                AbstractC16544l.m18094g(innerShowRendering, "innerShowRendering");
                AbstractC16544l.m18094g(outerRendering, "outerRendering");
                AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
                innerShowRendering.invoke(((AbstractC16546n) this.f1575Z).invoke(outerRendering), viewEnvironment);
                return C17296C.f55119a;
            case 12:
                final float fFloatValue3 = ((Number) obj).floatValue();
                final long j12 = ((C13800b) obj2).f43584a;
                ((Number) outerRendering).floatValue();
                final long j13 = ((C13800b) obj3).f43584a;
                boolean z6 = (AbstractC8088f6.m8538d(j12) && AbstractC8088f6.m8537c(j12)) && !Float.isInfinite(fFloatValue3) && !Float.isNaN(fFloatValue3) && AbstractC8088f6.m8538d(j13) && AbstractC8088f6.m8537c(j13);
                C16484C c16484c = (C16484C) this.f1575Z;
                if (z6) {
                    final C16501d c16501dM18049b = c16484c.m18049b();
                    if (c16501dM18049b != null) {
                        final C16484C c16484c2 = (C16484C) this.f1575Z;
                        c16484c2.f51144k.setValue(new InterfaceC16502e() { // from class: ko.z
                            /* JADX WARN: Code duplicated, block: B:15:0x0046  */
                            @Override // p858ko.InterfaceC16502e
                            /* JADX INFO: renamed from: a */
                            public final C16501d mo18064a(C16503f c16503f) {
                                boolean z10;
                                C16501d c16501d = c16501dM18049b;
                                C16484C this$0 = c16484c2;
                                AbstractC16544l.m18094g(this$0, "this$0");
                                long j14 = c16503f.f51188b;
                                float f11 = c16501d.f51185b;
                                C16499b c16499b = new C16499b(f11, j14);
                                long jM18063a = c16499b.m18063a();
                                float fM21556b = AbstractC21073a0.m21556b(jM18063a);
                                if (Float.isInfinite(fM21556b) || Float.isNaN(fM21556b) || fM21556b < 0.0f) {
                                    z10 = false;
                                } else {
                                    float fM21557c = AbstractC21073a0.m21557c(jM18063a);
                                    if (Float.isInfinite(fM21557c) || Float.isNaN(fM21557c) || fM21557c < 0.0f) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                }
                                if (!z10) {
                                    C21585H c21585h = C16484C.f51133q;
                                    throw new IllegalStateException("Old zoom is invalid/infinite. ".concat(this$0.m18053f(new C17309l[0])).toString());
                                }
                                float f12 = fFloatValue3;
                                boolean z11 = f12 < 1.0f;
                                boolean z12 = f12 > 1.0f;
                                C16485D c16485d = this$0.m18056i().f51154c;
                                boolean z13 = AbstractC8753z4.m9514b(AbstractC21073a0.m21558d(Math.max(c16485d.f51151b, c16485d.m18060a(j14)) / AbstractC8753z4.m9514b(j14), j14)) - AbstractC8753z4.m9514b(c16499b.m18063a()) < 0.001f;
                                boolean z14 = AbstractC8753z4.m9514b(c16499b.m18063a()) - AbstractC8753z4.m9514b(AbstractC21073a0.m21558d(this$0.m18056i().f51154c.m18060a(j14) / AbstractC8753z4.m9514b(j14), j14)) < 0.001f;
                                if (this$0.m18056i().f51153b) {
                                    if (z12 && z13) {
                                        f12 = (f12 / 250) + 1.0f;
                                    } else if (z11 && z14) {
                                        f12 = 1.0f - (f12 / 250);
                                    }
                                }
                                C16499b c16499b2 = new C16499b(f11 * f12, j14);
                                if (this$0.m18056i().f51153b && (z14 || z13)) {
                                    C16485D c16485d2 = this$0.m18056i().f51154c;
                                    long j15 = c16499b2.f51181a;
                                    float f13 = 1;
                                    c16499b2 = new C16499b(AbstractC8301I.m8920k(c16499b2.f51182b, (f13 - 0.1f) * (c16485d2.m18060a(j15) / AbstractC8753z4.m9514b(j15)), (f13 + 0.4f) * (Math.max(c16485d2.f51151b, c16485d2.m18060a(j15)) / AbstractC8753z4.m9514b(j15))), j15);
                                }
                                C16499b c16499b3 = c16499b2;
                                long jM18063a2 = c16499b3.m18063a();
                                float fM21556b2 = AbstractC21073a0.m21556b(jM18063a2);
                                if (!Float.isInfinite(fM21556b2) && !Float.isNaN(fM21556b2) && fM21556b2 >= 0.0f) {
                                    float fM21557c2 = AbstractC21073a0.m21557c(jM18063a2);
                                    if (!Float.isInfinite(fM21557c2) && !Float.isNaN(fM21557c2) && fM21557c2 >= 0.0f && Math.min(AbstractC21073a0.m21556b(jM18063a2), AbstractC21073a0.m21557c(jM18063a2)) > 0.0f) {
                                        long j16 = c16503f.f51189c;
                                        long j17 = c16501d.f51184a;
                                        if (!AbstractC8088f6.m8537c(C13800b.m15311l(j16, j17))) {
                                            throw new IllegalStateException("Can't center around an infinite offset ".concat(this$0.m18053f(new C17309l[0])).toString());
                                        }
                                        long j18 = j13;
                                        return new C16501d(c16499b3.f51182b, this$0.m18052e(new C16498a(j16, C13800b.m15310k(((C13800b) new C16522y(j18, c16499b, c16499b3, j12, this$0).invoke(new C13800b(C13800b.m15311l(j16, j17)))).f43584a, j16)), c16499b3, c16503f).f51180b, j18);
                                    }
                                }
                                throw new IllegalStateException(("New zoom is invalid/infinite = " + c16499b3 + ". " + this$0.m18053f(new C17309l("zoomDelta", Float.valueOf(f12)))).toString());
                            }
                        });
                    }
                    return C17296C.f55119a;
                }
                throw new IllegalStateException(("Can't transform with zoomDelta=" + fFloatValue3 + ", panDelta=" + C13800b.m15313n(j12) + ", centroid=" + C13800b.m15313n(j13) + ". " + c16484c.m18053f(new C17309l[0])).toString());
            case 13:
                C10845a c10845a2 = (C10845a) obj;
                ((Number) obj2).intValue();
                C6021p c6021p5 = (C6021p) outerRendering;
                int iIntValue7 = ((Number) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= c6021p5.m6542f(c10845a2) ? 4 : 2;
                }
                if ((iIntValue7 & 131) == 130 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    ((InterfaceC1440o) this.f1575Z).invoke(c10845a2, c6021p5, Integer.valueOf(iIntValue7 & 14));
                }
                return C17296C.f55119a;
            default:
                InterfaceC7537b appendInlineContent2 = (InterfaceC7537b) obj;
                String it2 = (String) obj2;
                C6021p c6021p6 = (C6021p) outerRendering;
                int iIntValue8 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(appendInlineContent2, "$this$appendInlineContent");
                AbstractC16544l.m18094g(it2, "it");
                if ((iIntValue8 & 129) == 128 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    AbstractC8175q5.m8756a(((C8262d) this.f1575Z).f25761g, true, true, c6021p6, 432, 0);
                }
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0485p(Object obj, int i10) {
        super(4);
        this.f1574Y = i10;
        this.f1575Z = obj;
    }
}
