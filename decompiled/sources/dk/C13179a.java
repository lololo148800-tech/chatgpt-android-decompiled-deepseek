package dk;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p647ak.C10678Y;
import p647ak.C10734v0;
import p729ej.C13430u;

/* JADX INFO: renamed from: dk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13179a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C13179a f41825Z = new C13179a(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13179a f41826o0 = new C13179a(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41827Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13179a(int i10, int i11) {
        super(i10);
        this.f41827Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f41827Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj2 = action.f42521b;
                C10678Y c10678y = obj2 instanceof C10678Y ? (C10678Y) obj2 : null;
                if (c10678y != null) {
                    action.f42521b = C10678Y.m11017l(c10678y, null, true, false, 123);
                }
                break;
            default:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                action2.m14964a(C10734v0.f31910a);
                break;
        }
        return C17296C.f55119a;
    }
}
