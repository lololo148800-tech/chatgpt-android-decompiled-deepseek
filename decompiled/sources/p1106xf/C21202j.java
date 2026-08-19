package p1106xf;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import cd.C11709i;
import com.openai.auth.SwitchAccountViewModel;
import com.withpersona.sdk2.inquiry.network.HttpStatusCode;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p099Dj.C2064b;
import p1140z1.AbstractC21669O;
import p1140z1.AbstractC21678Y;
import p1140z1.C21658D;
import p1140z1.C21659E;
import p1140z1.C21663I;
import p1140z1.C21665K;
import p1140z1.C21714s;
import p1149zc.C21855q;
import p1150zd.EnumC21867c;
import p1150zd.EnumC21876l;
import p1156zj.C22170l;
import p310M9.C5311e;
import p316Mf.C5345l;
import p392Q0.C6543a;
import p392Q0.C6546d;
import p479Td.C7351f0;
import p571X9.AbstractC9393x3;
import p774h1.C14336N;
import p774h1.InterfaceC14362r;
import p822j2.C16047d;
import p843k1.C16308b;
import p893n.AbstractActivityC17375g;
import p926of.C18146I;
import p926of.C18155S;
import p926of.C18173j;

/* JADX INFO: renamed from: xf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C21202j extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f67409Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f67410Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f67411o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f67412p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21202j(InterfaceC1436k interfaceC1436k, C7351f0 c7351f0, EnumC21876l enumC21876l) {
        super(0);
        this.f67409Y = 1;
        this.f67410Z = interfaceC1436k;
        this.f67411o0 = c7351f0;
        this.f67412p0 = enumC21876l;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        int i10 = 0;
        C17296C c17296c = C17296C.f55119a;
        Object obj = this.f67410Z;
        Object obj2 = this.f67411o0;
        Object obj3 = this.f67412p0;
        switch (this.f67409Y) {
            case 0:
                ((C11709i) obj3).m13031a();
                ((InterfaceC1436k) obj).invoke(new C18155S((C7351f0) obj2));
                return c17296c;
            case 1:
                ((InterfaceC1436k) obj).invoke(new C5345l((C7351f0) obj2, EnumC21867c.f69341o0, (EnumC21876l) obj3));
                return c17296c;
            case 2:
                ((InterfaceC1436k) obj).invoke(new C18146I(AbstractC9393x3.m9974d(new C18173j((String) obj3, null, null, (String) obj2, null, null, null, null, null, HttpStatusCode.BAD_GATEWAY_502)), 0, 6));
                return c17296c;
            case 3:
                C21663I c21663i = (C21663I) obj3;
                C21665K c21665k = c21663i.f68690K0;
                c21665k.f68738j = 0;
                C6546d c6546dM22014L = c21665k.f68729a.m22014L();
                int i11 = c6546dM22014L.f21184o0;
                if (i11 > 0) {
                    Object[] objArr = c6546dM22014L.f21182Y;
                    int i12 = 0;
                    do {
                        C21663I c21663i2 = ((C21658D) objArr[i12]).m22060t().f68747s;
                        AbstractC16544l.m18091d(c21663i2);
                        c21663i2.f68692s0 = c21663i2.f68693t0;
                        c21663i2.f68693t0 = Integer.MAX_VALUE;
                        if (c21663i2.f68694u0 == 2) {
                            c21663i2.f68694u0 = 3;
                        }
                        i12++;
                    } while (i12 < i11);
                }
                C21665K c21665k2 = c21663i.f68690K0;
                C6546d c6546dM22014L2 = c21665k2.f68729a.m22014L();
                int i13 = c6546dM22014L2.f21184o0;
                if (i13 > 0) {
                    Object[] objArr2 = c6546dM22014L2.f21182Y;
                    int i14 = 0;
                    do {
                        C21663I c21663i3 = ((C21658D) objArr2[i14]).m22060t().f68747s;
                        AbstractC16544l.m18091d(c21663i3);
                        c21663i3.f68683D0.f68667d = false;
                        i14++;
                    } while (i14 < i13);
                }
                C21714s c21714s = c21663i.mo22090f().f68893X0;
                C21665K c21665k3 = (C21665K) obj2;
                if (c21714s != null) {
                    boolean z6 = c21714s.f68758t0;
                    C6543a c6543a = (C6543a) c21665k3.f68729a.m22054p();
                    int i15 = c6543a.f21176Y.f21184o0;
                    for (int i16 = 0; i16 < i15; i16++) {
                        AbstractC21669O abstractC21669OMo22157H0 = ((AbstractC21678Y) ((C21658D) c6543a.get(i16)).f68638I0.f3469d).mo22157H0();
                        if (abstractC21669OMo22157H0 != null) {
                            abstractC21669OMo22157H0.f68758t0 = z6;
                        }
                    }
                }
                ((C21714s) obj).mo22123n0().mo19806b();
                if (c21663i.mo22090f().f68893X0 != null) {
                    C6543a c6543a2 = (C6543a) c21665k3.f68729a.m22054p();
                    int i17 = c6543a2.f21176Y.f21184o0;
                    for (int i18 = 0; i18 < i17; i18++) {
                        AbstractC21669O abstractC21669OMo22157H1 = ((AbstractC21678Y) ((C21658D) c6543a2.get(i18)).f68638I0.f3469d).mo22157H0();
                        if (abstractC21669OMo22157H1 != null) {
                            abstractC21669OMo22157H1.f68758t0 = false;
                        }
                    }
                }
                C21658D c21658d = c21665k2.f68729a;
                C6546d c6546dM22014L3 = c21658d.m22014L();
                int i19 = c6546dM22014L3.f21184o0;
                if (i19 > 0) {
                    Object[] objArr3 = c6546dM22014L3.f21182Y;
                    int i20 = 0;
                    do {
                        C21663I c21663i4 = ((C21658D) objArr3[i20]).m22060t().f68747s;
                        AbstractC16544l.m18091d(c21663i4);
                        int i21 = c21663i4.f68692s0;
                        int i22 = c21663i4.f68693t0;
                        if (i21 != i22 && i22 == Integer.MAX_VALUE) {
                            c21663i4.m22089e0();
                        }
                        i20++;
                    } while (i20 < i19);
                }
                C6546d c6546dM22014L4 = c21658d.m22014L();
                int i23 = c6546dM22014L4.f21184o0;
                if (i23 > 0) {
                    Object[] objArr4 = c6546dM22014L4.f21182Y;
                    do {
                        C21663I c21663i5 = ((C21658D) objArr4[i10]).m22060t().f68747s;
                        AbstractC16544l.m18091d(c21663i5);
                        C21659E c21659e = c21663i5.f68683D0;
                        c21659e.f68668e = c21659e.f68667d;
                        i10++;
                    } while (i10 < i23);
                }
                return c17296c;
            case 4:
                C14336N c14336n = AbstractC21678Y.f68797R0;
                ((AbstractC21678Y) obj3).m22153D0((InterfaceC14362r) obj, (C16308b) obj2);
                return c17296c;
            case 5:
                C21855q c21855q = (C21855q) obj2;
                ((SwitchAccountViewModel) obj3).mo14219o((AbstractActivityC17375g) obj, c21855q.f69326d, c21855q.f69325c);
                return c17296c;
            default:
                View view = ((C22170l) obj3).f70156f;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    C16047d c16047d = (C16047d) layoutParams;
                    ((ViewGroup.MarginLayoutParams) c16047d).height = 0;
                    ((ViewGroup.MarginLayoutParams) c16047d).width = 0;
                    C2064b c2064b = (C2064b) obj2;
                    c16047d.f49545i = c2064b.f6303m.getId();
                    ImageView imageView = c2064b.f6303m;
                    c16047d.f49551l = imageView.getId();
                    c16047d.f49564t = imageView.getId();
                    c16047d.f49566v = imageView.getId();
                    view.setLayoutParams(c16047d);
                }
                ((C5311e) obj).m5867w();
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21202j(Object obj, Object obj2, Object obj3, int i10) {
        super(0);
        this.f67409Y = i10;
        this.f67412p0 = obj;
        this.f67410Z = obj2;
        this.f67411o0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21202j(String str, String str2, InterfaceC1436k interfaceC1436k) {
        super(0);
        this.f67409Y = 2;
        this.f67412p0 = str;
        this.f67411o0 = str2;
        this.f67410Z = interfaceC1436k;
    }
}
