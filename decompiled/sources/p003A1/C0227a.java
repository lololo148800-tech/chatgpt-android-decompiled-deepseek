package p003A1;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.RectF;
import androidx.compose.animation.AbstractC10832b;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.AbstractC12214a;
import com.openai.chatgpt.R;
import io.livekit.android.room.C15102a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16524A;
import mh.EnumC17264l;
import mm.C17296C;
import mm.C17309l;
import p006A4.C0339D;
import p025An.C0624m;
import p025An.C0644w;
import p025An.InterfaceC0620k;
import p033B5.C0842z;
import p039Bc.AbstractC0870d;
import p040Bd.C0958L4;
import p040Bd.C1013V0;
import p041Be.EnumC1228V;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p072Ci.EnumC1696a;
import p077Cn.C1743k;
import p080D0.C1816m;
import p1014t1.C19738o;
import p103Dn.C2127D0;
import p1071w0.C20733W;
import p1095x1.InterfaceC21098s;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1143z4.C21778h;
import p1155zi.C22068v1;
import p1155zi.EnumC22055s0;
import p1160zp.AbstractC22225a;
import p117Eb.C2385o;
import p124Ei.C2537q;
import p124Ei.C2549w;
import p130Eo.C2617b;
import p148Fi.C2854t0;
import p153Fn.C2925c;
import p154Fo.C2947b;
import p154Fo.InterfaceC2948c;
import p165G9.AbstractC3021g;
import p179H0.C3196n;
import p199Hl.C3471G;
import p199Hl.C3490o;
import p199Hl.C3498w;
import p204I1.C3582M;
import p204I1.C3587c;
import p204I1.C3590f;
import p204I1.C3606v;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3880A3;
import p229J0.C3941K4;
import p229J0.C4104o2;
import p229J0.EnumC3886B3;
import p273Kl.C4727J0;
import p273Kl.EnumC4759a;
import p273Kl.EnumC4807x0;
import p278L0.C4847K;
import p278L0.C4855T;
import p343Nk.C5817a;
import p346Nn.C5891c0;
import p349O0.C5944C;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.C6032u0;
import p349O0.C6037x;
import p349O0.EnumC6020o0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p363Og.C6221y;
import p387Pl.AbstractC6468O;
import p387Pl.EnumC6466M;
import p389Pn.C6536u;
import p392Q0.C6548f;
import p404Qe.C6682r;
import p406Qg.C6704O;
import p406Qg.C6725u;
import p429Re.C6876j;
import p467T1.C7199i;
import p478Tc.AbstractC7313q;
import p492U1.C7536a;
import p492U1.C7545j;
import p492U1.InterfaceC7537b;
import p506Ug.C7671f;
import p523V9.AbstractC8003U3;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8087f5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8681n4;
import p586Y0.AbstractC9543B;
import p594Y9.AbstractC9740H4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p692d0.C12954G;
import p758g0.AbstractC13764h;
import p759g1.C13800b;
import p759g1.C13801c;
import p774h1.AbstractC14334L;
import p857kl.AbstractC16449P;
import p857kl.AbstractC16455c;
import p857kl.C16447N;
import p867l8.C16831c;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17790w;
import p968qi.C18742y;
import ug.AbstractC20236s;
import ve.C20584h;

