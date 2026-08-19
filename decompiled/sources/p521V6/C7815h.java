package p521V6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p263K9.C4576X;

/* JADX INFO: renamed from: V6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7815h implements Parcelable {

    /* JADX INFO: renamed from: Y */
    public final List f24704Y;

    /* JADX INFO: renamed from: Z */
    public static final List f24703Z = Arrays.asList("com.android.chrome", "com.google.android.apps.chrome", "com.android.chrome.beta", "com.android.chrome.dev");
    public static final Parcelable.Creator<C7815h> CREATOR = new C4576X(21);

    public C7815h(List list) {
        this.f24704Y = list;
    }

    /* JADX INFO: renamed from: a */
    public static String m8078a(ArrayList arrayList, List list, String str) {
        if (str != null && list.contains(str) && arrayList.contains(str)) {
            return str;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (arrayList.contains(str2)) {
                return str2;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String) arrayList.get(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f24704Y);
    }

    public C7815h(Parcel parcel) {
        this.f24704Y = parcel.createStringArrayList();
    }
}
