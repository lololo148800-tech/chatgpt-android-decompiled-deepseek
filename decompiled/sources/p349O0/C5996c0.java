package p349O0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p586Y0.AbstractC9543B;
import p586Y0.AbstractC9544C;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9562n;
import p586Y0.InterfaceC9564p;

/* JADX INFO: renamed from: O0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5996c0 extends AbstractC9543B implements Parcelable, InterfaceC9564p, InterfaceC5985X, InterfaceC5982V0 {
    public static final Parcelable.Creator<C5996c0> CREATOR = new C5989Z(2);

    /* JADX INFO: renamed from: Z */
    public C5953G0 f19474Z;

    public C5996c0(int i10) {
        C5953G0 c5953g0 = new C5953G0(i10);
        if (AbstractC9562n.f28758a.m12621z() != null) {
            C5953G0 c5953g1 = new C5953G0(i10);
            c5953g1.f28702a = 1;
            c5953g0.f28703b = c5953g1;
        }
        this.f19474Z = c5953g0;
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
        return this.f19474Z;
    }

    /* JADX INFO: renamed from: g */
    public final int m6412g() {
        return ((C5953G0) AbstractC9562n.m10097u(this.f19474Z, this)).f19391c;
    }

    @Override // p349O0.InterfaceC5982V0
    public final Object getValue() {
        return Integer.valueOf(m6412g());
    }

    /* JADX INFO: renamed from: h */
    public final void m6413h(int i10) {
        AbstractC9556h abstractC9556hM10087k;
        C5953G0 c5953g0 = (C5953G0) AbstractC9562n.m10085i(this.f19474Z);
        if (c5953g0.f19391c != i10) {
            C5953G0 c5953g1 = this.f19474Z;
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                ((C5953G0) AbstractC9562n.m10092p(c5953g1, this, abstractC9556hM10087k, c5953g0)).f19391c = i10;
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        }
    }

    @Override // p586Y0.AbstractC9543B, p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: j */
    public final AbstractC9544C mo6408j(AbstractC9544C abstractC9544C, AbstractC9544C abstractC9544C2, AbstractC9544C abstractC9544C3) {
        if (((C5953G0) abstractC9544C2).f19391c == ((C5953G0) abstractC9544C3).f19391c) {
            return abstractC9544C2;
        }
        return null;
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: p */
    public final void mo6348p(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f19474Z = (C5953G0) abstractC9544C;
    }

    @Override // p349O0.InterfaceC5985X
    public final void setValue(Object obj) {
        m6413h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((C5953G0) AbstractC9562n.m10085i(this.f19474Z)).f19391c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(m6412g());
    }
}
