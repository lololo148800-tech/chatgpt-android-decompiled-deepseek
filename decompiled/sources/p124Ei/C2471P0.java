package p124Ei;

import com.openai.voice.VoiceModeViewModel;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p360Od.C6172d;
import p575Xd.C9460s;
import p575Xd.InterfaceC9461t;
import p759g1.C13800b;
import p855kj.AbstractC16428g;

/* JADX INFO: renamed from: Ei.P0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2471P0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7701Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceModeViewModel f7702Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2471P0(VoiceModeViewModel voiceModeViewModel, int i10) {
        super(1);
        this.f7701Y = i10;
        this.f7702Z = voiceModeViewModel;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f7701Y) {
            case 0:
                AbstractC16428g it = (AbstractC16428g) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f7702Z.m14395k(new C2507f0(it));
                break;
            case 1:
                C17309l action = (C17309l) obj;
                AbstractC16544l.m18094g(action, "action");
                C6172d c6172d = (C6172d) action.f55136Y;
                Object obj2 = action.f55137Z;
                C2477T c2477t = new C2477T(c6172d, (InterfaceC9461t) obj2);
                VoiceModeViewModel voiceModeViewModel = this.f7702Z;
                voiceModeViewModel.m14395k(c2477t);
                voiceModeViewModel.m14395k(new C2498c0(obj2 instanceof C9460s));
                break;
            case 2:
                long j10 = ((C13800b) obj).f43584a;
                this.f7702Z.m14395k(C2542s0.f7934a);
                break;
            default:
                C17309l action2 = (C17309l) obj;
                AbstractC16544l.m18094g(action2, "action");
                C2477T c2477t2 = new C2477T((C6172d) action2.f55136Y, (InterfaceC9461t) action2.f55137Z);
                VoiceModeViewModel voiceModeViewModel2 = this.f7702Z;
                voiceModeViewModel2.m14395k(c2477t2);
                voiceModeViewModel2.m14395k(new C2498c0(false));
                break;
        }
        return C17296C.f55119a;
    }
}
