package za;

import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p033B5.C0842z;
import p783ha.AbstractC14431a;

/* JADX INFO: renamed from: za.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21828k {

    /* JADX INFO: renamed from: a */
    public static final int[] f69275a = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: b */
    public static final int[] f69276b = {R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: c */
    public static final C0842z f69277c = new C0842z(23);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f69278d = 0;

    /* JADX INFO: renamed from: a */
    public static void m22306a(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14431a.f45367H, i10, i11);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z6) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m22308c(context, f69276b, "Theme.MaterialComponents");
            }
        }
        m22308c(context, f69275a, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: b */
    public static void m22307b(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14431a.f45367H, i10, i11);
        boolean z6 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            int length = iArr2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z6 = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i12], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i12++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z6 = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z6) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m22308c(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AbstractC10763a.m11054l("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m22309d(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < materialToolbar.getChildCount(); i10++) {
            View childAt = materialToolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m22310e(View view) {
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        return view.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: f */
    public static TypedArray m22311f(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        m22306a(context, attributeSet, i10, i11);
        m22307b(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    /* JADX INFO: renamed from: g */
    public static PorterDuff.Mode m22312g(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