/* JADX INFO: renamed from: A1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0227a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f855Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f856Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0227a(Object obj, int i10) {
        super(2);
        this.f855Y = i10;
        this.f856Z = obj;
    }

    /* JADX INFO: renamed from: a */
    private final Object m725a(Object obj, Object obj2) {
        C6021p c6021p;
        C6021p c6021p2 = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
            c6021p2.m6517L();
        } else {
            C6682r c6682r = (C6682r) this.f856Z;
            String str = c6682r.f21486b;
            if (str != null) {
                C10456n c10456n = C10456n.f30959Y;
                C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p2, 0);
                int i10 = c6021p2.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, c10456n);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i = C21698j.f68869b;
                c6021p2.m6528W();
                if (c6021p2.f19563O) {
                    c6021p2.m6549l(c21696i);
                } else {
                    c6021p2.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p2, c17790wM19515a);
                C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
                C21694h c21694h = C21698j.f68874g;
                if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i10))) {
                    AbstractC0168G.m537z(i10, c6021p2, i10, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
                AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p2, 0, 3120, 120830);
                C18742y c18742y = c6682r.f21491g;
                String str2 = c18742y != null ? c18742y.f59615a : null;
                c6021p2.m6524S(1629613092);
                if (str2 == null) {
                    c6021p = c6021p2;
                } else {
                    AbstractC4124r4.m4768b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p2, 0, 3120, 55294);
                    c6021p = c6021p2;
                }
                c6021p.m6553p(false);
                c6021p.m6553p(true);
            }
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: b */
    private final Object m726b(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(((C6704O) this.f856Z).f21546j != null ? R.string.settings_memory_reset_gizmo : R.string.settings_memory_reset_default, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: c */
    private final Object m727c(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC4124r4.m4768b(((C7671f) this.f856Z).f24192b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: e */
    private final Object m728e(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C6876j c6876j = (C6876j) this.f856Z;
            AbstractC4124r4.m4769c(c6876j.f22049b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p, 0, 0, 131070);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: f */
    private final Object m729f(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC4124r4.m4768b(((C22068v1) this.f856Z).f69767a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: h */
    private final Object m730h(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(((EnumC17264l) this.f856Z).f55065Z, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:278:0x0659 A[PHI: r3
      0x0659: PHI (r3v67 J0.B3) = (r3v65 J0.B3), (r3v66 J0.B3) binds: [B:277:0x0657, B:280:0x0661] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        String strM19533p;
        Object objInvoke;
        List list;
        boolean zM15324k;
        InterfaceC0620k interfaceC0620kM6608x;
        int i10;
        int i11;
        int i12;
        int i13;
        long j10 = 255;
        long j11 = -9187201950435737472L;
        char c9 = 7;
        switch (this.f855Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    ((AbstractC0231b) this.f856Z).mo564b(0, c6021p);
                }
                return C17296C.f55119a;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC12214a.m14223a((AbstractC20236s) this.f856Z, null, c6021p2, 0);
                }
                return C17296C.f55119a;
            case 2:
                C16447N url = (C16447N) obj;
                C16447N it = (C16447N) obj2;
                AbstractC16544l.m18094g(url, "$this$url");
                AbstractC16544l.m18094g(it, "it");
                AbstractC16449P.m18026b(url, ((EnumC1228V) this.f856Z).f3240Y);
                AbstractC8681n4.m9374c(url, new String[]{"conversation"});
                return C17296C.f55119a;
            case 3:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C1013V0 c1013v0 = (C1013V0) this.f856Z;
                    boolean z6 = c1013v0.f2816c.size() > 4;
                    c6021p3.m6524S(-505808745);
                    Object objM6514H = c6021p3.m6514H();
                    C5975S c5975s = C6013l.f19514a;
                    if (objM6514H == c5975s) {
                        objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                        c6021p3.m6537c0(objM6514H);
                    }
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
                    c6021p3.m6553p(false);
                    C10456n c10456n = C10456n.f30959Y;
                    List list2 = c1013v0.f2816c;
                    List list3 = list2;
                    InterfaceC10459q interfaceC10459qM11205a = AbstractC10832b.m11205a(AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, 0.0f, !list3.isEmpty() ? AbstractC7313q.f23200e : 0, 7), null, 3);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p3, 0);
                    int i14 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11205a);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p3, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p3, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i14))) {
                        AbstractC0168G.m537z(i14, c6021p3, i14, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d);
                    c6021p3.m6524S(267367052);
                    if (!list3.isEmpty()) {
                        AbstractC3984T1.m4692k(null, 0.0f, 0L, c6021p3, 0, 7);
                    }
                    c6021p3.m6553p(false);
                    List listM19370t0 = AbstractC17680n.m19370t0(list2, new C0842z(3));
                    if (!((Boolean) interfaceC5985X.getValue()).booleanValue() && z6) {
                        listM19370t0 = AbstractC17680n.m19373w0(listM19370t0, 4);
                    }
                    List list4 = listM19370t0;
                    c6021p3.m6524S(267379424);
                    int i15 = 0;
                    for (Object obj3 : list4) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            AbstractC17681o.m19388q();
                            throw null;
                        }
                        AbstractC8003U3.m8306b((C0958L4) obj3, c6021p3, 8);
                        boolean z10 = i15 == list4.size() - 1;
                        c6021p3.m6524S(267383657);
                        if (!z6 || !z10) {
                            AbstractC3984T1.m4692k(null, 0.0f, 0L, c6021p3, 0, 7);
                        }
                        c6021p3.m6553p(false);
                        i15 = i16;
                    }
                    c6021p3.m6553p(false);
                    c6021p3.m6524S(267392330);
                    if (z6) {
                        C17756f c17756f = AbstractC17770m.f56724a;
                        C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
                        C10450h c10450h = C10444b.f30944w0;
                        InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                        c6021p3.m6524S(267401196);
                        Object objM6514H2 = c6021p3.m6514H();
                        if (objM6514H2 == c5975s) {
                            objM6514H2 = new C0339D(interfaceC5985X, 6);
                            c6021p3.m6537c0(objM6514H2);
                        }
                        c6021p3.m6553p(false);
                        InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10833a.m11209d(interfaceC10459qM11244d, false, null, (InterfaceC1426a) objM6514H2, 7), 0.0f, AbstractC7313q.f23198c, 1);
                        C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17764jM19500g, c10450h, c6021p3, 48);
                        int i17 = c6021p3.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p3.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11235m);
                        InterfaceC21700k.f68875m0.getClass();
                        C21696i c21696i2 = C21698j.f68869b;
                        c6021p3.m6528W();
                        if (c6021p3.f19563O) {
                            c6021p3.m6549l(c21696i2);
                        } else {
                            c6021p3.m6543f0();
                        }
                        C5997d.m6439Z(C21698j.f68873f, c6021p3, c17781r0M19506b);
                        C5997d.m6439Z(C21698j.f68872e, c6021p3, interfaceC6008i0M6550m2);
                        C21694h c21694h2 = C21698j.f68874g;
                        if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i17))) {
                            AbstractC0168G.m537z(i17, c6021p3, i17, c21694h2);
                        }
                        C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d2);
                        boolean zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                        if (zBooleanValue) {
                            strM19533p = AbstractC17792x.m19533p(c6021p3, -345037284, R.string.sports_show_less, c6021p3, false);
                        } else {
                            if (zBooleanValue) {
                                c6021p3.m6524S(-345184621);
                                c6021p3.m6553p(false);
                                throw new C0644w();
                            }
                            strM19533p = AbstractC17792x.m19533p(c6021p3, -345034756, R.string.sports_show_more, c6021p3, false);
                        }
                        AbstractC4124r4.m4768b(strM19533p, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p3.m6548k(AbstractC3947L4.f12183a)).f12157m, c6021p3, 0, 0, 65534);
                        AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.chevron_down_sm, c6021p3, 0), null, AbstractC8087f5.m8534c(c10456n, ((Number) AbstractC13764h.m15261b(((Boolean) interfaceC5985X.getValue()).booleanValue() ? -180.0f : 0.0f, null, "Sports chevron", c6021p3, 3072, 22).getValue()).floatValue()), 0L, c6021p3, 48, 8);
                        c6021p3.m6553p(true);
                    }
                    c6021p3.m6553p(false);
                    c6021p3.m6553p(true);
                }
                return C17296C.f55119a;
            case 4:
                long j12 = ((C13800b) obj2).f43584a;
                ((C19738o) obj).m20691a();
                ((C16524A) this.f856Z).f51261Y = j12;
                return C17296C.f55119a;
            case 5:
                InterfaceC21098s interfaceC21098sM2644c = ((C1816m) obj).m2644c();
                InterfaceC21098s interfaceC21098sM2644c2 = ((C1816m) obj2).m2644c();
                InterfaceC21098s interfaceC21098s = (InterfaceC21098s) this.f856Z;
                long jMo21521e = interfaceC21098sM2644c != null ? interfaceC21098s.mo21521e(interfaceC21098sM2644c, 0L) : 0L;
                long jMo21521e2 = interfaceC21098sM2644c2 != null ? interfaceC21098s.mo21521e(interfaceC21098sM2644c2, 0L) : 0L;
                return Integer.valueOf(C13800b.m15307h(jMo21521e) == C13800b.m15307h(jMo21521e2) ? AbstractC3021g.m3873a(Float.valueOf(C13800b.m15306g(jMo21521e)), Float.valueOf(C13800b.m15306g(jMo21521e2))) : AbstractC3021g.m3873a(Float.valueOf(C13800b.m15307h(jMo21521e)), Float.valueOf(C13800b.m15307h(jMo21521e2))));
            case 6:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    C3587c c3587c = new C3587c();
                    C2549w c2549w = (C2549w) this.f856Z;
                    if ((c2549w != null ? c2549w.f7959c : null) != null) {
                        c3587c.m4294f("androidx.compose.foundation.text.inlineContent", "[start]");
                        c3587c.m4291c("�");
                        c3587c.m4292d();
                        c3587c.m4291c(Separators.f31991SP);
                    }
                    String str = c2549w != null ? c2549w.f7957a : null;
                    if (str == null) {
                        str = "";
                    }
                    c3587c.m4291c(str);
                    if ((c2549w != null ? c2549w.f7960d : null) != null) {
                        c3587c.m4291c(Separators.f31991SP);
                        c3587c.m4294f("androidx.compose.foundation.text.inlineContent", "[end]");
                        c3587c.m4291c("�");
                        c3587c.m4292d();
                    }
                    C3590f c3590fM4297i = c3587c.m4297i();
                    c6021p4.m6524S(-1776762466);
                    InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p4.m6548k(AbstractC0187M0.f704f);
                    C6037x c6037x = AbstractC4124r4.f13310a;
                    float fMo7870w = interfaceC7537b.mo7870w(((C3582M) c6021p4.m6548k(c6037x)).f10910a.f10860b);
                    c6021p4.m6553p(false);
                    C3606v c3606v = new C3606v(((C3582M) c6021p4.m6548k(c6037x)).f10910a.f10860b, 4, ((C3582M) c6021p4.m6548k(c6037x)).f10910a.f10860b);
                    AbstractC4124r4.m4769c(c3590fM4297i, null, 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, AbstractC17659D.m19244f(new C17309l("[start]", new C20733W(c3606v, AbstractC8411c.m8969c(2134275022, c6021p4, new C2537q(c2549w, fMo7870w, 0)))), new C17309l("[end]", new C20733W(c3606v, AbstractC8411c.m8969c(-69162737, c6021p4, new C2537q(c2549w, fMo7870w, 1))))), null, null, c6021p4, 0, 0, 228862);
                }
                return C17296C.f55119a;
            case 7:
                C16447N url2 = (C16447N) obj;
                C16447N it2 = (C16447N) obj2;
                AbstractC16544l.m18094g(url2, "$this$url");
                AbstractC16544l.m18094g(it2, "it");
                url2.f51018a = ((C2854t0) this.f856Z).f8617f.f20275g ? "10.0.2.2:8005" : "localhost:8005";
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(AbstractC16455c.m18033f(new String[]{"get_token"}[0], 3, false));
                url2.f51025h = arrayList;
                return C17296C.f55119a;
            case 8:
                C2617b input = (C2617b) obj;
                C5817a logicEvaluator = (C5817a) obj2;
                AbstractC16544l.m18094g(input, "input");
                AbstractC16544l.m18094g(logicEvaluator, "logicEvaluator");
                C0295v c0295v = new C0295v(2, this.f856Z, InterfaceC2948c.class, "check", "check(Loperations/array/occurence/OccurrenceCheckInputData;LLogicEvaluator;)Ljava/lang/Object;", 0, 4);
                Map map = input.f8105b;
                Object obj4 = input.f8106c;
                C2947b c2947b = (map == null || (list = input.f8104a) == null || list.isEmpty()) ? null : new C2947b(list, map, obj4);
                return (c2947b == null || (objInvoke = c0295v.invoke(c2947b, logicEvaluator)) == null) ? obj4 : objInvoke;
            case 9:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                ((C3196n) this.f856Z).f9642e.m6410h(fFloatValue);
                return C17296C.f55119a;
            case 10:
                C13801c c13801cM15620I = AbstractC14334L.m15620I((RectF) obj);
                C13801c c13801cM15620I2 = AbstractC14334L.m15620I((RectF) obj2);
                switch (((C2385o) this.f856Z).f7413Y) {
                    case 6:
                        zM15324k = c13801cM15620I.m15324k(c13801cM15620I2);
                        break;
                    default:
                        zM15324k = c13801cM15620I2.m15315a(c13801cM15620I.m15317d());
                        break;
                }
                return Boolean.valueOf(zM15324k);
            case 11:
                long j13 = ((C7545j) obj).f23903a;
                float fM7853h = C7536a.m7853h(((C7536a) obj2).f23888a);
                C3880A3 c3880a3 = (C3880A3) this.f856Z;
                C4104o2 c4104o2 = new C4104o2(fM7853h, j13, c3880a3);
                C4847K c4847k = new C4847K();
                c4104o2.invoke(c4847k);
                LinkedHashMap linkedHashMap = c4847k.f15778a;
                C4855T c4855t = new C4855T(linkedHashMap);
                int iOrdinal = ((EnumC3886B3) ((C5944C) c3880a3.f11737c.f34071h).getValue()).ordinal();
                EnumC3886B3 enumC3886B3 = EnumC3886B3.f11777Y;
                if (iOrdinal != 0) {
                    if (iOrdinal != 1 && iOrdinal != 2) {
                        throw new C0644w();
                    }
                    EnumC3886B3 enumC3886B4 = EnumC3886B3.f11779o0;
                    if (linkedHashMap.containsKey(enumC3886B4)) {
                        enumC3886B3 = enumC3886B4;
                    } else {
                        enumC3886B4 = EnumC3886B3.f11778Z;
                        if (linkedHashMap.containsKey(enumC3886B4)) {
                            enumC3886B3 = enumC3886B4;
                        }
                    }
                }
                return new C17309l(c4855t, enumC3886B3);
            case 12:
                EnumC4759a newVal = (EnumC4759a) obj;
                EnumC4759a oldVal = (EnumC4759a) obj2;
                AbstractC16544l.m18094g(newVal, "newVal");
                AbstractC16544l.m18094g(oldVal, "oldVal");
                if (newVal != oldVal) {
                    int iOrdinal2 = newVal.ordinal();
                    C15102a c15102a = (C15102a) this.f856Z;
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 == 2) {
                            C8395g c8395g = AbstractC8396h.Companion;
                            EnumC8397i enumC8397i = EnumC8397i.f26117Z;
                            AbstractC8396h.Companion.getClass();
                            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                                AbstractC22225a.f70470a.getClass();
                                C16831c.m18567d(new Object[0]);
                            }
                            if (oldVal == EnumC4759a.f15525Z) {
                                c15102a.m16217i();
                            }
                        }
                    } else if (oldVal == EnumC4759a.f15526o0) {
                        C8395g c8395g2 = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i2 = EnumC8397i.f26117Z;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                            AbstractC22225a.f70470a.getClass();
                            C16831c.m18567d(new Object[0]);
                        }
                        C4727J0 c4727j0 = c15102a.f46944d;
                        if (c4727j0 != null) {
                            c4727j0.m5420o(EnumC4807x0.f15674Z);
                            C3490o c3490o = new C3490o(c4727j0);
                            C2925c c2925c = c4727j0.f15388m;
                            if (c2925c == null) {
                                AbstractC16544l.m18103p("coroutineScope");
                                throw null;
                            }
                            c4727j0.f15389n.m12669r(c3490o, c2925c);
                        }
                    } else if (oldVal == EnumC4759a.f15527p0) {
                        C8395g c8395g3 = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i3 = EnumC8397i.f26117Z;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i3.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                            AbstractC22225a.f70470a.getClass();
                            C16831c.m18567d(new Object[0]);
                        }
                        C4727J0 c4727j1 = c15102a.f46944d;
                        if (c4727j1 != null) {
                            c4727j1.m5420o(EnumC4807x0.f15674Z);
                            C3498w c3498w = new C3498w(c4727j1);
                            C2925c c2925c2 = c4727j1.f15388m;
                            if (c2925c2 == null) {
                                AbstractC16544l.m18103p("coroutineScope");
                                throw null;
                            }
                            c4727j1.f15389n.m12669r(c3498w, c2925c2);
                        }
                    } else if (oldVal == EnumC4759a.f15528q0) {
                        C4727J0 c4727j2 = c15102a.f46944d;
                    }
                }
                return C17296C.f55119a;
            case 13:
                EnumC4807x0 enumC4807x0 = (EnumC4807x0) obj;
                EnumC4807x0 old = (EnumC4807x0) obj2;
                AbstractC16544l.m18094g(enumC4807x0, "new");
                AbstractC16544l.m18094g(old, "old");
                if (enumC4807x0 != old) {
                    int iOrdinal3 = enumC4807x0.ordinal();
                    C4727J0 c4727j3 = (C4727J0) this.f856Z;
                    if (iOrdinal3 == 0) {
                        c4727j3.f15381f.start();
                        c4727j3.f15384i.start();
                    } else if (iOrdinal3 == 2) {
                        c4727j3.f15381f.stop();
                        c4727j3.f15384i.stop();
                    }
                }
                return C17296C.f55119a;
            case 14:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    AbstractC0870d.f2512O.invoke((C21778h) this.f856Z, c6021p5, 0);
                }
                return C17296C.f55119a;
            case 15:
                Set set = (Set) obj;
                C6032u0 c6032u0 = (C6032u0) this.f856Z;
                synchronized (c6032u0.f19647c) {
                    try {
                        if (((EnumC6020o0) c6032u0.f19663s.getValue()).compareTo(EnumC6020o0.f19546q0) >= 0) {
                            C12954G c12954g = c6032u0.f19652h;
                            if (set instanceof C6548f) {
                                C12954G c12954g2 = ((C6548f) set).f21195Y;
                                Object[] objArr = c12954g2.f41144b;
                                long[] jArr = c12954g2.f41143a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i18 = 0;
                                    while (true) {
                                        long j14 = jArr[i18];
                                        if ((((~j14) << c9) & j14 & j11) != j11) {
                                            int i19 = 8 - ((~(i18 - length)) >>> 31);
                                            for (int i20 = 0; i20 < i19; i20++) {
                                                if ((j14 & 255) < 128) {
                                                    Object obj5 = objArr[(i18 << 3) + i20];
                                                    if (!(obj5 instanceof AbstractC9543B) || ((AbstractC9543B) obj5).m10037c(1)) {
                                                        c12954g.m14624a(obj5);
                                                    }
                                                }
                                                j14 >>= 8;
                                            }
                                            i10 = 1;
                                            if (i19 == 8) {
                                            }
                                        } else {
                                            i10 = 1;
                                        }
                                        if (i18 != length) {
                                            i18 += i10;
                                            j11 = -9187201950435737472L;
                                            c9 = 7;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj6 : set) {
                                    if (!(obj6 instanceof AbstractC9543B) || ((AbstractC9543B) obj6).m10037c(1)) {
                                        c12954g.m14624a(obj6);
                                    }
                                }
                            }
                            interfaceC0620kM6608x = c6032u0.m6608x();
                        } else {
                            interfaceC0620kM6608x = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (interfaceC0620kM6608x != null) {
                    ((C0624m) interfaceC0620kM6608x).resumeWith(C17296C.f55119a);
                }
                return C17296C.f55119a;
            case 16:
                Set set2 = (Set) obj;
                if (set2 instanceof C6548f) {
                    C12954G c12954g3 = ((C6548f) set2).f21195Y;
                    Object[] objArr2 = c12954g3.f41144b;
                    long[] jArr2 = c12954g3.f41143a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i21 = 0;
                        while (true) {
                            long j15 = jArr2[i21];
                            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                int i23 = 0;
                                while (true) {
                                    if (i23 < i22) {
                                        if ((j15 & j10) < 128) {
                                            Object obj7 = objArr2[(i21 << 3) + i23];
                                            if (!(obj7 instanceof AbstractC9543B) || ((AbstractC9543B) obj7).m10037c(4)) {
                                            }
                                        }
                                        j15 >>= 8;
                                        i23++;
                                        j10 = 255;
                                    } else {
                                        i11 = 1;
                                        if (i22 == 8) {
                                        }
                                    }
                                }
                            } else {
                                i11 = 1;
                            }
                            if (i21 != length2) {
                                i21 += i11;
                                j10 = 255;
                            }
                        }
                        ((C1743k) this.f856Z).mo2524p(set2);
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj8 : set3) {
                            if (!(obj8 instanceof AbstractC9543B) || ((AbstractC9543B) obj8).m10037c(4)) {
                                ((C1743k) this.f856Z).mo2524p(set2);
                            }
                        }
                    }
                }
                return C17296C.f55119a;
            case 17:
                C6021p c6021p6 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    C10456n c10456n2 = C10456n.f30959Y;
                    C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p6, 0);
                    int i24 = c6021p6.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p6.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p6, c10456n2);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i3 = C21698j.f68869b;
                    c6021p6.m6528W();
                    if (c6021p6.f19563O) {
                        c6021p6.m6549l(c21696i3);
                    } else {
                        c6021p6.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p6, c17790wM19515a2);
                    C5997d.m6439Z(C21698j.f68872e, c6021p6, interfaceC6008i0M6550m3);
                    C21694h c21694h3 = C21698j.f68874g;
                    if (c6021p6.f19563O || !AbstractC16544l.m18089b(c6021p6.m6514H(), Integer.valueOf(i24))) {
                        AbstractC0168G.m537z(i24, c6021p6, i24, c21694h3);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p6, interfaceC10459qM10923d3);
                    int iOrdinal4 = ((EnumC22055s0) this.f856Z).ordinal();
                    if (iOrdinal4 == 0) {
                        c6021p6.m6524S(589174345);
                        AbstractC4124r4.m4769c(AbstractC9740H4.m10330e(AbstractC17681o.m19382k(AbstractC8142m4.m8676d(R.string.custom_instructions_user_tip1, c6021p6), AbstractC8142m4.m8676d(R.string.custom_instructions_user_tip2, c6021p6), AbstractC8142m4.m8676d(R.string.custom_instructions_user_tip3, c6021p6), AbstractC8142m4.m8676d(R.string.custom_instructions_user_tip4, c6021p6), AbstractC8142m4.m8676d(R.string.custom_instructions_user_tip5, c6021p6))), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c6021p6, 0, 0, 262142);
                        c6021p6.m6553p(false);
                    } else if (iOrdinal4 != 1) {
                        c6021p6.m6524S(590417290);
                        c6021p6.m6553p(false);
                    } else {
                        c6021p6.m6524S(589864033);
                        AbstractC4124r4.m4769c(AbstractC9740H4.m10330e(AbstractC17681o.m19382k(AbstractC8142m4.m8676d(R.string.custom_instructions_model_tip1, c6021p6), AbstractC8142m4.m8676d(R.string.custom_instructions_model_tip2, c6021p6), AbstractC8142m4.m8676d(R.string.custom_instructions_model_tip3, c6021p6), AbstractC8142m4.m8676d(R.string.custom_instructions_model_tip4, c6021p6))), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c6021p6, 0, 0, 262142);
                        c6021p6.m6553p(false);
                    }
                    c6021p6.m6553p(true);
                }
                return C17296C.f55119a;
            case 18:
                C6021p c6021p7 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else if (((C6221y) this.f856Z).f20249a) {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.customization_screen_title, c6021p7), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p7, 0, 0, 131070);
                }
                return C17296C.f55119a;
            case 19:
                C6021p c6021p8 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p8.m6562y()) {
                    c6021p8.m6517L();
                } else {
                    String displayLanguage = AbstractC8012V5.m8334g((Context) this.f856Z).getDisplayLanguage();
                    AbstractC16544l.m18093f(displayLanguage, "getDisplayLanguage(...)");
                    AbstractC4124r4.m4768b(displayLanguage, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p8, 0, 0, 131070);
                }
                return C17296C.f55119a;
            case 20:
                EnumC6466M newValue = (EnumC6466M) obj;
                EnumC6466M oldValue = (EnumC6466M) obj2;
                AbstractC16544l.m18094g(newValue, "newValue");
                AbstractC16544l.m18094g(oldValue, "oldValue");
                if (newValue != oldValue) {
                    AbstractC6468O abstractC6468O = (AbstractC6468O) this.f856Z;
                    ((C2127D0) abstractC6468O.f20982a.f34081Z).mo3231f(new C3471G(abstractC6468O, newValue));
                }
                return C17296C.f55119a;
            case 21:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                for (C5891c0 c5891c0 : ((C6536u) this.f856Z).f21154b) {
                    c5891c0.f19219a.mo7094d(obj, Boolean.valueOf(zBooleanValue2 != AbstractC16544l.m18089b(c5891c0.f19219a.f21150Y.get(obj), Boolean.TRUE)));
                }
                return C17296C.f55119a;
            case 22:
                return m725a(obj, obj2);
            case 23:
                C6021p c6021p9 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p9.m6562y()) {
                    c6021p9.m6517L();
                } else {
                    C20584h c20584h = ((C6725u) this.f856Z).f21603g;
                    Boolean boolValueOf = c20584h != null ? Boolean.valueOf(c20584h.f65315a) : null;
                    if (boolValueOf != null) {
                        boolean zBooleanValue3 = boolValueOf.booleanValue();
                        if (zBooleanValue3) {
                            i12 = R.string.custom_instructions_on;
                        } else {
                            if (zBooleanValue3) {
                                throw new C0644w();
                            }
                            i12 = R.string.custom_instructions_off;
                        }
                        AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(i12, c6021p9), AbstractC10842a.m11235m(C10456n.f30959Y, AbstractC7313q.f23199d, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p9.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p9, 0, 0, 65532);
                    }
                }
                return C17296C.f55119a;
            case 24:
                return m726b(obj, obj2);
            case 25:
                return m727c(obj, obj2);
            case 26:
                return m728e(obj, obj2);
            case 27:
                return m729f(obj, obj2);
            case 28:
                return m730h(obj, obj2);
            default:
                C6021p c6021p10 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p10.m6562y()) {
                    c6021p10.m6517L();
                } else {
                    int iOrdinal5 = ((EnumC1696a) this.f856Z).ordinal();
                    if (iOrdinal5 == 0) {
                        i13 = R.string.settings_color_system;
                    } else if (iOrdinal5 == 1) {
                        i13 = R.string.settings_color_light;
                    } else {
                        if (iOrdinal5 != 2) {
                            throw new C0644w();
                        }
                        i13 = R.string.settings_color_dark;
                    }
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(i13, c6021p10), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p10, 0, 0, 131070);
                }
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0227a(C21778h c21778h) {
        super(2);
        this.f855Y = 14;
        C8410b c8410b = AbstractC0870d.f2524a;
        this.f856Z = c21778h;
    }
}
