package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.f0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11041f0 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f33293a;

    /* JADX INFO: renamed from: b */
    public static final Class f33294b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC11039e0 f33295c;

    /* JADX INFO: renamed from: d */
    public static final boolean f33296d;

    /* JADX INFO: renamed from: e */
    public static final boolean f33297e;

    /* JADX INFO: renamed from: f */
    public static final long f33298f;

    /* JADX INFO: renamed from: g */
    public static final boolean f33299g;

    static {
        Unsafe unsafeM12012i = m12012i();
        f33293a = unsafeM12012i;
        f33294b = AbstractC11034c.f33286a;
        boolean zM12011h = m12011h(Long.TYPE);
        boolean zM12011h2 = m12011h(Integer.TYPE);
        AbstractC11039e0 c11037d0 = null;
        if (unsafeM12012i != null) {
            if (!AbstractC11034c.m11982a()) {
                c11037d0 = new C11037d0(unsafeM12012i);
            } else if (zM12011h) {
                c11037d0 = new C11035c0(unsafeM12012i, 1);
            } else if (zM12011h2) {
                c11037d0 = new C11035c0(unsafeM12012i, 0);
            }
        }
        f33295c = c11037d0;
        f33296d = c11037d0 == null ? false : c11037d0.mo11990r();
        f33297e = c11037d0 == null ? false : c11037d0.mo11991q();
        f33298f = m12008e(byte[].class);
        m12008e(boolean[].class);
        m12009f(boolean[].class);
        m12008e(int[].class);
        m12009f(int[].class);
        m12008e(long[].class);
        m12009f(long[].class);
        m12008e(float[].class);
        m12009f(float[].class);
        m12008e(double[].class);
        m12009f(double[].class);
        m12008e(Object[].class);
        m12009f(Object[].class);
        Field fieldM12010g = m12010g();
        if (fieldM12010g != null && c11037d0 != null) {
            c11037d0.m11997i(fieldM12010g);
        }
        f33299g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m12004a(Throwable th2) {
        Logger.getLogger(AbstractC11041f0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12005b(long j10, Object obj) {
        return ((byte) ((f33295c.m11994f((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12006c(long j10, Object obj) {
        return ((byte) ((f33295c.m11994f((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: d */
    public static Object m12007d(Class cls) {
        try {
            return f33293a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m12008e(Class cls) {
        if (f33297e) {
            return f33295c.m11992a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static void m12009f(Class cls) {
        if (f33297e) {
            f33295c.m11993b(cls);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Field m12010g() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC11034c.m11982a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static boolean m12011h(Class cls) {
        if (!AbstractC11034c.m11982a()) {
            return false;
        }
        try {
            Class cls2 = f33294b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static Unsafe m12012i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C11033b0());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m12013j(byte[] bArr, long j10, byte b) {
        f33295c.mo11987k(bArr, f33298f + j10, b);
    }

    /* JADX INFO: renamed from: k */
    public static void m12014k(Object obj, long j10, byte b) {
        long j11 = (-4) & j10;
        int iM11994f = f33295c.m11994f(j11, obj);
        int i10 = ((~((int) j10)) & 3) << 3;
        m12016m(j11, obj, ((255 & b) << i10) | (iM11994f & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: l */
    public static void m12015l(Object obj, long j10, byte b) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        m12016m(j11, obj, ((255 & b) << i10) | (f33295c.m11994f(j11, obj) & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: m */
    public static void m12016m(long j10, Object obj, int i10) {
        f33295c.m11998n(j10, obj, i10);
    }

    /* JADX INFO: renamed from: n */
    public static void m12017n(Object obj, long j10, long j11) {
        f33295c.m11999o(obj, j10, j11);
    }

    /* JADX INFO: renamed from: o */
    public static void m12018o(long j10, Object obj, Object obj2) {
        f33295c.m12000p(j10, obj, obj2);
    }
}
