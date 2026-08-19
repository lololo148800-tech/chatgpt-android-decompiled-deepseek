package p1142z3;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: z3.A */
/* JADX INFO: loaded from: classes.dex */
public final class C21728A implements InterfaceC21740h {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC21740h f68926Y;

    /* JADX INFO: renamed from: Z */
    public long f68927Z;

    /* JADX INFO: renamed from: o0 */
    public Uri f68928o0;

    /* JADX INFO: renamed from: p0 */
    public Map f68929p0;

    public C21728A(InterfaceC21740h interfaceC21740h) {
        interfaceC21740h.getClass();
        this.f68926Y = interfaceC21740h;
        this.f68928o0 = Uri.EMPTY;
        this.f68929p0 = Collections.emptyMap();
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k c21743k) {
        this.f68928o0 = c21743k.f68974a;
        this.f68929p0 = Collections.emptyMap();
        InterfaceC21740h interfaceC21740h = this.f68926Y;
        long jMo926a = interfaceC21740h.mo926a(c21743k);
        Uri uri = interfaceC21740h.getUri();
        uri.getClass();
        this.f68928o0 = uri;
        this.f68929p0 = interfaceC21740h.mo929h();
        return jMo926a;
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: c */
    public final void mo927c(InterfaceC21730C interfaceC21730C) {
        interfaceC21730C.getClass();
        this.f68926Y.mo927c(interfaceC21730C);
    }

    @Override // p1142z3.InterfaceC21740h
    public final void close() {
        this.f68926Y.close();
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        return this.f68926Y.getUri();
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: h */
    public final Map mo929h() {
        return this.f68926Y.mo929h();
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f68926Y.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f68927Z += (long) i12;
        }
        return i12;
    }
}
