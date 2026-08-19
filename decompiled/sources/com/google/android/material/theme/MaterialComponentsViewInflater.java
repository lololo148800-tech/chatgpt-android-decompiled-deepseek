package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import p264Ka.C4607a;
import p287La.AbstractC4967a;
import p523V9.AbstractC7972Q3;
import p523V9.AbstractC7979R3;
import p783ha.AbstractC14431a;
import p893n.C17393y;
import p999s.C19329Y;
import p999s.C19364m;
import p999s.C19366n;
import p999s.C19368o;
import p999s.C19390z;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C17393y {
    @Override // p893n.C17393y
    /* JADX INFO: renamed from: a */
    public final C19364m mo13679a(Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // p893n.C17393y
    /* JADX INFO: renamed from: b */
    public final C19366n mo13680b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p893n.C17393y
    /* JADX INFO: renamed from: c */
    public final C19368o mo13681c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // p893n.C17393y
    /* JADX INFO: renamed from: d */
    public final C19390z mo13682d(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // p893n.C17393y
    /* JADX INFO: renamed from: e */
    public final C19329Y mo13683e(Context context, AttributeSet attributeSet) {
        C4607a c4607a = new C4607a(AbstractC4967a.m5610a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = c4607a.getContext();
        if (AbstractC7972Q3.m8264e(context2, com.openai.chatgpt.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC14431a.f45390w;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iM8281e = -1;
            for (int i10 = 0; i10 < 2 && iM8281e < 0; i10++) {
                iM8281e = AbstractC7979R3.m8281e(context2, typedArrayObtainStyledAttributes, iArr2[i10], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iM8281e == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC14431a.f45389v);
                    Context context3 = c4607a.getContext();
                    int[] iArr3 = {1, 2};
                    int iM8281e2 = -1;
                    for (int i11 = 0; i11 < 2 && iM8281e2 < 0; i11++) {
                        iM8281e2 = AbstractC7979R3.m8281e(context3, typedArrayObtainStyledAttributes3, iArr3[i11], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM8281e2 >= 0) {
                        c4607a.setLineHeight(iM8281e2);
                    }
                }
            }
        }
        return c4607a;
    }
}
