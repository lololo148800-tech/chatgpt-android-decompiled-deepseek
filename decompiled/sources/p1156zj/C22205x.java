package p1156zj;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import androidx.work.impl.utils.p651oZ.HhJS;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: zj.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C22205x implements Parcelable {
    public static final Parcelable.Creator<C22205x> CREATOR = new C21006a(11);

    /* JADX INFO: renamed from: Y */
    public final String f70393Y;

    /* JADX INFO: renamed from: Z */
    public final String f70394Z;

    public C22205x(String absoluteFilePath, String mimeType) {
        AbstractC16544l.m18094g(absoluteFilePath, "absoluteFilePath");
        AbstractC16544l.m18094g(mimeType, "mimeType");
        this.f70393Y = absoluteFilePath;
        this.f70394Z = mimeType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22205x)) {
            return false;
        }
        C22205x c22205x = (C22205x) obj;
        return AbstractC16544l.m18089b(this.f70393Y, c22205x.f70393Y) && AbstractC16544l.m18089b(this.f70394Z, c22205x.f70394Z);
    }

    public final int hashCode() {
        return this.f70394Z.hashCode() + (this.f70393Y.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f70393Y);
        out.writeString(this.f70394Z);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame(absoluteFilePath=");
        sb2.append(this.f70393Y);
        sb2.append(", mimeType=");
        return AbstractC9306j0.m9891j(this.f70394Z, HhJS.MJml, sb2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C22205x(String str) {
        String mimeTypeFromExtension;
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        this(str, (fileExtensionFromUrl == null || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null) ? "image/*" : mimeTypeFromExtension);
    }
}
