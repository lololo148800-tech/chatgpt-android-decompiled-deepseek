package p193Hf;

import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.C3879A2;
import p229J0.C3941K4;
import p229J0.C4052f4;
import p349O0.C6021p;
import p478Tc.AbstractC7312p;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8136l6;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9156K;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13508z;
import p758g0.AbstractC13758e;
import p758g0.C13781p0;
import p870le.C16878e0;
import p882m1.AbstractC17140a;
import p894n0.InterfaceC17406l;
import p911o0.C17785t0;

/* JADX INFO: renamed from: Hf.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3368h0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10285Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f10286Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f10287o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f10288p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f10289q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3368h0(String str, Locale locale, boolean z6, boolean z10) {
        super(2);
        this.f10288p0 = str;
        this.f10289q0 = locale;
        this.f10286Z = z6;
        this.f10287o0 = z10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10285Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.file_document, c6021p, 0);
                    C10456n c10456n = C10456n.f30959Y;
                    AbstractC3878A1.m4596a(abstractC17140aM8631b, null, AbstractC10844c.m11252l(AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, 0.0f, 1, 7), AbstractC7312p.f23185b), 0L, c6021p, 48, 8);
                    String str = (String) this.f10288p0;
                    String strM9706b = str != null ? AbstractC9156K.m9706b(str, (Locale) this.f10289q0) : null;
                    c6021p.m6524S(-928408231);
                    if (strM9706b == null) {
                        strM9706b = AbstractC8142m4.m8676d(R.string.tap_to_view, c6021p);
                    }
                    c6021p.m6553p(false);
                    AbstractC4124r4.m4768b(strM9706b, C17785t0.f56761a.m19513a(c10456n, 1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12157m, c6021p, 0, 3120, 55292);
                    AbstractC8136l6.m8661b(this.f10286Z, this.f10287o0, c6021p, 0);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C3879A2.f11730a.m4599a(this.f10286Z, this.f10287o0, (InterfaceC17406l) this.f10288p0, C10456n.f30959Y, (C4052f4) this.f10289q0, AbstractC4141u3.m4770a(3, c6021p2), C3879A2.f11734e, C3879A2.f11733d, c6021p2, 114822144, 0);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C13781p0 c13781p0M15255t = AbstractC13758e.m15255t(150, 0, null, 6);
                    C10451i c10451i = C10444b.f30938q0;
                    AbstractC10831a.m11201d(this.f10286Z, null, AbstractC13508z.m15011c(c13781p0M15255t, c10451i, 12).m14995a(AbstractC13508z.m15013e(AbstractC13758e.m15255t(150, 0, null, 6), 2)), AbstractC13508z.m15019k(AbstractC13758e.m15255t(150, 0, null, 6), c10451i, 12).m14996a(AbstractC13508z.m15014f(AbstractC13758e.m15255t(150, 0, null, 6), 2)), null, AbstractC8411c.m8969c(703864108, c6021p3, new C16878e0((InterfaceC10459q) this.f10288p0, (InterfaceC1426a) this.f10289q0, this.f10287o0, 1)), c6021p3, 200064, 18);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3368h0(boolean z6, InterfaceC10459q interfaceC10459q, InterfaceC1426a interfaceC1426a, boolean z10) {
        super(2);
        this.f10286Z = z6;
        this.f10288p0 = interfaceC10459q;
        this.f10289q0 = interfaceC1426a;
        this.f10287o0 = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3368h0(boolean z6, boolean z10, InterfaceC17406l interfaceC17406l, C4052f4 c4052f4) {
        super(2);
        this.f10286Z = z6;
        this.f10287o0 = z10;
        this.f10288p0 = interfaceC17406l;
        this.f10289q0 = c4052f4;
    }
}
