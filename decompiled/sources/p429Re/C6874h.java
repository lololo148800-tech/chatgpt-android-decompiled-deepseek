package p429Re;

import com.openai.feature.disclosure.DisclosureViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Re.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6874h extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22043Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ DisclosureViewModel f22044Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6874h(DisclosureViewModel disclosureViewModel, int i10) {
        super(0);
        this.f22043Y = i10;
        this.f22044Z = disclosureViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f22043Y) {
            case 0:
                this.f22044Z.m14395k(C6870d.f22039a);
                break;
            default:
                this.f22044Z.m14395k(C6871e.f22040a);
                break;
        }
        return C17296C.f55119a;
    }
}
