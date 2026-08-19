package p817j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.sun.misc.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C15532a {

    /* JADX INFO: renamed from: b */
    private static final C15532a f48508b;

    /* JADX INFO: renamed from: a */
    private final Unsafe f48509a;

    static {
        Field fieldM16754i = m16754i();
        fieldM16754i.setAccessible(true);
        try {
            f48508b = new C15532a((Unsafe) fieldM16754i.get(null));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("Couldn't get the Unsafe", e10);
        }
    }

    C15532a(Unsafe unsafe) {
        this.f48509a = unsafe;
    }

    /* JADX INFO: renamed from: i */
    private static Field m16754i() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e10) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public static C15532a m16753h() {
        return f48508b;
    }

    /* JADX INFO: renamed from: f */
    public final int m16760f(Object obj, long j10) {
        int intVolatile;
        do {
            intVolatile = this.f48509a.getIntVolatile(obj, j10);
        } while (!this.f48509a.compareAndSwapInt(obj, j10, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    /* JADX INFO: renamed from: k */
    public final long m16763k(Field field) {
        return this.f48509a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: j */
    public final long m16762j(Class cls, String str) {
        try {
            return m16763k(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Cannot find field:", e10);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m16755a(Class cls) {
        return this.f48509a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m16756b(Class cls) {
        return this.f48509a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: g */
    public final Object m16761g(Object obj, long j10) {
        return this.f48509a.getObjectVolatile(obj, j10);
    }

    /* JADX INFO: renamed from: l */
    public final void m16764l(Object obj, long j10, Object obj2) {
        this.f48509a.putObjectVolatile(obj, j10, obj2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16757c(Object obj, long j10, int i10, int i11) {
        return this.f48509a.compareAndSwapInt(obj, j10, i10, i11);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16758d(Object obj, long j10, long j11, long j12) {
        return this.f48509a.compareAndSwapLong(obj, j10, j11, j12);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m16759e(Object obj, long j10, Object obj2) {
        return AbstractC15529a.m16748l(this.f48509a, obj, j10, obj2);
    }
}
