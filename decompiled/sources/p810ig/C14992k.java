package p810ig;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p872lg.C16946f;

/* JADX INFO: renamed from: ig.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C14992k extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C14992k f46667Z = new C14992k(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14992k f46668o0 = new C14992k(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46669Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14992k(int i10, int i11) {
        super(i10);
        this.f46669Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f46669Y) {
            case 0:
                C16946f it = (C16946f) obj;
                AbstractC16544l.m18094g(it, "it");
                break;
            default:
                String it2 = (String) obj;
                AbstractC16544l.m18094g(it2, "it");
                break;
        }
        return C17296C.f55119a;
    }
}
