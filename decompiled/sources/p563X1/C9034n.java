package p563X1;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.p650ui.node.Owner;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p349O0.C6017n;
import p562X0.InterfaceC9016k;

/* JADX INFO: renamed from: X1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9034n extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Context f27582Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f27583Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6017n f27584o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC9016k f27585p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f27586q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ View f27587r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9034n(Context context, InterfaceC1436k interfaceC1436k, C6017n c6017n, InterfaceC9016k interfaceC9016k, int i10, View view) {
        super(0);
        this.f27582Y = context;
        this.f27583Z = interfaceC1436k;
        this.f27584o0 = c6017n;
        this.f27585p0 = interfaceC9016k;
        this.f27586q0 = i10;
        this.f27587r0 = view;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f27587r0;
        AbstractC16544l.m18092e(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        Owner owner = (Owner) callback;
        return new C9037q(this.f27582Y, this.f27583Z, this.f27584o0, this.f27585p0, this.f27586q0, owner).getLayoutNode();
    }
}
