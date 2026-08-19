package p870le;

import androidx.compose.foundation.gestures.AbstractC10840a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import com.openai.chatgpt.R;
import io.sentry.android.replay.capture.C15272c;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.InterfaceC17302e;
import p002A0.C0136m;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.C0201R0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1039ud.C20198o;
import p1062vd.AbstractC20554e;
import p1062vd.C20541V;
import p1062vd.C20568r;
import p1071w0.C20702C0;
import p1071w0.C20706E0;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2509g;
import p172Gi.C3083p;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4017a;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p269Kh.C4679f;
import p302M0.AbstractC5253e;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p362Of.C6194i;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p478Tc.AbstractC7313q;
import p492U1.EnumC7546k;
import p523V9.AbstractC8034Z;
import p523V9.AbstractC8063c5;
import p523V9.AbstractC8098h0;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8223w5;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8741x4;
import p571X9.AbstractC9262b4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.InterfaceC13499q;
import p789hg.C14505d;
import p823j3.C16084f;
import p860l0.C16696N;
import p860l0.EnumC16673F0;
import p860l0.InterfaceC16736e1;
import p894n0.InterfaceC17406l;
import p909nm.C17691y;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;
import p911o0.C17794y;
import re.AbstractC18950c;
import re.C18973z;

/* JADX INFO: renamed from: le.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16878e0 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54169Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f54170Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f54171o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f54172p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16878e0(Object obj, InterfaceC17302e interfaceC17302e, boolean z6, int i10) {
        super(3);
        this.f54169Y = i10;
        this.f54171o0 = obj;
        this.f54172p0 = interfaceC17302e;
        this.f54170Z = z6;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C17296C c17296c = C17296C.f55119a;
        boolean z6 = this.f54170Z;
        C5975S c5975s = C6013l.f19514a;
        Object obj4 = this.f54172p0;
        Object obj5 = this.f54171o0;
        switch (this.f54169Y) {
            case 0:
                C10845a item = (C10845a) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    c6021p.m6524S(-992044765);
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) obj4;
                    C4679f c4679f = (C4679f) obj5;
                    boolean zM6542f = c6021p.m6542f(interfaceC1436k) | c6021p.m6542f(c4679f);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == c5975s) {
                        objM6514H = new C16084f(interfaceC1436k, 5, c4679f);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC8741x4.m9478b(c4679f, (InterfaceC1426a) objM6514H, null, this.f54170Z, c6021p, 0);
                }
                return c17296c;
            case 1:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                C6021p c6021p2 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k((InterfaceC10459q) obj5, AbstractC7313q.f23198c);
                c6021p2.m6524S(1432392797);
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) obj4;
                boolean zM6542f2 = c6021p2.m6542f(interfaceC1426a);
                Object objM6514H2 = c6021p2.m6514H();
                if (zM6542f2 || objM6514H2 == c5975s) {
                    objM6514H2 = new C14505d(8, interfaceC1426a);
                    c6021p2.m6537c0(objM6514H2);
                }
                c6021p2.m6553p(false);
                AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H2, interfaceC10459qM11233k, false, null, null, AbstractC8411c.m8969c(-2048181303, c6021p2, new C2509g(z6, 5)), c6021p2, 196608, 28);
                return c17296c;
            case 2:
                C17794y ModalBottomSheet = (C17794y) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(ModalBottomSheet, "$this$ModalBottomSheet");
                if ((iIntValue2 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C10449g c10449g = C10444b.f30947z0;
                    C10456n c10456n = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                    float f10 = AbstractC7313q.f23201f;
                    InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(interfaceC10459qM11244d, f10, 0.0f, 2);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, c10449g, c6021p3, 48);
                    int i10 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11235m);
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
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p3, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d);
                    String strM8676d = AbstractC8142m4.m8676d(R.string.voice_feedback_what_went_wrong, c6021p3);
                    C5984W0 c5984w0 = AbstractC3947L4.f12183a;
                    C3582M c3582m = ((C3941K4) c6021p3.m6548k(c5984w0)).f12153i;
                    float f11 = AbstractC4017a.f12601a;
                    AbstractC4124r4.m4768b(strM8676d, null, AbstractC3959O0.m4662d(AbstractC5253e.f17196b, c6021p3), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m, c6021p3, 0, 0, 65530);
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.voice_feedback_select_all_that_apply, c6021p3), null, AbstractC3959O0.m4662d(AbstractC5253e.f17198d, c6021p3), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p3.m6548k(c5984w0)).f12155k, c6021p3, 0, 0, 65530);
                    AbstractC17758g.m19482b(c6021p3, AbstractC10844c.m11245e(c10456n, f10));
                    c6021p3.m6524S(-567724054);
                    Object objM6514H3 = c6021p3.m6514H();
                    C5975S c5975s2 = C5975S.f19448r0;
                    if (objM6514H3 == c5975s) {
                        objM6514H3 = C5997d.m6430Q(C17691y.f56482Y, c5975s2);
                        c6021p3.m6537c0(objM6514H3);
                    }
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H3;
                    Object objM530s = AbstractC0168G.m530s(-567720913, c6021p3, false);
                    if (objM530s == c5975s) {
                        objM530s = C5997d.m6430Q(null, c5975s2);
                        c6021p3.m6537c0(objM530s);
                    }
                    InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM530s;
                    c6021p3.m6553p(false);
                    c6021p3.m6524S(-567718651);
                    boolean zM6544g = c6021p3.m6544g(z6);
                    Object objM6514H4 = c6021p3.m6514H();
                    if (zM6544g || objM6514H4 == c5975s) {
                        objM6514H4 = C5997d.m6421H(new C0201R0(z6, interfaceC5985X, interfaceC5985X2, 5));
                        c6021p3.m6537c0(objM6514H4);
                    }
                    InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) objM6514H4;
                    c6021p3.m6553p(false);
                    AbstractC6224C abstractC6224C = ((C18973z) obj5).f60527a;
                    if (abstractC6224C == null) {
                        c6021p3.m6524S(-567711061);
                        AbstractC8098h0.m8576h(0, c6021p3);
                        c6021p3.m6553p(false);
                    } else if (abstractC6224C instanceof C6223B) {
                        c6021p3.m6524S(-419090191);
                        List list = ((C3083p) ((C6223B) abstractC6224C).f20258a).f9287a;
                        String str = (String) interfaceC5985X2.getValue();
                        Set set = (Set) interfaceC5985X.getValue();
                        c6021p3.m6524S(-567699520);
                        Object objM6514H5 = c6021p3.m6514H();
                        if (objM6514H5 == c5975s) {
                            objM6514H5 = new C6194i(interfaceC5985X2, 27);
                            c6021p3.m6537c0(objM6514H5);
                        }
                        InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H5;
                        Object objM530s2 = AbstractC0168G.m530s(-567701626, c6021p3, false);
                        if (objM530s2 == c5975s) {
                            objM530s2 = new C6194i(interfaceC5985X, 28);
                            c6021p3.m6537c0(objM530s2);
                        }
                        c6021p3.m6553p(false);
                        AbstractC8098h0.m8575g(list, str, set, interfaceC1436k2, (InterfaceC1436k) objM530s2, c6021p3, 27648);
                        c6021p3.m6553p(false);
                    } else {
                        if (abstractC6224C instanceof AbstractC6249w ? true : abstractC6224C.equals(C6248v.f20327a)) {
                            c6021p3.m6524S(-418707992);
                            c6021p3.m6553p(false);
                        } else {
                            c6021p3.m6524S(-418590316);
                            c6021p3.m6553p(false);
                        }
                    }
                    AbstractC17758g.m19482b(c6021p3, AbstractC10844c.m11245e(c10456n, f10));
                    boolean zBooleanValue = ((Boolean) interfaceC5982V0.getValue()).booleanValue();
                    InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
                    c6021p3.m6524S(-567687370);
                    InterfaceC1439n interfaceC1439n = (InterfaceC1439n) obj4;
                    boolean zM6542f3 = c6021p3.m6542f(interfaceC1439n);
                    Object objM6514H6 = c6021p3.m6514H();
                    if (zM6542f3 || objM6514H6 == c5975s) {
                        objM6514H6 = new C15272c(interfaceC1439n, interfaceC5985X, interfaceC5985X2, 20);
                        c6021p3.m6537c0(objM6514H6);
                    }
                    c6021p3.m6553p(false);
                    AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H6, interfaceC10459qM11244d2, zBooleanValue, null, null, null, null, null, null, AbstractC18950c.f60504a, c6021p3, 805306416, 504);
                    AbstractC17758g.m19482b(c6021p3, AbstractC10844c.m11245e(c10456n, f10));
                    c6021p3.m6553p(true);
                }
                return c17296c;
            case 3:
                String currentText = (String) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(currentText, "currentText");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6021p4.m6542f(currentText) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    C10450h c10450h = C10444b.f30944w0;
                    C0136m c0136m = AbstractC17770m.f56729f;
                    C10456n c10456n2 = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qM9836a = AbstractC9262b4.m9836a(AbstractC10844c.m11244d(c10456n2, 1.0f), z6);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c0136m, c10450h, c6021p4, 54);
                    int i11 = c6021p4.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p4.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM9836a);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p4.m6528W();
                    if (c6021p4.f19563O) {
                        c6021p4.m6549l(c21696i2);
                    } else {
                        c6021p4.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p4, c17781r0M19506b);
                    C5997d.m6439Z(C21698j.f68872e, c6021p4, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p4.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p4, i11, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p4, interfaceC10459qM10923d2);
                    AbstractC8063c5.m8467j(AbstractC8034Z.m8391f(currentText, !currentText.equals((String) obj5)), C17785t0.f56761a.m19513a(c10456n2, 1.0f, true), 1, 2, false, c6021p4, 3456);
                    AbstractC8223w5.m8850b(((C20541V) obj4).f65173e, AbstractC10842a.m11237o(c10456n2, AbstractC7313q.f23199d, 0.0f, 0.0f, 0.0f, 14), C20568r.f65283Y, null, "historyItemStatusAnimation", null, AbstractC20554e.f65249g, c6021p4, 1597824, 40);
                    c6021p4.m6553p(true);
                }
                return c17296c;
            default:
                C6021p c6021p5 = (C6021p) obj2;
                ((Number) obj3).intValue();
                c6021p5.m6524S(805428266);
                C20706E0 c20706e0 = (C20706E0) obj5;
                boolean z10 = ((EnumC16673F0) c20706e0.f65623e.getValue()) == EnumC16673F0.f53401Y || !(c6021p5.m6548k(AbstractC0187M0.f710l) == EnumC7546k.f23905Z);
                boolean zM6542f4 = c6021p5.m6542f(c20706e0);
                Object objM6514H7 = c6021p5.m6514H();
                if (zM6542f4 || objM6514H7 == c5975s) {
                    objM6514H7 = new C20198o(c20706e0, 10);
                    c6021p5.m6537c0(objM6514H7);
                }
                InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V((InterfaceC1436k) objM6514H7, c6021p5);
                Object objM6514H8 = c6021p5.m6514H();
                if (objM6514H8 == c5975s) {
                    C16696N c16696n = new C16696N(new C6194i(interfaceC5985XM6435V, 15));
                    c6021p5.m6537c0(c16696n);
                    objM6514H8 = c16696n;
                }
                InterfaceC16736e1 interfaceC16736e1 = (InterfaceC16736e1) objM6514H8;
                boolean zM6542f5 = c6021p5.m6542f(interfaceC16736e1) | c6021p5.m6542f(c20706e0);
                Object objM6514H9 = c6021p5.m6514H();
                if (zM6542f5 || objM6514H9 == c5975s) {
                    objM6514H9 = new C20702C0(interfaceC16736e1, c20706e0);
                    c6021p5.m6537c0(objM6514H9);
                }
                InterfaceC10459q interfaceC10459qM11222h = AbstractC10840a.m11222h(C10456n.f30959Y, (C20702C0) objM6514H9, (EnumC16673F0) c20706e0.f65623e.getValue(), z6 && c20706e0.f65620b.m6409g() != 0.0f, z10, null, (InterfaceC17406l) obj4, 16);
                c6021p5.m6553p(false);
                return interfaceC10459qM11222h;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16878e0(C20706E0 c20706e0, boolean z6, InterfaceC17406l interfaceC17406l) {
        super(3);
        this.f54169Y = 4;
        this.f54171o0 = c20706e0;
        this.f54170Z = z6;
        this.f54172p0 = interfaceC17406l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16878e0(boolean z6, Object obj, Object obj2, int i10) {
        super(3);
        this.f54169Y = i10;
        this.f54170Z = z6;
        this.f54171o0 = obj;
        this.f54172p0 = obj2;
    }
}
