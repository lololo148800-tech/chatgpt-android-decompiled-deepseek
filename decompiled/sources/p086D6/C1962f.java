package p086D6;

import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.InterfaceC2184i;
import p162G6.InterfaceC3004a;
import p826j6.C16137F;
import p917o6.C17852e;
import p917o6.InterfaceC17838F;
import p917o6.InterfaceC17842J;
import p917o6.InterfaceC17846N;

/* JADX INFO: renamed from: D6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1962f implements InterfaceC1957a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3004a f5808a;

    public C1962f(InterfaceC3004a interfaceC3004a, InterfaceC3004a interfaceC3004a2) {
        this.f5808a = interfaceC3004a;
    }

    @Override // p086D6.InterfaceC1957a
    /* JADX INFO: renamed from: a */
    public final InterfaceC2184i mo3140a(C17852e request, C16137F c16137f) {
        AbstractC16544l.m18094g(request, "request");
        InterfaceC17842J interfaceC17842J = request.f56921a;
        boolean z6 = interfaceC17842J instanceof InterfaceC17846N;
        InterfaceC3004a interfaceC3004a = this.f5808a;
        if (z6) {
            return interfaceC3004a.mo954h(request);
        }
        if (interfaceC17842J instanceof InterfaceC17838F) {
            return interfaceC3004a.mo954h(request);
        }
        throw new IllegalStateException("");
    }
}
