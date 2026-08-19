package p739f3;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p637a3.InterfaceC10496m;
import p776h3.C14398l;
import p776h3.C14404r;

/* JADX INFO: renamed from: f3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13531b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C13531b f42823Z = new C13531b(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13531b f42824o0 = new C13531b(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42825Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13531b(int i10, int i11) {
        super(i10);
        this.f42825Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42825Y) {
            case 0:
                InterfaceC10496m interfaceC10496m = (InterfaceC10496m) obj2;
                return interfaceC10496m instanceof C14404r ? interfaceC10496m : obj;
            default:
                InterfaceC10496m interfaceC10496m2 = (InterfaceC10496m) obj2;
                return interfaceC10496m2 instanceof C14398l ? interfaceC10496m2 : obj;
        }
    }
}
