package p841k;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p718e4.C13280a;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16281a implements Parcelable {
    public static final Parcelable.Creator<C16281a> CREATOR = new C13280a(11);

    /* JADX INFO: renamed from: Y */
    public final int f50448Y;

    /* JADX INFO: renamed from: Z */
    public final Intent f50449Z;

    public C16281a(int i10, Intent intent) {
        this.f50448Y = i10;
        this.f50449Z = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f50448Y;
        if (i10 != -1) {
            strValueOf = i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb2.append(strValueOf);
        sb2.append(", data=");
        sb2.append(this.f50449Z);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC16544l.m18094g(dest, "dest");
        dest.writeInt(this.f50448Y);
        Intent intent = this.f50449Z;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }
}
