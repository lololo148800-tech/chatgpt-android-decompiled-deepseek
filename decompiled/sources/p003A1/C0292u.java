package p003A1;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import androidx.compose.p650ui.platform.AndroidComposeView;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.settings.impl.anonymous.AnonymousSettingsViewModel;
import com.openai.feature.settings.impl.instructions.CustomInstructionsEditViewModel;
import com.openai.feature.settings.impl.instructions.CustomInstructionsViewModel;
import com.openai.feature.settings.impl.memory.MemorySettingsViewModel;
import com.openai.feature.settings.impl.memory.ViewMemoryViewModel;
import com.openai.feature.settings.impl.settings.SettingsViewModel;
import com.openai.viewmodel.BaseViewModel;
import com.openai.voice.VoiceModeViewModel;
import java.util.List;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0633q0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2053b;
import p103Dn.C2153Q0;
import p1150zd.EnumC21875k;
import p1155zi.AbstractC21996d1;
import p124Ei.InterfaceC2548v0;
import p179H0.C3196n;
import p244Jg.C4337a;
import p349O0.C5994b0;
import p363Og.InterfaceC6206j;
import p363Og.InterfaceC6217u;
import p369On.C6272a;
import p389Pn.AbstractC6529n;
import p389Pn.C6534s;
import p389Pn.C6537v;
import p389Pn.C6538w;
import p389Pn.InterfaceC6533r;
import p392Q0.C6546d;
import p406Qg.InterfaceC6699J;
import p406Qg.InterfaceC6721q;
import p482Tg.InterfaceC7436U;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9306j0;
import p586Y0.C9566r;
import p737f1.AbstractC13512d;
import p737f1.C13510b;
import p759g1.C13801c;
import p774h1.AbstractC14334L;
import p905nd.C17570C;
import p909nm.AbstractC17680n;
import p926of.InterfaceC18159W;

