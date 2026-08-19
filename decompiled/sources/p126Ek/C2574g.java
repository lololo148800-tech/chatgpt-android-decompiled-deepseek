package p126Ek;

import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p225Im.InterfaceC3777y;
import p523V9.AbstractC8191s5;
import p729ej.InterfaceC13427r;

/* JADX INFO: renamed from: Ek.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C2574g implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8007b = 0;

    /* JADX INFO: renamed from: c */
    public final Object f8008c;

    /* JADX INFO: renamed from: d */
    public final Object f8009d;

    public C2574g(InterfaceC2568a service, String str) {
        AbstractC16544l.m18094g(service, "service");
        this.f8008c = service;
        this.f8009d = str;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r interfaceC13427r) {
        switch (this.f8007b) {
            case 0:
                break;
        }
        return AbstractC8191s5.m8780h(this, interfaceC13427r);
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        switch (this.f8007b) {
            case 0:
                return new C2219z0(new C2573f(this, null));
            default:
                return (InterfaceC2184i) this.f8009d;
        }
    }

    public String toString() {
        switch (this.f8007b) {
            case 1:
                return "TypedWorker(" + ((InterfaceC3777y) this.f8008c) + ')';
            default:
                return super.toString();
        }
    }

    public C2574g(InterfaceC3777y outputType, InterfaceC2184i work) {
        AbstractC16544l.m18094g(outputType, "outputType");
        AbstractC16544l.m18094g(work, "work");
        this.f8008c = outputType;
        this.f8009d = work;
    }
}
