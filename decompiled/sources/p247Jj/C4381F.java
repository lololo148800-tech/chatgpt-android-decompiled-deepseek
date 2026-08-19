package p247Jj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p125Ej.C2566j;

/* JADX INFO: renamed from: Jj.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C4381F extends AbstractC4385H {
    public static final Parcelable.Creator<C4381F> CREATOR = new C2566j(20);

    /* JADX INFO: renamed from: Y */
    public final String f14249Y;

    public C4381F(String type) {
        AbstractC16544l.m18094g(type, "type");
        this.f14249Y = type;
    }

    @Override // p247Jj.AbstractC4385H
    /* JADX INFO: renamed from: a */
    public final String mo5175a() {
        return this.f14249Y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f14249Y);
    }
}
