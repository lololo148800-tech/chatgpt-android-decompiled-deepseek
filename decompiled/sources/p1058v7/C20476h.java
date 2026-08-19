package p1058v7;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import io.sentry.instrumentation.file.C15379d;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1020t7.InterfaceC19808f;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC8206u4;
import p544W9.AbstractC8746y3;
import p544W9.AbstractC8752z3;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p743f7.C13579e;
import p826j6.C16137F;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p911o0.AbstractC17792x;
import p943p7.C18304b;
import p984r8.C18887a;

/* JADX INFO: renamed from: v7.h */
/* JADX INFO: loaded from: classes.dex */
public final class C20476h implements InterfaceC19808f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11256c f64999a;

    public C20476h(InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f64999a = internalLogger;
    }

    /* JADX INFO: renamed from: c */
    public static void m21122c(File file, boolean z6, C13579e c13579e) {
        C15379d c15379dM9508c = AbstractC8752z3.m9508c(file, new FileOutputStream(file, z6), z6);
        try {
            FileLock fileLockLock = c15379dM9508c.getChannel().lock();
            AbstractC16544l.m18093f(fileLockLock, "outputStream.channel.lock()");
            try {
                byte[] bArr = c13579e.f42930b;
                byte[] bArr2 = c13579e.f42929a;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr2.length + 6 + bArr.length + 6);
                AbstractC16544l.m18093f(byteBufferAllocate, "allocate(metaBlockSize + dataBlockSize)");
                ByteBuffer byteBufferPut = byteBufferAllocate.putShort(AbstractC17792x.m19524g(2)).putInt(bArr.length).put(bArr);
                AbstractC16544l.m18093f(byteBufferPut, "this\n            .putSho…e)\n            .put(data)");
                ByteBuffer byteBufferPut2 = byteBufferPut.putShort(AbstractC17792x.m19524g(1)).putInt(bArr2.length).put(bArr2);
                AbstractC16544l.m18093f(byteBufferPut2, "this\n            .putSho…e)\n            .put(data)");
                c15379dM9508c.write(byteBufferPut2.array());
                fileLockLock.release();
                AbstractC7942M5.m8232a(c15379dM9508c, null);
            } catch (Throwable th2) {
                fileLockLock.release();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC7942M5.m8232a(c15379dM9508c, th3);
                throw th4;
            }
        }
    }

    @Override // p1020t7.InterfaceC19808f
    /* JADX INFO: renamed from: a */
    public final boolean mo20764a(File file, Object obj, boolean z6) {
        C13579e data = (C13579e) obj;
        EnumC11255b enumC11255b = EnumC11255b.f34100o0;
        EnumC11255b enumC11255b2 = EnumC11255b.f34099Z;
        AbstractC16544l.m18094g(file, "file");
        AbstractC16544l.m18094g(data, "data");
        try {
            m21122c(file, z6, data);
            return true;
        } catch (IOException e10) {
            AbstractC7889G0.m8185c(this.f64999a, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 20), e10, 48);
            return false;
        } catch (SecurityException e11) {
            AbstractC7889G0.m8185c(this.f64999a, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 21), e11, 48);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21123b(int i10, int i11, String str) {
        if (i10 == i11) {
            return true;
        }
        EnumC11255b enumC11255b = EnumC11255b.f34099Z;
        if (i11 != -1) {
            AbstractC7889G0.m8184b(this.f64999a, 5, enumC11255b, new C20473e(str, i10, i11), null, false, 56);
        } else {
            AbstractC7889G0.m8184b(this.f64999a, 5, enumC11255b, new C18887a(str, 4), null, false, 56);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final C16137F m21124d(BufferedInputStream bufferedInputStream, int i10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        int i11 = bufferedInputStream.read(byteBufferAllocate.array());
        Object obj = null;
        if (!m21123b(6, i11, AbstractC10763a.m11054l("Block(", AbstractC17792x.m19541x(i10), "): Header read"))) {
            return new C16137F(obj, Math.max(0, i11), 15);
        }
        short s10 = byteBufferAllocate.getShort();
        if (s10 != AbstractC17792x.m19524g(i10)) {
            AbstractC7889G0.m8184b(this.f64999a, 5, EnumC11255b.f34099Z, new C20474f(s10, i10), null, false, 56);
            return new C16137F(obj, i11, 15);
        }
        int i12 = byteBufferAllocate.getInt();
        byte[] bArr = new byte[i12];
        int i13 = bufferedInputStream.read(bArr);
        return m21123b(i12, i13, AbstractC10763a.m11054l("Block(", AbstractC17792x.m19541x(i10), "):Data read")) ? new C16137F(bArr, i11 + i13, 15) : new C16137F(obj, Math.max(0, i13) + i11, 15);
    }

    /* JADX INFO: renamed from: e */
    public final List m21125e(File file) {
        C17689w c17689w = C17689w.f56480Y;
        EnumC11255b enumC11255b = EnumC11255b.f34100o0;
        EnumC11255b enumC11255b2 = EnumC11255b.f34099Z;
        try {
            return m21126f(file);
        } catch (IOException e10) {
            AbstractC7889G0.m8185c(this.f64999a, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 18), e10, 48);
            return c17689w;
        } catch (SecurityException e11) {
            AbstractC7889G0.m8185c(this.f64999a, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), C20475g.f64998Y, e11, 48);
            return c17689w;
        }
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m21126f(File file) {
        int iM8825g = (int) AbstractC8206u4.m8825g(file, this.f64999a);
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(AbstractC8746y3.m9492c(file, new FileInputStream(file)), 8192);
        int i10 = iM8825g;
        while (i10 > 0) {
            try {
                C16137F c16137fM21124d = m21124d(bufferedInputStream, 2);
                int i11 = c16137fM21124d.f50063Z;
                byte[] bArr = (byte[]) c16137fM21124d.f50064o0;
                if (bArr != null) {
                    C16137F c16137fM21124d2 = m21124d(bufferedInputStream, 1);
                    i10 -= i11 + c16137fM21124d2.f50063Z;
                    byte[] bArr2 = (byte[]) c16137fM21124d2.f50064o0;
                    if (bArr2 == null) {
                        break;
                    }
                    arrayList.add(new C13579e(bArr2, bArr));
                } else {
                    i10 -= i11;
                    break;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC7942M5.m8232a(bufferedInputStream, th2);
                    throw th3;
                }
            }
        }
        AbstractC7942M5.m8232a(bufferedInputStream, null);
        if (i10 != 0 || (iM8825g > 0 && arrayList.isEmpty())) {
            AbstractC7889G0.m8185c(this.f64999a, 5, AbstractC17681o.m19382k(EnumC11255b.f34098Y, EnumC11255b.f34100o0), new C18304b(file, 19), null, 56);
        }
        return arrayList;
    }
}
