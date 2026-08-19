package p321Mk;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.C19738o;
import p1030u1.C20097d;
import p523V9.AbstractC8088f6;
import p544W9.AbstractC8489H3;
import p658b5.C11238i;
import p759g1.C13800b;

/* JADX INFO: renamed from: Mk.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C5468f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17858Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11238i f17859Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20097d f17860o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC0571F f17861p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5468f(C11238i c11238i, C20097d c20097d, InterfaceC0571F interfaceC0571F, int i10) {
        super(2);
        this.f17858Y = i10;
        this.f17859Z = c11238i;
        this.f17860o0 = c20097d;
        this.f17861p0 = interfaceC0571F;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17858Y) {
            case 0:
                C19738o change = (C19738o) obj;
                long j10 = ((C13800b) obj2).f43584a;
                AbstractC16544l.m18094g(change, "change");
                AbstractC8489H3.m9144b(this.f17859Z, change, j10, this.f17860o0, this.f17861p0);
                break;
            case 1:
                C19738o change2 = (C19738o) obj;
                float fFloatValue = ((Number) obj2).floatValue();
                AbstractC16544l.m18094g(change2, "change");
                AbstractC8489H3.m9144b(this.f17859Z, change2, AbstractC8088f6.m8536b(fFloatValue, 0.0f), this.f17860o0, this.f17861p0);
                break;
            default:
                C19738o change3 = (C19738o) obj;
                float fFloatValue2 = ((Number) obj2).floatValue();
                AbstractC16544l.m18094g(change3, "change");
                AbstractC8489H3.m9144b(this.f17859Z, change3, AbstractC8088f6.m8536b(0.0f, fFloatValue2), this.f17860o0, this.f17861p0);
                break;
        }
        return C17296C.f55119a;
    }
}
