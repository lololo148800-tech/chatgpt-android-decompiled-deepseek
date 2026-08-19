package p349O0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p586Y0.AbstractC9543B;
import p586Y0.AbstractC9544C;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9562n;
import p586Y0.InterfaceC9564p;

/* JADX INFO: renamed from: O0.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5994b0 extends AbstractC9543B implements Parcelable, InterfaceC9564p, InterfaceC5985X, InterfaceC5982V0 {
    public static final Parcelable.Creator<C5994b0> CREATOR = new C5989Z(1);

    /* JADX INFO: renamed from: Z */
    public C5951F0 f19472Z;

    public C5994b0(float f10) {
        C5951F0 c5951f0 = new C5951F0(f10);
        if (AbstractC9562n.f28758a.m12621z() != null) {
            C5951F0 c5951f1 = new C5951F0(f10);
            c5951f1.f28702a = 1;
            c5951f0.f28703b = c5951f1;
        }
        this.f19472Z = c5951f0;
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
        return this.f19472Z;
    }

    /* JADX INFO: renamed from: g */
    public final float m6409g() {
        return ((C5951F0) AbstractC9562n.m10097u(this.f19472Z, this)).f19389c;
    }

    @Override // p349O0.InterfaceC5982V0
    public final Object getValue() {
        return Float.valueOf(m6409g());
    }

    /* JADX INFO: renamed from: h */
    public final void m6410h(float f10) {
        AbstractC9556h abstractC9556hM10087k;
        C5951F0 c5951f0 = (C5951F0) AbstractC9562n.m10085i(this.f19472Z);
        if (c5951f0.f19389c == f10) {
            return;
        }
        C5951F0 c5951f1 = this.f19472Z;
        synchronized (AbstractC9562n.f28759b) {
            abstractC9556hM10087k = AbstractC9562n.m10087k();
            ((C5951F0) AbstractC9562n.m10092p(c5951f1, this, abstractC9556hM10087k, c5951f0)).f19389c = f10;
        }
        AbstractC9562n.m10091o(abstractC9556hM10087k, this);
    }

    @Override // p586Y0.AbstractC9543B, p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: j */
    public final AbstractC9544C mo6408j(AbstractC9544C abstractC9544C, AbstractC9544C abstractC9544C2, AbstractC9544C abstractC9544C3) {
        if (((C5951F0) abstractC9544C2).f19389c == ((C5951F0) abstractC9544C3).f19389c) {
            return abstractC9544C2;
        }
        return null;
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: p */
    public final void mo6348p(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f19472Z = (C5951F0) abstractC9544C;
    }

    @Override // p349O0.InterfaceC5985X
    public final void setValue(Object obj) {
        m6410h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((C5951F0) AbstractC9562n.m10085i(this.f19472Z)).f19389c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(m6409g());
    }
}
