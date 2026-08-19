package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.y1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12209y1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f37122a;

    /* JADX INFO: renamed from: b */
    public static final Class f37123b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12206x1 f37124c;

    /* JADX INFO: renamed from: d */
    public static final boolean f37125d;

    /* JADX INFO: renamed from: e */
    public static final boolean f37126e;

    /* JADX INFO: renamed from: f */
    public static final long f37127f;

    /* JADX INFO: renamed from: g */
    public static final long f37128g;

    /* JADX INFO: renamed from: h */
    public static final boolean f37129h;

    static {
        Unsafe unsafeM14190m = m14190m();
        f37122a = unsafeM14190m;
        f37123b = AbstractC12144d.f37025a;
        boolean zM14183f = m14183f(Long.TYPE);
        boolean zM14183f2 = m14183f(Integer.TYPE);
        AbstractC12206x1 c12203w1 = null;
        if (unsafeM14190m != null) {
            if (!AbstractC12144d.m13942a()) {
                c12203w1 = new C12203w1(unsafeM14190m);
            } else if (zM14183f) {
                c12203w1 = new C12200v1(unsafeM14190m, 1);
            } else if (zM14183f2) {
                c12203w1 = new C12200v1(unsafeM14190m, 0);
            }
        }
        f37124c = c12203w1;
        f37125d = c12203w1 == null ? false : c12203w1.mo14165u();
        f37126e = c12203w1 == null ? false : c12203w1.mo14166t();
        f37127f = m14180c(byte[].class);
        m14180c(boolean[].class);
        m14181d(boolean[].class);
        m14180c(int[].class);
        m14181d(int[].class);
        m14180c(long[].class);
        m14181d(long[].class);
        m14180c(float[].class);
        m14181d(float[].class);
        m14180c(double[].class);
        m14181d(double[].class);
        m14180c(Object[].class);
        m14181d(Object[].class);
        java.lang.reflect.Field fieldM14182e = m14182e();
        f37128g = (fieldM14182e == null || c12203w1 == null) ? -1L : c12203w1.m14174l(fieldM14182e);
        f37129h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m14178a(Throwable th2) {
        Logger.getLogger(AbstractC12209y1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    /* JADX INFO: renamed from: b */
    public static Object m14179b(Class cls) {
        try {
            return f37122a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m14180c(Class cls) {
        if (f37126e) {
            return f37124c.m14169a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m14181d(Class cls) {
        if (f37126e) {
            f37124c.m14170b(cls);
        }
    }

    /* JADX INFO: renamed from: e */
    public static java.lang.reflect.Field m14182e() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (AbstractC12144d.m13942a()) {
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
    /* JADX INFO: renamed from: f */
    public static boolean m14183f(Class cls) {
        if (!AbstractC12144d.m13942a()) {
            return false;
        }
        try {
            Class cls2 = f37123b;
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

    /* JADX INFO: renamed from: g */
    public static byte m14184g(long j10, byte[] bArr) {
        return f37124c.mo14158f(f37127f + j10, bArr);
    }

    /* JADX INFO: renamed from: h */
    public static byte m14185h(long j10, Object obj) {
        return (byte) ((f37124c.m14171i((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m14186i(long j10, Object obj) {
        return (byte) ((f37124c.m14171i((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static int m14187j(AbstractC12133Z abstractC12133Z, long j10) {
        return f37124c.m14171i(j10, abstractC12133Z);
    }

    /* JADX INFO: renamed from: k */
    public static long m14188k(AbstractC12133Z abstractC12133Z, long j10) {
        return f37124c.m14172j(j10, abstractC12133Z);
    }

    /* JADX INFO: renamed from: l */
    public static Object m14189l(AbstractC12133Z abstractC12133Z, long j10) {
        return f37124c.m14173k(j10, abstractC12133Z);
    }

    /* JADX INFO: renamed from: m */
    public static Unsafe m14190m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C12197u1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m14191n(Object obj, long j10, boolean z6) {
        f37124c.mo14161m(obj, j10, z6);
    }

    /* JADX INFO: renamed from: o */
    public static void m14192o(byte[] bArr, long j10, byte b) {
        f37124c.mo14162n(bArr, f37127f + j10, b);
    }

    /* JADX INFO: renamed from: p */
    public static void m14193p(Object obj, long j10, byte b) {
        long j11 = (-4) & j10;
        int iM14171i = f37124c.m14171i(j11, obj);
        int i10 = ((~((int) j10)) & 3) << 3;
        m14197t(j11, obj, ((255 & b) << i10) | (iM14171i & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: q */
    public static void m14194q(Object obj, long j10, byte b) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        m14197t(j11, obj, ((255 & b) << i10) | (f37124c.m14171i(j11, obj) & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: r */
    public static void m14195r(Object obj, long j10, double d10) {
        f37124c.mo14163o(obj, j10, d10);
    }

    /* JADX INFO: renamed from: s */
    public static void m14196s(Object obj, long j10, float f10) {
        f37124c.mo14164p(obj, j10, f10);
    }

    /* JADX INFO: renamed from: t */
    public static void m14197t(long j10, Object obj, int i10) {
        f37124c.m14175q(j10, obj, i10);
    }

    /* JADX INFO: renamed from: u */
    public static void m14198u(Object obj, long j10, long j11) {
        f37124c.m14176r(obj, j10, j11);
    }

    /* JADX INFO: renamed from: v */
    public static void m14199v(long j10, Object obj, Object obj2) {
        f37124c.m14177s(j10, obj, obj2);
    }
}
