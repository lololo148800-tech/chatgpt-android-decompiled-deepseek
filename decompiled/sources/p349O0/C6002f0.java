package p349O0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p586Y0.AbstractC9543B;
import p586Y0.AbstractC9544C;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9562n;
import p586Y0.InterfaceC9564p;

/* JADX INFO: renamed from: O0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6002f0 extends AbstractC9543B implements Parcelable, InterfaceC9564p {
    public static final Parcelable.Creator<C6002f0> CREATOR = new C6000e0();

    /* JADX INFO: renamed from: Z */
    public final InterfaceC5959J0 f19486Z;

    /* JADX INFO: renamed from: o0 */
    public C5957I0 f19487o0;

    public C6002f0(Object obj, InterfaceC5959J0 interfaceC5959J0) {
        this.f19486Z = interfaceC5959J0;
        C5957I0 c5957i0 = new C5957I0(obj);
        if (AbstractC9562n.f28758a.m12621z() != null) {
            C5957I0 c5957i1 = new C5957I0(obj);
            c5957i1.f28702a = 1;
            c5957i0.f28703b = c5957i1;
        }
        this.f19487o0 = c5957i0;
    }

    @Override // p586Y0.InterfaceC9564p
    /* JADX INFO: renamed from: b */
    public final InterfaceC5959J0 mo6406b() {
        return this.f19486Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: f */
    public final AbstractC9544C mo6345f() {
        return this.f19487o0;
    }

    @Override // p349O0.InterfaceC5982V0
    public final Object getValue() {
        return ((C5957I0) AbstractC9562n.m10097u(this.f19487o0, this)).f19401c;
    }

    @Override // p586Y0.AbstractC9543B, p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: j */
    public final AbstractC9544C mo6408j(AbstractC9544C abstractC9544C, AbstractC9544C abstractC9544C2, AbstractC9544C abstractC9544C3) {
        if (this.f19486Z.mo6393a(((C5957I0) abstractC9544C2).f19401c, ((C5957I0) abstractC9544C3).f19401c)) {
            return abstractC9544C2;
        }
        return null;
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: p */
    public final void mo6348p(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f19487o0 = (C5957I0) abstractC9544C;
    }

    @Override // p349O0.InterfaceC5985X
    public final void setValue(Object obj) {
        AbstractC9556h abstractC9556hM10087k;
        C5957I0 c5957i0 = (C5957I0) AbstractC9562n.m10085i(this.f19487o0);
        if (this.f19486Z.mo6393a(c5957i0.f19401c, obj)) {
            return;
        }
        C5957I0 c5957i1 = this.f19487o0;
        synchronized (AbstractC9562n.f28759b) {
            abstractC9556hM10087k = AbstractC9562n.m10087k();
            ((C5957I0) AbstractC9562n.m10092p(c5957i1, this, abstractC9556hM10087k, c5957i0)).f19401c = obj;
        }
        AbstractC9562n.m10091o(abstractC9556hM10087k, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((C5957I0) AbstractC9562n.m10085i(this.f19487o0)).f19401c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        C5975S c5975s = C5975S.f19445o0;
        InterfaceC5959J0 interfaceC5959J0 = this.f19486Z;
        if (AbstractC16544l.m18089b(interfaceC5959J0, c5975s)) {
            i11 = 0;
        } else if (AbstractC16544l.m18089b(interfaceC5959J0, C5975S.f19448r0)) {
            i11 = 1;
        } else {
            if (!AbstractC16544l.m18089b(interfaceC5959J0, C5975S.f19446p0)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
