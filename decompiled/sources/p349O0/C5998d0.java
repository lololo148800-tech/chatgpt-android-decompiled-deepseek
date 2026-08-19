package p349O0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p586Y0.AbstractC9543B;
import p586Y0.AbstractC9544C;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9562n;
import p586Y0.InterfaceC9564p;

/* JADX INFO: renamed from: O0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5998d0 extends AbstractC9543B implements Parcelable, InterfaceC9564p, InterfaceC5985X, InterfaceC5982V0 {
    public static final Parcelable.Creator<C5998d0> CREATOR = new C5989Z(3);

    /* JADX INFO: renamed from: Z */
    public C5955H0 f19483Z;

    public C5998d0(long j10) {
        C5955H0 c5955h0 = new C5955H0(j10);
        if (AbstractC9562n.f28758a.m12621z() != null) {
            C5955H0 c5955h1 = new C5955H0(j10);
            c5955h1.f28702a = 1;
            c5955h0.f28703b = c5955h1;
        }
        this.f19483Z = c5955h0;
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
        return this.f19483Z;
    }

    /* JADX INFO: renamed from: g */
    public final long m6471g() {
        return ((C5955H0) AbstractC9562n.m10097u(this.f19483Z, this)).f19395c;
    }

    @Override // p349O0.InterfaceC5982V0
    public final Object getValue() {
        return Long.valueOf(m6471g());
    }

    /* JADX INFO: renamed from: h */
    public final void m6472h(long j10) {
        AbstractC9556h abstractC9556hM10087k;
        C5955H0 c5955h0 = (C5955H0) AbstractC9562n.m10085i(this.f19483Z);
        if (c5955h0.f19395c != j10) {
            C5955H0 c5955h1 = this.f19483Z;
            synchronized (AbstractC9562n.f28759b) {
                abstractC9556hM10087k = AbstractC9562n.m10087k();
                ((C5955H0) AbstractC9562n.m10092p(c5955h1, this, abstractC9556hM10087k, c5955h0)).f19395c = j10;
            }
            AbstractC9562n.m10091o(abstractC9556hM10087k, this);
        }
    }

    @Override // p586Y0.AbstractC9543B, p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: j */
    public final AbstractC9544C mo6408j(AbstractC9544C abstractC9544C, AbstractC9544C abstractC9544C2, AbstractC9544C abstractC9544C3) {
        if (((C5955H0) abstractC9544C2).f19395c == ((C5955H0) abstractC9544C3).f19395c) {
            return abstractC9544C2;
        }
        return null;
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: p */
    public final void mo6348p(AbstractC9544C abstractC9544C) {
        AbstractC16544l.m18092e(abstractC9544C, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f19483Z = (C5955H0) abstractC9544C;
    }

    @Override // p349O0.InterfaceC5985X
    public final void setValue(Object obj) {
        m6472h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((C5955H0) AbstractC9562n.m10085i(this.f19483Z)).f19395c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(m6471g());
    }
}
