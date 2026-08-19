package p406Qg;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p072Ci.C1705j;

/* JADX INFO: renamed from: Qg.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6712h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C6712h f21573Z = new C6712h(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C6712h f21574o0 = new C6712h(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C6712h f21575p0 = new C6712h(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21576Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6712h(int i10, int i11) {
        super(i10);
        this.f21576Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f21576Y) {
            case 0:
                C1705j update = (C1705j) obj;
                AbstractC16544l.m18094g(update, "$this$update");
                return C1705j.m2512a(update, false, null, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, false, false, 2097087);
            case 1:
                C1705j update2 = (C1705j) obj;
                AbstractC16544l.m18094g(update2, "$this$update");
                return C1705j.m2512a(update2, true, null, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, false, false, 2097150);
            default:
                C1705j update3 = (C1705j) obj;
                AbstractC16544l.m18094g(update3, "$this$update");
                return C1705j.m2512a(update3, false, null, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, false, false, 2097150);
        }
    }
}
