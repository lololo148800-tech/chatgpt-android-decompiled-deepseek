package io.sentry;

import io.sentry.hints.InterfaceC15367f;
import io.sentry.hints.InterfaceC15368g;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8477F3;
import p544W9.AbstractC8483G3;
import p658b5.C11241l;

/* JADX INFO: renamed from: io.sentry.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C15457r extends AbstractC15403m {

    /* JADX INFO: renamed from: e */
    public final C15109B f48275e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC15151P f48276f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC15127H f48277g;

    public C15457r(C15109B c15109b, InterfaceC15151P interfaceC15151P, InterfaceC15127H interfaceC15127H, long j10, int i10) {
        super(c15109b, interfaceC15127H, j10, i10);
        AbstractC8483G3.m9133c(c15109b, "Hub is required.");
        this.f48275e = c15109b;
        AbstractC8483G3.m9133c(interfaceC15151P, "Serializer is required.");
        this.f48276f = interfaceC15151P;
        AbstractC8483G3.m9133c(interfaceC15127H, "Logger is required.");
        this.f48277g = interfaceC15127H;
    }

    /* JADX INFO: renamed from: c */
    public static void m16664c(C15457r c15457r, File file, InterfaceC15368g interfaceC15368g) {
        c15457r.getClass();
        boolean zMo16388a = interfaceC15368g.mo16388a();
        InterfaceC15127H interfaceC15127H = c15457r.f48277g;
        if (zMo16388a) {
            interfaceC15127H.mo16298o(EnumC15375i1.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                interfaceC15127H.mo16298o(EnumC15375i1.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th2) {
            interfaceC15127H.mo16296g(EnumC15375i1.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    @Override // io.sentry.AbstractC15403m
    /* JADX INFO: renamed from: a */
    public final boolean mo16650a(String str) {
        return str.endsWith(".envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        m16664c(r9, r10, (io.sentry.hints.InterfaceC15368g) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0116, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0138, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0159, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015d, code lost:
    
        return;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException
     */
    @Override // io.sentry.AbstractC15403m
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo16651b(File file, C15516w c15516w) {
        Object objM9088b;
        boolean zIsFile = file.isFile();
        InterfaceC15127H interfaceC15127H = this.f48277g;
        if (!zIsFile) {
            interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!file.getName().endsWith(".envelope")) {
            interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                interfaceC15127H.mo16298o(EnumC15375i1.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    C11241l c11241lMo16324d = this.f48276f.mo16324d(bufferedInputStream);
                    if (c11241lMo16324d == null) {
                        interfaceC15127H.mo16298o(EnumC15375i1.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                    } else {
                        this.f48275e.mo16237D(c11241lMo16324d, c15516w);
                    }
                    Object objM9088b2 = AbstractC8465D3.m9088b(c15516w);
                    if (!InterfaceC15367f.class.isInstance(AbstractC8465D3.m9088b(c15516w)) || objM9088b2 == null) {
                        AbstractC8477F3.m9114d(InterfaceC15367f.class, objM9088b2, interfaceC15127H);
                    } else if (!((InterfaceC15367f) objM9088b2).mo16391d()) {
                        interfaceC15127H.mo16298o(EnumC15375i1.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
                    }
                    bufferedInputStream.close();
                    objM9088b = AbstractC8465D3.m9088b(c15516w);
                    if (InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w))) {
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                interfaceC15127H.mo16296g(EnumC15375i1.ERROR, e10, "File '%s' cannot be found.", file.getAbsolutePath());
                objM9088b = AbstractC8465D3.m9088b(c15516w);
                if (InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w))) {
                }
                AbstractC8477F3.m9114d(InterfaceC15368g.class, objM9088b, interfaceC15127H);
            } catch (IOException e11) {
                interfaceC15127H.mo16296g(EnumC15375i1.ERROR, e11, "I/O on file '%s' failed.", file.getAbsolutePath());
                objM9088b = AbstractC8465D3.m9088b(c15516w);
                if (InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w))) {
                }
                AbstractC8477F3.m9114d(InterfaceC15368g.class, objM9088b, interfaceC15127H);
            } catch (Throwable th4) {
                interfaceC15127H.mo16296g(EnumC15375i1.ERROR, th4, "Failed to capture cached envelope %s", file.getAbsolutePath());
                Object objM9088b3 = AbstractC8465D3.m9088b(c15516w);
                if (!InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w)) || objM9088b3 == null) {
                    AbstractC8477F3.m9114d(InterfaceC15368g.class, objM9088b3, interfaceC15127H);
                } else {
                    ((InterfaceC15368g) objM9088b3).mo16390c(false);
                    interfaceC15127H.mo16296g(EnumC15375i1.INFO, th4, "File '%s' won't retry.", file.getAbsolutePath());
                }
                objM9088b = AbstractC8465D3.m9088b(c15516w);
                if (InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w))) {
                }
                AbstractC8477F3.m9114d(InterfaceC15368g.class, objM9088b, interfaceC15127H);
            }
            AbstractC8477F3.m9114d(InterfaceC15368g.class, objM9088b, interfaceC15127H);
        } catch (Throwable th5) {
            Object objM9088b4 = AbstractC8465D3.m9088b(c15516w);
            if (!InterfaceC15368g.class.isInstance(AbstractC8465D3.m9088b(c15516w)) || objM9088b4 == null) {
                AbstractC8477F3.m9114d(InterfaceC15368g.class, objM9088b4, interfaceC15127H);
            } else {
                m16664c(this, file, (InterfaceC15368g) objM9088b4);
            }
            throw th5;
        }
    }
}
