package p1033u5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.C17690x;
import p960q9.C18658l;

/* JADX INFO: renamed from: u5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20116a implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<C20116a> CREATOR = new C18658l(12);

    /* JADX INFO: renamed from: Y */
    public final String f63738Y;

    /* JADX INFO: renamed from: Z */
    public final Map f63739Z;

    public C20116a(String str, Map map) {
        this.f63738Y = str;
        this.f63739Z = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20116a) {
            C20116a c20116a = (C20116a) obj;
            if (AbstractC16544l.m18089b(this.f63738Y, c20116a.f63738Y) && AbstractC16544l.m18089b(this.f63739Z, c20116a.f63739Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f63739Z.hashCode() + (this.f63738Y.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(key=");
        sb2.append(this.f63738Y);
        sb2.append(", extras=");
        return AbstractC12107L1.m13827r(sb2, this.f63739Z, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f63738Y);
        Map map = this.f63739Z;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public /* synthetic */ C20116a(String str) {
        this(str, C17690x.f56481Y);
    }
}
