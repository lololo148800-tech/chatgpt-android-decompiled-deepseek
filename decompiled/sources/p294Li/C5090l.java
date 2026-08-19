package p294Li;

import com.openai.voice.settings.VoiceModeSettingsViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Li.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C5090l extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16652Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceModeSettingsViewModel f16653Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5090l(VoiceModeSettingsViewModel voiceModeSettingsViewModel, int i10) {
        super(0);
        this.f16652Y = i10;
        this.f16653Z = voiceModeSettingsViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f16652Y) {
            case 0:
                this.f16653Z.m14395k(C5097s.f16668a);
                break;
            default:
                this.f16653Z.m14395k(C5095q.f16666a);
                break;
        }
        return C17296C.f55119a;
    }
}