/* JADX INFO: renamed from: A1.u */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0292u extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1060Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0292u(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f1060Y = i12;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        float fM6409g;
        C17296C c17296c = C17296C.f55119a;
        switch (this.f1060Y) {
            case 0:
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) obj;
                C6546d c6546d = ((AndroidComposeView) this.receiver).f32753B1;
                if (!c6546d.m7105j(interfaceC1426a)) {
                    c6546d.m7099c(interfaceC1426a);
                }
                return c17296c;
            case 1:
                int i10 = ((C13510b) obj).f42774a;
                AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
                Class cls = AndroidComposeView.f32748K1;
                androidComposeView.getClass();
                boolean zM15032E = false;
                if (!C13510b.m15026a(i10, 7) && !C13510b.m15026a(i10, 8)) {
                    Integer numM15037J = AbstractC13512d.m15037J(i10);
                    if (numM15037J == null) {
                        throw new IllegalStateException("Invalid focus direction");
                    }
                    int iIntValue = numM15037J.intValue();
                    C13801c c13801cM11349w = androidComposeView.m11349w();
                    Rect rectM15615D = c13801cM11349w != null ? AbstractC14334L.m15615D(c13801cM11349w) : null;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View viewFindNextFocus = rectM15615D == null ? focusFinder.findNextFocus(androidComposeView, androidComposeView.findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(androidComposeView, rectM15615D, iIntValue);
                    if (viewFindNextFocus != null) {
                        zM15032E = AbstractC13512d.m15032E(viewFindNextFocus, Integer.valueOf(iIntValue), rectM15615D);
                    }
                }
                return Boolean.valueOf(zM15032E);
            case 2:
                ((AbstractC0633q0) this.receiver).mo1150k((Throwable) obj);
                return c17296c;
            case 3:
                InterfaceC2548v0 p10 = (InterfaceC2548v0) obj;
                AbstractC16544l.m18094g(p10, "p0");
                ((VoiceModeViewModel) this.receiver).m14395k(p10);
                return c17296c;
            case 4:
                InterfaceC18159W p11 = (InterfaceC18159W) obj;
                AbstractC16544l.m18094g(p11, "p0");
                ((MessagesViewModel) this.receiver).m14395k(p11);
                return c17296c;
            case 5:
                InterfaceC18159W p12 = (InterfaceC18159W) obj;
                AbstractC16544l.m18094g(p12, "p0");
                ((MessagesViewModel) this.receiver).m14395k(p12);
                return c17296c;
            case 6:
                float fFloatValue = ((Number) obj).floatValue();
                C3196n c3196n = (C3196n) this.receiver;
                float f10 = 0.0f;
                if (!c3196n.m4043b()) {
                    C5994b0 c5994b0 = c3196n.f9643f;
                    float fM8915f = AbstractC8301I.m8915f(c5994b0.m6409g() + fFloatValue, 0.0f);
                    float fM6409g2 = fM8915f - c5994b0.m6409g();
                    c5994b0.m6410h(fM8915f);
                    float fM4042a = c3196n.m4042a();
                    C5994b0 c5994b1 = c3196n.f9644g;
                    if (fM4042a <= c5994b1.m6409g()) {
                        fM6409g = c3196n.m4042a();
                    } else {
                        float fAbs = Math.abs(c3196n.m4042a() / c5994b1.m6409g()) - 1.0f;
                        f10 = fAbs >= 0.0f ? fAbs : 0.0f;
                        if (f10 > 2.0f) {
                            f10 = 2.0f;
                        }
                        fM6409g = (c5994b1.m6409g() * (f10 - (((float) Math.pow(f10, 2)) / 4))) + c5994b1.m6409g();
                    }
                    c3196n.f9642e.m6410h(fM6409g);
                    f10 = fM6409g2;
                }
                return Float.valueOf(f10);
            case 7:
                InterfaceC18159W p13 = (InterfaceC18159W) obj;
                AbstractC16544l.m18094g(p13, "p0");
                ((MessagesViewModel) this.receiver).m14395k(p13);
                return c17296c;
            case 8:
                InterfaceC18159W p14 = (InterfaceC18159W) obj;
                AbstractC16544l.m18094g(p14, "p0");
                ((MessagesViewModel) this.receiver).m14395k(p14);
                return c17296c;
            case 9:
                C4337a p15 = (C4337a) obj;
                AbstractC16544l.m18094g(p15, "p0");
                ((AnonymousSettingsViewModel) this.receiver).m14395k(p15);
                return c17296c;
            case 10:
                InterfaceC2053b p16 = (InterfaceC2053b) obj;
                AbstractC16544l.m18094g(p16, "p0");
                ((BaseViewModel) this.receiver).m14395k(p16);
                return c17296c;
            case 11:
                EnumC21875k p17 = (EnumC21875k) obj;
                AbstractC16544l.m18094g(p17, "p0");
                return Boolean.valueOf(((C9566r) this.receiver).contains(p17));
            case 12:
                EnumC21875k p18 = (EnumC21875k) obj;
                AbstractC16544l.m18094g(p18, "p0");
                List list = (List) this.receiver;
                AbstractC16544l.m18094g(list, "<this>");
                if (list.contains(p18)) {
                    list.remove(p18);
                } else {
                    list.add(p18);
                }
                return c17296c;
            case 13:
                InterfaceC18159W p19 = (InterfaceC18159W) obj;
                AbstractC16544l.m18094g(p19, "p0");
                ((MessagesViewModel) this.receiver).m14395k(p19);
                return c17296c;
            case 14:
                InterfaceC6206j p20 = (InterfaceC6206j) obj;
                AbstractC16544l.m18094g(p20, "p0");
                ((CustomInstructionsEditViewModel) this.receiver).m14395k(p20);
                return c17296c;
            case 15:
                InterfaceC6217u p21 = (InterfaceC6217u) obj;
                AbstractC16544l.m18094g(p21, "p0");
                ((CustomInstructionsViewModel) this.receiver).m14395k(p21);
                return c17296c;
            case 16:
                return (C6272a) ((C6534s) this.receiver).m7093a(obj);
            case 17:
                AbstractC6529n abstractC6529n = (AbstractC6529n) this.receiver;
                C6538w c6538w = abstractC6529n.f21142a;
                int iIntValue2 = ((Number) c6538w.f21156a.m7093a(obj)).intValue();
                String str = (String) AbstractC17680n.m19344T(iIntValue2 - c6538w.f21157b, abstractC6529n.f21143b);
                if (str == null) {
                    return AbstractC9306j0.m9891j(c6538w.f21159d, " does not have a corresponding string representation", AbstractC10763a.m11057o(iIntValue2, "The value ", " of "));
                }
                return str;
            case 18:
                return ((C6534s) this.receiver).f21150Y.get(obj);
            case 19:
                return Boolean.valueOf(((InterfaceC6533r) this.receiver).test(obj));
            case 20:
                ((C6537v) this.receiver).getClass();
                return Boolean.TRUE;
            case 21:
                return (Integer) ((C6534s) this.receiver).m7093a(obj);
            case 22:
                return (Integer) ((C6534s) this.receiver).m7093a(obj);
            case 23:
                InterfaceC6721q p22 = (InterfaceC6721q) obj;
                AbstractC16544l.m18094g(p22, "p0");
                ((MemorySettingsViewModel) this.receiver).m14395k(p22);
                return c17296c;
            case 24:
                InterfaceC6699J p23 = (InterfaceC6699J) obj;
                AbstractC16544l.m18094g(p23, "p0");
                ((ViewMemoryViewModel) this.receiver).m14395k(p23);
                return c17296c;
            case 25:
                AbstractC21996d1 p24 = (AbstractC21996d1) obj;
                AbstractC16544l.m18094g(p24, "p0");
                C17570C c17570c = (C17570C) this.receiver;
                c17570c.getClass();
                C2153Q0 c2153q0 = c17570c.f56214a;
                c2153q0.getClass();
                c2153q0.m3251l(null, p24);
                return c17296c;
            case 26:
                InterfaceC7436U p25 = (InterfaceC7436U) obj;
                AbstractC16544l.m18094g(p25, "p0");
                ((SettingsViewModel) this.receiver).m14395k(p25);
                return c17296c;
            case 27:
                InterfaceC7436U p26 = (InterfaceC7436U) obj;
                AbstractC16544l.m18094g(p26, "p0");
                ((SettingsViewModel) this.receiver).m14395k(p26);
                return c17296c;
            case 28:
                InterfaceC7436U p27 = (InterfaceC7436U) obj;
                AbstractC16544l.m18094g(p27, "p0");
                ((SettingsViewModel) this.receiver).m14395k(p27);
                return c17296c;
            default:
                InterfaceC7436U p28 = (InterfaceC7436U) obj;
                AbstractC16544l.m18094g(p28, "p0");
                ((SettingsViewModel) this.receiver).m14395k(p28);
                return c17296c;
        }
    }
}
