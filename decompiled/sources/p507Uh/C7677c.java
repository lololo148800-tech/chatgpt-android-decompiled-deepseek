package p507Uh;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p474T8.InterfaceC7263a;
import p474T8.InterfaceC7269g;
import p571X9.AbstractC9196Q3;
import p571X9.AbstractC9209T;
import p594Y9.AbstractC9836Y;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Uh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C7677c {

    /* JADX INFO: renamed from: a */
    public final ArrayList f24207a;

    /* JADX INFO: renamed from: b */
    public final boolean f24208b;

    /* JADX INFO: renamed from: c */
    public final boolean f24209c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC7263a f24210d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractActivityC17375g f24211e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C7689o f24212f;

    public C7677c(InterfaceC7263a interfaceC7263a, AbstractActivityC17375g abstractActivityC17375g, C7689o c7689o) {
        boolean z6;
        this.f24210d = interfaceC7263a;
        this.f24211e = abstractActivityC17375g;
        this.f24212f = c7689o;
        List listMo7721a = interfaceC7263a.mo7721a();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listMo7721a, 10));
        Iterator it = listMo7721a.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC9836Y.m10482a((InterfaceC7269g) it.next(), c7689o, abstractActivityC17375g));
        }
        this.f24207a = arrayList;
        List listMo7723d = interfaceC7263a.mo7723d();
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(listMo7723d, 10));
        Iterator it2 = listMo7723d.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AbstractC9836Y.m10482a((InterfaceC7269g) it2.next(), c7689o, abstractActivityC17375g));
        }
        this.f24208b = interfaceC7263a.mo7724g();
        if (interfaceC7263a.mo7722b()) {
            z6 = true;
        } else {
            List listMo7721a2 = interfaceC7263a.mo7721a();
            if (!(listMo7721a2 instanceof Collection) || !listMo7721a2.isEmpty()) {
                Iterator it3 = listMo7721a2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (AbstractC9196Q3.m9763e(((InterfaceC7269g) it3.next()).mo7726a())) {
                            z6 = true;
                        }
                    }
                }
            }
            z6 = false;
        }
        this.f24209c = z6;
    }

    /* JADX INFO: renamed from: a */
    public final void m7971a() {
        ArrayList arrayList = this.f24207a;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!(((InterfaceC7678d) it.next()).mo3586a() instanceof C7681g)) {
                C7689o c7689o = this.f24212f;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        InterfaceC7682h interfaceC7682hMo3586a = ((InterfaceC7678d) it2.next()).mo3586a();
                        C7680f c7680f = interfaceC7682hMo3586a instanceof C7680f ? (C7680f) interfaceC7682hMo3586a : null;
                        if (c7680f != null && c7680f.f24219b) {
                            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(((InterfaceC7678d) it3.next()).mo3588c());
                            }
                            c7689o.m7974c(arrayList2);
                            AbstractActivityC17375g abstractActivityC17375g = this.f24211e;
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", abstractActivityC17375g.getPackageName(), null));
                            AbstractC9209T.m9776b(abstractActivityC17375g, null, intent);
                            return;
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((InterfaceC7678d) it4.next()).mo3588c());
                }
                c7689o.m7974c(arrayList3);
                this.f24210d.mo7725j();
                return;
            }
        }
    }
}
