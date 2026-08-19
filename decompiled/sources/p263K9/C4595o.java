package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: K9.o */
/* JADX INFO: loaded from: classes.dex */
public final class C4595o implements Parcelable {
    public static final Parcelable.Creator<C4595o> CREATOR = new C4576X(4);

    /* JADX INFO: renamed from: Y */
    public final Enum f14969Y;

    /* JADX WARN: Multi-variable type inference failed */
    public C4595o(InterfaceC4579a interfaceC4579a) {
        this.f14969Y = (Enum) interfaceC4579a;
    }

    /* JADX INFO: renamed from: a */
    public static C4595o m5339a(int i10) throws C4594n {
        InterfaceC4579a interfaceC4579a;
        if (i10 != -262) {
            for (EnumC4557D enumC4557D : EnumC4557D.values()) {
                if (enumC4557D.f14894Y == i10) {
                    interfaceC4579a = enumC4557D;
                }
            }
            for (EnumC4596p enumC4596p : EnumC4596p.values()) {
                if (enumC4596p.f14971Y == i10) {
                    interfaceC4579a = enumC4596p;
                }
            }
            throw new C4594n(AbstractC0010F.m19c(i10, "Algorithm with COSE value ", " not supported"));
        }
        interfaceC4579a = EnumC4557D.RS1;
        return new C4595o(interfaceC4579a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [K9.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [K9.a, java.lang.Enum] */
    public final boolean equals(Object obj) {
        return (obj instanceof C4595o) && this.f14969Y.mo5322a() == ((C4595o) obj).f14969Y.mo5322a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14969Y});
    }

    public final String toString() {
        return AbstractC10763a.m11054l("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f14969Y), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [K9.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14969Y.mo5322a());
    }
}
