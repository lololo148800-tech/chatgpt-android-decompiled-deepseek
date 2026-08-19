package p978r1;

import android.view.KeyEvent;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: r1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C18859e extends AbstractC10458p implements InterfaceC18858d {

    /* JADX INFO: renamed from: A0 */
    public AbstractC16546n f60082A0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC1436k f60083z0;

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p978r1.InterfaceC18858d
    /* JADX INFO: renamed from: l */
    public final boolean mo15576l(KeyEvent keyEvent) {
        ?? r6 = this.f60082A0;
        if (r6 != 0) {
            return ((Boolean) r6.invoke(new C18856b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p978r1.InterfaceC18858d
    /* JADX INFO: renamed from: z */
    public final boolean mo15577z(KeyEvent keyEvent) {
        InterfaceC1436k interfaceC1436k = this.f60083z0;
        if (interfaceC1436k != null) {
            return ((Boolean) interfaceC1436k.invoke(new C18856b(keyEvent))).booleanValue();
        }
        return false;
    }
}
