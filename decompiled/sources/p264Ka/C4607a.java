package p264Ka;

import android.content.Context;
import android.content.res.TypedArray;
import com.openai.chatgpt.R;
import p523V9.AbstractC7972Q3;
import p523V9.AbstractC7979R3;
import p783ha.AbstractC14431a;
import p999s.C19329Y;

/* JADX INFO: renamed from: Ka.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4607a extends C19329Y {
    @Override // p999s.C19329Y, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (AbstractC7972Q3.m8264e(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i10, AbstractC14431a.f45389v);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iM8281e = -1;
            for (int i11 = 0; i11 < 2 && iM8281e < 0; i11++) {
                iM8281e = AbstractC7979R3.m8281e(context2, typedArrayObtainStyledAttributes, iArr[i11], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iM8281e >= 0) {
                setLineHeight(iM8281e);
            }
        }
    }
}
