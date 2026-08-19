package p968qi;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p478Tc.AbstractC7313q;
import p492U1.C7540e;

/* JADX INFO: renamed from: qi.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C18732o extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59586Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f59587Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18732o(int i10, float f10) {
        super(1);
        this.f59586Y = i10;
        this.f59587Z = f10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        float length;
        if (((Number) obj).intValue() == 0) {
            length = (String.valueOf(this.f59586Y).length() * this.f59587Z) + AbstractC7313q.f23199d;
        } else {
            length = 164;
        }
        return new C7540e(length);
    }
}
