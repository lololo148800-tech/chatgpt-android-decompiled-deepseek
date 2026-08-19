package p1027tp;

import android.os.Build;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import p826j6.AbstractC16145N;

/* JADX INFO: renamed from: tp.I */
/* JADX INFO: loaded from: classes2.dex */
public class C20044I {

    /* JADX INFO: renamed from: c */
    public static final C20044I f63473c;

    /* JADX INFO: renamed from: a */
    public final boolean f63474a;

    /* JADX INFO: renamed from: b */
    public final Constructor f63475b;

    static {
        C20044I c20044i;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            c20044i = new C20043H(Build.VERSION.SDK_INT >= 24);
        } else {
            c20044i = new C20044I(true);
        }
        f63473c = c20044i;
    }

    public C20044I(boolean z6) {
        this.f63474a = z6;
        Constructor declaredConstructor = null;
        if (z6) {
            try {
                declaredConstructor = AbstractC16145N.m17729i().getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f63475b = declaredConstructor;
    }

    /* JADX INFO: renamed from: a */
    public Executor mo20859a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Object mo20860b(Method method, Class cls, Object obj, Object... objArr) {
        Constructor constructor = this.f63475b;
        return (constructor != null ? AbstractC16145N.m17735o(constructor.newInstance(cls, -1)) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
