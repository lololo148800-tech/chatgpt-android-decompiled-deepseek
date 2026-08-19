package io.sentry.instrumentation.file;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: io.sentry.instrumentation.file.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15377b implements InterfaceC15376a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47956Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ byte[] f47957Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f47958o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f47959p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Closeable f47960q0;

    public /* synthetic */ C15377b(Closeable closeable, byte[] bArr, int i10, int i11, int i12) {
        this.f47956Y = i12;
        this.f47960q0 = closeable;
        this.f47957Z = bArr;
        this.f47958o0 = i10;
        this.f47959p0 = i11;
    }

    @Override // io.sentry.instrumentation.file.InterfaceC15376a
    public final Object call() throws IOException {
        switch (this.f47956Y) {
            case 0:
                return Integer.valueOf(((C15378c) this.f47960q0).f47961Y.read(this.f47957Z, this.f47958o0, this.f47959p0));
            default:
                FileOutputStream fileOutputStream = ((C15379d) this.f47960q0).f47963Y;
                byte[] bArr = this.f47957Z;
                int i10 = this.f47958o0;
                int i11 = this.f47959p0;
                fileOutputStream.write(bArr, i10, i11);
                return Integer.valueOf(i11);
        }
    }
}
