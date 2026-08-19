package p003A1;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p737f1.AbstractC13512d;
import p737f1.C13510b;
import p737f1.C13526r;

/* JADX INFO: renamed from: A1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0301x extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1074Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13510b f1075Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0301x(C13510b c13510b, int i10) {
        super(1);
        this.f1074Y = i10;
        this.f1075Z = c13510b;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f1074Y) {
            case 0:
                Boolean boolM15030C = AbstractC13512d.m15030C((C13526r) obj, this.f1075Z.f42774a);
                return Boolean.valueOf(boolM15030C != null ? boolM15030C.booleanValue() : true);
            default:
                Boolean boolM15030C2 = AbstractC13512d.m15030C((C13526r) obj, this.f1075Z.f42774a);
                return Boolean.valueOf(boolM15030C2 != null ? boolM15030C2.booleanValue() : true);
        }
    }
}
