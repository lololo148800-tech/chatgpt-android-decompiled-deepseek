package io.sentry.instrumentation.file;

import io.sentry.C15109B;
import io.sentry.C15524y1;
import io.sentry.InterfaceC15154Q;
import io.sentry.android.core.C15254r;
import io.sentry.util.AbstractC15500e;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p001A.C0076n;
import p071Ch.C1669I;
import p117Eb.C2391u;

/* JADX INFO: renamed from: io.sentry.instrumentation.file.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15378c extends FileInputStream {

    /* JADX INFO: renamed from: Y */
    public final FileInputStream f47961Y;

    /* JADX INFO: renamed from: Z */
    public final C1669I f47962Z;

    public C15378c(File file) {
        this(m16631a(file, null));
    }

    /* JADX INFO: renamed from: a */
    public static C2391u m16631a(File file, FileInputStream fileInputStream) {
        C15109B c15109b = C15109B.f47017a;
        InterfaceC15154Q interfaceC15154QMo16256y = AbstractC15500e.f48420a ? c15109b.mo16256y() : c15109b.mo16243e();
        InterfaceC15154Q interfaceC15154QMo16285p = interfaceC15154QMo16256y != null ? interfaceC15154QMo16256y.mo16285p("file.read") : null;
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new C2391u(file, interfaceC15154QMo16285p, fileInputStream, c15109b.mo16246j(), 16);
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47962Z.m2499b(this.f47961Y);
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f47962Z.m2502e(new C15254r(this, 4, atomicInteger));
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final long skip(long j10) {
        return ((Long) this.f47962Z.m2502e(new C0076n(j10, this))).longValue();
    }

    public C15378c(C2391u c2391u, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.f47962Z = new C1669I((InterfaceC15154Q) c2391u.f7430o0, (File) c2391u.f7429Z, (C15524y1) c2391u.f7432q0);
        this.f47961Y = (FileInputStream) c2391u.f7431p0;
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return ((Integer) this.f47962Z.m2502e(new C15254r(this, 3, bArr))).intValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C15378c(C2391u c2391u) throws FileNotFoundException {
        FileInputStream fileInputStream = (FileInputStream) c2391u.f7431p0;
        try {
            super(fileInputStream.getFD());
            this.f47962Z = new C1669I((InterfaceC15154Q) c2391u.f7430o0, (File) c2391u.f7429Z, (C15524y1) c2391u.f7432q0);
            this.f47961Y = fileInputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        return ((Integer) this.f47962Z.m2502e(new C15377b(this, bArr, i10, i11, 0))).intValue();
    }
}
