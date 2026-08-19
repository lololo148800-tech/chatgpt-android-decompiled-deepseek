package p247Jj;

import fk.C13684e;
import p248Jk.InterfaceC4473d;
import p720e6.C13287b;
import p791hj.C14522e;
import p814ik.C15033e;
import sj.C19661b;

/* JADX INFO: renamed from: Jj.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C4375C implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14243a;

    /* JADX INFO: renamed from: b */
    public final C4373B f14244b;

    public /* synthetic */ C4375C(C4373B c4373b, int i10) {
        this.f14243a = i10;
        this.f14244b = c4373b;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f14243a) {
            case 0:
                C14522e c14522e = new C14522e(C4373B.m5169a(this.f14244b.f14241b));
                c14522e.m16020m(100);
                return c14522e.m16016g();
            case 1:
                return new C13684e(C4373B.m5169a(this.f14244b.f14241b));
            case 2:
                return new C15033e(C4373B.m5169a(this.f14244b.f14241b));
            default:
                return new C19661b(C4373B.m5169a(this.f14244b.f14241b));
        }
    }

    public C4375C(C13287b c13287b, C4373B c4373b) {
        this.f14243a = 0;
        this.f14244b = c4373b;
    }
}
