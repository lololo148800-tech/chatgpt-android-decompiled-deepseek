package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import p370P0.C6277D;

/* JADX INFO: renamed from: com.google.protobuf.r */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12186r {

    /* JADX INFO: renamed from: a */
    public int f37094a;

    /* JADX INFO: renamed from: b */
    public C6277D f37095b;

    /* JADX INFO: renamed from: c */
    public static int m14084c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    /* JADX INFO: renamed from: d */
    public static long m14085d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    /* JADX INFO: renamed from: h */
    public static C12177o m14086h(byte[] bArr, int i10, int i11, boolean z6) {
        C12177o c12177o = new C12177o(bArr, i10, i11, z6);
        try {
            c12177o.mo14034k(i11);
            return c12177o;
        } catch (C12181p0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC12186r m14087i(InputStream inputStream) {
        if (inputStream != null) {
            return new C12180p(inputStream);
        }
        byte[] bArr = AbstractC12175n0.f37051b;
        return m14086h(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: renamed from: x */
    public static int m14088x(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw C12181p0.m14066g();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw C12181p0.m14066g();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw C12181p0.m14063d();
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo14015A();

    /* JADX INFO: renamed from: B */
    public abstract long mo14016B();

    /* JADX INFO: renamed from: C */
    public abstract String mo14017C();

    /* JADX INFO: renamed from: D */
    public abstract String mo14018D();

    /* JADX INFO: renamed from: E */
    public abstract int mo14019E();

    /* JADX INFO: renamed from: F */
    public abstract int mo14020F();

    /* JADX INFO: renamed from: G */
    public abstract long mo14021G();

    /* JADX INFO: renamed from: H */
    public abstract boolean mo14022H(int i10);

    /* JADX INFO: renamed from: a */
    public abstract void mo14029a(int i10);

    /* JADX INFO: renamed from: b */
    public final void m14089b() {
        if (this.f37094a >= 100) {
            throw new C12181p0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo14030e();

    /* JADX INFO: renamed from: f */
    public abstract int mo14031f();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo14032g();

    /* JADX INFO: renamed from: j */
    public abstract void mo14033j(int i10);

    /* JADX INFO: renamed from: k */
    public abstract int mo14034k(int i10);

    /* JADX INFO: renamed from: l */
    public abstract boolean mo14035l();

    /* JADX INFO: renamed from: m */
    public abstract C12168l mo14036m();

    /* JADX INFO: renamed from: n */
    public abstract double mo14037n();

    /* JADX INFO: renamed from: o */
    public abstract int mo14038o();

    /* JADX INFO: renamed from: p */
    public abstract int mo14039p();

    /* JADX INFO: renamed from: q */
    public abstract long mo14040q();

    /* JADX INFO: renamed from: r */
    public abstract float mo14041r();

    /* JADX INFO: renamed from: s */
    public abstract void mo14042s(int i10, InterfaceC12088F0 interfaceC12088F0, C12087F c12087f);

    /* JADX INFO: renamed from: t */
    public abstract int mo14043t();

    /* JADX INFO: renamed from: u */
    public abstract long mo14044u();

    /* JADX INFO: renamed from: v */
    public abstract void mo14045v(InterfaceC12088F0 interfaceC12088F0, C12087F c12087f);

    /* JADX INFO: renamed from: w */
    public abstract int mo14046w();

    /* JADX INFO: renamed from: y */
    public abstract int mo14047y();

    /* JADX INFO: renamed from: z */
    public abstract long mo14048z();
}
