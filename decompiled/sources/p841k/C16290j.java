package p841k;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p718e4.C13280a;

/* JADX INFO: renamed from: k.j */
/* JADX INFO: loaded from: classes.dex */
public final class C16290j implements Parcelable {
    public static final Parcelable.Creator<C16290j> CREATOR = new C13280a(12);

    /* JADX INFO: renamed from: Y */
    public final IntentSender f50463Y;

    /* JADX INFO: renamed from: Z */
    public final Intent f50464Z;

    /* JADX INFO: renamed from: o0 */
    public final int f50465o0;

    /* JADX INFO: renamed from: p0 */
    public final int f50466p0;

    public C16290j(IntentSender intentSender, Intent intent, int i10, int i11) {
        AbstractC16544l.m18094g(intentSender, "intentSender");
        this.f50463Y = intentSender;
        this.f50464Z = intent;
        this.f50465o0 = i10;
        this.f50466p0 = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC16544l.m18094g(dest, "dest");
        dest.writeParcelable(this.f50463Y, i10);
        dest.writeParcelable(this.f50464Z, i10);
        dest.writeInt(this.f50465o0);
        dest.writeInt(this.f50466p0);
    }
}
