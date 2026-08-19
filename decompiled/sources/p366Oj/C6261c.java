package p366Oj;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;
import p813ij.C15024h;

/* JADX INFO: renamed from: Oj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6261c extends View.BaseSavedState {
    public static final C6260b CREATOR = new C6260b();

    /* JADX INFO: renamed from: Y */
    public final C15024h f20350Y;

    public C6261c(Parcelable parcelable, C15024h c15024h) {
        super(parcelable);
        this.f20350Y = c15024h;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        super.writeToParcel(out, i10);
        out.writeParcelable(this.f20350Y, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6261c(Parcel source) {
        super(source);
        AbstractC16544l.m18094g(source, "source");
        Parcelable parcelable = source.readParcelable(C15024h.class.getClassLoader());
        AbstractC16544l.m18091d(parcelable);
        this.f20350Y = (C15024h) parcelable;
    }
}
