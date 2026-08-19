package p708dh;

import androidx.work.impl.utils.p651oZ.HhJS;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p072Ci.C1705j;
import p072Ci.EnumC1702g;

/* JADX INFO: renamed from: dh.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C13137O extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41706Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ EnumC1702g f41707Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13137O(EnumC1702g enumC1702g, int i10) {
        super(1);
        this.f41706Y = i10;
        this.f41707Z = enumC1702g;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Bm.n, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v7, types: [Bm.n, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f41706Y) {
            case 0:
                C1705j c1705j = (C1705j) obj;
                AbstractC16544l.m18094g(c1705j, HhJS.xTOLegE);
                return (C1705j) this.f41707Z.f4865o0.invoke(c1705j, Boolean.TRUE);
            default:
                C1705j update = (C1705j) obj;
                AbstractC16544l.m18094g(update, "$this$update");
                return (C1705j) this.f41707Z.f4865o0.invoke(update, Boolean.TRUE);
        }
    }
}
