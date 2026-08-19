package p189Ha;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.C12048m;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.openai.chatgpt.R;
import p030B2.C0747b;
import p056C2.C1512f;

/* JADX INFO: renamed from: Ha.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3271e extends C0747b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9947d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f9948e;

    public /* synthetic */ C3271e(Object obj, int i10) {
        this.f9947d = i10;
        this.f9948e = obj;
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: c */
    public void mo1590c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f9947d) {
            case 3:
                super.mo1590c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f9948e).f36659r0);
                break;
            default:
                super.mo1590c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: d */
    public final void mo862d(View view, C1512f c1512f) {
        int i10;
        Object obj = this.f9948e;
        View.AccessibilityDelegate accessibilityDelegate = this.f2118a;
        switch (this.f9947d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c1512f.f4042a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                c1512f.m2212a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c1512f.f4042a);
                C12048m c12048m = (C12048m) obj;
                c1512f.m2221k(c12048m.f36587s1.getVisibility() == 0 ? c12048m.m11743M().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : c12048m.m11743M().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1512f.f4042a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int i11 = MaterialButtonToggleGroup.f36484y0;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < materialButtonToggleGroup.getChildCount(); i13++) {
                        if (materialButtonToggleGroup.getChildAt(i13) == view) {
                            i10 = i12;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i13) instanceof MaterialButton) && materialButtonToggleGroup.m13610c(i13)) {
                                i12++;
                            }
                        }
                    }
                    i10 = -1;
                } else {
                    i10 = -1;
                }
                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i10, 1, false, ((MaterialButton) view).f36472C0));
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c1512f.f4042a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.f36660s0);
                accessibilityNodeInfo3.setChecked(checkableImageButton.f36659r0);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = c1512f.f4042a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).f36665L0);
                break;
        }
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: g */
    public boolean mo1593g(View view, int i10, Bundle bundle) {
        switch (this.f9947d) {
            case 0:
                if (i10 != 1048576) {
                    return super.mo1593g(view, i10, bundle);
                }
                ((C3277k) ((AbstractC3276j) this.f9948e)).m4150a(3);
                return true;
            default:
                return super.mo1593g(view, i10, bundle);
        }
    }
}
