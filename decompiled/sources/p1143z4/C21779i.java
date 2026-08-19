package p1143z4;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC11104m;
import androidx.navigation.NavControllerViewModel;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;

/* JADX INFO: renamed from: z4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C21779i implements Parcelable {
    public static final Parcelable.Creator<C21779i> CREATOR = new C21006a(4);

    /* JADX INFO: renamed from: Y */
    public final String f69085Y;

    /* JADX INFO: renamed from: Z */
    public final int f69086Z;

    /* JADX INFO: renamed from: o0 */
    public final Bundle f69087o0;

    /* JADX INFO: renamed from: p0 */
    public final Bundle f69088p0;

    public C21779i(C21778h entry) {
        AbstractC16544l.m18094g(entry, "entry");
        this.f69085Y = entry.f69078r0;
        this.f69086Z = entry.f69074Z.f69135r0;
        this.f69087o0 = entry.m22263d();
        Bundle bundle = new Bundle();
        this.f69088p0 = bundle;
        entry.f69081u0.m351u(bundle);
    }

    /* JADX INFO: renamed from: a */
    public final C21778h m22266a(Context context, AbstractC21790t abstractC21790t, EnumC11104m hostLifecycleState, NavControllerViewModel navControllerViewModel) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f69087o0;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String id2 = this.f69085Y;
        AbstractC16544l.m18094g(id2, "id");
        return new C21778h(context, abstractC21790t, bundle2, hostLifecycleState, navControllerViewModel, id2, this.f69088p0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        AbstractC16544l.m18094g(parcel, "parcel");
        parcel.writeString(this.f69085Y);
        parcel.writeInt(this.f69086Z);
        parcel.writeBundle(this.f69087o0);
        parcel.writeBundle(this.f69088p0);
    }

    public C21779i(Parcel inParcel) {
        AbstractC16544l.m18094g(inParcel, "inParcel");
        String string = inParcel.readString();
        AbstractC16544l.m18091d(string);
        this.f69085Y = string;
        this.f69086Z = inParcel.readInt();
        this.f69087o0 = inParcel.readBundle(C21779i.class.getClassLoader());
        Bundle bundle = inParcel.readBundle(C21779i.class.getClassLoader());
        AbstractC16544l.m18091d(bundle);
        this.f69088p0 = bundle;
    }
}
