package p994rk;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: rk.b2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19149b2 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ View f60859Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19145a2 f60860Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19149b2(View view, C19145a2 c19145a2) {
        super(0);
        this.f60859Y = view;
        this.f60860Z = c19145a2;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        View view = this.f60859Y;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int height = this.f60860Z.f60850Y.getHeight();
        if (height < 1) {
            height = 1;
        }
        layoutParams.height = height;
        view.setLayoutParams(layoutParams);
        return C17296C.f55119a;
    }
}
