package p482Tg;

import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.AbstractC10839g;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import bf.InterfaceC11374b0;
import com.openai.auth.SwitchAccountViewModel;
import com.openai.feature.settings.impl.settings.SettingsViewModel;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1081wc.InterfaceC20904w;
import p124Ei.C2476S0;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3914G1;
import p229J0.C3890C1;
import p324Mn.C5521B;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p437Rn.C6959q;
import p478Tc.C7299c;
import p527Ve.C8280q;
import p537W0.AbstractC8411c;
import p553Wh.C8870f;
import p594Y9.AbstractC9746I4;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.InterfaceC13499q;
import p773h0.InterfaceC14267W;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: Tg.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C7438W extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23530Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f23531Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f23532o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f23533p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f23534q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f23535r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f23536s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f23537t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Object f23538u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ Object f23539v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7438W(InterfaceC3759g interfaceC3759g, InterfaceC5985X interfaceC5985X, C7439X c7439x, C8870f c8870f, InterfaceC10459q interfaceC10459q, Context context, SwitchAccountViewModel switchAccountViewModel, SettingsViewModel settingsViewModel, boolean z6) {
        super(3);
        this.f23533p0 = c7439x;
        this.f23534q0 = switchAccountViewModel;
        this.f23535r0 = context;
        this.f23536s0 = c8870f;
        this.f23537t0 = interfaceC3759g;
        this.f23531Z = interfaceC10459q;
        this.f23532o0 = z6;
        this.f23538u0 = settingsViewModel;
        this.f23539v0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f23530Y) {
            case 0:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qMo428M = AbstractC10842a.m11232j(C10456n.f30959Y, paddings).mo428M(AbstractC10844c.f32512c);
                    c6021p.m6524S(307990280);
                    boolean zM6545h = c6021p.m6545h((C7439X) this.f23533p0);
                    SwitchAccountViewModel switchAccountViewModel = (SwitchAccountViewModel) this.f23534q0;
                    boolean zM6545h2 = zM6545h | c6021p.m6545h(switchAccountViewModel) | c6021p.m6545h((Context) this.f23535r0) | c6021p.m6545h((C8870f) this.f23536s0) | c6021p.m6542f((InterfaceC3759g) this.f23537t0) | c6021p.m6542f(this.f23531Z) | c6021p.m6544g(this.f23532o0);
                    SettingsViewModel settingsViewModel = (SettingsViewModel) this.f23538u0;
                    boolean zM6542f = zM6545h2 | c6021p.m6542f(settingsViewModel);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        InterfaceC3759g interfaceC3759g = (InterfaceC3759g) this.f23537t0;
                        InterfaceC10459q interfaceC10459q = this.f23531Z;
                        objM6514H = new C7437V(interfaceC3759g, (InterfaceC5985X) this.f23539v0, (C7439X) this.f23533p0, (C8870f) this.f23536s0, interfaceC10459q, (Context) this.f23535r0, switchAccountViewModel, settingsViewModel, this.f23532o0);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC9746I4.m10337a(interfaceC10459qMo428M, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H, c6021p, 0, 254);
                }
                break;
            default:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                C6021p c6021p2 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                InterfaceC14267W interfaceC14267W = (InterfaceC14267W) c6021p2.m6548k(AbstractC10839g.f32446a);
                c6021p2.m6524S(31206742);
                InterfaceC20904w interfaceC20904w = (InterfaceC20904w) this.f23534q0;
                boolean zM6545h3 = c6021p2.m6545h(interfaceC20904w);
                InterfaceC11374b0 interfaceC11374b0 = (InterfaceC11374b0) this.f23535r0;
                boolean zM6545h4 = zM6545h3 | c6021p2.m6545h(interfaceC11374b0);
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f23536s0;
                boolean zM6542f2 = zM6545h4 | c6021p2.m6542f(interfaceC1436k);
                Object objM6514H2 = c6021p2.m6514H();
                if (zM6542f2 || objM6514H2 == C6013l.f19514a) {
                    objM6514H2 = new C6959q(interfaceC20904w, interfaceC11374b0, interfaceC1436k, 5);
                    c6021p2.m6537c0(objM6514H2);
                }
                c6021p2.m6553p(false);
                InterfaceC10459q interfaceC10459qM11210e = AbstractC10833a.m11210e(this.f23531Z, (C7299c) this.f23533p0, interfaceC14267W, false, null, (InterfaceC1426a) objM6514H2, 252);
                boolean z6 = this.f23532o0;
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1811154198, c6021p2, new C8280q(interfaceC11374b0, z6, 0)), interfaceC10459qM11210e, null, AbstractC8411c.m8969c(-1140200525, c6021p2, new C2476S0(interfaceC11374b0, (C5521B) this.f23538u0, z6, (C5521B) this.f23539v0, 2)), AbstractC8411c.m8969c(739326098, c6021p2, new C8280q(interfaceC11374b0, z6, 1)), null, (C3890C1) this.f23537t0, 0.0f, 0.0f, c6021p2, 27654, 420);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7438W(InterfaceC10459q interfaceC10459q, C7299c c7299c, InterfaceC20904w interfaceC20904w, InterfaceC11374b0 interfaceC11374b0, InterfaceC1436k interfaceC1436k, C3890C1 c3890c1, boolean z6, C5521B c5521b, C5521B c5521b2) {
        super(3);
        this.f23531Z = interfaceC10459q;
        this.f23533p0 = c7299c;
        this.f23534q0 = interfaceC20904w;
        this.f23535r0 = interfaceC11374b0;
        this.f23536s0 = interfaceC1436k;
        this.f23537t0 = c3890c1;
        this.f23532o0 = z6;
        this.f23538u0 = c5521b;
        this.f23539v0 = c5521b2;
    }
}
