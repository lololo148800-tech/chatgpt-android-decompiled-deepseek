package p080D0;

import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1014t1.C19732i;
import p1140z1.EnumC21705m0;
import p1140z1.InterfaceC21707n0;
import p647ak.AbstractC10712k0;
import p647ak.InterfaceC10717n;
import p729ej.C13430u;
import p860l0.C16697N0;

/* JADX INFO: renamed from: D0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C1786U extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5118Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16556x f5119Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1786U(C16556x c16556x, int i10) {
        super(1);
        this.f5118Y = i10;
        this.f5119Z = c16556x;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        boolean z6;
        switch (this.f5118Y) {
            case 0:
                if (((C1820o) obj).f5240f.f10892a.f10882a.f10934Y.length() > 0) {
                    this.f5119Z.f51285Y = false;
                }
                return C17296C.f55119a;
            case 1:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Parcelable parcelable = (AbstractC10712k0) action.f42521b;
                if ((parcelable instanceof InterfaceC10717n) && ((InterfaceC10717n) parcelable).mo11010d()) {
                    action.f42521b = parcelable;
                    this.f5119Z.f51285Y = false;
                }
                return C17296C.f55119a;
            case 2:
                InterfaceC21707n0 interfaceC21707n0 = (InterfaceC21707n0) obj;
                C16556x c16556x = this.f5119Z;
                if (c16556x.f51285Y) {
                    z6 = true;
                } else {
                    AbstractC16544l.m18092e(interfaceC21707n0, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    if (((C16697N0) interfaceC21707n0).f53506z0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                c16556x.f51285Y = z6;
                return Boolean.valueOf(!z6);
            default:
                if (!((C19732i) obj).f62470B0) {
                    return EnumC21705m0.f68877Y;
                }
                this.f5119Z.f51285Y = false;
                return EnumC21705m0.f68879o0;
        }
    }
}
