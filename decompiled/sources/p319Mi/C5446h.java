package p319Mi;

import com.openai.voice.training.VoiceTrainingViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Mi.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C5446h extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17792Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceTrainingViewModel f17793Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5446h(VoiceTrainingViewModel voiceTrainingViewModel, int i10) {
        super(0);
        this.f17792Y = i10;
        this.f17793Z = voiceTrainingViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f17792Y) {
            case 0:
                this.f17793Z.m14395k(C5442d.f17788a);
                break;
            default:
                this.f17793Z.m14395k(C5441c.f17787a);
                break;
        }
        return C17296C.f55119a;
    }
}
