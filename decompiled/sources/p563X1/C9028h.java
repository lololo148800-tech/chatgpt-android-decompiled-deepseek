package p563X1;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: X1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9028h extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27543Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9037q f27544Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9028h(C9037q c9037q, int i10) {
        super(0);
        this.f27543Y = i10;
        this.f27544Z = c9037q;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f27543Y) {
            case 0:
                this.f27544Z.getLayoutNode().m22017O();
                return C17296C.f55119a;
            case 1:
                C9037q c9037q = this.f27544Z;
                if (c9037q.f27559s0 && c9037q.isAttachedToWindow() && c9037q.getView().getParent() == c9037q) {
                    c9037q.getSnapshotObserver().m22222a(c9037q, C9021a.f27519Z, c9037q.getUpdate());
                }
                return C17296C.f55119a;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f27544Z.f27589K0.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                C9037q c9037q2 = this.f27544Z;
                c9037q2.getReleaseBlock().invoke(c9037q2.f27589K0);
                C9037q.m9605l(c9037q2);
                return C17296C.f55119a;
            case 4:
                C9037q c9037q3 = this.f27544Z;
                c9037q3.getResetBlock().invoke(c9037q3.f27589K0);
                return C17296C.f55119a;
            default:
                C9037q c9037q4 = this.f27544Z;
                c9037q4.getUpdateBlock().invoke(c9037q4.f27589K0);
                return C17296C.f55119a;
        }
    }
}
