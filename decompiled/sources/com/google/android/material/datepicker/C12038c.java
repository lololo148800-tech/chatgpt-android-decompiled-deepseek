package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.openai.chatgpt.R;
import p1061vb.C20513d;
import p523V9.AbstractC7972Q3;
import p523V9.AbstractC7979R3;
import p783ha.AbstractC14431a;

/* JADX INFO: renamed from: com.google.android.material.datepicker.c */
/* JADX INFO: loaded from: classes.dex */
public final class C12038c {

    /* JADX INFO: renamed from: a */
    public final C20513d f36559a;

    /* JADX INFO: renamed from: b */
    public final C20513d f36560b;

    public C12038c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC7972Q3.m8265f(R.attr.materialCalendarStyle, context, C12048m.class.getCanonicalName()).data, AbstractC14431a.f45382o);
        C20513d.m21167k(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        C20513d.m21167k(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        C20513d.m21167k(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        C20513d.m21167k(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListM8279c = AbstractC7979R3.m8279c(context, typedArrayObtainStyledAttributes, 6);
        this.f36559a = C20513d.m21167k(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        C20513d.m21167k(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.f36560b = C20513d.m21167k(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        new Paint().setColor(colorStateListM8279c.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
