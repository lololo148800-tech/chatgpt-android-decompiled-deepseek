package p247Jj;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p125Ej.C2566j;

/* JADX INFO: renamed from: Jj.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C4389J implements Parcelable {
    public static final Parcelable.Creator<C4389J> CREATOR = new C2566j(21);

    /* JADX INFO: renamed from: Y */
    public final Map f14258Y;

    public C4389J(Map fields) {
        AbstractC16544l.m18094g(fields, "fields");
        this.f14258Y = fields;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        Map map = this.f14258Y;
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeParcelable((Parcelable) entry.getValue(), i10);
        }
    }
}
