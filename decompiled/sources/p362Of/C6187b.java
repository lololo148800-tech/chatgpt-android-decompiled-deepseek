package p362Of;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3991U3;
import p291Lf.AbstractC5023t;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8238y4;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8479G;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p911o0.InterfaceC17763i0;
import p946pc.C18321F;
import p962qc.AbstractC18671e;
import td.C19842e;

/* JADX INFO: renamed from: Of.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6187b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20147Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f20148Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f20149o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6187b(int i10, String str, InterfaceC1436k interfaceC1436k) {
        super(3);
        this.f20147Y = i10;
        this.f20148Z = interfaceC1436k;
        this.f20149o0 = str;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f20147Y) {
            case 0:
                InterfaceC17763i0 paddingValues = (InterfaceC17763i0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddingValues, "paddingValues");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(paddingValues) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(AbstractC8479G.m9126g(c10456n, AbstractC8479G.m9124e(c6021p), 14), paddingValues);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11232j);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    String strM8676d = AbstractC8142m4.m8676d(R.string.code_dialog_title, c6021p);
                    C3582M c3582m = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12152h;
                    float f10 = AbstractC7313q.f23201f;
                    float f11 = AbstractC7313q.f23199d;
                    AbstractC4124r4.m4768b(strM8676d, AbstractC10842a.m11234l(c10456n, f10, f11), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m, c6021p, 0, 0, 65532);
                    C18321F c18321fM5651b = AbstractC5023t.m5651b(c6021p);
                    InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(c10456n, f10, f11);
                    String str = this.f20149o0;
                    AbstractC18671e.m20038a(interfaceC10459qM11234l, c18321fM5651b, AbstractC8411c.m8969c(-1237494195, c6021p, new C3991U3(str, 1)), c6021p, 384, 0);
                    c6021p.m6524S(310964145);
                    InterfaceC1436k interfaceC1436k = this.f20148Z;
                    boolean zM6542f = c6021p.m6542f(interfaceC1436k) | c6021p.m6542f(str);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C6186a(0, str, interfaceC1436k);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H, AbstractC10842a.m11234l(AbstractC10844c.m11244d(c10456n, 1.0f), f10, f11), false, null, null, null, null, null, null, AbstractC6190e.f20161c, c6021p, 805306368, 508);
                    c6021p.m6553p(true);
                }
                break;
            default:
                C10845a item = (C10845a) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC8238y4.m8879c(0, c6021p2);
                    InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(this.f20148Z, c6021p2);
                    c6021p2.m6524S(-1096526200);
                    boolean zM6542f2 = c6021p2.m6542f(interfaceC5985XM6435V);
                    String str2 = this.f20149o0;
                    boolean zM6542f3 = zM6542f2 | c6021p2.m6542f(str2);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f3 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C19842e(interfaceC5985XM6435V, str2, null);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p2, str2);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
