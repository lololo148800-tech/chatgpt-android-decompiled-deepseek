package p124Ei;

import com.openai.voice.VoiceModeViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p172Gi.EnumC3062D;

/* JADX INFO: renamed from: Ei.O0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2469O0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7696Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceModeViewModel f7697Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2469O0(VoiceModeViewModel voiceModeViewModel, int i10) {
        super(0);
        this.f7696Y = i10;
        this.f7697Z = voiceModeViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f7696Y) {
            case 0:
                this.f7697Z.m14395k(new C2472Q(EnumC3062D.Voice, null, 6));
                break;
            case 1:
                this.f7697Z.m14395k(new C2516i0(false));
                break;
            case 2:
                this.f7697Z.m14395k(new C2501d0(false));
                break;
            case 3:
                this.f7697Z.m14395k(new C2498c0(false));
                break;
            case 4:
                this.f7697Z.m14395k(C2485X.f7737a);
                break;
            case 5:
                this.f7697Z.m14395k(C2481V.f7730a);
                break;
            case 6:
                this.f7697Z.m14395k(new C2472Q(EnumC3062D.QuickTile, null, 6));
                break;
            case 7:
                this.f7697Z.m14395k(new C2501d0(false));
                break;
            default:
                this.f7697Z.m14395k(new C2498c0(false));
                break;
        }
        return C17296C.f55119a;
    }
}
