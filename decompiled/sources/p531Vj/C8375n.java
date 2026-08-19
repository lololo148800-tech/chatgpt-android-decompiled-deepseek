package p531Vj;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p523V9.AbstractC8191s5;
import p729ej.InterfaceC13427r;
import p841k.AbstractC16283c;

/* JADX INFO: renamed from: Vj.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C8375n implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final AbstractC16283c f26075b;

    /* JADX INFO: renamed from: c */
    public final Context f26076c;

    public C8375n(AbstractC16283c resolvableApiLauncher, Context context) {
        AbstractC16544l.m18094g(resolvableApiLauncher, "resolvableApiLauncher");
        AbstractC16544l.m18094g(context, "context");
        this.f26075b = resolvableApiLauncher;
        this.f26076c = context;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r interfaceC13427r) {
        return AbstractC8191s5.m8780h(this, interfaceC13427r);
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C8374m(this, null));
    }
}
