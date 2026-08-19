package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.openai.chatgpt.R;
import java.util.HashMap;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p1061vb.C20513d;
import p658b5.C11248s;
import p806ia.C14954d;
import p862l2.C16806e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: i */
    public HashMap f36838i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: r */
    public final void mo13690r(View view, View view2, boolean z6, boolean z10) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                this.f36838i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof C16806e) && (((C16806e) childAt.getLayoutParams()).f53917a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z11) {
                    if (z6) {
                        this.f36838i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                        childAt.setImportantForAccessibility(4);
                    } else {
                        HashMap map = this.f36838i;
                        if (map != null && map.containsKey(childAt)) {
                            int iIntValue = ((Integer) this.f36838i.get(childAt)).intValue();
                            WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                            childAt.setImportantForAccessibility(iIntValue);
                        }
                    }
                }
            }
            if (!z6) {
                this.f36838i = null;
            }
        }
        super.mo13690r(view, view2, z6, z10);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* JADX INFO: renamed from: y */
    public final C11248s mo13697y(Context context, boolean z6) {
        int i10 = z6 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        C11248s c11248s = new C11248s(9, false);
        c11248s.f34081Z = C14954d.m16117b(context, i10);
        c11248s.f34082o0 = new C20513d();
        return c11248s;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
