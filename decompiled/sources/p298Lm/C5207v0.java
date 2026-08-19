package p298Lm;

import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Lm.v0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5207v0 implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16920Y;

    /* JADX INFO: renamed from: Z */
    public final C5213y0 f16921Z;

    public /* synthetic */ C5207v0(C5213y0 c5213y0, int i10) {
        this.f16920Y = i10;
        this.f16921Z = c5213y0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f16920Y) {
            case 0:
                C5213y0 c5213y0 = this.f16921Z;
                return c5213y0.m5762d(c5213y0.f16935Y);
            default:
                C5135D0 c5135d0 = this.f16921Z.f16936Z;
                Type type = c5135d0 != null ? (Type) c5135d0.invoke() : null;
                AbstractC16544l.m18091d(type);
                return ReflectClassUtilKt.getParameterizedTypeArguments(type);
        }
    }
}
