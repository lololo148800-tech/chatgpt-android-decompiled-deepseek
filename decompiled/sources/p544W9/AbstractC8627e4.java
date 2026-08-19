package p544W9;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.C21307a;
import p523V9.AbstractC8112i6;
import p857kl.C16460h;

/* JADX INFO: renamed from: W9.e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8627e4 {

    /* JADX INFO: renamed from: a */
    public static Field f26462a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f26463b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f26464c = true;

    /* JADX INFO: renamed from: a */
    public static final Charset m9277a(C16460h c16460h) {
        AbstractC16544l.m18094g(c16460h, "<this>");
        String strM779m = c16460h.m779m("charset");
        if (strM779m == null) {
            return null;
        }
        try {
            Charset charset = C21307a.f67720a;
            Charset charsetForName = Charset.forName(strM779m);
            AbstractC16544l.m18093f(charsetForName, "forName(...)");
            return charsetForName;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C16460h m9278e(C16460h c16460h, Charset charset) {
        AbstractC16544l.m18094g(c16460h, "<this>");
        AbstractC16544l.m18094g(charset, "charset");
        String lowerCase = c16460h.f51066d.toLowerCase(Locale.ROOT);
        AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
        return !lowerCase.equals("text") ? c16460h : c16460h.m18037q("charset", AbstractC8112i6.m8606d(charset));
    }

    /* JADX INFO: renamed from: b */
    public float mo6076b(View view) {
        if (f26464c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f26464c = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: c */
    public void mo6077c(View view, float f10) {
        if (f26464c) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f26464c = false;
            }
        }
        view.setAlpha(f10);
    }

    /* JADX INFO: renamed from: d */
    public void mo6072d(View view, int i10) {
        if (!f26463b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f26462a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f26463b = true;
        }
        Field field = f26462a;
        if (field != null) {
            try {
                f26462a.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
