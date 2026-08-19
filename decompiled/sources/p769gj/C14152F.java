package p769gj;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: gj.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C14152F extends View.BaseSavedState {
    public static final C14151E CREATOR = new C14151E();

    /* JADX INFO: renamed from: Y */
    public final SparseArray f44509Y;

    public C14152F(Parcelable parcelable, SparseArray sparseArray) {
        super(parcelable);
        this.f44509Y = sparseArray;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        super.writeToParcel(out, i10);
        out.writeSparseArray(this.f44509Y);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14152F(Parcel source) {
        super(source);
        AbstractC16544l.m18094g(source, "source");
        SparseArray sparseArray = source.readSparseArray(C14152F.class.getClassLoader());
        AbstractC16544l.m18091d(sparseArray);
        this.f44509Y = sparseArray;
    }
}
