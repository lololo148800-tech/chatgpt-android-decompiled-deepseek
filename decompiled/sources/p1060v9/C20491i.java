package p1060v9;

import p1009s9.C19499b;
import p1022t9.InterfaceC19823h;
import p702da.C13049a;

/* JADX INFO: renamed from: v9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C20491i implements InterfaceC20484b {

    /* JADX INFO: renamed from: Z */
    public static C20491i f65066Z;

    /* JADX INFO: renamed from: o0 */
    public static final C20492j f65067o0 = new C20492j(0, 0, 0, false, false);

    /* JADX INFO: renamed from: Y */
    public Object f65068Y;

    public /* synthetic */ C20491i(Object obj) {
        this.f65068Y = obj;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C20491i m21138a() {
        try {
            if (f65066Z == null) {
                f65066Z = new C20491i();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f65066Z;
    }

    @Override // p1060v9.InterfaceC20484b
    /* JADX INFO: renamed from: d */
    public void mo211d(C19499b c19499b) {
        boolean z6 = c19499b.f61940Z == 0;
        C13049a c13049a = (C13049a) this.f65068Y;
        if (z6) {
            c13049a.mo13202f(null, c13049a.f36090w);
            return;
        }
        C20491i c20491i = c13049a.f36082o;
        if (c20491i != null) {
            ((InterfaceC19823h) c20491i.f65068Y).mo20772d(c19499b);
        }
    }
}
