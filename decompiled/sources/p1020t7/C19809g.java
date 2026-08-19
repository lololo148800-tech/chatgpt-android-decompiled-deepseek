package p1020t7;

import io.sentry.instrumentation.file.C15379d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.jvm.internal.AbstractC16544l;
import p1112xm.AbstractC21304h;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC7942M5;
import p544W9.AbstractC8752z3;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p909nm.AbstractC17681o;
import p943p7.C18304b;

/* JADX INFO: renamed from: t7.g */
/* JADX INFO: loaded from: classes.dex */
public final class C19809g implements InterfaceC19808f {

    /* JADX INFO: renamed from: b */
    public static final byte[] f62844b = new byte[0];

    /* JADX INFO: renamed from: a */
    public final InterfaceC11256c f62845a;

    public C19809g(InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f62845a = internalLogger;
    }

    /* JADX INFO: renamed from: b */
    public static void m20765b(File file, boolean z6, byte[] bArr) {
        C15379d c15379dM9508c = AbstractC8752z3.m9508c(file, new FileOutputStream(file, z6), z6);
        try {
            FileLock fileLockLock = c15379dM9508c.getChannel().lock();
            AbstractC16544l.m18093f(fileLockLock, "outputStream.channel.lock()");
            try {
                c15379dM9508c.write(bArr);
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
        byte[] data = (byte[]) obj;
        EnumC11255b enumC11255b = EnumC11255b.f34100o0;
        EnumC11255b enumC11255b2 = EnumC11255b.f34099Z;
        AbstractC16544l.m18094g(file, "file");
        AbstractC16544l.m18094g(data, "data");
        try {
            m20765b(file, z6, data);
            return true;
        } catch (IOException e10) {
            AbstractC7889G0.m8185c(this.f62845a, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 15), e10, 48);
            return false;
        } catch (SecurityException e11) {
            AbstractC7889G0.m8185c(this.f62845a, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 16), e11, 48);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m20766c(File file) {
        byte[] bArrM21644g = f62844b;
        EnumC11255b enumC11255b = EnumC11255b.f34100o0;
        EnumC11255b enumC11255b2 = EnumC11255b.f34099Z;
        try {
            if (!file.exists()) {
                AbstractC7889G0.m8185c(this.f62845a, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 11), null, 56);
            } else if (file.isDirectory()) {
                AbstractC7889G0.m8185c(this.f62845a, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 12), null, 56);
            } else {
                bArrM21644g = AbstractC21304h.m21644g(file);
            }
        } catch (IOException e10) {
            AbstractC7889G0.m8185c(this.f62845a, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 13), e10, 48);
        } catch (SecurityException e11) {
            AbstractC7889G0.m8185c(this.f62845a, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 14), e11, 48);
        }
        return bArrM21644g;
    }
}
