package io.sentry.instrumentation.file;

import io.sentry.C15109B;
import io.sentry.C15524y1;
import io.sentry.InterfaceC15154Q;
import io.sentry.android.core.C15254r;
import io.sentry.util.AbstractC15500e;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import p001A.C0041V;
import p071Ch.C1669I;
import p658b5.C11238i;

/* JADX INFO: renamed from: io.sentry.instrumentation.file.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C15379d extends FileOutputStream {

    /* JADX INFO: renamed from: Y */
    public final FileOutputStream f47963Y;

    /* JADX INFO: renamed from: Z */
    public final C1669I f47964Z;

    public C15379d(C11238i c11238i, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.f47964Z = new C1669I((InterfaceC15154Q) c11238i.f34009Z, (File) c11238i.f34008Y, (C15524y1) c11238i.f34011p0);
        this.f47963Y = (FileOutputStream) c11238i.f34010o0;
    }

    /* JADX INFO: renamed from: a */
    public static C11238i m16632a(File file, FileOutputStream fileOutputStream, boolean z6) {
        C15109B c15109b = C15109B.f47017a;
        InterfaceC15154Q interfaceC15154QMo16256y = AbstractC15500e.f48420a ? c15109b.mo16256y() : c15109b.mo16243e();
        InterfaceC15154Q interfaceC15154QMo16285p = interfaceC15154QMo16256y != null ? interfaceC15154QMo16256y.mo16285p("file.write") : null;
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, z6);
        }
        return new C11238i(file, interfaceC15154QMo16285p, fileOutputStream, c15109b.mo16246j());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47964Z.m2499b(this.f47963Y);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(int i10) {
        this.f47964Z.m2502e(new C0041V(this, i10, 4));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f47964Z.m2502e(new C15254r(this, 5, bArr));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        this.f47964Z.m2502e(new C15377b(this, bArr, i10, i11, 1));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C15379d(C11238i c11238i) throws FileNotFoundException {
        FileOutputStream fileOutputStream = (FileOutputStream) c11238i.f34010o0;
        try {
            super(fileOutputStream.getFD());
            this.f47964Z = new C1669I((InterfaceC15154Q) c11238i.f34009Z, (File) c11238i.f34008Y, (C15524y1) c11238i.f34011p0);
            this.f47963Y = fileOutputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }
}
