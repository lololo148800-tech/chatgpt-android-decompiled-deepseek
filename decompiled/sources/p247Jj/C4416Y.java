package p247Jj;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import kotlin.jvm.internal.AbstractC16544l;
import p1044uj.C20362t;

/* JADX INFO: renamed from: Jj.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C4416Y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC16544l.m18094g(parcel, "parcel");
        return new C4417Z(parcel.readString(), parcel.readString(), (AbstractC4413V0) parcel.readParcelable(C4417Z.class.getClassLoader()), (StepStyles.DocumentStepStyle) parcel.readParcelable(C4417Z.class.getClassLoader()), (NextStep.CancelDialog) parcel.readParcelable(C4417Z.class.getClassLoader()), (NextStep.Document) parcel.readParcelable(C4417Z.class.getClassLoader()), parcel.readString(), (C20362t) parcel.readParcelable(C4417Z.class.getClassLoader()), (NextStep.Document.AssetConfig) parcel.readParcelable(C4417Z.class.getClassLoader()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C4417Z[i10];
    }
}
