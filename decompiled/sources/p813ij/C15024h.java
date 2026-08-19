package p813ij;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: ij.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C15024h implements Parcelable {
    public static final C15023g CREATOR = new C15023g();

    /* JADX INFO: renamed from: Y */
    public final Map f46722Y;

    public C15024h(C15026j viewStateCache) {
        AbstractC16544l.m18094g(viewStateCache, "viewStateCache");
        this.f46722Y = AbstractC17659D.m19254p((LinkedHashMap) viewStateCache.f46724Y);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeMap(this.f46722Y);
    }

    public C15024h(Parcel source) {
        AbstractC16544l.m18094g(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        source.readMap(AbstractC16529F.m18079c(linkedHashMap), C15026j.class.getClassLoader());
        this.f46722Y = AbstractC17659D.m19254p(linkedHashMap);
    }
}
