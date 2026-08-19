package p1063vf;

import java.io.File;
import java.io.IOException;
import mm.C17296C;
import p005A3.C0334u;
import p049Bm.InterfaceC1436k;
import p1073w3.AbstractC20800b;
import p1112xm.AbstractC21304h;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vf.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C20609q extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20610r f65401Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ File f65402Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20609q(C20610r c20610r, File file, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f65401Y = c20610r;
        this.f65402Z = file;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C20609q(this.f65401Y, this.f65402Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C20609q c20609q = (C20609q) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        c20609q.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C0334u c0334u = this.f65401Y.f65403a;
        synchronized (c0334u) {
            try {
                if (!c0334u.f1162j) {
                    c0334u.f1157e.clear();
                    c0334u.m981t();
                    try {
                        try {
                            c0334u.f1155c.m66E();
                            C0334u.m973v(c0334u.f1153a);
                        } catch (IOException e10) {
                            AbstractC20800b.m21325m("SimpleCache", "Storing index file failed", e10);
                            C0334u.m973v(c0334u.f1153a);
                        }
                        c0334u.f1162j = true;
                    } catch (Throwable th2) {
                        C0334u.m973v(c0334u.f1153a);
                        c0334u.f1162j = true;
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        AbstractC21304h.m21640c(this.f65402Z);
        return C17296C.f55119a;
    }
}
