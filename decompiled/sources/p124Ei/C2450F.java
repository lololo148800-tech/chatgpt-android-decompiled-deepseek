package p124Ei;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import com.openai.chatgpt.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.C0146w;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1113xn.AbstractC21329w;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p273Kl.C4714D;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p360Od.C6172d;
import p360Od.EnumC6170b;
import p362Of.AbstractC6191f;
import p362Of.AbstractC6196k;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8479G;
import p571X9.AbstractC9306j0;
import p575Xd.C9463v;
import p575Xd.C9466y;
import p575Xd.InterfaceC9461t;
import p594Y9.AbstractC9746I4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.C17781r0;
import p911o0.C17790w;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: Ei.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C2450F extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7606Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6172d f7607Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f7608o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f7609p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2450F(C6172d c6172d, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10) {
        super(3);
        this.f7606Y = i10;
        this.f7607Z = c6172d;
        this.f7608o0 = interfaceC1436k;
        this.f7609p0 = interfaceC1436k2;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6021p c6021p;
        String strM8677e;
        int i10;
        C5975S c5975s = C6013l.f19514a;
        InterfaceC1436k interfaceC1436k = this.f7608o0;
        C10456n c10456n = C10456n.f30959Y;
        C17296C c17296c = C17296C.f55119a;
        switch (this.f7606Y) {
            case 0:
                C10845a item = (C10845a) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC6196k.m6724a(this.f7607Z, this.f7608o0, AbstractC10844c.m11260t(AbstractC10844c.m11244d(AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23201f), 1.0f), C10444b.f30947z0, 2), this.f7609p0, c6021p2, 0);
                }
                return c17296c;
            case 1:
                C17794y ModalBottomSheet = (C17794y) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(ModalBottomSheet, "$this$ModalBottomSheet");
                if ((iIntValue2 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    c6021p3.m6524S(1527656822);
                    C6172d c6172d = this.f7607Z;
                    boolean zM6542f = c6021p3.m6542f(c6172d) | c6021p3.m6542f(interfaceC1436k);
                    InterfaceC1436k interfaceC1436k2 = this.f7609p0;
                    boolean zM6542f2 = zM6542f | c6021p3.m6542f(interfaceC1436k2);
                    Object objM6514H = c6021p3.m6514H();
                    if (zM6542f2 || objM6514H == c5975s) {
                        objM6514H = new C0146w(c6172d, interfaceC1436k, interfaceC1436k2, 10);
                        c6021p3.m6537c0(objM6514H);
                    }
                    c6021p3.m6553p(false);
                    AbstractC9746I4.m10337a(null, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H, c6021p3, 0, 255);
                }
                return c17296c;
            default:
                InterfaceC17763i0 paddingValues = (InterfaceC17763i0) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddingValues, "paddingValues");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6021p4.m6542f(paddingValues) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10842a.m11232j(AbstractC8479G.m9126g(c10456n, AbstractC8479G.m9124e(c6021p4), 14), paddingValues), AbstractC7313q.f23201f, 0.0f, 2);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p4, 0);
                    int i11 = c6021p4.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p4.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM11235m);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p4.m6528W();
                    if (c6021p4.f19563O) {
                        c6021p4.m6549l(c21696i);
                    } else {
                        c6021p4.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p4, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p4, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p4.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p4, i11, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p4, interfaceC10459qM10923d);
                    String strM8676d = AbstractC8142m4.m8676d(R.string.tool_function_action_dialog_title, c6021p4);
                    C5984W0 c5984w0 = AbstractC3947L4.f12183a;
                    C3582M c3582m = ((C3941K4) c6021p4.m6548k(c5984w0)).f12151g;
                    float f10 = AbstractC7313q.f23199d;
                    AbstractC4124r4.m4768b(strM8676d, AbstractC10842a.m11235m(c10456n, 0.0f, f10, 1), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m, c6021p4, 0, 0, 65532);
                    C6172d c6172d2 = this.f7607Z;
                    String str = c6172d2.f20091a.f28480b;
                    if (str == null) {
                        str = "";
                    }
                    EnumC6170b enumC6170b = c6172d2.f20093c;
                    int iOrdinal = enumC6170b.ordinal();
                    if (iOrdinal == 0) {
                        c6021p = c6021p4;
                        c6021p.m6524S(-160328585);
                        c6021p.m6553p(false);
                        strM8677e = "";
                    } else if (iOrdinal == 1) {
                        c6021p = c6021p4;
                        c6021p.m6524S(-1252107654);
                        strM8677e = AbstractC8142m4.m8677e(R.string.tool_function_action_dialog_description_success, new Object[]{str}, c6021p);
                        c6021p.m6553p(false);
                    } else if (iOrdinal == 2) {
                        c6021p = c6021p4;
                        c6021p.m6524S(-1252102341);
                        strM8677e = AbstractC8142m4.m8677e(R.string.tool_function_action_dialog_description_declined, new Object[]{str}, c6021p);
                        c6021p.m6553p(false);
                    } else {
                        if (iOrdinal != 3) {
                            c6021p4.m6524S(-1252434521);
                            c6021p4.m6553p(false);
                            throw new C0644w();
                        }
                        c6021p = c6021p4;
                        c6021p.m6524S(-1252113058);
                        strM8677e = AbstractC8142m4.m8677e(R.string.tool_function_action_dialog_description_in_progress, new Object[]{str}, c6021p);
                        c6021p.m6553p(false);
                    }
                    C6021p c6021p5 = c6021p;
                    AbstractC4124r4.m4768b(strM8677e, AbstractC10842a.m11235m(c10456n, 0.0f, f10, 1), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12155k, c6021p5, 0, 0, 65532);
                    C9463v c9463v = c6172d2.f20091a;
                    String str2 = c9463v.f28482d;
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.tool_function_action_dialog_action_name, new Object[]{str2 != null ? str2 : ""}, c6021p5), AbstractC10842a.m11235m(c10456n, 0.0f, f10, 1), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p5.m6548k(c5984w0)).f12155k, c6021p5, 0, 0, 65532);
                    c6021p5.m6524S(-1252076670);
                    for (Map.Entry entry : c9463v.f28484f.entrySet()) {
                        AbstractC4124r4.m4768b(AbstractC9306j0.m9890i((String) entry.getKey(), ": ", (String) entry.getValue()), AbstractC10842a.m11234l(c10456n, AbstractC7313q.f23201f, AbstractC7313q.f23198c), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p5.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p5, 0, 0, 65532);
                    }
                    c6021p5.m6553p(false);
                    c6021p5.m6524S(-1252065515);
                    List<C9466y> list = c9463v.f28483e;
                    if (list.isEmpty()) {
                        i10 = 1;
                    } else {
                        float f11 = AbstractC7313q.f23199d;
                        AbstractC17758g.m19482b(c6021p5, AbstractC10842a.m11235m(c10456n, 0.0f, f11, 1));
                        InterfaceC10459q interfaceC10459qM9122c = AbstractC8479G.m9122c(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC8479G.m9124e(c6021p5));
                        C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(f11), C10444b.f30943v0, c6021p5, 0);
                        int i12 = c6021p5.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p5.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p5, interfaceC10459qM9122c);
                        InterfaceC21700k.f68875m0.getClass();
                        C21696i c21696i2 = C21698j.f68869b;
                        c6021p5.m6528W();
                        if (c6021p5.f19563O) {
                            c6021p5.m6549l(c21696i2);
                        } else {
                            c6021p5.m6543f0();
                        }
                        C5997d.m6439Z(C21698j.f68873f, c6021p5, c17781r0M19506b);
                        C5997d.m6439Z(C21698j.f68872e, c6021p5, interfaceC6008i0M6550m2);
                        C21694h c21694h2 = C21698j.f68874g;
                        if (c6021p5.f19563O || !AbstractC16544l.m18089b(c6021p5.m6514H(), Integer.valueOf(i12))) {
                            AbstractC0168G.m537z(i12, c6021p5, i12, c21694h2);
                        }
                        C5997d.m6439Z(C21698j.f68871d, c6021p5, interfaceC10459qM10923d2);
                        c6021p5.m6524S(-553712158);
                        for (C9466y c9466y : list) {
                            String str3 = c9466y.f28489c;
                            if (str3 == null || !AbstractC21329w.m21734u(str3, "image/", false)) {
                                c6021p5.m6524S(347356355);
                                AbstractC6196k.m6728e(c9466y, null, c6021p5, 0);
                                c6021p5.m6553p(false);
                            } else {
                                c6021p5.m6524S(-681533918);
                                AbstractC6196k.m6729f(c9466y, interfaceC1436k, null, c6021p5, 0);
                                c6021p5.m6553p(false);
                            }
                        }
                        c6021p5.m6553p(false);
                        i10 = 1;
                        c6021p5.m6553p(true);
                    }
                    c6021p5.m6553p(false);
                    AbstractC17758g.m19482b(c6021p5, AbstractC10842a.m11235m(c10456n, 0.0f, AbstractC7313q.f23199d, i10));
                    c6021p5.m6524S(-1252035726);
                    if (enumC6170b == EnumC6170b.f20088p0) {
                        Iterator it = c9463v.f28485g.iterator();
                        while (it.hasNext()) {
                            AbstractC6196k.m6727d((InterfaceC9461t) it.next(), this.f7609p0, c6172d2, AbstractC10842a.m11235m(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23201f, 0.0f, 2), c6021p5, 0, 0);
                        }
                    }
                    c6021p5.m6553p(false);
                    AbstractC17758g.m19482b(c6021p5, AbstractC10842a.m11235m(c10456n, 0.0f, AbstractC7313q.f23199d, 1));
                    InterfaceC10459q interfaceC10459qM11235m2 = AbstractC10842a.m11235m(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23201f, 0.0f, 2);
                    c6021p5.m6524S(-1252009467);
                    boolean zM6542f3 = c6021p5.m6542f(interfaceC1436k) | c6021p5.m6542f(c6172d2);
                    Object objM6514H2 = c6021p5.m6514H();
                    if (zM6542f3 || objM6514H2 == c5975s) {
                        objM6514H2 = new C4714D(interfaceC1436k, 13, c6172d2);
                        c6021p5.m6537c0(objM6514H2);
                    }
                    c6021p5.m6553p(false);
                    AbstractC3984T1.m4695n((InterfaceC1426a) objM6514H2, interfaceC10459qM11235m2, false, null, null, null, null, null, null, AbstractC6191f.f20165d, c6021p5, 805306368, 508);
                    c6021p5.m6553p(true);
                }
                return c17296c;
        }
    }
}
