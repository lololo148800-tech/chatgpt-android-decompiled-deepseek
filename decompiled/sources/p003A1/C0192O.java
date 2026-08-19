package p003A1;

import android.view.accessibility.AccessibilityEvent;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: A1.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0192O extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f726Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0203S f727Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0192O(C0203S c0203s, int i10) {
        super(1);
        this.f726Y = i10;
        this.f727Z = c0203s;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f726Y) {
            case 0:
                C0203S c0203s = this.f727Z;
                return Boolean.valueOf(c0203s.f765d.getParent().requestSendAccessibilityEvent(c0203s.f765d, (AccessibilityEvent) obj));
            default:
                C0291t1 c0291t1 = (C0291t1) obj;
                C0203S c0203s2 = this.f727Z;
                c0203s2.getClass();
                if (c0291t1.f1055Z.contains(c0291t1)) {
                    c0203s2.f765d.getSnapshotObserver().m22222a(c0291t1, c0203s2.f764M, new C0286s(c0291t1, 2, c0203s2));
                }
                return C17296C.f55119a;
        }
    }
}
