package p994rk;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputConfirmationCodeComponent;
import hk.C14525c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p030B2.C0740V;
import p049Bm.InterfaceC1426a;
import p1091wn.AbstractC21031l;
import p1091wn.C21025f;
import p1110xk.AbstractC21293p;

/* JADX INFO: renamed from: rk.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19155d0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C14525c f60868Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InputConfirmationCodeComponent f60869Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19155d0(C14525c c14525c, InputConfirmationCodeComponent inputConfirmationCodeComponent) {
        super(0);
        this.f60868Y = c14525c;
        this.f60869Z = inputConfirmationCodeComponent;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f60868Y.f45777b;
        AbstractC16544l.m18093f(constraintLayout, "getRoot(...)");
        C21025f c21025f = new C21025f(AbstractC21031l.m21487k(new C0740V(constraintLayout, 0), C19151c0.f60861Z));
        while (c21025f.hasNext()) {
            TextInputLayout textInputLayout = (TextInputLayout) c21025f.next();
            UiComponentConfig.InputTextBasedComponentStyle styles = this.f60869Z.f40949Y.getStyles();
            if (styles != null) {
                AbstractC21293p.m21634c(textInputLayout, styles);
            }
        }
        return C17296C.f55119a;
    }
}
