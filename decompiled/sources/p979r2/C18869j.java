package p979r2;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: r2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C18869j extends C18868i {
    @Override // p979r2.C18868i
    /* JADX INFO: renamed from: q */
    public final Typeface mo20185q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f60104f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f60110l.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // p979r2.C18868i
    /* JADX INFO: renamed from: v */
    public final Method mo20189v(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
