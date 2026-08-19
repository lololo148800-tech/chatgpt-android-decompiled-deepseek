package re;

import com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: re.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C18951d extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f60505Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceEndedViewModel f60506Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18951d(VoiceEndedViewModel voiceEndedViewModel, int i10) {
        super(0);
        this.f60505Y = i10;
        this.f60506Z = voiceEndedViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f60505Y) {
            case 0:
                this.f60506Z.m14395k(C18956i.f60510a);
                break;
            case 1:
                this.f60506Z.m14395k(new C18958k(false));
                break;
            case 2:
                this.f60506Z.m14395k(new C18958k(true));
                break;
            case 3:
                this.f60506Z.m14395k(C18956i.f60510a);
                break;
            case 4:
                this.f60506Z.m14395k(C18956i.f60510a);
                break;
            case 5:
                this.f60506Z.m14395k(C18961n.f60516a);
                break;
            default:
                this.f60506Z.m14395k(C18960m.f60515a);
                break;
        }
        return C17296C.f55119a;
    }
}
