package mo;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;
import p026Ao.AbstractC0652A;
import p026Ao.C0665N;
import p026Ao.C0671e;
import p026Ao.C0678l;
import p026Ao.InterfaceC0676j;
import p523V9.AbstractC7942M5;
import p544W9.AbstractC8746y3;

/* JADX INFO: renamed from: mo.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C17359z extends AbstractC17325B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55385a;

    /* JADX INFO: renamed from: b */
    public final C17352s f55386b;

    /* JADX INFO: renamed from: c */
    public final Object f55387c;

    public /* synthetic */ C17359z(C17352s c17352s, Object obj, int i10) {
        this.f55385a = i10;
        this.f55386b = c17352s;
        this.f55387c = obj;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: a */
    public final long mo4142a() {
        switch (this.f55385a) {
            case 0:
                return ((File) this.f55387c).length();
            case 1:
                return ((C0678l) this.f55387c).mo1372d();
            default:
                return ((AbstractC17325B) this.f55387c).mo4142a();
        }
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: b */
    public final C17352s mo4143b() {
        switch (this.f55385a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f55386b;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: d */
    public final void mo4145d(InterfaceC0676j interfaceC0676j) {
        Object obj = this.f55387c;
        switch (this.f55385a) {
            case 0:
                File file = (File) obj;
                Logger logger = AbstractC0652A.f1907a;
                C0671e c0671e = new C0671e(AbstractC8746y3.m9492c(file, new FileInputStream(file)), C0665N.f1937d);
                try {
                    interfaceC0676j.mo1339u(c0671e);
                    AbstractC7942M5.m8232a(c0671e, null);
                    return;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(c0671e, th2);
                        throw th3;
                    }
                }
            case 1:
                interfaceC0676j.mo1332b0((C0678l) obj);
                return;
            default:
                ((AbstractC17325B) obj).mo4145d(interfaceC0676j);
                return;
        }
    }

    public C17359z(AbstractC17325B abstractC17325B, C17352s c17352s) {
        this.f55385a = 2;
        this.f55387c = abstractC17325B;
        this.f55386b = c17352s;
    }
}
