package p196Hi;

import com.openai.voice.assistant.AssistantViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Hi.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3433c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10452Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AssistantViewModel f10453Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3433c(AssistantViewModel assistantViewModel, int i10) {
        super(0);
        this.f10452Y = i10;
        this.f10453Z = assistantViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f10452Y) {
            case 0:
                this.f10453Z.m14395k(C3443m.f10471a);
                break;
            default:
                this.f10453Z.m14395k(C3441k.f10469a);
                break;
        }
        return C17296C.f55119a;
    }
}
