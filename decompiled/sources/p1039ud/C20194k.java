package p1039ud;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p098Di.InterfaceC2062k;
import p523V9.AbstractC8079e5;
import p775h2.AbstractC14376f;
import p909nm.C17691y;

/* JADX INFO: renamed from: ud.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C20194k implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final boolean f63946a;

    /* JADX INFO: renamed from: b */
    public final boolean f63947b;

    /* JADX INFO: renamed from: c */
    public final List f63948c;

    /* JADX INFO: renamed from: d */
    public final String f63949d;

    /* JADX INFO: renamed from: e */
    public final boolean f63950e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f63951f;

    public C20194k(boolean z6, boolean z10, List conversations, String searchQuery, boolean z11) {
        AbstractC16544l.m18094g(conversations, "conversations");
        AbstractC16544l.m18094g(searchQuery, "searchQuery");
        this.f63946a = z6;
        this.f63947b = z10;
        this.f63948c = conversations;
        this.f63949d = searchQuery;
        this.f63950e = z11;
        C17691y c17691y = C17691y.f56482Y;
        this.f63951f = AbstractC8079e5.m8504d(conversations, searchQuery, null, c17691y, c17691y);
    }

    /* JADX INFO: renamed from: e */
    public static C20194k m21010e(C20194k c20194k, boolean z6, List list, String str, boolean z10, int i10) {
        boolean z11 = (i10 & 1) != 0 ? c20194k.f63946a : false;
        if ((i10 & 2) != 0) {
            z6 = c20194k.f63947b;
        }
        boolean z12 = z6;
        if ((i10 & 4) != 0) {
            list = c20194k.f63948c;
        }
        List conversations = list;
        if ((i10 & 8) != 0) {
            str = c20194k.f63949d;
        }
        String searchQuery = str;
        if ((i10 & 16) != 0) {
            z10 = c20194k.f63950e;
        }
        c20194k.getClass();
        AbstractC16544l.m18094g(conversations, "conversations");
        AbstractC16544l.m18094g(searchQuery, "searchQuery");
        return new C20194k(z11, z12, conversations, searchQuery, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20194k)) {
            return false;
        }
        C20194k c20194k = (C20194k) obj;
        return this.f63946a == c20194k.f63946a && this.f63947b == c20194k.f63947b && AbstractC16544l.m18089b(this.f63948c, c20194k.f63948c) && AbstractC16544l.m18089b(this.f63949d, c20194k.f63949d) && this.f63950e == c20194k.f63950e;
    }

    public final int hashCode() {
        return AbstractC0168G.m527p(AbstractC14376f.m15858x(this.f63948c, (((this.f63946a ? 1231 : 1237) * 31) + (this.f63947b ? 1231 : 1237)) * 31, 31), 31, this.f63949d) + (this.f63950e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
