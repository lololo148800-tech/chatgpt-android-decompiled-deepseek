package p440S0;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: S0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6976b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22305Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Collection f22306Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6976b(int i10, Collection collection) {
        super(1);
        this.f22305Y = i10;
        this.f22306Z = collection;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f22305Y) {
            case 0:
                return Boolean.valueOf(this.f22306Z.contains(obj));
            case 1:
                return Boolean.valueOf(this.f22306Z.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f22306Z));
        }
    }
}
