package p349O0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p586Y0.AbstractC9543B;
import p586Y0.AbstractC9544C;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9562n;
import p586Y0.InterfaceC9564p;

/* JADX INFO: renamed from: O0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5992a0 extends AbstractC9543B implements Parcelable, InterfaceC9564p, InterfaceC5985X, InterfaceC5982V0 {
    public static final Parcelable.Creator<C5992a0> CREATOR = new C5989Z(0);

    /* JADX INFO: renamed from: Z */
    public C5949E0 f19469Z;

    public C5992a0(double d10) {
        C5949E0 c5949e0 = new C5949E0(d10);
        if (AbstractC9562n.f28758a.m12621z() != null) {
            C5949E0 c5949e1 = new C5949E0(d10);
            c5949e1.f28702a = 1;
            c5949e0.f28703b = c5949e1;
        }
        this.f19469Z = c5949e0;
    }

    @Override // p586Y0.InterfaceC9564p
    /* JADX INFO: renamed from: b */
    public final InterfaceC5959J0 mo6406b() {
        return C5975S.f19448r0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: f */
    public final AbstractC9544C mo6345f() {
        return this.f19469Z;
    }

    /* JADX INFO: renamed from: g */
    public final void m6407g(double d10) {
        AbstractC9556h abstractC9556hM10087k;
        C5949E0 c5949e0 = (C5949E0) AbstractC9562n.m10085i(this.f19469Z);
        if (c5949e0.f19388c == d10) {
            return;
        }
        C5949E0 c5949e1 = this.f19469Z;
        synchronized (AbstractC9562n.f28759b) {
            abstractC9556hM10087k = AbstractC9562n.m10087k();
            ((C5949E0) AbstractC9562n.m10092p(c5949e1, this, abstractC9556hM10087k, c5949e0)).f19388c = d10;
        }
        AbstractC9562n.m10091o(abstractC9556hM10087k, this);
    }

    @Override // p349O0.InterfaceC5982V0
    public final Object getValue() {
        return Double.valueOf(((C5949E0) AbstractC9562n.m10097u(this.f19469Z, this)).f19388c);
    }

    @Override // p586Y0.AbstractC9543B, p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: j */
    public final AbstractC9544C mo6408j(AbstractC9544C abstractC9544C, AbstractC9544C abstractC9544C2, AbstractC9544C abstractC9544C3) {
        if (((C5949E0) abstractC9544C2).f19388c == ((C5949E0) abstractC9544C3).f19388c) {
            return abstractC9544C2;
        }
        return null;
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: p */
    public final void mo6348p(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.f19469Z = (C5949E0) abstractC9544C;
    }

    @Override // p349O0.InterfaceC5985X
    public final void setValue(Object obj) {
        m6407g(((Number) obj).doubleValue());
    }

    public final String toString() {
        return "MutableDoubleState(value=" + ((C5949E0) AbstractC9562n.m10085i(this.f19469Z)).f19388c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeDouble(((C5949E0) AbstractC9562n.m10097u(this.f19469Z, this)).f19388c);
    }
}
