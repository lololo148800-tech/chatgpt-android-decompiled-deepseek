package p287La;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.C10820c;

/* JADX INFO: renamed from: La.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4967a {

    /* JADX INFO: renamed from: a */
    public static final int[] f16195a = {R.attr.theme, com.openai.chatgpt.R.attr.theme};

    /* JADX INFO: renamed from: b */
    public static final int[] f16196b = {com.openai.chatgpt.R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: a */
    public static Context m5610a(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16196b, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z6 = (context instanceof C10820c) && ((C10820c) context).f32081a == resourceId;
        if (resourceId == 0 || z6) {
            return context;
        }
        C10820c c10820c = new C10820c(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f16195a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c10820c.getTheme().applyStyle(resourceId2, true);
        }
        return c10820c;
    }
}
