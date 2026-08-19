package p531Vj;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p729ej.InterfaceC13427r;
import p841k.AbstractC16283c;

/* JADX INFO: renamed from: Vj.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C8339I implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final AbstractC16283c f25993b;

    /* JADX INFO: renamed from: c */
    public final Context f25994c;

    /* JADX INFO: renamed from: d */
    public final EnumC8334D f25995d;

    public C8339I(AbstractC16283c requestPermissionsLauncher, Context context, EnumC8334D enumC8334D) {
        AbstractC16544l.m18094g(requestPermissionsLauncher, "requestPermissionsLauncher");
        this.f25993b = requestPermissionsLauncher;
        this.f25994c = context;
        this.f25995d = enumC8334D;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        return (otherWorker instanceof C8339I) && ((C8339I) otherWorker).f25995d == this.f25995d;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C8338H(this, null));
    }
}
