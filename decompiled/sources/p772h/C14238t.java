package p772h;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: h.t */
/* JADX INFO: loaded from: classes.dex */
public final class C14238t extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public static final C14238t f44689Y = new C14238t(0);

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            return new C14240v(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return C14239u.f44690a;
        }
    }
}
