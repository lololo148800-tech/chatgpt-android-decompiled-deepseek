package p1139z0;

import p350O1.C6061j;
import p350O1.InterfaceC6060i;

/* JADX INFO: renamed from: z0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C21584G implements InterfaceC6060i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC6060i[] f68342a;

    public C21584G(InterfaceC6060i[] interfaceC6060iArr) {
        this.f68342a = interfaceC6060iArr;
    }

    @Override // p350O1.InterfaceC6060i
    /* JADX INFO: renamed from: a */
    public final void mo6611a(C6061j c6061j) {
        for (InterfaceC6060i interfaceC6060i : this.f68342a) {
            interfaceC6060i.mo6611a(c6061j);
        }
    }
}
