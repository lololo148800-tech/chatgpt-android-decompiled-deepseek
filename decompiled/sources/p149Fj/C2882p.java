package p149Fj;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p125Ej.C2566j;
import p770gk.InterfaceC14188d;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Fj.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C2882p implements InterfaceC14188d {
    public static final Parcelable.Creator<C2882p> CREATOR = new C2566j(8);

    /* JADX INFO: renamed from: Y */
    public final String f8664Y;

    /* JADX INFO: renamed from: Z */
    public final List f8665Z;

    public C2882p(String stepName, List ids) {
        AbstractC16544l.m18094g(stepName, "stepName");
        AbstractC16544l.m18094g(ids, "ids");
        this.f8664Y = stepName;
        this.f8665Z = ids;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f8664Y);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f8665Z, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
    }
}
