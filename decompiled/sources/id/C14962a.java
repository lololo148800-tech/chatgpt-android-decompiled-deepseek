package id;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p834jd.C16194c;

/* JADX INFO: renamed from: id.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14962a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C14962a f46601Z = new C14962a(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14962a f46602o0 = new C14962a(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46603Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14962a(int i10, int i11) {
        super(i10);
        this.f46603Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f46603Y) {
            case 0:
                C16194c update = (C16194c) obj;
                AbstractC16544l.m18094g(update, "$this$update");
                return C16194c.m17803a(update, false, false, false, update.f50270d + 1, null, 23);
            default:
                C16194c it = (C16194c) obj;
                AbstractC16544l.m18094g(it, "it");
                return C16194c.m17803a(it, false, false, true, 0, null, 27);
        }
    }
}
