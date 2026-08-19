package androidx.appcompat.view;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.view.f */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC10823f implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: c */
    public static final Class[] f32094c = {MenuItem.class};

    /* JADX INFO: renamed from: a */
    public Object f32095a;

    /* JADX INFO: renamed from: b */
    public Method f32096b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f32096b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f32095a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
