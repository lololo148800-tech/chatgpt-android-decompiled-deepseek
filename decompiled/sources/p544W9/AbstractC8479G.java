package p544W9;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.foundation.C10841h;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.WeakHashMap;
import p003A1.C0280q;
import p030B2.AbstractC0738T;
import p049Bm.InterfaceC1426a;
import p1139z0.C21585H;
import p349O0.C6013l;
import p349O0.C6021p;
import p594Y9.AbstractC9834X3;
import p635a1.AbstractC10443a;
import p635a1.InterfaceC10459q;
import p773h0.C14314v0;
import p773h0.C14322z0;

/* JADX INFO: renamed from: W9.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8479G {
    /* JADX INFO: renamed from: a */
    public static void m9120a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ImageView.ScaleType m9121b(int i10) {
        if (i10 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i10 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i10 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i10 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i10 != 5) {
            return i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10459q m9122c(InterfaceC10459q interfaceC10459q, C14322z0 c14322z0) {
        return AbstractC10443a.m10921b(interfaceC10459q, C0280q.f1030t0, new C10841h(c14322z0, false, null, true, false));
    }

    /* JADX INFO: renamed from: d */
    public static void m9123d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: e */
    public static final C14322z0 m9124e(C6021p c6021p) {
        int i10 = 0;
        Object[] objArr = new Object[0];
        C21585H c21585h = C14322z0.f44951i;
        boolean zM6538d = c6021p.m6538d(0);
        Object objM6514H = c6021p.m6514H();
        if (zM6538d || objM6514H == C6013l.f19514a) {
            objM6514H = new C14314v0(i10, 0);
            c6021p.m6537c0(objM6514H);
        }
        return (C14322z0) AbstractC9834X3.m10481d(objArr, c21585h, null, (InterfaceC1426a) objM6514H, c6021p, 0, 4);
    }

    /* JADX INFO: renamed from: f */
    public static void m9125f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z6 = onLongClickListener != null;
        boolean z10 = zHasOnClickListeners || z6;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z6);
        checkableImageButton.setImportantForAccessibility(z10 ? 1 : 2);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC10459q m9126g(InterfaceC10459q interfaceC10459q, C14322z0 c14322z0, int i10) {
        return AbstractC10443a.m10921b(interfaceC10459q, C0280q.f1030t0, new C10841h(c14322z0, false, null, (i10 & 2) != 0, true));
    }
}
