package p001A;

import p283L5.AbstractC4941g;
import p610Z1.C10142i;
import p610Z1.InterfaceC10143j;

/* JADX INFO: renamed from: A.p0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0081p0 implements InterfaceC10143j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C0087s0 f326Y;

    public /* synthetic */ C0081p0(C0087s0 c0087s0) {
        this.f326Y = c0087s0;
    }

    /* JADX INFO: renamed from: a */
    public void m267a() {
        C0087s0 c0087s0 = this.f326Y;
        synchronized (c0087s0.f339a) {
            try {
                if (c0087s0.f347i == 5) {
                    c0087s0.m288l(c0087s0.f344f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        String str;
        C0087s0 c0087s0 = this.f326Y;
        synchronized (c0087s0.f339a) {
            AbstractC4941g.m5559R("Release completer expected to be null", c0087s0.f349k == null);
            c0087s0.f349k = c10142i;
            str = "Release[session=" + c0087s0 + "]";
        }
        return str;
    }
}
