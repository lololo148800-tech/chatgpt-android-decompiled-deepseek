package p051Bo;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p026Ao.C0654C;
import p049Bm.InterfaceC1436k;
import p140Fa.C2685e;

/* JADX INFO: renamed from: Bo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C1460f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C1460f f3838Z = new C1460f(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C1460f f3839o0 = new C1460f(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3840Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1460f(int i10, int i11) {
        super(i10);
        this.f3840Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3840Y) {
            case 0:
                C1462h entry = (C1462h) obj;
                AbstractC16544l.m18094g(entry, "entry");
                C0654C c0654c = C1461g.f3841f;
                return Boolean.valueOf(C2685e.m3659e(entry.f3845a));
            default:
                C1462h it = (C1462h) obj;
                AbstractC16544l.m18094g(it, "it");
                return Boolean.TRUE;
        }
    }
}
