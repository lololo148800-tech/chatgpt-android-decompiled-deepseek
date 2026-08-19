package p1143z4;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16544l;
import p1039ud.C20198o;
import p1091wn.AbstractC21031l;
import p1091wn.C21025f;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: z4.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21769K {

    /* JADX INFO: renamed from: a */
    public C21780j f69051a;

    /* JADX INFO: renamed from: b */
    public boolean f69052b;

    /* JADX INFO: renamed from: a */
    public abstract AbstractC21790t mo986a();

    /* JADX INFO: renamed from: b */
    public final C21780j m22258b() {
        C21780j c21780j = this.f69051a;
        if (c21780j != null) {
            return c21780j;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    /* JADX INFO: renamed from: d */
    public void mo988d(List list, C21759A c21759a) {
        C21025f c21025f = new C21025f(AbstractC21031l.m21488l(AbstractC21031l.m21495s(AbstractC17680n.m19329H(list), new C20198o(this, c21759a))));
        while (c21025f.hasNext()) {
            m22258b().m22272f((C21778h) c21025f.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo989e(C21778h popUpTo, boolean z6) {
        AbstractC16544l.m18094g(popUpTo, "popUpTo");
        List list = (List) m22258b().f69093e.f6797Y.getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C21778h c21778h = null;
        while (mo22260f()) {
            c21778h = (C21778h) listIterator.previous();
            if (AbstractC16544l.m18089b(c21778h, popUpTo)) {
                break;
            }
        }
        if (c21778h != null) {
            m22258b().m22269c(c21778h, z6);
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean mo22260f() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC21790t mo22259c(AbstractC21790t abstractC21790t) {
        return abstractC21790t;
    }
}
