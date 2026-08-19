package p056C2;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import p960q9.C18655i;

/* JADX INFO: renamed from: C2.g */
/* JADX INFO: loaded from: classes.dex */
public class C1513g extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    public final C18655i f4045a;

    public C1513g(C18655i c18655i) {
        this.f4045a = c18655i;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        C1512f c1512fMo561j = this.f4045a.mo561j(i10);
        if (c1512fMo561j == null) {
            return null;
        }
        return c1512fMo561j.f4042a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i10) {
        this.f4045a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        C1512f c1512fMo562l = this.f4045a.mo562l(i10);
        if (c1512fMo562l == null) {
            return null;
        }
        return c1512fMo562l.f4042a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        return this.f4045a.mo563q(i10, i11, bundle);
    }
}
