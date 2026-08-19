package p521V6;

import com.auth0.android.result.Credentials;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17327D;
import mo.InterfaceC17338e;
import p009A7.FlM.nkFZpTrMPpn;
import p025An.C0624m;
import p402Qc.C6593i;
import p421R6.C6815a;
import p446S6.C7023b;
import p497U6.InterfaceC7569a;
import p571X9.AbstractC9233X;
import p974qo.C18792h;

/* JADX INFO: renamed from: V6.F */
/* JADX INFO: loaded from: classes.dex */
public final class C7803F implements InterfaceC7569a, InterfaceC17338e {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C0624m f24685Y;

    public /* synthetic */ C7803F(C0624m c0624m) {
        this.f24685Y = c0624m;
    }

    @Override // mo.InterfaceC17338e
    /* JADX INFO: renamed from: b */
    public void mo1006b(C18792h call, C17327D c17327d) {
        AbstractC16544l.m18094g(call, "call");
        this.f24685Y.m1251B(new C6593i(c17327d, 16), c17327d);
    }

    @Override // p497U6.InterfaceC7569a
    /* JADX INFO: renamed from: f */
    public void mo7759f(C6815a c6815a) {
        C7023b error = (C7023b) c6815a;
        AbstractC16544l.m18094g(error, "error");
        this.f24685Y.resumeWith(AbstractC9233X.m9806b(error));
    }

    @Override // mo.InterfaceC17338e
    /* JADX INFO: renamed from: h */
    public void mo1007h(C18792h call, IOException iOException) {
        AbstractC16544l.m18094g(call, "call");
        this.f24685Y.resumeWith(AbstractC9233X.m9806b(iOException));
    }

    @Override // p497U6.InterfaceC7569a
    public void onSuccess(Object obj) {
        Credentials credentials = (Credentials) obj;
        AbstractC16544l.m18094g(credentials, nkFZpTrMPpn.hfju);
        this.f24685Y.resumeWith(credentials);
    }
}
