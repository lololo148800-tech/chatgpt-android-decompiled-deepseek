package p046Bk;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C11107p;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.ESignatureComponent;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p006A4.C0349j;
import p021Aj.ViewOnClickListenerC0529n;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p074Ck.C1716a;
import p1110xk.AbstractC21280c;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p437Rn.C6959q;
import p523V9.AbstractC8170q0;
import p594Y9.AbstractC9722E4;
import p647ak.C10711k;
import p647ak.C10713l;
import p665bk.C11480a;
import p665bk.C11483d;
import p769gj.C14183y;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.W */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC1357W implements View.OnClickListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3590Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f3591Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f3592o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f3593p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f3594q0;

    public /* synthetic */ ViewOnClickListenerC1357W(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f3590Y = i10;
        this.f3591Z = obj;
        this.f3592o0 = obj2;
        this.f3593p0 = obj3;
        this.f3594q0 = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String dialogText;
        Integer backgroundColorValue;
        Object obj = this.f3594q0;
        Object obj2 = this.f3593p0;
        Object obj3 = this.f3592o0;
        Object obj4 = this.f3591Z;
        int i10 = 0;
        switch (this.f3590Y) {
            case 0:
                C1375d0 this$0 = (C1375d0) obj4;
                AbstractC16544l.m18094g(this$0, "this$0");
                InterfaceC19201o2 component = (InterfaceC19201o2) obj3;
                AbstractC16544l.m18094g(component, "$component");
                C1407s0 rendering = (C1407s0) obj2;
                AbstractC16544l.m18094g(rendering, "$rendering");
                C14183y viewEnvironment = (C14183y) obj;
                AbstractC16544l.m18094g(viewEnvironment, "$viewEnvironment");
                C1716a c1716a = this$0.f3648a;
                Pi2NavigationBar pi2NavigationBar = c1716a.f4914i;
                pi2NavigationBar.getBackButton().setEnabled(false);
                pi2NavigationBar.setImportantForAccessibility(4);
                c1716a.f4917l.setImportantForAccessibility(4);
                ESignatureComponent eSignatureComponent = (ESignatureComponent) component;
                C0349j c0349j = new C0349j(this$0, 3, component);
                C1338M c1338m = this$0.f3651d;
                c1338m.getClass();
                if (!c1338m.f3535c) {
                    c1338m.f3535c = true;
                    StepStyles.UiStepStyle uiStepStyle = rendering.f3763n;
                    int iIntValue = (uiStepStyle == null || (backgroundColorValue = uiStepStyle.getBackgroundColorValue()) == null) ? -1 : backgroundColorValue.intValue();
                    BottomSheetBehavior bottomSheetBehaviorM13584v = BottomSheetBehavior.m13584v(c1338m.m2029a().f4926i);
                    AbstractC16544l.m18093f(bottomSheetBehaviorM13584v, "from(...)");
                    bottomSheetBehaviorM13584v.f36441c = true;
                    C1334K c1334k = new C1334K(c1338m, bottomSheetBehaviorM13584v, viewEnvironment, iIntValue);
                    ArrayList arrayList = bottomSheetBehaviorM13584v.f36434X;
                    if (!arrayList.contains(c1334k)) {
                        arrayList.add(c1334k);
                    }
                    c1338m.m2029a().f4920c.setOnClickListener(new ViewOnClickListenerC1330I(bottomSheetBehaviorM13584v, 0));
                    c1338m.m2029a().f4922e.setOnClickListener(new ViewOnClickListenerC1330I(bottomSheetBehaviorM13584v, 1));
                    c1338m.m2029a().f4919b.setOnClickListener(new ViewOnClickListenerC0529n(c1338m, 2));
                    c1338m.m2029a().f4921d.setOnClickListener(new ViewOnClickListenerC1332J(c1338m, i10, bottomSheetBehaviorM13584v));
                    ConstraintLayout constraintLayout = c1338m.m2029a().f4926i;
                    AbstractC21280c.m21621a(constraintLayout, uiStepStyle, constraintLayout);
                }
                c1338m.f3536d = c0349j;
                c1338m.m2029a().f4923f.m14584c();
                TextView textView = c1338m.m2029a().f4925h;
                UiComponentConfig.ESignature eSignature = eSignatureComponent.f40906Y;
                UiComponentConfig.ESignature.Attributes attributes = eSignature.getAttributes();
                textView.setText(attributes != null ? attributes.getDialogTitle() : null);
                TextView textView2 = c1338m.m2029a().f4924g;
                UiComponentConfig.ESignature.Attributes attributes2 = eSignature.getAttributes();
                if (attributes2 == null || (dialogText = attributes2.getDialogText()) == null) {
                    dialogText = "";
                }
                textView2.setText(dialogText);
                FrameLayout frameLayout = c1338m.m2029a().f4918a;
                AbstractC16544l.m18093f(frameLayout, "getRoot(...)");
                AbstractC9722E4.m10313a(new C1336L(c1338m, eSignatureComponent), frameLayout);
                break;
            default:
                C11480a c11480a = (C11480a) obj4;
                C11107p c11107p = (C11107p) obj3;
                C10713l this$1 = (C10713l) obj2;
                AbstractC16544l.m18094g(this$1, "this$0");
                AbstractC8170q0 abstractC8170q0 = (AbstractC8170q0) obj;
                c11480a.f34720b.setEnabled(false);
                C11483d c11483d = c11480a.f34727i.f40877G0;
                Pi2CircleMaskView pi2CircleMaskView = c11483d.f34741c;
                if (pi2CircleMaskView.getScaleX() == 5.0f && pi2CircleMaskView.getScaleY() == 5.0f) {
                    Pi2CircleMaskView.m14564a(c11483d.f34741c, new C6959q(c11107p, this$1, abstractC8170q0, 11), 1);
                } else {
                    C3516e c3516e = AbstractC0593T.f1824a;
                    AbstractC0575H.m1156D(c11107p, AbstractC2935m.f8797a, null, new C10711k(abstractC8170q0, this$1, null), 2);
                }
                break;
        }
    }
}
