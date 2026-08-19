package p1159zo;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.AbstractC0668b;
import p026Ao.C0656E;
import p026Ao.C0658G;
import p026Ao.C0674h;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p026Ao.C0679m;
import p138F8.vJO.anhfj;
import p523V9.AbstractC7942M5;
import p544W9.AbstractC8718u;

/* JADX INFO: renamed from: zo.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C22224j implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final C0656E f70459Y;

    /* JADX INFO: renamed from: Z */
    public final Random f70460Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f70461o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f70462p0;

    /* JADX INFO: renamed from: q0 */
    public final long f70463q0;

    /* JADX INFO: renamed from: r0 */
    public final C0675i f70464r0;

    /* JADX INFO: renamed from: s0 */
    public final C0675i f70465s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f70466t0;

    /* JADX INFO: renamed from: u0 */
    public C22215a f70467u0;

    /* JADX INFO: renamed from: v0 */
    public final byte[] f70468v0;

    /* JADX INFO: renamed from: w0 */
    public final C0674h f70469w0;

    /* JADX INFO: renamed from: a */
    public final void m22417a(int i10, C0678l c0678l) throws IOException {
        if (this.f70466t0) {
            throw new IOException("closed");
        }
        int iMo1372d = c0678l.mo1372d();
        if (iMo1372d > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        C0675i c0675i = this.f70465s0;
        c0675i.m1436f1(i10 | 128);
        c0675i.m1436f1(iMo1372d | 128);
        byte[] bArr = this.f70468v0;
        AbstractC16544l.m18091d(bArr);
        this.f70460Z.nextBytes(bArr);
        c0675i.m1433d1(bArr);
        if (iMo1372d > 0) {
            long j10 = c0675i.f1970Z;
            c0675i.m1432c1(c0678l);
            C0674h c0674h = this.f70469w0;
            AbstractC16544l.m18091d(c0674h);
            c0675i.m1446r0(c0674h);
            c0674h.m1416e(j10);
            AbstractC8718u.m9437f(c0674h, bArr);
            c0674h.close();
        }
        this.f70459Y.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        C22215a c22215a = this.f70467u0;
        if (c22215a != null) {
            c22215a.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m22418e(int i10, C0678l c0678l) throws IOException {
        if (this.f70466t0) {
            throw new IOException("closed");
        }
        C0675i c0675i = this.f70464r0;
        c0675i.m1432c1(c0678l);
        int i11 = i10 | 128;
        if (this.f70461o0 && c0678l.mo1372d() >= this.f70463q0) {
            C22215a c22215a = this.f70467u0;
            if (c22215a == null) {
                c22215a = new C22215a(this.f70462p0, 0);
                this.f70467u0 = c22215a;
            }
            C0675i c0675i2 = c22215a.f70404o0;
            if (c0675i2.f1970Z != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (c22215a.f70403Z) {
                ((Deflater) c22215a.f70405p0).reset();
            }
            long j10 = c0675i.f1970Z;
            C0679m c0679m = (C0679m) c22215a.f70406q0;
            c0679m.mo1338n0(c0675i, j10);
            c0679m.flush();
            C0678l c0678l2 = AbstractC22216b.f70407a;
            if (c0675i2.mo1361p0(c0675i2.f1970Z - ((long) c0678l2.f1972Y.length), c0678l2)) {
                long j11 = c0675i2.f1970Z - ((long) 4);
                C0674h c0674hM1446r0 = c0675i2.m1446r0(AbstractC0668b.f1946a);
                try {
                    c0674hM1446r0.m1415a(j11);
                    AbstractC7942M5.m8232a(c0674hM1446r0, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(c0674hM1446r0, th2);
                        throw th3;
                    }
                }
            } else {
                c0675i2.m1436f1(0);
            }
            c0675i.mo1338n0(c0675i2, c0675i2.f1970Z);
            i11 = i10 | 192;
        }
        long j12 = c0675i.f1970Z;
        C0675i c0675i3 = this.f70465s0;
        c0675i3.m1436f1(i11);
        if (j12 <= 125) {
            c0675i3.m1436f1(((int) j12) | 128);
        } else if (j12 <= 65535) {
            c0675i3.m1436f1(254);
            c0675i3.m1441j1((int) j12);
        } else {
            c0675i3.m1436f1(255);
            C0658G c0658gM1431b1 = c0675i3.m1431b1(8);
            int i12 = c0658gM1431b1.f1926c;
            byte[] bArr = c0658gM1431b1.f1924a;
            bArr[i12] = (byte) ((j12 >>> 56) & 255);
            bArr[i12 + 1] = (byte) ((j12 >>> 48) & 255);
            bArr[i12 + 2] = (byte) ((j12 >>> 40) & 255);
            bArr[i12 + 3] = (byte) ((j12 >>> 32) & 255);
            bArr[i12 + 4] = (byte) ((j12 >>> 24) & 255);
            bArr[i12 + 5] = (byte) ((j12 >>> 16) & 255);
            bArr[i12 + 6] = (byte) ((j12 >>> 8) & 255);
            bArr[i12 + 7] = (byte) (j12 & 255);
            c0658gM1431b1.f1926c = i12 + 8;
            c0675i3.f1970Z += 8;
        }
        byte[] bArr2 = this.f70468v0;
        AbstractC16544l.m18091d(bArr2);
        this.f70460Z.nextBytes(bArr2);
        c0675i3.m1433d1(bArr2);
        if (j12 > 0) {
            C0674h c0674h = this.f70469w0;
            AbstractC16544l.m18091d(c0674h);
            c0675i.m1446r0(c0674h);
            c0674h.m1416e(0L);
            AbstractC8718u.m9437f(c0674h, bArr2);
            c0674h.close();
        }
        c0675i3.mo1338n0(c0675i, j12);
        C0656E c0656e = this.f70459Y;
        if (c0656e.f1920o0) {
            throw new IllegalStateException("closed");
        }
        C0675i c0675i4 = c0656e.f1919Z;
        long j13 = c0675i4.f1970Z;
        if (j13 > 0) {
            c0656e.f1918Y.mo1338n0(c0675i4, j13);
        }
    }

    public C22224j(C0656E c0656e, Random random, boolean z6, boolean z10, long j10) {
        AbstractC16544l.m18094g(c0656e, anhfj.oBzaYK);
        this.f70459Y = c0656e;
        this.f70460Z = random;
        this.f70461o0 = z6;
        this.f70462p0 = z10;
        this.f70463q0 = j10;
        this.f70464r0 = new C0675i();
        this.f70465s0 = c0656e.f1919Z;
        this.f70468v0 = new byte[4];
        this.f70469w0 = new C0674h();
    }
}
