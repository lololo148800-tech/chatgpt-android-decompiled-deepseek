package p737f1;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: f1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C13516h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C13516h f42785Z = new C13516h(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13516h f42786o0 = new C13516h(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C13516h f42787p0 = new C13516h(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C13516h f42788q0 = new C13516h(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C13516h f42789r0 = new C13516h(1, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42790Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13516h(int i10, int i11) {
        super(i10);
        this.f42790Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f42790Y) {
            case 0:
                ((InterfaceC13517i) obj).mo15070c(false);
                return C17296C.f55119a;
            case 1:
                int i10 = ((C13510b) obj).f42774a;
                return C13522n.f42803b;
            case 2:
                int i11 = ((C13510b) obj).f42774a;
                return C13522n.f42803b;
            case 3:
                return Boolean.valueOf(AbstractC13512d.m15029B((C13526r) obj));
            default:
                return Boolean.valueOf(AbstractC13512d.m15029B((C13526r) obj));
        }
    }
}
