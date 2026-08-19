package lk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC7877E4;
import p718e4.C13280a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC17058a implements Parcelable {
    public static final Parcelable.Creator<EnumC17058a> CREATOR;

    /* JADX INFO: renamed from: Y */
    public static final EnumC17058a f54521Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC17058a f54522Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC17058a f54523o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC17058a[] f54524p0;

    static {
        EnumC17058a enumC17058a = new EnumC17058a("REQUIRED", 0);
        f54521Y = enumC17058a;
        EnumC17058a enumC17058a2 = new EnumC17058a("OPTIONAL", 1);
        f54522Z = enumC17058a2;
        EnumC17058a enumC17058a3 = new EnumC17058a("NONE", 2);
        f54523o0 = enumC17058a3;
        EnumC17058a[] enumC17058aArr = {enumC17058a, enumC17058a2, enumC17058a3};
        f54524p0 = enumC17058aArr;
        AbstractC7877E4.m8156j(enumC17058aArr);
        CREATOR = new C13280a(14);
    }

    public static EnumC17058a valueOf(String str) {
        return (EnumC17058a) Enum.valueOf(EnumC17058a.class, str);
    }

    public static EnumC17058a[] values() {
        return (EnumC17058a[]) f54524p0.clone();
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
