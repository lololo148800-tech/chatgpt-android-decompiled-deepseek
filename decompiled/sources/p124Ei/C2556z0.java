package p124Ei;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1441p;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6021p;
import p467T1.C7199i;
import p736f0.C13489g;

/* JADX INFO: renamed from: Ei.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2556z0 extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ long f7979Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2556z0(long j10) {
        super(4);
        this.f7979Y = j10;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C13489g AnimatedContent = (C13489g) obj;
        String text = (String) obj2;
        C6021p c6021p = (C6021p) obj3;
        int iIntValue = ((Number) obj4).intValue();
        AbstractC16544l.m18094g(AnimatedContent, "$this$AnimatedContent");
        AbstractC16544l.m18094g(text, "text");
        C3582M c3582m = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k;
        AbstractC4124r4.m4768b(text, null, this.f7979Y, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, c3582m, c6021p, (iIntValue >> 3) & 14, 0, 65018);
        return C17296C.f55119a;
    }
}
