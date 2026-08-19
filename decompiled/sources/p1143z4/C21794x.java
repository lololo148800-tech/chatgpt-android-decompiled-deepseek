package p1143z4;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p571X9.AbstractC9393x3;
import p846k4.C16340i;
import p882m1.clb.WGTYqNchEpHca;

/* JADX INFO: renamed from: z4.x */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC21768J("navigation")
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Lz4/x;", "Lz4/K;", "Lz4/v;", "navigation-common_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class C21794x extends AbstractC21769K {

    /* JADX INFO: renamed from: c */
    public final C21770L f69154c;

    public C21794x(C21770L navigatorProvider) {
        AbstractC16544l.m18094g(navigatorProvider, "navigatorProvider");
        this.f69154c = navigatorProvider;
    }

    @Override // p1143z4.AbstractC21769K
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C21792v mo986a() {
        return new C21792v(this);
    }

    @Override // p1143z4.AbstractC21769K
    /* JADX INFO: renamed from: d */
    public final void mo988d(List list, C21759A c21759a) {
        AbstractC21790t abstractC21790tM22284s;
        String strValueOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21778h c21778h = (C21778h) it.next();
            AbstractC21790t abstractC21790t = c21778h.f69074Z;
            AbstractC16544l.m18092e(abstractC21790t, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            C21792v c21792v = (C21792v) abstractC21790t;
            Bundle bundleM22263d = c21778h.m22263d();
            int i10 = c21792v.f69142v0;
            String str = c21792v.f69144x0;
            if (i10 == 0 && str == null) {
                StringBuilder sb2 = new StringBuilder(WGTYqNchEpHca.tigWggjbn);
                int i11 = c21792v.f69135r0;
                if (i11 != 0) {
                    strValueOf = String.valueOf(i11);
                } else {
                    strValueOf = "the root navigation";
                }
                sb2.append(strValueOf);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (str != null) {
                abstractC21790tM22284s = c21792v.m22285t(str, false);
            } else {
                abstractC21790tM22284s = c21792v.m22284s(i10, false);
            }
            if (abstractC21790tM22284s == null) {
                if (c21792v.f69143w0 == null) {
                    String strValueOf2 = c21792v.f69144x0;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(c21792v.f69142v0);
                    }
                    c21792v.f69143w0 = strValueOf2;
                }
                String str2 = c21792v.f69143w0;
                AbstractC16544l.m18091d(str2);
                throw new IllegalArgumentException(AbstractC10763a.m11054l("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            AbstractC21769K abstractC21769KM22262b = this.f69154c.m22262b(abstractC21790tM22284s.f69130Y);
            C21780j c21780jM22258b = m22258b();
            Bundle bundleM22279j = abstractC21790tM22284s.m22279j(bundleM22263d);
            C21795y c21795y = c21780jM22258b.f69096h;
            abstractC21769KM22262b.mo988d(AbstractC9393x3.m9974d(C16340i.m17935i(c21795y.f33529a, abstractC21790tM22284s, bundleM22279j, c21795y.m12191k(), c21795y.f33545q)), c21759a);
        }
    }
}
