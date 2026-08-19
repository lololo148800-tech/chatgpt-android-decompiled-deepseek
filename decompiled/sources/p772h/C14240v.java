package p772h;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: h.v */
/* JADX INFO: loaded from: classes.dex */
public final class C14240v extends AbstractC14237s {

    /* JADX INFO: renamed from: a */
    public final Field f44691a;

    /* JADX INFO: renamed from: b */
    public final Field f44692b;

    /* JADX INFO: renamed from: c */
    public final Field f44693c;

    public C14240v(Field field, Field field2, Field field3) {
        this.f44691a = field;
        this.f44692b = field2;
        this.f44693c = field3;
    }

    @Override // p772h.AbstractC14237s
    /* JADX INFO: renamed from: a */
    public final boolean mo15537a(InputMethodManager inputMethodManager) {
        try {
            this.f44693c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // p772h.AbstractC14237s
    /* JADX INFO: renamed from: b */
    public final Object mo15538b(InputMethodManager inputMethodManager) {
        try {
            return this.f44691a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // p772h.AbstractC14237s
    /* JADX INFO: renamed from: c */
    public final View mo15539c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f44692b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
