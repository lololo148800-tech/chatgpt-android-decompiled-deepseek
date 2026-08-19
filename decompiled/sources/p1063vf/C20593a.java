package p1063vf;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p005A3.C0318e;
import p1113xn.AbstractC21329w;
import p1142z3.C21742j;
import p1142z3.C21743k;
import p1142z3.InterfaceC21730C;
import p1142z3.InterfaceC21740h;

/* JADX INFO: renamed from: vf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20593a implements InterfaceC21740h {

    /* JADX INFO: renamed from: Y */
    public final C0318e f65349Y;

    /* JADX INFO: renamed from: Z */
    public final Map f65350Z;

    public C20593a(C0318e c0318e, Map map) {
        this.f65349Y = c0318e;
        this.f65350Z = map;
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k dataSpec) {
        AbstractC16544l.m18094g(dataSpec, "dataSpec");
        Uri uri = dataSpec.f68974a;
        boolean zM18089b = AbstractC16544l.m18089b(uri.getQueryParameter("noauth"), "true");
        C21742j c21742jM22240a = dataSpec.m22240a();
        c21742jM22240a.f68972i = dataSpec.f68982i & 4;
        if (zM18089b) {
            String string = uri.toString();
            AbstractC16544l.m18093f(string, "toString(...)");
            c21742jM22240a.f68964a = Uri.parse(AbstractC21329w.m21732s(string, "&noauth=true", ""));
        } else {
            c21742jM22240a.f68968e = this.f65350Z;
        }
        return this.f65349Y.mo926a(c21742jM22240a.m22239a());
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: c */
    public final void mo927c(InterfaceC21730C transferListener) {
        AbstractC16544l.m18094g(transferListener, "transferListener");
        this.f65349Y.mo927c(transferListener);
    }

    @Override // p1142z3.InterfaceC21740h
    public final void close() {
        this.f65349Y.close();
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        return this.f65349Y.f1108t0;
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: h */
    public final Map mo929h() {
        return Collections.emptyMap();
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] buffer, int i10, int i11) {
        AbstractC16544l.m18094g(buffer, "buffer");
        return this.f65349Y.read(buffer, i10, i11);
    }
}
