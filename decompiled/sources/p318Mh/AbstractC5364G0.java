package p318Mh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p006A4.C0346g;
import p006A4.C0347h;
import p006A4.C0353n;
import p006A4.C0354o;
import p006A4.C0355p;
import p017Af.C0485p;
import p049Bm.InterfaceC1441p;
import p1070w.C20694c;
import p1143z4.AbstractC21790t;
import p1143z4.C21759A;
import p1143z4.C21770L;
import p1143z4.C21775e;
import p1143z4.C21776f;
import p1143z4.C21778h;
import p1143z4.C21786p;
import p1143z4.C21789s;
import p1143z4.C21792v;
import p1143z4.C21793w;
import p1143z4.C21795y;
import p293Lh.C5056b;
import p537W0.C8410b;
import p544W9.AbstractC8477F3;
import p544W9.AbstractC8634g;
import p544W9.AbstractC8646i;
import p544W9.AbstractC8652j;
import p587Y1.C9588n;
import p909nm.C17689w;

/* JADX INFO: renamed from: Mh.G0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5364G0 {

    /* JADX INFO: renamed from: a */
    public static final C9588n f17603a = new C9588n(15);

    /* JADX INFO: renamed from: a */
    public static final EnumC5368I0 m5886a(C21778h c21778h) {
        return (EnumC5368I0) AbstractC8477F3.m9111a(EnumC5368I0.f17611p0).m5891b(c21778h.m22263d());
    }

    /* JADX INFO: renamed from: b */
    public static final void m5887b(C21793w c21793w, AbstractC5362F0 destination, boolean z6, InterfaceC1441p content) {
        AbstractC16544l.m18094g(c21793w, "<this>");
        AbstractC16544l.m18094g(destination, "destination");
        AbstractC16544l.m18094g(content, "content");
        String str = (String) destination.f17599c.getValue();
        List<C21775e> list = (List) destination.f17600d.getValue();
        Iterable iterable = z6 ? (List) destination.f17597a.getValue() : C17689w.f56480Y;
        C5391c c5391c = C5391c.f17649q0;
        C5391c c5391c2 = C5391c.f17650r0;
        C5391c c5391c3 = C5391c.f17651s0;
        C5391c c5391c4 = C5391c.f17652t0;
        C8410b c8410b = new C8410b(new C0485p(content, 6), true, -1208240530);
        C21770L c21770l = c21793w.f69151g;
        c21770l.getClass();
        C0346g c0346g = new C0346g((C0347h) c21770l.m22262b(AbstractC8652j.m9332e(C0347h.class)), c8410b);
        c0346g.m22283r(str);
        for (C21775e c21775e : list) {
            String argumentName = c21775e.f69065a;
            C21776f c21776f = c21775e.f69066b;
            AbstractC16544l.m18094g(argumentName, "argumentName");
            c0346g.f69134q0.put(argumentName, c21776f);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c0346g.m22278f((C21786p) it.next());
        }
        c0346g.f1199v0 = c5391c;
        c0346g.f1200w0 = c5391c2;
        c0346g.f1201x0 = c5391c3;
        c0346g.f1202y0 = c5391c4;
        c21793w.f69153i.add(c0346g);
    }

    /* JADX INFO: renamed from: c */
    public static final void m5888c(C21793w c21793w, AbstractC5362F0 destination, C9588n dialogProperties, C8410b c8410b) {
        AbstractC16544l.m18094g(c21793w, "<this>");
        AbstractC16544l.m18094g(destination, "destination");
        AbstractC16544l.m18094g(dialogProperties, "dialogProperties");
        String str = (String) destination.f17599c.getValue();
        List<C21775e> list = (List) destination.f17600d.getValue();
        C8410b c8410b2 = new C8410b(new C5056b(c8410b, 1), true, 1231099057);
        C21770L c21770l = c21793w.f69151g;
        c21770l.getClass();
        C0354o c0354o = new C0354o((C0355p) c21770l.m22262b(AbstractC8652j.m9332e(C0355p.class)), dialogProperties, c8410b2);
        c0354o.m22283r(str);
        for (C21775e c21775e : list) {
            String argumentName = c21775e.f69065a;
            C21776f c21776f = c21775e.f69066b;
            AbstractC16544l.m18094g(argumentName, "argumentName");
            c0354o.f69134q0.put(argumentName, c21776f);
        }
        c21793w.f69153i.add(c0354o);
    }

    /* JADX INFO: renamed from: d */
    public static final void m5889d(C21795y navigate, String route, boolean z6) {
        AbstractC16544l.m18094g(navigate, "$this$navigate");
        AbstractC16544l.m18094g(route, "route");
        C21759A c21759aM9320d = AbstractC8646i.m9320d(new C0353n(z6, route, navigate, 3));
        int i10 = AbstractC21790t.f69129t0;
        Uri uri = Uri.parse(AbstractC8634g.m9293g(route));
        AbstractC16544l.m18090c(uri, "Uri.parse(this)");
        C20694c c20694c = new C20694c(uri, null, null, 2);
        C21792v c21792v = navigate.f33531c;
        if (c21792v == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + c20694c + ". Navigation graph has not been set for NavController " + navigate + '.').toString());
        }
        C21789s c21789sMo22282q = c21792v.mo22282q(c20694c);
        if (c21789sMo22282q == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + c20694c + " cannot be found in the navigation graph " + navigate.f33531c);
        }
        Bundle bundle = c21789sMo22282q.f69124Z;
        AbstractC21790t abstractC21790t = c21789sMo22282q.f69123Y;
        Bundle bundleM22279j = abstractC21790t.m22279j(bundle);
        if (bundleM22279j == null) {
            bundleM22279j = new Bundle();
        }
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleM22279j.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        navigate.m12194n(abstractC21790t, bundleM22279j, c21759aM9320d);
    }
}
