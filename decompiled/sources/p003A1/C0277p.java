package p003A1;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p650ui.platform.AndroidComposeView;
import p030B2.C0747b;
import p056C2.C1512f;
import p1140z1.C21658D;
import p563X1.AbstractC9029i;

/* JADX INFO: renamed from: A1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0277p extends C0747b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AndroidComposeView f1004d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C21658D f1005e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AndroidComposeView f1006f;

    public C0277p(AndroidComposeView androidComposeView, C21658D c21658d, AndroidComposeView androidComposeView2) {
        this.f1004d = androidComposeView;
        this.f1005e = c21658d;
        this.f1006f = androidComposeView2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: d */
    public final void mo862d(View view, C1512f c1512f) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2118a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1512f.f4042a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        AndroidComposeView androidComposeView = this.f1004d;
        C0203S c0203s = androidComposeView.f32750A0;
        if (c0203s.m649y()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        C21658D c21658d = this.f1005e;
        C21658D c21658dM22009G = c21658d.m22009G();
        while (true) {
            if (c21658dM22009G == null) {
                c21658dM22009G = null;
                break;
            } else if (c21658dM22009G.f68638I0.m2020g(8)) {
                break;
            } else {
                c21658dM22009G = c21658dM22009G.m22009G();
            }
        }
        Integer numValueOf = c21658dM22009G != null ? Integer.valueOf(c21658dM22009G.f68651Z) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == androidComposeView.getSemanticsOwner().m3805a().f8892g) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        AndroidComposeView androidComposeView2 = this.f1006f;
        c1512f.f4043b = iIntValue;
        accessibilityNodeInfo.setParent(androidComposeView2, iIntValue);
        int i10 = c21658d.f68651Z;
        int iM14681e = c0203s.f754C.m14681e(i10);
        if (iM14681e != -1) {
            AbstractC9029i abstractC9029iM805p = AbstractC0240d0.m805p(androidComposeView.getAndroidViewsHandler$ui_release(), iM14681e);
            if (abstractC9029iM805p != null) {
                accessibilityNodeInfo.setTraversalBefore(abstractC9029iM805p);
            } else {
                accessibilityNodeInfo.setTraversalBefore(androidComposeView2, iM14681e);
            }
            AndroidComposeView.m11320a(androidComposeView, i10, accessibilityNodeInfo, c0203s.f756E);
        }
        int iM14681e2 = c0203s.f755D.m14681e(i10);
        if (iM14681e2 != -1) {
            AbstractC9029i abstractC9029iM805p2 = AbstractC0240d0.m805p(androidComposeView.getAndroidViewsHandler$ui_release(), iM14681e2);
            if (abstractC9029iM805p2 != null) {
                accessibilityNodeInfo.setTraversalAfter(abstractC9029iM805p2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(androidComposeView2, iM14681e2);
            }
            AndroidComposeView.m11320a(androidComposeView, i10, accessibilityNodeInfo, c0203s.f757F);
        }
    }
}
