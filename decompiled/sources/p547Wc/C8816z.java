package p547Wc;

import af.C10545A;
import af.C10546B;
import af.C10564U;
import af.C10575c0;
import af.C10595w;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.view.View;
import bf.C11363S;
import bf.C11391s;
import bf.C11398z;
import com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModel;
import com.openai.feature.onboarding.impl.viewmodel.VerifyEmailLinkViewModel;
import com.openai.feature.subscriptions.ChoosePlanViewModel;
import fo.C13718o;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p077Cn.InterfaceC1747o;
import p087D7.AbstractC1976c;
import p1081wc.C20857C;
import p1081wc.C20893l;
import p1081wc.InterfaceC20904w;
import p1095x1.AbstractC21067V;
import p1113xn.AbstractC21322p;
import p1113xn.C21307a;
import p1140z1.AbstractC21690f;
import p1155zi.C21921H1;
import p153Fn.C2925c;
import p225Im.InterfaceC3759g;
import p349O0.C5996c0;
import p349O0.InterfaceC5985X;
import p403Qd.AbstractC6601G;
import p403Qd.C6644m;
import p482Tg.C7443a0;
import p523V9.AbstractC8215v5;
import p552Wg.C8838B;
import p552Wg.C8850l;
import p552Wg.C8858t;
import p553Wh.C8870f;
import p571X9.AbstractC9306j0;
import p590Y4.AbstractC9647d;
import p590Y4.C9645b;
import p613Z4.AbstractC10159f;
import p622Ze.C10295m;
import p624Zg.C10362d;
import p624Zg.C10390v;
import p636a2.C10479p;
import p646aj.C10627g;
import p647ak.C10678Y;
import p677c8.C11689a;
import p715e1.C13256b;
import p715e1.C13257c;
import p722e8.C13295E;
import p722e8.C13313X;
import p722e8.C13315Z;
import p729ej.C13421l;
import p737f1.C13526r;
import p749fd.C13628m;
import p751ff.C13633d;
import p773h0.C14257L;
import p860l0.C16782u;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17680n;
import p909nm.C17690x;
import p926of.C18150M;

