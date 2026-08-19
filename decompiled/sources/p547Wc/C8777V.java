package p547Wc;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.lazy.C10845a;
import com.google.protobuf.AbstractC12107L1;
import ge.C14107v0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p006A4.C0362w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1025te.C19866Q;
import p1082wd.C20909b;
import p117Eb.C2385o;
import p169Gf.C3046j;
import p193Hf.C3321N;
import p225Im.InterfaceC3759g;
import p229J0.C4082k4;
import p269Kh.C4679f;
import p269Kh.C4684k;
import p269Kh.C4688o;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p350O1.C6051I;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8741x4;
import p552Wg.C8846h;
import p553Wh.C8870f;
import p571X9.AbstractC9262b4;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.InterfaceC13499q;
import p870le.AbstractC16851H;
import p870le.C16872b0;
import p894n0.InterfaceC17406l;
import p948pi.C18418a;

/* JADX INFO: renamed from: Wc.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C8777V extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26773Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f26774Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f26775o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f26776p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f26777q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f26778r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f26779s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8777V(InterfaceC1426a interfaceC1426a, boolean z6, InterfaceC17406l interfaceC17406l, InterfaceC5985X interfaceC5985X, String str, InterfaceC1436k interfaceC1436k) {
        super(3);
        this.f26776p0 = interfaceC1426a;
        this.f26774Z = z6;
        this.f26777q0 = interfaceC17406l;
        this.f26775o0 = interfaceC5985X;
        this.f26778r0 = str;
        this.f26779s0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f26773Y) {
            case 0:
                InterfaceC1439n innerTextField = (InterfaceC1439n) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(innerTextField, "innerTextField");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6545h(innerTextField) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C4082k4 c4082k4 = C4082k4.f13034a;
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f26775o0;
                    String str = (String) interfaceC5985X.getValue();
                    C2385o c2385o = C6051I.f19710a;
                    c6021p.m6524S(1609792561);
                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) this.f26776p0;
                    C8410b c8410bM8969c = (interfaceC1426a != null || this.f26774Z) ? AbstractC8411c.m8969c(-2052667350, c6021p, new C3321N(9, interfaceC1426a)) : null;
                    c6021p.m6553p(false);
                    c4082k4.m4751b(str, innerTextField, true, true, c2385o, (InterfaceC17406l) this.f26777q0, false, null, AbstractC8411c.m8969c(-66714025, c6021p, new C3046j((String) this.f26778r0, 10)), c8410bM8969c, AbstractC8411c.m8969c(2017295720, c6021p, new C8805o(interfaceC5985X, (InterfaceC1436k) this.f26779s0, false, 1)), null, null, null, null, null, null, AbstractC8802l.f26936c, c6021p, ((iIntValue << 3) & 112) | 100887936, 113246214, 129216);
                }
                break;
            case 1:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                C6021p c6021p2 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                C19866Q c19866q = (C19866Q) this.f26776p0;
                boolean zM20785h = c19866q.m20785h();
                InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) this.f26775o0;
                boolean z6 = true;
                boolean z10 = !zM20785h && ((Boolean) interfaceC5985X2.getValue()).booleanValue();
                C10456n c10456n = C10456n.f30959Y;
                if (this.f26774Z && !c19866q.m20785h()) {
                    z6 = false;
                }
                InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(AbstractC9262b4.m9836a(c10456n, z6), AbstractC7313q.f23199d, 0.0f, 0.0f, 0.0f, 14);
                boolean zM20784g = c19866q.m20784g();
                boolean zM20783f = c19866q.m20783f();
                c6021p2.m6524S(251737160);
                InterfaceC3759g interfaceC3759g = (InterfaceC3759g) this.f26777q0;
                boolean zM6542f = c6021p2.m6542f(interfaceC3759g) | c6021p2.m6545h((C18418a) this.f26778r0) | c6021p2.m6545h((C8870f) this.f26779s0) | c6021p2.m6542f(c19866q);
                Object objM6514H = c6021p2.m6514H();
                C5975S c5975s = C6013l.f19514a;
                if (zM6542f || objM6514H == c5975s) {
                    C0362w c0362w = new C0362w((InterfaceC3759g) this.f26777q0, (C18418a) this.f26778r0, (C8870f) this.f26779s0, c19866q, interfaceC5985X2, 13);
                    c6021p2.m6537c0(c0362w);
                    objM6514H = c0362w;
                }
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
                boolean zM13832w = AbstractC12107L1.m13832w(c6021p2, false, 251750408, interfaceC3759g);
                Object objM6514H2 = c6021p2.m6514H();
                if (zM13832w || objM6514H2 == c5975s) {
                    objM6514H2 = new C8846h(interfaceC3759g, 25);
                    c6021p2.m6537c0(objM6514H2);
                }
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H2;
                boolean zM13832w2 = AbstractC12107L1.m13832w(c6021p2, false, 251753737, interfaceC3759g);
                Object objM6514H3 = c6021p2.m6514H();
                if (zM13832w2 || objM6514H3 == c5975s) {
                    objM6514H3 = new C8846h(interfaceC3759g, 26);
                    c6021p2.m6537c0(objM6514H3);
                }
                InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H3;
                boolean zM13832w3 = AbstractC12107L1.m13832w(c6021p2, false, 251757101, interfaceC3759g);
                Object objM6514H4 = c6021p2.m6514H();
                if (zM13832w3 || objM6514H4 == c5975s) {
                    objM6514H4 = new C8846h(interfaceC3759g, 27);
                    c6021p2.m6537c0(objM6514H4);
                }
                InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H4;
                boolean zM13832w4 = AbstractC12107L1.m13832w(c6021p2, false, 251759871, interfaceC3759g);
                Object objM6514H5 = c6021p2.m6514H();
                if (zM13832w4 || objM6514H5 == c5975s) {
                    objM6514H5 = new C14107v0(interfaceC3759g, 7);
                    c6021p2.m6537c0(objM6514H5);
                }
                c6021p2.m6553p(false);
                boolean z11 = z10;
                AbstractC16851H.m18574a(zM20784g, zM20783f, z11, c19866q.f62994y, c19866q.f62977h, interfaceC1436k, interfaceC1426a2, interfaceC1426a3, interfaceC1426a4, (InterfaceC1436k) objM6514H5, interfaceC10459qM11237o, c6021p2, 0, 0, 0);
                break;
            default:
                C10845a item = (C10845a) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue2 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C4684k c4684k = ((C4679f) this.f26777q0).f15228a;
                    String str2 = c4684k.f15237b;
                    String str3 = ((C20909b) this.f26775o0).m21453a().f15253b;
                    c6021p3.m6524S(-992002380);
                    InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) this.f26779s0;
                    boolean zM6542f2 = c6021p3.m6542f(interfaceC1436k2);
                    InterfaceC1426a interfaceC1426a5 = (InterfaceC1426a) this.f26776p0;
                    boolean zM6542f3 = zM6542f2 | c6021p3.m6542f(interfaceC1426a5);
                    Object objM6514H6 = c6021p3.m6514H();
                    if (zM6542f3 || objM6514H6 == C6013l.f19514a) {
                        objM6514H6 = new C16872b0(interfaceC1436k2, interfaceC1426a5, 2);
                        c6021p3.m6537c0(objM6514H6);
                    }
                    c6021p3.m6553p(false);
                    AbstractC8741x4.m9479c((C4688o) this.f26778r0, str3, (InterfaceC1436k) objM6514H6, null, this.f26774Z, str2, c4684k.f15239d, c6021p3, 0, 8);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8777V(C4679f c4679f, C20909b c20909b, C4688o c4688o, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, boolean z6) {
        super(3);
        this.f26777q0 = c4679f;
        this.f26775o0 = c20909b;
        this.f26778r0 = c4688o;
        this.f26779s0 = interfaceC1436k;
        this.f26776p0 = interfaceC1426a;
        this.f26774Z = z6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8777V(C19866Q c19866q, boolean z6, InterfaceC3759g interfaceC3759g, C18418a c18418a, C8870f c8870f, InterfaceC5985X interfaceC5985X) {
        super(3);
        this.f26776p0 = c19866q;
        this.f26774Z = z6;
        this.f26777q0 = interfaceC3759g;
        this.f26778r0 = c18418a;
        this.f26779s0 = c8870f;
        this.f26775o0 = interfaceC5985X;
    }
}
