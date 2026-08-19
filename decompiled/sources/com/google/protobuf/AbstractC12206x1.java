package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.x1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12206x1 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f37120a;

    public AbstractC12206x1(Unsafe unsafe) {
        this.f37120a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m14169a(Class cls) {
        return this.f37120a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m14170b(Class cls) {
        return this.f37120a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo14155c(long j10, byte[] bArr, long j11);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo14156d(long j10, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract byte mo14157e(long j10);

    /* JADX INFO: renamed from: f */
    public abstract byte mo14158f(long j10, Object obj);

    /* JADX INFO: renamed from: g */
    public abstract double mo14159g(long j10, Object obj);

    /* JADX INFO: renamed from: h */
    public abstract float mo14160h(long j10, Object obj);

    /* JADX INFO: renamed from: i */
    public final int m14171i(long j10, Object obj) {
        return this.f37120a.getInt(obj, j10);
    }

    /* JADX INFO: renamed from: j */
    public final long m14172j(long j10, Object obj) {
        return this.f37120a.getLong(obj, j10);
    }

    /* JADX INFO: renamed from: k */
    public final Object m14173k(long j10, Object obj) {
        return this.f37120a.getObject(obj, j10);
    }

    /* JADX INFO: renamed from: l */
    public final long m14174l(java.lang.reflect.Field field) {
        return this.f37120a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo14161m(Object obj, long j10, boolean z6);

    /* JADX INFO: renamed from: n */
    public abstract void mo14162n(Object obj, long j10, byte b);

    /* JADX INFO: renamed from: o */
    public abstract void mo14163o(Object obj, long j10, double d10);

    /* JADX INFO: renamed from: p */
    public abstract void mo14164p(Object obj, long j10, float f10);

    /* JADX INFO: renamed from: q */
    public final void m14175q(long j10, Object obj, int i10) {
        this.f37120a.putInt(obj, j10, i10);
    }

    /* JADX INFO: renamed from: r */
    public final void m14176r(Object obj, long j10, long j11) {
        this.f37120a.putLong(obj, j10, j11);
    }

    /* JADX INFO: renamed from: s */
    public final void m14177s(long j10, Object obj, Object obj2) {
        this.f37120a.putObject(obj, j10, obj2);
    }

    /* JADX INFO: renamed from: t */
    public boolean mo14166t() {
        Unsafe unsafe = this.f37120a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            AbstractC12209y1.m14178a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: u */
    public abstract boolean mo14165u();
}
