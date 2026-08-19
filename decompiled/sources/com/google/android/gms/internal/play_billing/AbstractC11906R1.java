package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.R1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11906R1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f36181a;

    /* JADX INFO: renamed from: b */
    public static final Class f36182b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC11904Q1 f36183c;

    /* JADX INFO: renamed from: d */
    public static final boolean f36184d;

    /* JADX INFO: renamed from: e */
    public static final boolean f36185e;

    /* JADX INFO: renamed from: f */
    public static final long f36186f;

    /* JADX INFO: renamed from: g */
    public static final boolean f36187g;

    /* JADX WARN: Code duplicated, block: B:11:0x004a  */
    /* JADX WARN: Code duplicated, block: B:4:0x001f  */
    /* JADX WARN: Code duplicated, block: B:50:0x017c A[PHI: r0
      0x017c: PHI (r0v42 java.lang.reflect.Field) = (r0v35 java.lang.reflect.Field), (r0v37 java.lang.reflect.Field) binds: [B:43:0x016a, B:49:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        AbstractC11904Q1 c11898o1;
        Field declaredField;
        boolean z6;
        boolean z10;
        Field declaredField2;
        Field field;
        AbstractC11904Q1 abstractC11904Q1;
        Unsafe unsafeM13333j = m13333j();
        f36181a = unsafeM13333j;
        int i10 = AbstractC11914U0.f36197a;
        f36182b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zM13342s = m13342s(cls);
        boolean zM13342s2 = m13342s(Integer.TYPE);
        if (unsafeM13333j == null) {
            c11898o1 = null;
        } else if (zM13342s) {
            c11898o1 = new C11901P1(unsafeM13333j);
        } else if (zM13342s2) {
            c11898o1 = new C11898O1(unsafeM13333j);
        } else {
            c11898o1 = null;
        }
        f36183c = c11898o1;
        if (c11898o1 == null) {
            z6 = false;
        } else {
            try {
                Class<?> cls2 = c11898o1.f36171a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                try {
                    declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                } catch (Throwable unused) {
                    declaredField = null;
                }
                if (declaredField == null) {
                    try {
                        declaredField = Buffer.class.getDeclaredField("address");
                    } catch (Throwable unused2) {
                        declaredField = null;
                    }
                    if (declaredField == null || declaredField.getType() != Long.TYPE) {
                        declaredField = null;
                    }
                }
                if (declaredField == null) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            } catch (Throwable th2) {
                Logger.getLogger(AbstractC11906R1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
        }
        f36184d = z6;
        AbstractC11904Q1 abstractC11904Q2 = f36183c;
        if (abstractC11904Q2 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = abstractC11904Q2.f36171a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class<?> cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z10 = true;
            } catch (Throwable th3) {
                Logger.getLogger(AbstractC11906R1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
                z10 = false;
            }
        }
        f36185e = z10;
        f36186f = m13344u(byte[].class);
        m13344u(boolean[].class);
        m13324a(boolean[].class);
        m13344u(int[].class);
        m13324a(int[].class);
        m13344u(long[].class);
        m13324a(long[].class);
        m13344u(float[].class);
        m13324a(float[].class);
        m13344u(double[].class);
        m13324a(double[].class);
        m13344u(Object[].class);
        m13324a(Object[].class);
        int i11 = AbstractC11914U0.f36197a;
        try {
            declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        if (declaredField2 == null) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused4) {
                declaredField2 = null;
            }
            if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
                field = null;
            } else {
                field = declaredField2;
            }
        } else {
            field = declaredField2;
        }
        if (field != null && (abstractC11904Q1 = f36183c) != null) {
            abstractC11904Q1.f36171a.objectFieldOffset(field);
        }
        f36187g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m13324a(Class cls) {
        if (f36185e) {
            f36183c.f36171a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m13325b(Object obj, long j10, byte b) {
        AbstractC11904Q1 abstractC11904Q1 = f36183c;
        long j11 = (-4) & j10;
        int i10 = abstractC11904Q1.f36171a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        abstractC11904Q1.f36171a.putInt(obj, j11, ((255 & b) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: renamed from: c */
    public static void m13326c(Object obj, long j10, byte b) {
        AbstractC11904Q1 abstractC11904Q1 = f36183c;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        abstractC11904Q1.f36171a.putInt(obj, j11, ((255 & b) << i10) | (abstractC11904Q1.f36171a.getInt(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: d */
    public static double m13327d(long j10, Object obj) {
        return f36183c.mo13314a(j10, obj);
    }

    /* JADX INFO: renamed from: e */
    public static float m13328e(long j10, Object obj) {
        return f36183c.mo13315b(j10, obj);
    }

    /* JADX INFO: renamed from: f */
    public static int m13329f(long j10, Object obj) {
        return f36183c.f36171a.getInt(obj, j10);
    }

    /* JADX INFO: renamed from: g */
    public static long m13330g(long j10, Object obj) {
        return f36183c.f36171a.getLong(obj, j10);
    }

    /* JADX INFO: renamed from: h */
    public static Object m13331h(Class cls) {
        try {
            return f36181a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Object m13332i(long j10, Object obj) {
        return f36183c.f36171a.getObject(obj, j10);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m13333j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C11895N1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m13334k(Object obj, long j10, boolean z6) {
        f36183c.mo13316c(obj, j10, z6);
    }

    /* JADX INFO: renamed from: l */
    public static void m13335l(Object obj, long j10, double d10) {
        f36183c.mo13318e(obj, j10, d10);
    }

    /* JADX INFO: renamed from: m */
    public static void m13336m(Object obj, long j10, float f10) {
        f36183c.mo13319f(obj, j10, f10);
    }

    /* JADX INFO: renamed from: n */
    public static void m13337n(long j10, Object obj, int i10) {
        f36183c.f36171a.putInt(obj, j10, i10);
    }

    /* JADX INFO: renamed from: o */
    public static void m13338o(Object obj, long j10, long j11) {
        f36183c.f36171a.putLong(obj, j10, j11);
    }

    /* JADX INFO: renamed from: p */
    public static void m13339p(long j10, Object obj, Object obj2) {
        f36183c.f36171a.putObject(obj, j10, obj2);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ boolean m13340q(long j10, Object obj) {
        return ((byte) ((f36183c.f36171a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ boolean m13341r(long j10, Object obj) {
        return ((byte) ((f36183c.f36171a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static boolean m13342s(Class cls) {
        int i10 = AbstractC11914U0.f36197a;
        try {
            Class cls2 = f36182b;
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

    /* JADX INFO: renamed from: t */
    public static boolean m13343t(long j10, Object obj) {
        return f36183c.mo13320g(j10, obj);
    }

    /* JADX INFO: renamed from: u */
    public static int m13344u(Class cls) {
        if (f36185e) {
            return f36183c.f36171a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
