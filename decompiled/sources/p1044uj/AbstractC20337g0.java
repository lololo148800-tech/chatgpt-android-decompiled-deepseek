package p1044uj;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;

/* JADX INFO: renamed from: uj.g0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20337g0 implements Parcelable {

    /* JADX INFO: renamed from: Y */
    public final EnumC20327b0 f64304Y;

    /* JADX INFO: renamed from: Z */
    public final List f64305Z;

    public AbstractC20337g0(EnumC20327b0 enumC20327b0, List list) {
        this.f64304Y = enumC20327b0;
        this.f64305Z = list;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC20337g0 m21039c(AbstractC20337g0 abstractC20337g0, EnumC20335f0 uploadState, String str, ArrayList arrayList, C20338h c20338h, int i10) {
        List list;
        if ((i10 & 2) != 0) {
            str = null;
        }
        ArrayList arrayList2 = arrayList;
        if ((i10 & 4) != 0) {
            arrayList2 = null;
        }
        C20338h c20338h2 = (i10 & 8) != 0 ? null : c20338h;
        abstractC20337g0.getClass();
        AbstractC16544l.m18094g(uploadState, "uploadState");
        if (abstractC20337g0 instanceof C20331d0) {
            C20331d0 c20331d0 = (C20331d0) abstractC20337g0;
            if (str == null) {
                str = ((C20331d0) abstractC20337g0).f64284q0;
            }
            return C20331d0.m21037i(c20331d0, null, uploadState, str, false, 9);
        }
        if (abstractC20337g0 instanceof C20329c0) {
            if (arrayList2 == null) {
                list = ((C20329c0) abstractC20337g0).f64274o0;
            }
            return C20329c0.m21032i((C20329c0) abstractC20337g0, list, null, uploadState, c20338h2, false, 230);
        }
        if (!(abstractC20337g0 instanceof C20333e0)) {
            list = arrayList2;
            throw new C0644w();
        }
        list = arrayList2;
        C20333e0 c20333e0 = (C20333e0) abstractC20337g0;
        List documents = c20333e0.f64289o0;
        AbstractC16544l.m18094g(documents, "documents");
        return new C20333e0(documents, c20333e0.f64290p0, uploadState, c20333e0.f64292r0);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC20337g0 m21040a(EnumC20327b0 enumC20327b0) {
        if (this instanceof C20331d0) {
            return C20331d0.m21037i((C20331d0) this, enumC20327b0, null, null, false, 14);
        }
        if (this instanceof C20329c0) {
            return C20329c0.m21032i((C20329c0) this, null, enumC20327b0, null, null, false, 251);
        }
        if (this instanceof C20333e0) {
            return this;
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC20337g0 m21041b(boolean z6) {
        if (this instanceof C20331d0) {
            return C20331d0.m21037i((C20331d0) this, null, null, null, z6, 7);
        }
        if (this instanceof C20329c0) {
            return C20329c0.m21032i((C20329c0) this, null, null, null, null, z6, 191);
        }
        if (this instanceof C20333e0) {
            return this;
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: d */
    public EnumC20327b0 mo21033d() {
        return this.f64304Y;
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo21034f();

    /* JADX INFO: renamed from: g */
    public List mo21035g() {
        return this.f64305Z;
    }

    /* JADX INFO: renamed from: h */
    public abstract EnumC20335f0 mo21036h();
}
