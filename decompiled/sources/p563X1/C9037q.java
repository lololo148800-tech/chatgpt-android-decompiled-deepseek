package p563X1;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p650ui.node.Owner;
import p003A1.AbstractC0231b;
import p049Bm.InterfaceC1436k;
import p1001s1.C19434d;
import p349O0.C6017n;
import p562X0.InterfaceC9015j;
import p562X0.InterfaceC9016k;
import p658b5.C11242m;

/* JADX INFO: renamed from: X1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C9037q extends AbstractC9029i {

    /* JADX INFO: renamed from: K0 */
    public final View f27589K0;

    /* JADX INFO: renamed from: L0 */
    public final C19434d f27590L0;

    /* JADX INFO: renamed from: M0 */
    public InterfaceC9015j f27591M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC1436k f27592N0;

    /* JADX INFO: renamed from: O0 */
    public InterfaceC1436k f27593O0;

    /* JADX INFO: renamed from: P0 */
    public InterfaceC1436k f27594P0;

    public C9037q(Context context, InterfaceC1436k interfaceC1436k, C6017n c6017n, InterfaceC9016k interfaceC9016k, int i10, Owner owner) {
        View view = (View) interfaceC1436k.invoke(context);
        C19434d c19434d = new C19434d();
        super(context, c6017n, i10, c19434d, view, owner);
        this.f27589K0 = view;
        this.f27590L0 = c19434d;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        Object objMo610b = interfaceC9016k != null ? interfaceC9016k.mo610b(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objMo610b instanceof SparseArray ? (SparseArray) objMo610b : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (interfaceC9016k != null) {
            setSavableRegistryEntry(interfaceC9016k.mo611d(strValueOf, new C9028h(this, 2)));
        }
        C9021a c9021a = C9021a.f27522q0;
        this.f27592N0 = c9021a;
        this.f27593O0 = c9021a;
        this.f27594P0 = c9021a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m9605l(C9037q c9037q) {
        c9037q.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(InterfaceC9015j interfaceC9015j) {
        InterfaceC9015j interfaceC9015j2 = this.f27591M0;
        if (interfaceC9015j2 != null) {
            ((C11242m) interfaceC9015j2).m12609K();
        }
        this.f27591M0 = interfaceC9015j;
    }

    public final C19434d getDispatcher() {
        return this.f27590L0;
    }

    public final InterfaceC1436k getReleaseBlock() {
        return this.f27594P0;
    }

    public final InterfaceC1436k getResetBlock() {
        return this.f27593O0;
    }

    public /* bridge */ /* synthetic */ AbstractC0231b getSubCompositionView() {
        return null;
    }

    public final InterfaceC1436k getUpdateBlock() {
        return this.f27592N0;
    }

    public final void setReleaseBlock(InterfaceC1436k interfaceC1436k) {
        this.f27594P0 = interfaceC1436k;
        setRelease(new C9028h(this, 3));
    }

    public final void setResetBlock(InterfaceC1436k interfaceC1436k) {
        this.f27593O0 = interfaceC1436k;
        setReset(new C9028h(this, 4));
    }

    public final void setUpdateBlock(InterfaceC1436k interfaceC1436k) {
        this.f27592N0 = interfaceC1436k;
        setUpdate(new C9028h(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
