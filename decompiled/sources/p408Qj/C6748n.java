package p408Qj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p026Ao.InterfaceC0676j;
import p049Bm.InterfaceC1436k;
import p247Jj.C4435i0;
import p729ej.C13430u;

/* JADX INFO: renamed from: Qj.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C6748n extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21657Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Parcelable f21658Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6748n(Parcelable parcelable, int i10) {
        super(1);
        this.f21657Y = i10;
        this.f21658Z = parcelable;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f21657Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                action.m14964a(this.f21658Z);
                break;
            case 1:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                Parcelable parcelable = this.f21658Z;
                C4435i0 c4435i0 = (C4435i0) parcelable;
                action2.f42521b = new C6745k(parcelable, c4435i0.f14439o0, c4435i0.f14440p0, c4435i0.f14441q0, c4435i0.f14442r0, c4435i0.f14443s0);
                break;
            case 2:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                action3.m14964a(this.f21658Z);
                break;
            default:
                InterfaceC0676j bufferedSink = (InterfaceC0676j) obj;
                AbstractC16544l.m18094g(bufferedSink, "bufferedSink");
                Parcel parcelObtain = Parcel.obtain();
                AbstractC16544l.m18093f(parcelObtain, "obtain()");
                parcelObtain.writeParcelable(this.f21658Z, 0);
                byte[] byteArray = parcelObtain.marshall();
                AbstractC16544l.m18093f(byteArray, "byteArray");
                bufferedSink.mo1327A0(byteArray);
                parcelObtain.recycle();
                break;
        }
        return C17296C.f55119a;
    }
}
