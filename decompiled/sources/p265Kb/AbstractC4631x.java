package p265Kb;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Kb.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4631x {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4631x f15080a;

    static {
        AbstractC4631x c4630w;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c4630w = new C4627t(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod.setAccessible(true);
                    c4630w = new C4629v(declaredMethod);
                }
            } catch (Exception unused2) {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod3.setAccessible(true);
                c4630w = new C4628u(iIntValue, declaredMethod3);
            }
        } catch (Exception unused3) {
            c4630w = new C4630w();
        }
        f15080a = c4630w;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo5373a(Class cls);
}
