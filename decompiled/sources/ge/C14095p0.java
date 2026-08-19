package ge;

import com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModel;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p172Gi.C3061C;
import re.C18956i;
import re.C18957j;
import re.C18970w;
import re.C18971x;
import re.InterfaceC18972y;

/* JADX INFO: renamed from: ge.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14095p0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44332Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceEndedViewModel f44333Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14095p0(VoiceEndedViewModel voiceEndedViewModel, int i10) {
        super(1);
        this.f44332Y = i10;
        this.f44333Z = voiceEndedViewModel;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f44332Y) {
            case 0:
                C3061C c3061c = (C3061C) obj;
                if (c3061c != null) {
                    this.f44333Z.m14395k(new C18957j(c3061c));
                }
                break;
            default:
                InterfaceC18972y effect = (InterfaceC18972y) obj;
                AbstractC16544l.m18094g(effect, "effect");
                boolean zEquals = effect.equals(C18970w.f60525a);
                C18956i c18956i = C18956i.f60510a;
                VoiceEndedViewModel voiceEndedViewModel = this.f44333Z;
                if (zEquals || effect.equals(C18971x.f60526a)) {
                    voiceEndedViewModel.m14395k(c18956i);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
