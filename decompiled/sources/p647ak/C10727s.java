package p647ak;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p531Vj.C8343M;

/* JADX INFO: renamed from: ak.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C10727s extends AbstractC10729t {
    public static final Parcelable.Creator<C10727s> CREATOR = new C8343M(15);

    /* JADX INFO: renamed from: Y */
    public final String f31864Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC10721p f31865Z;

    public C10727s(String absoluteFilePath, EnumC10721p captureMethod) {
        AbstractC16544l.m18094g(absoluteFilePath, "absoluteFilePath");
        AbstractC16544l.m18094g(captureMethod, "captureMethod");
        this.f31864Y = absoluteFilePath;
        this.f31865Z = captureMethod;
    }

    @Override // p647ak.AbstractC10729t
    /* JADX INFO: renamed from: a */
    public final String mo11035a() {
        return this.f31864Y;
    }

    @Override // p647ak.AbstractC10729t
    /* JADX INFO: renamed from: b */
    public final EnumC10721p mo11036b() {
        return this.f31865Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10727s)) {
            return false;
        }
        C10727s c10727s = (C10727s) obj;
        return AbstractC16544l.m18089b(this.f31864Y, c10727s.f31864Y) && this.f31865Z == c10727s.f31865Z;
    }

    public final int hashCode() {
        return this.f31865Z.hashCode() + (this.f31864Y.hashCode() * 31);
    }

    public final String toString() {
        return "SelfieVideo(absoluteFilePath=" + this.f31864Y + ", captureMethod=" + this.f31865Z + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f31864Y);
        out.writeString(this.f31865Z.name());
    }
}
