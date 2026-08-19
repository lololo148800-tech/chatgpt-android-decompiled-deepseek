package p406Qg;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Qg.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C6702M extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21533Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f21534Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6702M(Object obj, int i10) {
        super(1);
        this.f21533Y = i10;
        this.f21534Z = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f21533Y) {
            case 0:
                this.f21534Z.get(((Number) obj).intValue());
                return null;
            case 1:
                ?? r6 = this.f21534Z;
                int size = r6.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((InterfaceC1436k) r6.get(i10)).invoke(obj);
                }
                return C17296C.f55119a;
            case 2:
                return Boolean.valueOf(AbstractC16544l.m18089b(obj, this.f21534Z));
            case 3:
                ((Number) obj).intValue();
                return this.f21534Z;
            case 4:
                ((Number) obj).intValue();
                return this.f21534Z;
            default:
                ((Number) obj).intValue();
                return this.f21534Z;
        }
    }
}