/* JADX INFO: renamed from: Wc.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C8816z extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26998Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f26999Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f27000o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8816z(Object obj, int i10, Object obj2) {
        super(0);
        this.f26998Y = i10;
        this.f27000o0 = obj;
        this.f26999Z = obj2;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C11398z c11398z;
        String str;
        int i10 = 0;
        int i11 = 2;
        int i12 = 1;
        switch (this.f26998Y) {
            case 0:
                ((InterfaceC1436k) this.f27000o0).invoke(this.f26999Z);
                return C17296C.f55119a;
            case 1:
                ((InterfaceC5985X) this.f27000o0).setValue(this.f26999Z);
                return C17296C.f55119a;
            case 2:
                AbstractC0575H.m1156D((C2925c) this.f27000o0, null, null, new C8769M((C16782u) this.f26999Z, null), 3);
                return C17296C.f55119a;
            case 3:
                ((InterfaceC1436k) ((InterfaceC3759g) this.f27000o0)).invoke(new C8850l((String) this.f26999Z));
                return C17296C.f55119a;
            case 4:
                if (!((C8870f) this.f27000o0).f27149b.m12195o()) {
                    ((AbstractActivityC17375g) this.f26999Z).finish();
                }
                return C17296C.f55119a;
            case 5:
                ((InterfaceC1436k) ((InterfaceC3759g) this.f27000o0)).invoke(new C8858t(((C8838B) this.f26999Z).f27028c));
                return C17296C.f55119a;
            case 6:
                AbstractC10159f abstractC10159f = ((AbstractC9647d) this.f27000o0).f29073a;
                C9645b c9645b = (C9645b) this.f26999Z;
                abstractC10159f.getClass();
                synchronized (abstractC10159f.f30091c) {
                    if (((LinkedHashSet) abstractC10159f.f30093e).remove(c9645b) && ((LinkedHashSet) abstractC10159f.f30093e).isEmpty()) {
                        abstractC10159f.mo10759d();
                    }
                    break;
                }
                return C17296C.f55119a;
            case 7:
                C11391s c11391s = (C11391s) this.f26999Z;
                if (c11391s != null && (c11398z = c11391s.f34417c) != null && (str = c11398z.f34428d) != null) {
                    ((InterfaceC1436k) this.f27000o0).invoke(new C10295m(str));
                }
                return C17296C.f55119a;
            case 8:
                ((ChoosePlanViewModel) this.f27000o0).m14395k(new C10362d(((C10390v) this.f26999Z).f30791a.f30669a));
                return C17296C.f55119a;
            case 9:
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f27000o0;
                interfaceC5985X.setValue(Boolean.valueOf(!((Boolean) interfaceC5985X.getValue()).booleanValue()));
                ((C10479p) this.f26999Z).f31040p0 = true;
                return C17296C.f55119a;
            case 10:
                Locale locale = Locale.US;
                Throwable stackCapture = (Throwable) this.f26999Z;
                AbstractC16544l.m18093f(stackCapture, "stackCapture");
                return String.format(locale, "SDK instance with name %s is not found, returning no-op implementation. Please make sure to call Datadog.initialize([instanceName]) before getting the instance. SDK instance was requested from:\n%s", Arrays.copyOf(new Object[]{(String) this.f27000o0, AbstractC17680n.m19349Y(AbstractC17680n.m19336L(AbstractC21322p.m21685S(AbstractC1976c.m3148e(stackCapture)), 1), Separators.RETURN, null, null, 0, null, null, 62)}, 2));
            case 11:
                ((InterfaceC1436k) ((InterfaceC3759g) this.f27000o0)).invoke(new C10595w(true ^ ((C10545A) this.f26999Z).f31306f));
                return C17296C.f55119a;
            case 12:
                ((InterfaceC1436k) this.f27000o0).invoke(new C10546B((C11363S) ((C21921H1) ((C10575c0) this.f26999Z).f31409a).f69472a));
                return C17296C.f55119a;
            case 13:
                ((InterfaceC1436k) this.f27000o0).invoke(new C10546B((C11363S) this.f26999Z));
                return C17296C.f55119a;
            case 14:
                C10627g c10627g = (C10627g) this.f27000o0;
                File fileM10996b = c10627g.m10996b();
                if (!fileM10996b.exists()) {
                    fileM10996b.createNewFile();
                    byte[] bytes = "{\"batch\":[".getBytes(C21307a.f67720a);
                    AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
                    c10627g.m10998d(bytes, fileM10996b);
                    i10 = 1;
                }
                if (fileM10996b.length() > 475000) {
                    C10627g.m10995a(c10627g);
                    fileM10996b = c10627g.m10996b();
                    fileM10996b.createNewFile();
                    byte[] bytes2 = "{\"batch\":[".getBytes(C21307a.f67720a);
                    AbstractC16544l.m18093f(bytes2, "this as java.lang.String).getBytes(charset)");
                    c10627g.m10998d(bytes2, fileM10996b);
                } else {
                    i12 = i10;
                }
                StringBuilder sbM9893l = AbstractC9306j0.m9893l(i12 == 0 ? Separators.COMMA : "");
                sbM9893l.append((String) this.f26999Z);
                byte[] bytes3 = sbM9893l.toString().getBytes(C21307a.f67720a);
                AbstractC16544l.m18093f(bytes3, "this as java.lang.String).getBytes(charset)");
                c10627g.m10998d(bytes3, fileM10996b);
                return C17296C.f55119a;
            case 15:
                ((C13421l) this.f27000o0).f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C10564U((C10678Y) this.f26999Z, 21)));
                return C17296C.f55119a;
            case 16:
                ((C13256b) this.f27000o0).f41871C0.invoke((C13257c) this.f26999Z);
                return C17296C.f55119a;
            case 17:
                C13315Z c13315z = (C13315Z) this.f27000o0;
                c13315z.f42183b.mo15460p("rum", new C13313X(c13315z, C11689a.m13025a(c13315z.m14932d(), null, false, null, null, null, null, 0, 0, 1, null, null, 0L, 0L, 32135), i10));
                c13315z.f42195n.putAll(((C13295E) this.f26999Z).f42028c);
                return C17296C.f55119a;
            case 18:
                ((C16525B) this.f27000o0).f51262Y = ((C13526r) this.f26999Z).m15077K0();
                return C17296C.f55119a;
            case 19:
                ((InterfaceC20904w) this.f27000o0).mo21447a(C20893l.f66573k, C17690x.f56481Y);
                ((InterfaceC1436k) ((InterfaceC3759g) this.f26999Z)).invoke(C13633d.f43077a);
                return C17296C.f55119a;
            case 20:
                ((InterfaceC5985X) this.f26999Z).setValue(Boolean.FALSE);
                ((C8870f) this.f27000o0).f27149b.m12195o();
                return C17296C.f55119a;
            case 21:
                ((C13718o) ((C13628m) this.f27000o0).f43062Z).m15206c(new C13628m(this, i11));
                return C17296C.f55119a;
            case 22:
                C13718o c13718o = (C13718o) ((C7443a0) this.f27000o0).f23559Z;
                C7443a0 c7443a0 = new C7443a0(this, 13);
                c13718o.getClass();
                C13718o.m15205b(c7443a0);
                return C17296C.f55119a;
            case 23:
                ((InterfaceC1747o) this.f27000o0).mo2524p(this.f26999Z);
                return C17296C.f55119a;
            case 24:
                ((InterfaceC1436k) this.f27000o0).invoke(new C18150M(((C6644m) ((AbstractC6601G) this.f26999Z)).f21408f));
                return C17296C.f55119a;
            case 25:
                ((InterfaceC20904w) this.f27000o0).mo21447a(C20857C.f66316B, C17690x.f56481Y);
                ((C5996c0) this.f26999Z).m6413h(Integer.MAX_VALUE);
                return C17296C.f55119a;
            case 26:
                ((InterfaceC1436k) this.f27000o0).invoke((View) this.f26999Z);
                return C17296C.f55119a;
            case 27:
                ((C16525B) this.f27000o0).f51262Y = AbstractC21690f.m22204i((C14257L) this.f26999Z, AbstractC21067V.f66979a);
                return C17296C.f55119a;
            case 28:
                ((FinishAccountViewModel) this.f27000o0).mo14325n((Context) this.f26999Z);
                return C17296C.f55119a;
            default:
                ((VerifyEmailLinkViewModel) this.f27000o0).m14336p((Context) this.f26999Z);
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8816z(Object obj, Object obj2, boolean z6, int i10) {
        super(0);
        this.f26998Y = i10;
        this.f26999Z = obj;
        this.f27000o0 = obj2;
    }
}
