package p905nd;

import io.ktor.utils.p815io.InterfaceC15088n;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p201Hn.ExecutorC3515d;

/* JADX INFO: renamed from: nd.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C17598z extends InputStream {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ExecutorC3515d f56343Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC15088n f56344Z;

    public C17598z(ExecutorC3515d executorC3515d, InterfaceC15088n interfaceC15088n) {
        this.f56343Y = executorC3515d;
        this.f56344Z = interfaceC15088n;
    }

    @Override // java.io.InputStream
    public final int read() {
        return ((Number) AbstractC0575H.m1161I(this.f56343Y, new C17596x(this.f56344Z, null))).intValue();
    }

    @Override // java.io.InputStream
    public final int read(byte[] b, int i10, int i11) {
        AbstractC16544l.m18094g(b, "b");
        return ((Number) AbstractC0575H.m1161I(this.f56343Y, new C17597y(this.f56344Z, b, i10, i11, null))).intValue();
    }
}
