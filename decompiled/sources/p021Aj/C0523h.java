package p021Aj;

import com.openai.voice.VoiceModeViewModel;
import com.withpersona.sdk2.inquiry.network.dto.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import ge.EnumC14057V0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p006A4.C0362w;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1081wc.C20864J;
import p1081wc.C20883b0;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21098s;
import p1110xk.AbstractC21284g;
import p1155zi.C21938L2;
import p1155zi.EnumC21914F2;
import p1155zi.EnumC22033m2;
import p1156zj.AbstractC22120R0;
import p1156zj.AbstractC22180o0;
import p1156zj.C22107K0;
import p1156zj.C22130W0;
import p1156zj.C22147d0;
import p1156zj.C22195t0;
import p1156zj.InterfaceC22179o;
import p124Ei.AbstractC2523k1;
import p124Ei.C2472Q;
import p124Ei.C2492a0;
import p124Ei.C2518j;
import p124Ei.C2529m1;
import p140Fa.C2685e;
import p153Fn.C2925c;
import p168Gd.C3034b;
import p172Gi.EnumC3062D;
import p318Mh.AbstractC5364G0;
import p318Mh.C5431w;
import p318Mh.EnumC5421r;
import p349O0.C5994b0;
import p349O0.InterfaceC5985X;
import p387Pl.C6501u;
import p427Rc.C6844a;
import p492U1.EnumC7546k;
import p523V9.AbstractC8215v5;
import p553Wh.C8870f;
import p587Y1.C9592r;
import p587Y1.C9596v;
import p729ej.C13421l;
import p729ej.InterfaceC13418i;
import p758g0.C13756d;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.C17690x;
import p926of.C18152O;
import p949pj.C18428A;
import sg.C19540D;
import sg.C19554S;
import sg.C19575q;
import sg.C19578t;

/* JADX INFO: renamed from: Aj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C0523h extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1675Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1676Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f1677o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f1678p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f1679q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f1680r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0523h(C13421l c13421l, C22107K0 c22107k0, AbstractC22180o0 abstractC22180o0, InterfaceC22179o interfaceC22179o, C22195t0 c22195t0) {
        super(0);
        this.f1675Y = 8;
        this.f1678p0 = c13421l;
        this.f1676Z = c22107k0;
        this.f1677o0 = abstractC22180o0;
        this.f1680r0 = interfaceC22179o;
        this.f1679q0 = c22195t0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f1675Y) {
            case 0:
                C22130W0 c22130w0 = (C22130W0) this.f1676Z;
                if (c22130w0 != null) {
                    C22147d0 c22147d0 = (C22147d0) this.f1677o0;
                    C18428A c18428a = c22147d0.f70015t0;
                    AbstractC22120R0.m22361h(c22147d0, (C13421l) this.f1678p0, (C22195t0) this.f1679q0, null, c22130w0, (C2685e) this.f1680r0, c18428a, false, c22130w0.f69960p0, -1, 1152);
                }
                break;
            case 1:
                ((C6844a) this.f1676Z).m7281a(AbstractC0575H.m1156D((C2925c) this.f1677o0, null, null, new C2518j((C6501u) this.f1678p0, (C13756d) this.f1679q0, (C5994b0) this.f1680r0, null), 3));
                break;
            case 2:
                C20883b0 c20883b0 = C20883b0.f66504e;
                Map map = ((C2529m1) this.f1677o0).f7863d;
                EnumC21914F2 action = ((C21938L2) this.f1678p0).f69491b;
                AbstractC16544l.m18094g(action, "action");
                ((InterfaceC20904w) this.f1676Z).mo21447a(c20883b0, AbstractC17659D.m19248j(map, AbstractC17660E.m19258c(new C17309l("action", action.name()))));
                int i10 = AbstractC2523k1.f7833a[action.ordinal()];
                if (i10 != 1) {
                    VoiceModeViewModel voiceModeViewModel = (VoiceModeViewModel) this.f1680r0;
                    if (i10 == 2) {
                        voiceModeViewModel.m14395k(new C2472Q(EnumC3062D.Voice, EnumC22033m2.Standard, 4));
                    } else if (i10 == 3 || i10 == 4) {
                        voiceModeViewModel.m14395k(C2492a0.f7766a);
                    }
                } else {
                    AbstractC5364G0.m5889d(((C8870f) this.f1679q0).f27149b, C5431w.m5902f(C5431w.f17746g, EnumC5421r.f17710Z, null, false, false, 14), true);
                }
                break;
            case 3:
                C3034b c3034b = (C3034b) this.f1676Z;
                if (c3034b != null) {
                    ((InterfaceC1436k) this.f1677o0).invoke(new C18152O((String) this.f1678p0, c3034b.f9128a, (InterfaceC21098s) ((InterfaceC5985X) this.f1680r0).getValue(), false));
                    ((InterfaceC20904w) this.f1679q0).mo21447a(C20864J.f66425d, C17690x.f56481Y);
                }
                break;
            case 4:
                ((C9592r) this.f1676Z).m10138l((InterfaceC1426a) this.f1677o0, (C9596v) this.f1678p0, (String) this.f1679q0, (EnumC7546k) this.f1680r0);
                break;
            case 5:
                int iOrdinal = ((EnumC14057V0) this.f1676Z).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    ((InterfaceC1426a) this.f1678p0).invoke();
                } else if (iOrdinal == 4) {
                    ((InterfaceC1426a) this.f1677o0).invoke();
                } else if (iOrdinal != 5) {
                    ((InterfaceC1426a) this.f1680r0).invoke();
                } else {
                    ((InterfaceC1426a) this.f1679q0).invoke();
                }
                break;
            case 6:
                ((InterfaceC1436k) this.f1676Z).invoke(new C19554S((C19575q) this.f1677o0, ((C19578t) this.f1678p0).f62167a, (String) ((InterfaceC5985X) this.f1679q0).getValue(), ((C19540D) this.f1680r0).f62074e));
                break;
            case 7:
                AbstractC21284g.m21626b((ThemeableLottieAnimationView) this.f1676Z, (LocalImageComponentStyle) this.f1677o0, (String[]) this.f1678p0, (String[]) this.f1679q0, (String[]) this.f1680r0);
                break;
            default:
                C13421l c13421l = (C13421l) this.f1678p0;
                InterfaceC13418i interfaceC13418iMo3400l = c13421l.f42503Y.mo3400l();
                AbstractC22180o0 abstractC22180o0 = (AbstractC22180o0) this.f1677o0;
                InterfaceC22179o interfaceC22179o = (InterfaceC22179o) this.f1680r0;
                C22195t0 c22195t0 = (C22195t0) this.f1679q0;
                C22107K0 c22107k0 = (C22107K0) this.f1676Z;
                interfaceC13418iMo3400l.mo3393B(AbstractC8215v5.m8839a(c22107k0, new C0362w(abstractC22180o0, interfaceC22179o, c22195t0, c13421l, c22107k0, 18)));
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0523h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(0);
        this.f1675Y = i10;
        this.f1676Z = obj;
        this.f1677o0 = obj2;
        this.f1678p0 = obj3;
        this.f1679q0 = obj4;
        this.f1680r0 = obj5;
    }
}
