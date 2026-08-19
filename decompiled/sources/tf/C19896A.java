package tf;

import com.openai.feature.messages.image.ImageDetailViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: tf.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C19896A extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63042Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ImageDetailViewModel f63043Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19896A(ImageDetailViewModel imageDetailViewModel, int i10) {
        super(0);
        this.f63042Y = i10;
        this.f63043Z = imageDetailViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f63042Y) {
            case 0:
                this.f63043Z.m14395k(C19927l.f63184a);
                break;
            default:
                this.f63043Z.m14395k(C19932q.f63190a);
                break;
        }
        return C17296C.f55119a;
    }
}
