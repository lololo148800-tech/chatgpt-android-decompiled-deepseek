package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import p926of.yRae.sVDIzpC;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10982r0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f33086a = Logger.getLogger(AbstractC10982r0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final Unsafe f33087b;

    /* JADX INFO: renamed from: c */
    public static final Class f33088c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC10980q0 f33089d;

    /* JADX INFO: renamed from: e */
    public static final boolean f33090e;

    /* JADX INFO: renamed from: f */
    public static final boolean f33091f;

    /* JADX INFO: renamed from: g */
    public static final long f33092g;

    /* JADX INFO: renamed from: h */
    public static final boolean f33093h;

    /* JADX WARN: Code duplicated, block: B:110:0x0269  */
    /* JADX WARN: Code duplicated, block: B:116:0x0279  */
    /* JADX WARN: Code duplicated, block: B:117:0x027b  */
    static {
        boolean z6;
        boolean z10;
        boolean z11;
        Field fieldM11695d;
        boolean z12;
        AbstractC10980q0 abstractC10980q0;
        boolean z13 = false;
        Unsafe unsafeM11703l = m11703l();
        f33087b = unsafeM11703l;
        f33088c = AbstractC10951c.f33018a;
        Class<?> cls = Long.TYPE;
        boolean zM11696e = m11696e(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean zM11696e2 = m11696e(cls2);
        AbstractC10980q0 c10978p0 = null;
        if (unsafeM11703l != null) {
            if (!AbstractC10951c.m11572a()) {
                c10978p0 = new C10978p0(unsafeM11703l);
            } else if (zM11696e) {
                c10978p0 = new C10976o0(unsafeM11703l, 1);
            } else if (zM11696e2) {
                c10978p0 = new C10976o0(unsafeM11703l, 0);
            }
        }
        f33089d = c10978p0;
        if (unsafeM11703l != null) {
            try {
                Class<?> cls3 = unsafeM11703l.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m11695d() != null) {
                    if (!AbstractC10951c.m11572a()) {
                        cls3.getMethod("getByte", cls);
                        cls3.getMethod("putByte", cls, Byte.TYPE);
                        cls3.getMethod("getInt", cls);
                        cls3.getMethod("putInt", cls, cls2);
                        cls3.getMethod("getLong", cls);
                        cls3.getMethod("putLong", cls, cls);
                        cls3.getMethod("copyMemory", cls, cls, cls);
                        cls3.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                    }
                    z13 = true;
                }
            } catch (Throwable th2) {
                f33086a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                z13 = false;
            }
        }
        f33090e = z13;
        Unsafe unsafe = f33087b;
        if (unsafe != null) {
            try {
                Class<?> cls4 = unsafe.getClass();
                boolean z14 = true;
                try {
                    Class<?>[] clsArr = new Class[1];
                    try {
                        clsArr[0] = Field.class;
                        cls4.getMethod("objectFieldOffset", clsArr);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        Class<?>[] clsArr2 = new Class[1];
                        try {
                            clsArr2[0] = Class.class;
                            cls4.getMethod("arrayIndexScale", clsArr2);
                            Class<?> cls5 = Long.TYPE;
                            Class<?>[] clsArr3 = new Class[2];
                            clsArr3[0] = Object.class;
                            z14 = true;
                            clsArr3[1] = cls5;
                            cls4.getMethod("getInt", clsArr3);
                            Class<?>[] clsArr4 = new Class[3];
                            clsArr4[0] = Object.class;
                            clsArr4[1] = cls5;
                            clsArr4[2] = Integer.TYPE;
                            cls4.getMethod("putInt", clsArr4);
                            Class<?>[] clsArr5 = new Class[2];
                            z6 = false;
                            try {
                                clsArr5[0] = Object.class;
                                z10 = true;
                                try {
                                    clsArr5[1] = cls5;
                                    cls4.getMethod("getLong", clsArr5);
                                    Class<?>[] clsArr6 = new Class[3];
                                    clsArr6[0] = Object.class;
                                    try {
                                        clsArr6[1] = cls5;
                                        clsArr6[2] = cls5;
                                        cls4.getMethod("putLong", clsArr6);
                                        Class<?>[] clsArr7 = new Class[2];
                                        boolean z15 = false;
                                        try {
                                            clsArr7[0] = Object.class;
                                            z10 = true;
                                            try {
                                                clsArr7[1] = cls5;
                                                cls4.getMethod("getObject", clsArr7);
                                                Class<?>[] clsArr8 = new Class[3];
                                                clsArr8[0] = Object.class;
                                                clsArr8[1] = cls5;
                                                clsArr8[2] = Object.class;
                                                cls4.getMethod("putObject", clsArr8);
                                                if (AbstractC10951c.m11572a()) {
                                                    z11 = true;
                                                } else {
                                                    Class<?>[] clsArr9 = new Class[2];
                                                    z15 = false;
                                                    clsArr9[0] = Object.class;
                                                    try {
                                                        clsArr9[1] = cls5;
                                                        cls4.getMethod("getByte", clsArr9);
                                                        Class<?>[] clsArr10 = new Class[3];
                                                        clsArr10[0] = Object.class;
                                                        try {
                                                            clsArr10[1] = cls5;
                                                            clsArr10[2] = Byte.TYPE;
                                                            cls4.getMethod("putByte", clsArr10);
                                                            Class<?>[] clsArr11 = new Class[2];
                                                            try {
                                                                clsArr11[0] = Object.class;
                                                                z10 = true;
                                                                try {
                                                                    clsArr11[1] = cls5;
                                                                    cls4.getMethod("getBoolean", clsArr11);
                                                                    Class<?>[] clsArr12 = new Class[3];
                                                                    clsArr12[0] = Object.class;
                                                                    clsArr12[1] = cls5;
                                                                    clsArr12[2] = Boolean.TYPE;
                                                                    cls4.getMethod("putBoolean", clsArr12);
                                                                    Class<?>[] clsArr13 = new Class[2];
                                                                    clsArr13[0] = Object.class;
                                                                    z10 = true;
                                                                    clsArr13[1] = cls5;
                                                                    cls4.getMethod("getFloat", clsArr13);
                                                                    Class<?>[] clsArr14 = new Class[3];
                                                                    clsArr14[0] = Object.class;
                                                                    clsArr14[1] = cls5;
                                                                    clsArr14[2] = Float.TYPE;
                                                                    cls4.getMethod("putFloat", clsArr14);
                                                                    String str = sVDIzpC.IaRVFMYXnbd;
                                                                    Class<?>[] clsArr15 = new Class[2];
                                                                    z6 = false;
                                                                    clsArr15[0] = Object.class;
                                                                    z10 = true;
                                                                    clsArr15[1] = cls5;
                                                                    cls4.getMethod(str, clsArr15);
                                                                    cls4.getMethod("putDouble", Object.class, cls5, Double.TYPE);
                                                                    z11 = true;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    z6 = false;
                                                                    f33086a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                                                                    z11 = z6;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                z6 = false;
                                                                z10 = true;
                                                                f33086a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                                                                z11 = z6;
                                                                f33091f = z11;
                                                                f33092g = m11693b(byte[].class);
                                                                m11693b(boolean[].class);
                                                                m11694c(boolean[].class);
                                                                m11693b(int[].class);
                                                                m11694c(int[].class);
                                                                m11693b(long[].class);
                                                                m11694c(long[].class);
                                                                m11693b(float[].class);
                                                                m11694c(float[].class);
                                                                m11693b(double[].class);
                                                                m11694c(double[].class);
                                                                m11693b(Object[].class);
                                                                m11694c(Object[].class);
                                                                fieldM11695d = m11695d();
                                                                if (fieldM11695d != null) {
                                                                    abstractC10980q0.m11688j(fieldM11695d);
                                                                }
                                                                if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                                                                    z12 = z10;
                                                                } else {
                                                                    z12 = z6;
                                                                }
                                                                f33093h = z12;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            z10 = true;
                                                            z6 = false;
                                                            f33086a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                                                            z11 = z6;
                                                            f33091f = z11;
                                                            f33092g = m11693b(byte[].class);
                                                            m11693b(boolean[].class);
                                                            m11694c(boolean[].class);
                                                            m11693b(int[].class);
                                                            m11694c(int[].class);
                                                            m11693b(long[].class);
                                                            m11694c(long[].class);
                                                            m11693b(float[].class);
                                                            m11694c(float[].class);
                                                            m11693b(double[].class);
                                                            m11694c(double[].class);
                                                            m11693b(Object[].class);
                                                            m11694c(Object[].class);
                                                            fieldM11695d = m11695d();
                                                            if (fieldM11695d != null) {
                                                                abstractC10980q0.m11688j(fieldM11695d);
                                                            }
                                                            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                                                                z12 = z10;
                                                            } else {
                                                                z12 = z6;
                                                            }
                                                            f33093h = z12;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        z10 = true;
                                                        z6 = z15;
                                                        f33086a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                                                        z11 = z6;
                                                        f33091f = z11;
                                                        f33092g = m11693b(byte[].class);
                                                        m11693b(boolean[].class);
                                                        m11694c(boolean[].class);
                                                        m11693b(int[].class);
                                                        m11694c(int[].class);
                                                        m11693b(long[].class);
                                                        m11694c(long[].class);
                                                        m11693b(float[].class);
                                                        m11694c(float[].class);
                                                        m11693b(double[].class);
                                                        m11694c(double[].class);
                                                        m11693b(Object[].class);
                                                        m11694c(Object[].class);
                                                        fieldM11695d = m11695d();
                                                        if (fieldM11695d != null) {
                                                            abstractC10980q0.m11688j(fieldM11695d);
                                                        }
                                                        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                                                            z12 = z10;
                                                        } else {
                                                            z12 = z6;
                                                        }
                                                        f33093h = z12;
                                                    }
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            z6 = z15;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            z6 = false;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        z6 = false;
                        z10 = z14;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    z10 = z14;
                }
            } catch (Throwable th15) {
                th = th15;
                z6 = false;
            }
            f33091f = z11;
            f33092g = m11693b(byte[].class);
            m11693b(boolean[].class);
            m11694c(boolean[].class);
            m11693b(int[].class);
            m11694c(int[].class);
            m11693b(long[].class);
            m11694c(long[].class);
            m11693b(float[].class);
            m11694c(float[].class);
            m11693b(double[].class);
            m11694c(double[].class);
            m11693b(Object[].class);
            m11694c(Object[].class);
            fieldM11695d = m11695d();
            if (fieldM11695d != null && (abstractC10980q0 = f33089d) != null) {
                abstractC10980q0.m11688j(fieldM11695d);
            }
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                z12 = z10;
            } else {
                z12 = z6;
            }
            f33093h = z12;
        }
        z11 = false;
        z6 = false;
        z10 = true;
        f33091f = z11;
        f33092g = m11693b(byte[].class);
        m11693b(boolean[].class);
        m11694c(boolean[].class);
        m11693b(int[].class);
        m11694c(int[].class);
        m11693b(long[].class);
        m11694c(long[].class);
        m11693b(float[].class);
        m11694c(float[].class);
        m11693b(double[].class);
        m11694c(double[].class);
        m11693b(Object[].class);
        m11694c(Object[].class);
        fieldM11695d = m11695d();
        if (fieldM11695d != null) {
            abstractC10980q0.m11688j(fieldM11695d);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z12 = z10;
        } else {
            z12 = z6;
        }
        f33093h = z12;
    }

    /* JADX INFO: renamed from: a */
    public static Object m11692a(Class cls) {
        try {
            return f33087b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m11693b(Class cls) {
        if (f33091f) {
            return f33089d.m11683a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static void m11694c(Class cls) {
        if (f33091f) {
            f33089d.m11684b(cls);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Field m11695d() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC10951c.m11572a()) {
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
    /* JADX INFO: renamed from: e */
    public static boolean m11696e(Class cls) {
        if (!AbstractC10951c.m11572a()) {
            return false;
        }
        try {
            Class cls2 = f33088c;
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

    /* JADX INFO: renamed from: f */
    public static byte m11697f(long j10, byte[] bArr) {
        return f33089d.mo11675d(f33092g + j10, bArr);
    }

    /* JADX INFO: renamed from: g */
    public static byte m11698g(long j10, Object obj) {
        return (byte) ((f33089d.m11685g((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: h */
    public static byte m11699h(long j10, Object obj) {
        return (byte) ((f33089d.m11685g((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static int m11700i(AbstractC10947a abstractC10947a, long j10) {
        return f33089d.m11685g(j10, abstractC10947a);
    }

    /* JADX INFO: renamed from: j */
    public static long m11701j(AbstractC10947a abstractC10947a, long j10) {
        return f33089d.m11686h(j10, abstractC10947a);
    }

    /* JADX INFO: renamed from: k */
    public static Object m11702k(long j10, Object obj) {
        return f33089d.m11687i(j10, obj);
    }

    /* JADX INFO: renamed from: l */
    public static Unsafe m11703l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C10974n0());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m11704m(byte[] bArr, long j10, byte b) {
        f33089d.mo11679l(bArr, f33092g + j10, b);
    }

    /* JADX INFO: renamed from: n */
    public static void m11705n(Object obj, long j10, byte b) {
        long j11 = (-4) & j10;
        int iM11685g = f33089d.m11685g(j11, obj);
        int i10 = ((~((int) j10)) & 3) << 3;
        m11707p(j11, obj, ((255 & b) << i10) | (iM11685g & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: o */
    public static void m11706o(Object obj, long j10, byte b) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        m11707p(j11, obj, ((255 & b) << i10) | (f33089d.m11685g(j11, obj) & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: p */
    public static void m11707p(long j10, Object obj, int i10) {
        f33089d.m11689o(j10, obj, i10);
    }

    /* JADX INFO: renamed from: q */
    public static void m11708q(Object obj, long j10, long j11) {
        f33089d.m11690p(obj, j10, j11);
    }

    /* JADX INFO: renamed from: r */
    public static void m11709r(long j10, Object obj, Object obj2) {
        f33089d.m11691q(j10, obj, obj2);
    }
}
