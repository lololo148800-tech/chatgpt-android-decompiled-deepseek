package p082D2;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: D2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1857d {

    /* JADX INFO: renamed from: a */
    public static final String[] f5343a = new String[0];

    /* JADX INFO: renamed from: a */
    public static InputConnection m2737a(InputConnection inputConnection, EditorInfo editorInfo, InterfaceC1860g interfaceC1860g) {
        if (editorInfo == null) {
            throw new NullPointerException("editorInfo must be non-null");
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25) {
            return new C1858e(inputConnection, interfaceC1860g);
        }
        String[] strArr = f5343a;
        if (i10 >= 25) {
            String[] strArr2 = editorInfo.contentMimeTypes;
            if (strArr2 != null) {
                strArr = strArr2;
            }
        } else {
            Bundle bundle = editorInfo.extras;
            if (bundle != null) {
                String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                if (stringArray == null) {
                    stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                }
                if (stringArray != null) {
                    strArr = stringArray;
                }
            }
        }
        return strArr.length == 0 ? inputConnection : new C1859f(inputConnection, interfaceC1860g);
    }

    /* JADX INFO: renamed from: b */
    public static void m2738b(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* JADX INFO: renamed from: c */
    public static void m2739c(EditorInfo editorInfo, CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            AbstractC1855b.m2735a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i10 >= 30) {
            AbstractC1855b.m2735a(editorInfo, charSequence);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 : i11;
        if (i11 <= i12) {
            i11 = i12;
        }
        int length = charSequence.length();
        if (i13 < 0 || i11 > length) {
            m2740d(editorInfo, null, 0, 0);
            return;
        }
        int i14 = editorInfo.inputType & 4095;
        if (i14 == 129 || i14 == 225 || i14 == 18) {
            m2740d(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m2740d(editorInfo, charSequence, i13, i11);
            return;
        }
        int i15 = i11 - i13;
        int i16 = i15 > 1024 ? 0 : i15;
        int i17 = 2048 - i16;
        int iMin = Math.min(charSequence.length() - i11, i17 - Math.min(i13, (int) (((double) i17) * 0.8d)));
        int iMin2 = Math.min(i13, i17 - iMin);
        int i18 = i13 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i18))) {
            i18++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i11 + iMin) - 1))) {
            iMin--;
        }
        int i19 = iMin2 + i16;
        m2740d(editorInfo, i16 != i15 ? TextUtils.concat(charSequence.subSequence(i18, i18 + iMin2), charSequence.subSequence(i11, iMin + i11)) : charSequence.subSequence(i18, i19 + iMin + i18), iMin2, i19);
    }

    /* JADX INFO: renamed from: d */
    public static void m2740d(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }
}
