package p478Tc;

import com.openai.design.ForwardingDrawInfo;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6021p;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: Tc.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C7303g extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C7303g f23137Z = new C7303g(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C7303g f23138o0 = new C7303g(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23139Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7303g(int i10, int i11) {
        super(i10);
        this.f23139Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23139Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                }
                break;
            default:
                InterfaceC16039d interfaceC16039d = (InterfaceC16039d) obj;
                ForwardingDrawInfo info = (ForwardingDrawInfo) obj2;
                AbstractC16544l.m18094g(interfaceC16039d, "$this$null");
                AbstractC16544l.m18094g(info, "info");
                info.getPainter().m18904g(interfaceC16039d, interfaceC16039d.mo17602i(), info.f37241a, info.f37242b);
                break;
        }
        return C17296C.f55119a;
    }
}
