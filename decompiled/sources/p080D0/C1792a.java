package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p523V9.AbstractC8088f6;

/* JADX INFO: renamed from: D0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1792a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5136Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1818n f5137Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1792a(InterfaceC1818n interfaceC1818n, int i10) {
        super(0);
        this.f5136Y = i10;
        this.f5137Z = interfaceC1818n;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f5136Y) {
            case 0:
                break;
        }
        return Boolean.valueOf(AbstractC8088f6.m8538d(this.f5137Z.mo2571a()));
    }
}
