package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.w1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12203w1 extends AbstractC12206x1 {
    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: c */
    public final void mo14155c(long j10, byte[] bArr, long j11) {
        this.f37120a.copyMemory((Object) null, j10, bArr, AbstractC12209y1.f37127f, j11);
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: d */
    public final boolean mo14156d(long j10, Object obj) {
        return this.f37120a.getBoolean(obj, j10);
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: e */
    public final byte mo14157e(long j10) {
        return this.f37120a.getByte(j10);
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: f */
    public final byte mo14158f(long j10, Object obj) {
        return this.f37120a.getByte(obj, j10);
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: g */
    public final double mo14159g(long j10, Object obj) {
        return this.f37120a.getDouble(obj, j10);
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: h */
    public final float mo14160h(long j10, Object obj) {
        return this.f37120a.getFloat(obj, j10);
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: m */
    public final void mo14161m(Object obj, long j10, boolean z6) {
        this.f37120a.putBoolean(obj, j10, z6);
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: n */
    public final void mo14162n(Object obj, long j10, byte b) {
        this.f37120a.putByte(obj, j10, b);
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: o */
    public final void mo14163o(Object obj, long j10, double d10) {
        this.f37120a.putDouble(obj, j10, d10);
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: p */
    public final void mo14164p(Object obj, long j10, float f10) {
        this.f37120a.putFloat(obj, j10, f10);
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: t */
    public final boolean mo14166t() {
        if (!super.mo14166t()) {
            return false;
        }
        try {
            Class<?> cls = this.f37120a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            AbstractC12209y1.m14178a(th2);
            return false;
        }
    }

    @Override // com.google.protobuf.AbstractC12206x1
    /* JADX INFO: renamed from: u */
    public final boolean mo14165u() {
        Unsafe unsafe = this.f37120a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC12209y1.m14182e() != null) {
                    try {
                        Class<?> cls3 = this.f37120a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        AbstractC12209y1.m14178a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                AbstractC12209y1.m14178a(th3);
            }
        }
        return false;
    }
}
