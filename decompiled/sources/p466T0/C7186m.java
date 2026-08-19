package p466T0;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0716A;
import p1091wn.AbstractC21031l;
import p1113xn.C21316j;
import p1113xn.C21317k;
import p200Hm.C3508g;
import p530Vi.AbstractC8301I;
import p909nm.AbstractC17667a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p916o5.C17825c;

/* JADX INFO: renamed from: T0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7186m extends AbstractC17667a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22834Y;

    /* JADX INFO: renamed from: Z */
    public final Object f22835Z;

    public /* synthetic */ C7186m(Object obj, int i10) {
        this.f22834Y = i10;
        this.f22835Z = obj;
    }

    @Override // p909nm.AbstractC17667a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f22834Y) {
            case 0:
                return ((C7176c) this.f22835Z).containsValue(obj);
            default:
                if (obj == null ? true : obj instanceof C21316j) {
                    return super.contains((C21316j) obj);
                }
                return false;
        }
    }

    @Override // p909nm.AbstractC17667a
    /* JADX INFO: renamed from: f */
    public final int mo1316f() {
        switch (this.f22834Y) {
            case 0:
                C7176c c7176c = (C7176c) this.f22835Z;
                c7176c.getClass();
                return c7176c.f22812Z;
            default:
                return ((C21317k) this.f22835Z).f67753a.groupCount() + 1;
        }
    }

    @Override // p909nm.AbstractC17667a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f22834Y) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f22834Y) {
            case 0:
                C7176c c7176c = (C7176c) this.f22835Z;
                AbstractC7188o[] abstractC7188oArr = new AbstractC7188o[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    abstractC7188oArr[i10] = new C7189p(2);
                }
                return new C7185l(c7176c.f22811Y, abstractC7188oArr);
            default:
                return new C0716A(AbstractC21031l.m21495s(AbstractC17680n.m19329H(AbstractC17681o.m19380i(this)), new C17825c(this, 1)));
        }
    }

    /* JADX INFO: renamed from: j */
    public C21316j m7561j(int i10) {
        C21317k c21317k = (C21317k) this.f22835Z;
        Matcher matcher = c21317k.f67753a;
        C3508g c3508gM8929t = AbstractC8301I.m8929t(matcher.start(i10), matcher.end(i10));
        if (c3508gM8929t.f10591Y < 0) {
            return null;
        }
        String strGroup = c21317k.f67753a.group(i10);
        AbstractC16544l.m18093f(strGroup, "group(...)");
        return new C21316j(strGroup, c3508gM8929t);
    }
}
