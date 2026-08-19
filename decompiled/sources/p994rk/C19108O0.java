package p994rk;

import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21285h;
import uk.C20378h;

/* JADX INFO: renamed from: rk.O0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19108O0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19105N0 f60806Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20378h f60807Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19108O0(C19105N0 c19105n0, C20378h c20378h) {
        super(0);
        this.f60806Y = c19105n0;
        this.f60807Z = c20378h;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        UiComponentConfig.InputSelectComponentStyle styles = this.f60806Y.f60794Y.getStyles();
        if (styles != null) {
            TextInputLayout listSelector = this.f60807Z.f64446c;
            AbstractC16544l.m18093f(listSelector, "listSelector");
            AbstractC21285h.m21629a(listSelector, styles);
        }
        return C17296C.f55119a;
    }
}
