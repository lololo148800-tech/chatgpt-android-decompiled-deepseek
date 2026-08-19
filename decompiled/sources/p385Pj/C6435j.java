package p385Pj;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0593T;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p523V9.AbstractC8191s5;
import p729ej.InterfaceC13427r;
import p841k.AbstractC16283c;

/* JADX INFO: renamed from: Pj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C6435j implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final AbstractC16283c f20894b;

    /* JADX INFO: renamed from: c */
    public final Context f20895c;

    public C6435j(AbstractC16283c openDocumentLauncher, Context context) {
        AbstractC16544l.m18094g(openDocumentLauncher, "openDocumentLauncher");
        this.f20894b = openDocumentLauncher;
        this.f20895c = context;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r interfaceC13427r) {
        return AbstractC8191s5.m8780h(this, interfaceC13427r);
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        C1970n c1970n = new C1970n(new C6430e(), 15, this);
        C3516e c3516e = AbstractC0593T.f1824a;
        return AbstractC2124C.m3224w(c1970n, ExecutorC3515d.f10633Z);
    }
}
