package p946pc;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8088f6;
import p759g1.C13803e;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: pc.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C18329N extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ArrayList f58509Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ArrayList f58510Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f58511o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f58512p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18329N(ArrayList arrayList, ArrayList arrayList2, long j10, float f10) {
        super(1);
        this.f58509Y = arrayList;
        this.f58510Z = arrayList2;
        this.f58511o0 = j10;
        this.f58512p0 = f10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC16039d drawBehind = (InterfaceC16039d) obj;
        AbstractC16544l.m18094g(drawBehind, "$this$drawBehind");
        Iterator it = this.f58509Y.iterator();
        while (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            drawBehind.mo17607x0(this.f58511o0, AbstractC8088f6.m8536b(0.0f, fFloatValue), AbstractC8088f6.m8536b(C13803e.m15333e(drawBehind.mo17602i()), fFloatValue), this.f58512p0, (480 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
        }
        Iterator it2 = this.f58510Z.iterator();
        while (it2.hasNext()) {
            float fFloatValue2 = ((Number) it2.next()).floatValue();
            drawBehind.mo17607x0(this.f58511o0, AbstractC8088f6.m8536b(fFloatValue2, 0.0f), AbstractC8088f6.m8536b(fFloatValue2, C13803e.m15331c(drawBehind.mo17602i())), this.f58512p0, (480 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
        }
        return C17296C.f55119a;
    }
}
