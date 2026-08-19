package p813ij;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ij.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C15021e extends View.BaseSavedState {
    public static final C15020d CREATOR = new C15020d();

    /* JADX INFO: renamed from: Y */
    public final C15024h f46718Y;

    public C15021e(Parcelable parcelable, C15024h c15024h) {
        super(parcelable);
        this.f46718Y = c15024h;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        super.writeToParcel(out, i10);
        out.writeParcelable(this.f46718Y, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15021e(Parcel source) {
        super(source);
        AbstractC16544l.m18094g(source, "source");
        Parcelable parcelable = source.readParcelable(C15024h.class.getClassLoader());
        AbstractC16544l.m18091d(parcelable);
        this.f46718Y = (C15024h) parcelable;
    }
}
