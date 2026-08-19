package p838jj;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: jj.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C16235p extends View.BaseSavedState {
    public static final C16234o CREATOR = new C16234o();

    /* JADX INFO: renamed from: Y */
    public final ArrayList f50356Y;

    public C16235p(Parcelable parcelable, ArrayList arrayList) {
        super(parcelable);
        this.f50356Y = arrayList;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        super.writeToParcel(out, i10);
        out.writeTypedList(this.f50356Y);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16235p(Parcel source) {
        super(source);
        AbstractC16544l.m18094g(source, "source");
        ArrayList arrayList = new ArrayList();
        source.readTypedList(arrayList, C16233n.CREATOR);
        this.f50356Y = arrayList;
    }
}
