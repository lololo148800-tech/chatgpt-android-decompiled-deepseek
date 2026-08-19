package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11066B {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC11070F f33354Y;

    /* JADX INFO: renamed from: Z */
    public boolean f33355Z;

    /* JADX INFO: renamed from: o0 */
    public int f33356o0 = -1;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC11067C f33357p0;

    public AbstractC11066B(AbstractC11067C abstractC11067C, InterfaceC11070F interfaceC11070F) {
        this.f33357p0 = abstractC11067C;
        this.f33354Y = interfaceC11070F;
    }

    /* JADX INFO: renamed from: a */
    public final void m12115a(boolean z6) {
        if (z6 == this.f33355Z) {
            return;
        }
        this.f33355Z = z6;
        int i10 = z6 ? 1 : -1;
        AbstractC11067C abstractC11067C = this.f33357p0;
        int i11 = abstractC11067C.f33361c;
        abstractC11067C.f33361c = i10 + i11;
        if (!abstractC11067C.f33362d) {
            abstractC11067C.f33362d = true;
            while (true) {
                try {
                    int i12 = abstractC11067C.f33361c;
                    if (i11 == i12) {
                        break;
                    }
                    boolean z10 = i11 == 0 && i12 > 0;
                    boolean z11 = i11 > 0 && i12 == 0;
                    if (z10) {
                        abstractC11067C.mo130g();
                    } else if (z11) {
                        abstractC11067C.mo131h();
                    }
                    i11 = i12;
                } catch (Throwable th2) {
                    abstractC11067C.f33362d = false;
                    throw th2;
                }
            }
            abstractC11067C.f33362d = false;
        }
        if (this.f33355Z) {
            abstractC11067C.m12118c(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo12110b() {
    }

    /* JADX INFO: renamed from: c */
    public boolean mo12111c(InterfaceC11112u interfaceC11112u) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo12112d();
}
