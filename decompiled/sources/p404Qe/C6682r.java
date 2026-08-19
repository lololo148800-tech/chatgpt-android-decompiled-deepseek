package p404Qe;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p909nm.AbstractC17680n;
import p968qi.C18737t;
import p968qi.C18739v;
import p968qi.C18742y;

/* JADX INFO: renamed from: Qe.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C6682r implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final boolean f21485a;

    /* JADX INFO: renamed from: b */
    public final String f21486b;

    /* JADX INFO: renamed from: c */
    public final String f21487c;

    /* JADX INFO: renamed from: d */
    public final C18737t f21488d;

    /* JADX INFO: renamed from: e */
    public final int f21489e;

    /* JADX INFO: renamed from: f */
    public final C18739v f21490f;

    /* JADX INFO: renamed from: g */
    public final C18742y f21491g;

    public C6682r(boolean z6, String str, String str2, C18737t c18737t, int i10, C18739v selectionState) {
        List list;
        AbstractC16544l.m18094g(selectionState, "selectionState");
        this.f21485a = z6;
        this.f21486b = str;
        this.f21487c = str2;
        this.f21488d = c18737t;
        this.f21489e = i10;
        this.f21490f = selectionState;
        this.f21491g = (c18737t == null || (list = c18737t.f59597a) == null) ? null : (C18742y) AbstractC17680n.m19344T(i10, list);
    }

    /* JADX INFO: renamed from: e */
    public static C6682r m7181e(C6682r c6682r, String str, String str2, C18737t c18737t, int i10, C18739v c18739v, int i11) {
        boolean z6 = c6682r.f21485a;
        if ((i11 & 2) != 0) {
            str = c6682r.f21486b;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = c6682r.f21487c;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            c18737t = c6682r.f21488d;
        }
        C18737t c18737t2 = c18737t;
        if ((i11 & 16) != 0) {
            i10 = c6682r.f21489e;
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            c18739v = c6682r.f21490f;
        }
        C18739v selectionState = c18739v;
        c6682r.getClass();
        AbstractC16544l.m18094g(selectionState, "selectionState");
        return new C6682r(z6, str3, str4, c18737t2, i12, selectionState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6682r)) {
            return false;
        }
        C6682r c6682r = (C6682r) obj;
        return this.f21485a == c6682r.f21485a && AbstractC16544l.m18089b(this.f21486b, c6682r.f21486b) && AbstractC16544l.m18089b(this.f21487c, c6682r.f21487c) && AbstractC16544l.m18089b(this.f21488d, c6682r.f21488d) && this.f21489e == c6682r.f21489e && AbstractC16544l.m18089b(this.f21490f, c6682r.f21490f);
    }

    public final int hashCode() {
        int i10 = (this.f21485a ? 1231 : 1237) * 31;
        String str = this.f21486b;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21487c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C18737t c18737t = this.f21488d;
        return this.f21490f.hashCode() + ((((iHashCode2 + (c18737t != null ? c18737t.hashCode() : 0)) * 31) + this.f21489e) * 31);
    }

    public final String toString() {
        return "█";
    }
}
