package p056C2;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p239Ja.C4307j;
import p239Ja.C4309l;
import p544W9.AbstractC8473F;

/* JADX INFO: renamed from: C2.b */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC1508b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final C4307j f4024a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC1508b(C4307j c4307j) {
        this.f4024a = c4307j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC1508b) {
            return this.f4024a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC1508b) obj).f4024a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4024a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z6) {
        C4309l c4309l = (C4309l) this.f4024a.f13996Z;
        AutoCompleteTextView autoCompleteTextView = c4309l.f14002h;
        if (autoCompleteTextView == null || AbstractC8473F.m9107b(autoCompleteTextView)) {
            return;
        }
        int i10 = z6 ? 2 : 1;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        c4309l.f14045d.setImportantForAccessibility(i10);
    }
}
