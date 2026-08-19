package p994rk;

import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.GovernmentIdNfcScanComponent;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21295r;

/* JADX INFO: renamed from: rk.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C19083G extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ TextView f60759Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ GovernmentIdNfcScanComponent f60760Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19083G(TextView textView, GovernmentIdNfcScanComponent governmentIdNfcScanComponent) {
        super(0);
        this.f60759Y = textView;
        this.f60760Z = governmentIdNfcScanComponent;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        TextBasedComponentStyle errorLabelStyle;
        TextView textView = this.f60759Y;
        textView.setVisibility(8);
        UiComponentConfig.GovernmentIdNfcScanStyles styles = this.f60760Z.f40910Y.getStyles();
        if (styles != null && (errorLabelStyle = styles.getErrorLabelStyle()) != null) {
            AbstractC21295r.m21637c(textView, errorLabelStyle);
        }
        return C17296C.f55119a;
    }
}
