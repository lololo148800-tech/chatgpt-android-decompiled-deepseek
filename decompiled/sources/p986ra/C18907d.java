package p986ra;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import p056C2.C1511e;
import p056C2.C1512f;
import p304M2.AbstractC5278a;

/* JADX INFO: renamed from: ra.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18907d extends AbstractC5278a {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Chip f60276q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18907d(Chip chip, Chip chip2) {
        super(chip2);
        this.f60276q = chip;
    }

    @Override // p304M2.AbstractC5278a
    /* JADX INFO: renamed from: l */
    public final void mo5800l(ArrayList arrayList) {
        boolean z6 = false;
        arrayList.add(0);
        Rect rect = Chip.f36527K0;
        Chip chip = this.f60276q;
        if (chip.m13619c()) {
            C18909f c18909f = chip.f36540s0;
            if (c18909f != null && c18909f.f60309W0) {
                z6 = true;
            }
            if (!z6 || chip.f36543v0 == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // p304M2.AbstractC5278a
    /* JADX INFO: renamed from: o */
    public final void mo5803o(int i10, C1512f c1512f) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1512f.f4042a;
        if (i10 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f36527K0);
            return;
        }
        Chip chip = this.f60276q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c1512f.m2213b(C1511e.f4025e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
