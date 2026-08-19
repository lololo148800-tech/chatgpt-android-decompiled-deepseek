package p660b6;

import java.util.List;
import p228J.AbstractC3812N;
import p591Y5.AbstractC9653d;
import p591Y5.C9654e;
import p591Y5.C9657h;
import p591Y5.C9661l;

/* JADX INFO: renamed from: b6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11249a extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f34083o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11249a(int i10, List list) {
        super(list, 6);
        this.f34083o0 = i10;
    }

    @Override // p660b6.InterfaceC11253e
    /* JADX INFO: renamed from: p */
    public final AbstractC9653d mo10670p() {
        switch (this.f34083o0) {
            case 0:
                return new C9654e(0, (List) this.f11539Z);
            case 1:
                return new C9657h(0, (List) this.f11539Z);
            case 2:
                return new C9654e(1, (List) this.f11539Z);
            case 3:
                return new C9657h(1, (List) this.f11539Z);
            case 4:
                return new C9657h(2, (List) this.f11539Z);
            case 5:
                return new C9661l((List) this.f11539Z);
            default:
                return new C9654e(2, (List) this.f11539Z);
        }
    }
}
