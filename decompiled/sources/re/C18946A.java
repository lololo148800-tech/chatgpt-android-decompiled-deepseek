package re;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;

/* JADX INFO: renamed from: re.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C18946A extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ long f60494Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f60495Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18946A(long j10, int i10) {
        super(2);
        this.f60494Y = j10;
        this.f60495Z = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f60495Z | 1);
        AbstractC18947B.m20273a(this.f60494Y, (C6021p) obj, iM6447d0);
        return C17296C.f55119a;
    }
}
