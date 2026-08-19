package p108E2;

import android.os.Parcel;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: E2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2253l extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C2253l f6896Z = new C2253l(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C2253l f6897o0 = new C2253l(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6898Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2253l(int i10, int i11) {
        super(i10);
        this.f6898Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f6898Y) {
            case 0:
                Parcel it = (Parcel) obj;
                AbstractC16544l.m18094g(it, "it");
                return new C2252k(it);
            default:
                Parcel it2 = (Parcel) obj;
                AbstractC16544l.m18094g(it2, "it");
                return new C2254m(it2);
        }
    }
}
