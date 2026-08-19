package p1156zj;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1088wk.C21006a;
import p911o0.AbstractC17792x;
import p949pj.C18428A;

/* JADX INFO: renamed from: zj.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22159h0 extends AbstractC22180o0 {
    public static final Parcelable.Creator<C22159h0> CREATOR = new C21006a(20);

    /* JADX INFO: renamed from: Z */
    public final C22139a1 f70063Z;

    /* JADX INFO: renamed from: o0 */
    public final List f70064o0;

    /* JADX INFO: renamed from: p0 */
    public final List f70065p0;

    /* JADX INFO: renamed from: q0 */
    public final int f70066q0;

    /* JADX INFO: renamed from: r0 */
    public final AbstractC22180o0 f70067r0;

    /* JADX INFO: renamed from: s0 */
    public final C22130W0 f70068s0;

    /* JADX INFO: renamed from: t0 */
    public final C18428A f70069t0;

    public C22159h0(C22139a1 currentPart, List uploadingIds, List list, int i10, AbstractC22180o0 abstractC22180o0, C22130W0 id2, C18428A cameraProperties) {
        AbstractC16544l.m18094g(currentPart, "currentPart");
        AbstractC16544l.m18094g(uploadingIds, "uploadingIds");
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        this.f70063Z = currentPart;
        this.f70064o0 = uploadingIds;
        this.f70065p0 = list;
        this.f70066q0 = i10;
        this.f70067r0 = abstractC22180o0;
        this.f70068s0 = id2;
        this.f70069t0 = cameraProperties;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: c */
    public final AbstractC22180o0 mo22377c() {
        return this.f70067r0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: d */
    public final C22139a1 mo22378d() {
        return this.f70063Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: f */
    public final int mo22379f() {
        return this.f70066q0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: g */
    public final List mo22380g() {
        return this.f70065p0;
    }

    @Override // p1156zj.AbstractC22180o0
    /* JADX INFO: renamed from: h */
    public final List mo22381h() {
        return this.f70064o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f70063Z, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f70064o0, out);
        while (itM19536s.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s.next(), i10);
        }
        Iterator itM19536s2 = AbstractC17792x.m19536s(this.f70065p0, out);
        while (itM19536s2.hasNext()) {
            out.writeParcelable((Parcelable) itM19536s2.next(), i10);
        }
        out.writeInt(this.f70066q0);
        out.writeParcelable(this.f70067r0, i10);
        this.f70068s0.writeToParcel(out, i10);
        out.writeParcelable(this.f70069t0, i10);
    }
}
