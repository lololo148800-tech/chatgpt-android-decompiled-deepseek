package lk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC7877E4;
import p718e4.C13280a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lk.d */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC17061d implements Parcelable {
    public static final Parcelable.Creator<EnumC17061d> CREATOR;

    /* JADX INFO: renamed from: Y */
    public static final EnumC17061d f54530Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC17061d f54531Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC17061d[] f54532o0;

    static {
        EnumC17061d enumC17061d = new EnumC17061d("ROUGH", 0);
        f54530Y = enumC17061d;
        EnumC17061d enumC17061d2 = new EnumC17061d("PRECISE", 1);
        f54531Z = enumC17061d2;
        EnumC17061d[] enumC17061dArr = {enumC17061d, enumC17061d2};
        f54532o0 = enumC17061dArr;
        AbstractC7877E4.m8156j(enumC17061dArr);
        CREATOR = new C13280a(15);
    }

    public static EnumC17061d valueOf(String str) {
        return (EnumC17061d) Enum.valueOf(EnumC17061d.class, str);
    }

    public static EnumC17061d[] values() {
        return (EnumC17061d[]) f54532o0.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(name());
    }
}
