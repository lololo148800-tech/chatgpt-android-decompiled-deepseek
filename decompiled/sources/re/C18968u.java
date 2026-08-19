package re;

import com.openai.chatgpt.R;
import com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModel;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC7966P5;
import p523V9.AbstractC7974Q5;
import p523V9.AbstractC8142m4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17781r0;

/* JADX INFO: renamed from: re.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C18968u extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f60522Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceEndedViewModel f60523Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18968u(VoiceEndedViewModel voiceEndedViewModel, int i10) {
        super(2);
        this.f60522Y = i10;
        this.f60523Z = voiceEndedViewModel;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f60522Y) {
            case 0:
                Set selectedOptions = (Set) obj;
                AbstractC16544l.m18094g(selectedOptions, "selectedOptions");
                this.f60523Z.m14395k(new C18959l((String) obj2, selectedOptions));
                break;
            default:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p, 0);
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    c6021p.m6524S(-1157484611);
                    VoiceEndedViewModel voiceEndedViewModel = this.f60523Z;
                    boolean zM6542f = c6021p.m6542f(voiceEndedViewModel);
                    Object objM6514H = c6021p.m6514H();
                    C5975S c5975s = C6013l.f19514a;
                    if (zM6542f || objM6514H == c5975s) {
                        objM6514H = new C18951d(voiceEndedViewModel, 5);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC18947B.m20276d((InterfaceC1426a) objM6514H, AbstractC7974Q5.m8276c(), AbstractC8142m4.m8676d(R.string.voice_snackbar_feedback_thumbs_up, c6021p), c6021p, 0);
                    c6021p.m6524S(-1157475075);
                    boolean zM6542f2 = c6021p.m6542f(voiceEndedViewModel);
                    Object objM6514H2 = c6021p.m6514H();
                    if (zM6542f2 || objM6514H2 == c5975s) {
                        objM6514H2 = new C18951d(voiceEndedViewModel, 6);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    AbstractC18947B.m20276d((InterfaceC1426a) objM6514H2, AbstractC7966P5.m8257e(), AbstractC8142m4.m8676d(R.string.voice_snackbar_feedback_thumbs_down, c6021p), c6021p, 0);
                    c6021p.m6553p(true);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
